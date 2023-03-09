package com.kafka.kafkapublisher;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.kafka.kafkapublisher.models.Transactions;
import com.kafka.kafkapublisher.services.TransactionService;
import org.junit.Before;
import org.junit.Test;

public class TransactionServiceTest {

    private TransactionService transactionService;

    @Before
    public void setUp() {
        // Create an instance of the TransactionService class
        transactionService = new TransactionService();
    }

    @Test
    public void testGetTransactionById() {
        // Mock any dependencies that the service might have

        // Call the method under test
        Transactions transaction = transactionService.getTransactionById("3");

        // Assert that the returned transaction object has the expected values
        assertEquals("3", transaction.getTransactionId());
        assertEquals("cwd", transaction.getServiceName());
        assertEquals("100", transaction.getAmount());
        assertEquals("500", transaction.getCharges());
    }
}

