package com.bank.bank.route;
import com.bank.bank.service.bankService;
public abstract  class getService {
    private final bankService bankService;

    protected getService (bankService bankService) {
        this.bankService = bankService;
    }

    protected bankService BankService() {
        return bankService;
    }




}
