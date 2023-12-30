package github.guisofiati.paymentservice.services;

import github.guisofiati.paymentservice.models.PaymentModel;

public interface PaymentService {

    void sendPayment(PaymentModel paymentModel);
}
