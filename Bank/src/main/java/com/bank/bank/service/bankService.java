package com.bank.bank.service;
import com.bank.bank.model.Person;
import com.bank.bank.repository.bankRepository;

import org.springframework.stereotype.Service;
import com.bank.bank.model.Bank;
import java.util.List;
import java.util.stream.StreamSupport;

@Service
public  class bankService {


    private final bankRepository BankRepositorys;

    public  bankService(bankRepository BankRepositorys) {
        this.BankRepositorys = BankRepositorys;
    }


    public List<Bank> getPersons() {
        return BankRepositorys.findAll();
    }
    public Bank postPerson(Bank person) {
        return BankRepositorys.save(person);
    }


    public Bank personWithdraw(long id,double amount) {


        System.out.println(id);
        return BankRepositorys.findById(id).map(user -> {

            System.out.println(user.getBalance());
if(bankValidation.withdraw(amount, user.getBalance())){
    user.setBalance(user.getBalance()-amount);
    return BankRepositorys.save(user);

}
    else {
      throw new RuntimeException("Not enough money");
}


        }).orElseThrow(()->new RuntimeException("User not found with id: " + id));


    }






    public Bank personDeposit(long id,double deposit) {



        return BankRepositorys.findById(id).map(user -> {
            System.out.println(deposit);
            if(bankValidation.deposit(deposit)){
               user.setBalance(user.getBalance()+deposit);
                return BankRepositorys.save(user);

            }
            else {
                throw new RuntimeException("Not enough money");
            }


        }).orElseThrow(()->new RuntimeException("User not found with id: " + id));


    }












}
