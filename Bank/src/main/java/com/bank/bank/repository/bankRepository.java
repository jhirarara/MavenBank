package com.bank.bank.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.bank.bank.model.Bank;

@Repository
public interface bankRepository extends JpaRepository<Bank,Long>{
}
