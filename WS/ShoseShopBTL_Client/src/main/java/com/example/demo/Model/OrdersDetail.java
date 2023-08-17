package com.example.demo.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrdersDetail {
	private int ord_id;
	private int ord_number;
	private long ord_price;
	private int ord_quantity;
	private int ord_discount;
	private long ord_pay;
	private int or_id;
	private int pro_id;
}
