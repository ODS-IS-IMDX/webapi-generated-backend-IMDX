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

/**
 * Unit tests for the {@link FacilityInformationApi} class.
 */
public class FacilityInformationApiTest {

    private FacilityInformationApi facilityInformationApi = new FacilityInformationApi() {

        @Override
        public ResponseEntity<Object> facilityInformationGet(UUID xTracking, @Valid List<String> sids,
                @Valid List<List<Float>> searchArea, @Valid Integer epsgCode, @Valid List<String> infraCompanyIds,
                @Valid Integer returnZoomLevel, @Valid String updateDate) {
            throw new UnsupportedOperationException("Unimplemented method 'facilityInformationGet'");
        }
    };

    /**
        * test getRequest method.
    */
    @Test
    public void testGetRequest() {
        // Act
        Optional<NativeWebRequest> response = facilityInformationApi.getRequest();

        // Assert
        assertFalse(response.isPresent());
    }
}
