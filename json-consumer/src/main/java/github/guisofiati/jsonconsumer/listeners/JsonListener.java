package github.guisofiati.jsonconsumer.listeners;

import github.guisofiati.jsonconsumer.models.PaymentModel;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import static java.lang.Thread.sleep;

@Component
@Log4j2
public class JsonListener {

    // created 3 listeners, it could be several microservices instead

    @KafkaListener(topics = "payment-topic", groupId = "create-group", containerFactory = "jsonContainerFactory")
    @SneakyThrows
    public void antiFraud(@Payload PaymentModel payment) {
        log.info("Payment received: {}", payment);
        sleep(2000);
        log.info("Validating fraud...");
        sleep(2000);
        log.info("Purchase approved!");
        sleep(3000);
    }

    @KafkaListener(topics = "payment-topic", groupId = "pdf-group", containerFactory = "jsonContainerFactory")
    @SneakyThrows
    public void pdfGenerator(@Payload PaymentModel payment) {
        log.info("Generating PDF of product id: {}", payment.getProductId());
        sleep(3000);
    }

    @KafkaListener(topics = "payment-topic", groupId = "email-group", containerFactory = "jsonContainerFactory")
    @SneakyThrows
    public void sendEmail() {
        log.info("Sending confirmation e-mail...");
        sleep(2000);
    }
}
