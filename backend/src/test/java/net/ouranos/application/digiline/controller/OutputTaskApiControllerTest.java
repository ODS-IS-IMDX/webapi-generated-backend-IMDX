package net.ouranos.application.digiline.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import jakarta.servlet.http.HttpServletRequest;
import net.ouranos.adaptor.digiline.Adaptor;
import net.ouranos.common.component.TokenIntrospection;
import net.ouranos.domain.digiline.model.OutputTask;
import net.ouranos.transform.digiline.Transform;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import java.util.UUID;

public class OutputTaskApiControllerTest {

    /**
     * {@link Transform} のモック。
     */
    @Mock
    private Transform<Object> transform;

    /**
     * {@link Adaptor} のモック。
     */
    @Mock
    private Adaptor<Object> adaptor;

    /**
     * {@link TokenIntrospection} のモック。
     */
    @Mock
    private TokenIntrospection tokenIntrospection;

    /**
     * {@link HttpServletRequest} のモック。
     */
    @Mock
    private HttpServletRequest request;

    /**
     * {@link ServletRequestAttributes} のモック。
     */
    @Mock
    private ServletRequestAttributes servletRequestAttributes;

    /**
     * テスト対象クラス{@link OutputTaskApiController} 。
     */
    @InjectMocks
    private OutputTaskApiController outputTaskApiController;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        UUID.randomUUID();
        RequestContextHolder.setRequestAttributes(servletRequestAttributes);
    }

    @Test
    void testGet_query() {
        // テストデータ
        OutputTask dataModelOutputTask = new OutputTask();
        ResponseEntity<Object> responseEntity = ResponseEntity.ok(dataModelOutputTask);
        UUID uuid = UUID.randomUUID();
        String queryParam = "taskId";

        // モックの設定
        when(adaptor.sendGet("OutputTask", uuid, "taskId=taskId", "token")).thenReturn(responseEntity);
        when(transform.decode(responseEntity, uuid, "taskId=taskId")).thenReturn(responseEntity);
        when(servletRequestAttributes.getRequest()).thenReturn(request);
        when(request.getHeader("Authorization")).thenReturn("token");

        // 実行
        ResponseEntity<Object> response = outputTaskApiController.outputTaskGet(uuid, "taskId");
        
        // 検証
        assertEquals(ResponseEntity.ok(dataModelOutputTask), response, "レスポンスが期待通りであること");
        verify(adaptor, times(1)).sendGet("OutputTask", uuid, "taskId=taskId", "token");
        verify(transform, times(1)).decode(responseEntity, uuid, "taskId=taskId");
        verify(tokenIntrospection, times(1)).verifyToken("token");
    }
}
