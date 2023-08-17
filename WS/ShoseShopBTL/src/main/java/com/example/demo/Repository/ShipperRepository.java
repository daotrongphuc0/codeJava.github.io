package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Shipper;

@Repository
public interface ShipperRepository extends JpaRepository<Shipper, Integer>{

}
