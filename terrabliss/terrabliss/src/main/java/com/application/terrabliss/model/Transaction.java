package com.application.terrabliss.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "transaction")
public class Transaction {

    @Id
    private String transactionId;
    private List<CartItems> cartItems;
    private String userId;
    private PaymentMode paymentMode;
    private double total;
    private LocalDateTime transactionDate;
}
