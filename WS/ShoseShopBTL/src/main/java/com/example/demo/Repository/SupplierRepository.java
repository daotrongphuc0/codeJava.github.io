package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Supplier;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Integer>{

}
