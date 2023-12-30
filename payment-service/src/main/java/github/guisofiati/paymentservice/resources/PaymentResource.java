package github.guisofiati.paymentservice.resources;

import github.guisofiati.paymentservice.models.PaymentModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface PaymentResource {

    @PostMapping
    ResponseEntity<PaymentModel> payment(@RequestBody PaymentModel paymentModel);
}
