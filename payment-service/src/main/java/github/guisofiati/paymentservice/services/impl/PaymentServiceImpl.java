package github.guisofiati.paymentservice.services.impl;

import github.guisofiati.paymentservice.models.PaymentModel;
import github.guisofiati.paymentservice.services.PaymentService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class PaymentServiceImpl implements PaymentService {

    @Override
    public void sendPayment(PaymentModel paymentModel) {
        log.info("PAYMENT SERVICE IMPL ::: Payment received {}", paymentModel);
    }
}
