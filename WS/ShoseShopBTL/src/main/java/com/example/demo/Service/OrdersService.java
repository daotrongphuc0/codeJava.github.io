package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Orders;
import com.example.demo.Repository.OrdersRepository;

@Service
public class OrdersService {

	@Autowired
	private OrdersRepository ordersRepository;
	public List<Orders> GetAllOrders(){
		return ordersRepository.findAll();
	}
}
