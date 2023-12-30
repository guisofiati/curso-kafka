package github.guisofiati.strconsumer.listeners;

import github.guisofiati.strconsumer.custom.StringConsumerCustomListener;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Log4j2
public class StringConsumerListener {

    //we've two partitions, therefore listener 'create' will be registered in one partition and 'log' listener in other
//    @KafkaListener(groupId = "group-1",
//            topicPartitions = {
//            @TopicPartition(topic = "str-topic", partitions = {"0"})
//            },
//            containerFactory = "strContainerFactory")
    @StringConsumerCustomListener(groupId = "group-1")
    @SneakyThrows
    public void create(String message) {
        log.info("CREATE ::: Received message: {}", message);
        throw new IllegalArgumentException("Error...");
    }

    @StringConsumerCustomListener(groupId = "group-1")
    public void log(String message) {
        log.info("LOG ::: Received message: {}", message);
    }

    @KafkaListener(topics = "str-topic", groupId = "group-2", containerFactory = "validMessageContainerFactory")
    public void history(String message) {
        log.info("HISTORY ::: Received message: {}", message);
    }
}
