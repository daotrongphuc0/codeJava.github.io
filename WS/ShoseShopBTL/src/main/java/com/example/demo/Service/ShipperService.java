package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Shipper;
import com.example.demo.Repository.ShipperRepository;

@Service
public class ShipperService {

	@Autowired
	private ShipperRepository shipperRepository;
	public List<Shipper> GetAllShipper(){
		return shipperRepository.findAll();
	}
}
