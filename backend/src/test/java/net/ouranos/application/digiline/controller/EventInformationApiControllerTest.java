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
import net.ouranos.domain.digiline.model.EventInformation;
import net.ouranos.transform.digiline.Transform;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import java.time.OffsetDateTime;
import java.util.UUID;
import java.util.ArrayList;
import java.util.List;

public class EventInformationApiControllerTest {

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
     * テスト対象クラス{@link EventInformationApiController} 。
     */    @InjectMocks
    private EventInformationApiController eventInformationApiController;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        UUID.randomUUID();
    }

    @Test
    void testGet_query() {
        // テストデータ
        EventInformation dataModelEventInformation = new EventInformation();
        ResponseEntity<Object> responseEntity = ResponseEntity.ok(dataModelEventInformation);
        RequestContextHolder.setRequestAttributes(servletRequestAttributes);
        UUID xTracking = UUID.randomUUID();
        List<String> sids = new ArrayList<String>();
        sids.add("a");
        sids.add("b");
        List<String> infraCompanyIds = new ArrayList<String>();
        infraCompanyIds.add("c");
        infraCompanyIds.add("d");
        Integer returnZoomLevel = (int) 0;
        String updateDate = "2024/08/20 03:59:44";
        String queryParam = sids+"&"+infraCompanyIds+"&"+returnZoomLevel+"&"+updateDate;

        // モックの設定
        when(adaptor.sendGet("EventInformation", xTracking, queryParam, "token")).thenReturn(responseEntity);
        when(transform.decode(responseEntity, xTracking, queryParam)).thenReturn(responseEntity);
        when(servletRequestAttributes.getRequest()).thenReturn(request);
        when(request.getHeader("Authorization")).thenReturn("token");
        when(request.getQueryString()).thenReturn(queryParam);

        // 実行
        ResponseEntity<Object> response = eventInformationApiController.eventInformationGet(xTracking, sids, infraCompanyIds, returnZoomLevel, updateDate);
        
        // 検証
        assertEquals(ResponseEntity.ok(dataModelEventInformation), response, "レスポンスが期待通りであること");
        verify(adaptor, times(1)).sendGet("EventInformation", xTracking, queryParam, "token");
        verify(transform, times(1)).decode(responseEntity, xTracking, queryParam);
        verify(tokenIntrospection, times(1)).verifyToken("token");
    }
}
