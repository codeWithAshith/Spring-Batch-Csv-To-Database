package com.codeWithAshith.SpringBatchcsvToDatabase.repository;

import com.codeWithAshith.SpringBatchcsvToDatabase.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository  extends JpaRepository<Customer,Integer> {
}
