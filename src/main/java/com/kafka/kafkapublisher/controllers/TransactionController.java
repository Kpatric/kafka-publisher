package com.kafka.kafkapublisher.controllers;

import com.kafka.kafkapublisher.models.Transactions;
import com.kafka.kafkapublisher.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @Autowired
    private KafkaTemplate<String, Transactions> kafkaTemplate;

    @PostMapping("transaction")
    public String getTransactions(@RequestBody Transactions message) {
        kafkaTemplate.send("Payments", message);
        return "Message published successfully to newtopic!";
    }

    @GetMapping("balance")
    public Transactions getBalance(@PathVariable("id")String id){
        return transactionService.getTransactionById(id);
    }
}
