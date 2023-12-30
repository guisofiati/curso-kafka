package github.guisofiati.paymentservice.resources.impl;

import github.guisofiati.paymentservice.models.PaymentModel;
import github.guisofiati.paymentservice.resources.PaymentResource;
import github.guisofiati.paymentservice.services.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/payments")
public class PaymentResourceImpl implements PaymentResource {

    private final PaymentService paymentService;

    @Override
    public ResponseEntity<PaymentModel> payment(PaymentModel paymentModel) {
        paymentService.sendPayment(paymentModel);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
