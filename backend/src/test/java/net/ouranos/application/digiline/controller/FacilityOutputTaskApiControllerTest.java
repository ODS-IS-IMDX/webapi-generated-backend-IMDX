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
import net.ouranos.domain.digiline.model.FacilityReception;
import net.ouranos.transform.digiline.Transform;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import java.util.UUID;

public class FacilityOutputTaskApiControllerTest {

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
     * テスト対象クラス{@link FacilityOutputTaskApiController} 。
     */    @InjectMocks
    private FacilityOutputTaskApiController facilityOutputTaskApiController;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        UUID.randomUUID();
        RequestContextHolder.setRequestAttributes(servletRequestAttributes);
    }

    @Test
    void testPut_query() {
        // テストデータ
        FacilityReception dataModelFacilityReception = new FacilityReception();
        ResponseEntity<Object> responseEntity = ResponseEntity.ok(dataModelFacilityReception);
        UUID uuid = UUID.randomUUID();

        // モックの設定
        when(transform.encode(dataModelFacilityReception, uuid, null)).thenReturn(dataModelFacilityReception);
        when(adaptor.sendPut(dataModelFacilityReception, uuid, null, "token")).thenReturn(responseEntity);
        when(transform.decode(responseEntity, uuid, null)).thenReturn(responseEntity);
        when(servletRequestAttributes.getRequest()).thenReturn(request);
        when(request.getHeader("Authorization")).thenReturn("token");

        // 実行
        ResponseEntity<Object> response = facilityOutputTaskApiController.facilityOutputTaskPut(uuid, dataModelFacilityReception);

        // 検証
        assertEquals(ResponseEntity.ok(dataModelFacilityReception), response, "レスポンスが期待通りであること");
        verify(transform, times(1)).encode(dataModelFacilityReception, uuid, null);
        verify(adaptor, times(1)).sendPut(dataModelFacilityReception, uuid, null, "token");
        verify(transform, times(1)).decode(responseEntity, uuid, null);
        verify(tokenIntrospection, times(1)).verifyToken("token");
    }
}
