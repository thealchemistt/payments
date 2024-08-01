package com.example.payments.controller;
import com.example.payments.service.PaymentService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @GetMapping("/payment/{productId}")
    public String processPayment(@PathVariable String productId) {
        return paymentService.processPayment(productId);
    }
}