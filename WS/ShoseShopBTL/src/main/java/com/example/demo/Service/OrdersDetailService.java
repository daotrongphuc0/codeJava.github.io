package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.OrdersDetail;
import com.example.demo.Repository.OrdersDetailRepository;

@Service
public class OrdersDetailService {

	@Autowired
	private OrdersDetailRepository ordersDetailRepository;
	public List<OrdersDetail> GetAllOrdersDetail(){
		return ordersDetailRepository.findAll();
	}
}
