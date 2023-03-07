package com.kafka.kafkapublisher.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transactions {
    private String transactionId;
    private String serviceName;
    private String amount;
    private String charges;
    private String accountName;
    private String accountNumber;
}
