package org.example.paymentservice_feb2025.paymentgateways;

public interface IPaymentGateway {
    String getPaymentLink(Long amount,String orderId,String phoneNumber,String name,String email);
}
