package net.ouranos.application.digiline.controller;

import static org.junit.jupiter.api.Assertions.assertFalse;
import java.util.Optional;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

/**
 * Unit tests for the {@link OutputTaskApi} class.
 */
public class OutputTaskApiTest {

    private OutputTaskApi outputTaskApi = new OutputTaskApi() {

        @Override
        public ResponseEntity<Object> outputTaskGet(UUID xTracking, String queryParam) {
            throw new UnsupportedOperationException("Unimplemented method 'outputTaskGet'");
        }

    };

    /**
        * test getRequest method.
    */
    @Test
    public void testGetRequest() {
        // Act
        Optional<NativeWebRequest> response = outputTaskApi.getRequest();

        // Assert
        assertFalse(response.isPresent());
    }
}
