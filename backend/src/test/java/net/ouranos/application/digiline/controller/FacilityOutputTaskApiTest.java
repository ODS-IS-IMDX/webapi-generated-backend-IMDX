package net.ouranos.application.digiline.controller;

import static org.junit.jupiter.api.Assertions.assertFalse;
import java.util.Optional;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import jakarta.validation.Valid;
import net.ouranos.domain.digiline.model.FacilityReception;

/**
 * Unit tests for the {@link FacilityOutputTaskApi} class.
 */
public class FacilityOutputTaskApiTest {

    private FacilityOutputTaskApi facilityOutputTaskApi = new FacilityOutputTaskApi() {

        @Override
        public ResponseEntity<Object> facilityOutputTaskPut(UUID xTracking,
        @Valid FacilityReception facilityReception) {
            throw new UnsupportedOperationException("Unimplemented method 'facilityOutputTaskPut'");
        }
    };

    /**
        * test getRequest method.
    */
    @Test
    public void testGetRequest() {
        // Act
        Optional<NativeWebRequest> response = facilityOutputTaskApi.getRequest();

        // Assert
        assertFalse(response.isPresent());
    }
}
