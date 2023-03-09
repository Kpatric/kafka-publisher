package com.kafka.kafkapublisher.services;

import com.kafka.kafkapublisher.models.Transactions;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {

    public Transactions getTransactionById(String id){
        return Transactions.builder()
                .transactionId("3")
                .serviceName("cwd")
                .amount("100")
                .charges("600")
                .build();
    }
}
