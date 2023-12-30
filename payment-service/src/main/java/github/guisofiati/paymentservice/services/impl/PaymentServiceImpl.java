package github.guisofiati.paymentservice.services.impl;

import github.guisofiati.paymentservice.models.PaymentModel;
import github.guisofiati.paymentservice.services.PaymentService;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
@Log4j2
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {

    private final KafkaTemplate<String, Serializable> kafkaTemplate;

    @Override
    @SneakyThrows
    public void sendPayment(PaymentModel paymentModel) {
        log.info("Payment received: {}", paymentModel);
        Thread.sleep(1000);
        log.info("Sending payment...");
        kafkaTemplate.send("payment-topic", paymentModel);
    }
}
