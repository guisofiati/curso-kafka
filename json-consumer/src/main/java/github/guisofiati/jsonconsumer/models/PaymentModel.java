package github.guisofiati.jsonconsumer.models;

import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@ToString
public class PaymentModel implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private Long userId;
    private Long productId;
    private String cardNumber;
}
