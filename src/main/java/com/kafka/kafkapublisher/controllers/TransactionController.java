package com.kafka.kafkapublisher.controllers;

import com.kafka.kafkapublisher.models.Transactions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/")
public class TransactionController {

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    @PostMapping("transaction")
    public String getTransactions(@RequestBody Transactions message) {
        kafkaTemplate.send("Payments", message);
        return "Message published successfully to newtopic!";
    }
}
