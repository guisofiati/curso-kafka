package github.guisofiati.paymentservice.models;

import lombok.Getter;

import java.io.Serializable;

@Getter
public class PaymentModel implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private Long userId;
    private Long productId;
    private String cardNumber;
}
