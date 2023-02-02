package com.kaminski.springbootmicropayment.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Payment implements Serializable {

    private Long id;
    private Long userId;
    private Long productId;
    private String cardNumber;

}