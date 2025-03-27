package net.ouranos.transform.digiline;

import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;


@Component
public class ExampleTransformImpl<T> implements Transform<T> {

    @Override
    public T encode(T dataModel, UUID transaction, String queryParam) {
        return dataModel;
    }

    @Override
    public ResponseEntity<T> decode(ResponseEntity<T> dataModel, UUID transaction, String queryParam) {
        return dataModel;
    }

}
