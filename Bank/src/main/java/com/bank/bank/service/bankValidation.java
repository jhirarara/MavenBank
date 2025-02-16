package com.bank.bank.service;

import com.fasterxml.jackson.annotation.JsonProperty;

public class bankValidation {

    @JsonProperty("amount")
    private double amount;
    @JsonProperty("deposit")
    private double deposit;

    public double getAmount() {
        return amount;
    }

 public double getDeposit() {
        return deposit;
 }

public static boolean deposit(double deposit) {
        return deposit > 0;
}




    public static boolean withdraw(double amount, double balance) {

        return !(amount - balance > 100);
    }











}
