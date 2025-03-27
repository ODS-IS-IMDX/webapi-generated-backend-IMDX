package net.ouranos.transform.digiline;

import java.util.UUID;

import org.springframework.http.ResponseEntity;

public interface Transform<T> {

    
    T encode(T dataModel, UUID transaction, String queryParam);

    ResponseEntity<T> decode(ResponseEntity<T> dataModel, UUID transaction, String queryParam);

}
