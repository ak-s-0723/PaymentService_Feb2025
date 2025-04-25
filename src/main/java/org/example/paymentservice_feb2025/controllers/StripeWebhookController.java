package org.example.paymentservice_feb2025.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StripeWebhookController {

    @PostMapping("/stripeWebhook")
    public void respondToEvents(@RequestBody String event) {
        //You can add your own logic to send email or do CRUD based on event
        System.out.println(event);
    }
}
