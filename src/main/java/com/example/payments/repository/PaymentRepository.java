package com.example.payments.repository;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class PaymentRepository {
    private Map<String, String> payments = new HashMap<>();

    public void savePayment(String productId, String status) {
        payments.put(productId, status);
    }
}
