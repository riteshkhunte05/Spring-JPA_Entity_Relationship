package com.springjpaentity.SpringJPAEntityMapping.repository;

import com.springjpaentity.SpringJPAEntityMapping.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}