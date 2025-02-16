package com.bank.bank.model;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;


@Entity
@Table(name="personaccount")
public class Bank extends Person {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long  id;
    @Name("personBalance")
    private double balance;
    public Bank(@JsonProperty("firstname") String firstname, @JsonProperty("lastname") String lastname, int age, String address, double balance) {
        super(firstname,lastname,age,address);
        this.balance = balance;
    }

    public Bank() {
        super();
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
}
