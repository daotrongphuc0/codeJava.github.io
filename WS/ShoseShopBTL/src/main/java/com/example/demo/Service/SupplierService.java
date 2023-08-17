package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Supplier;
import com.example.demo.Repository.SupplierRepository;

@Service
public class SupplierService {

	@Autowired
	private SupplierRepository supplierRepository;
	public List<Supplier> GetAllSupplier(){
		return supplierRepository.findAll();
	}
}
