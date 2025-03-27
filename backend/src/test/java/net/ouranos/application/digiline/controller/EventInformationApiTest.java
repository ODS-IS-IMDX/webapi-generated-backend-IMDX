package net.ouranos.application.digiline.controller;

import static org.junit.jupiter.api.Assertions.assertFalse;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * Unit tests for the {@link EventInformationApi} class.
 */
public class EventInformationApiTest {

    private EventInformationApi eventInformationApi = new EventInformationApi() {

        @Override
        public ResponseEntity<Object> eventInformationGet(UUID xTracking, @NotNull @Valid List<String> sids,
        @Valid List<String> infraCompanyIds, @Valid Integer returnZoomLevel, @Valid String updateDate) {
            throw new UnsupportedOperationException("Unimplemented method 'eventInformationGet'");
        }
    };

    /**
        * test getRequest method.
    */
    @Test
    public void testGetRequest() {
        // Act
        Optional<NativeWebRequest> response = eventInformationApi.getRequest();

        // Assert
        assertFalse(response.isPresent());
    }
}
