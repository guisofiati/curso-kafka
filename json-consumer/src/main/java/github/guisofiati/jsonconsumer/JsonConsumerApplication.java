package github.guisofiati.jsonconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class JsonConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(JsonConsumerApplication.class, args);
	}

}
