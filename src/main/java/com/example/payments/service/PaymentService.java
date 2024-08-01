package com.example.payments.service;

import com.example.payments.repository.PaymentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    private static final Logger logger = LoggerFactory.getLogger(PaymentService.class);

    @Autowired
    private PaymentRepository paymentRepository;

    public String processPayment(String productId) {
        logger.info("Processing payment for product: {}", productId);
        paymentRepository.savePayment(productId, "Processed");
        return "Payment processed for product: " + productId;
    }
}
