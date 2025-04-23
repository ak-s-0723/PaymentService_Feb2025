package org.example.paymentservice_feb2025.dtos;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PaymentRequestDto {
    Long amount;
    String orderId;
    String phoneNumber;
    String name;
    String email;
}
