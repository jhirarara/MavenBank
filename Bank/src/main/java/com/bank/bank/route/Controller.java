package com.bank.bank.route;
import com.bank.bank.model.Bank;

import com.bank.bank.service.bankValidation;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import com.bank.bank.service.bankService;
@RestController
@RequestMapping("/users")

public class Controller extends getService {
    @Autowired


    Controller(bankService bankService) {
 super(bankService);
    }


@GetMapping("/getUser")
    public List<Bank> getUser() {
     return BankService().getPersons();
}

@PostMapping("/postUser")
    public Bank postUser(@RequestBody Bank bank) {
        return BankService().postPerson(bank);

}



@PutMapping("/userWithdraw/{id}")
    public Bank userWithdraw(@PathVariable Long id , @RequestBody bankValidation amount ) {

    System.out.println(id);

      return BankService().personWithdraw(id,  amount.getAmount());
}

@PutMapping("/userDeposit/{id}")
 public Bank userDeposit(@PathVariable Long id , @RequestBody bankValidation deposit ) {
        return BankService().personDeposit(id,  deposit.getDeposit());
}

}
