package com.example.demo.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="ordersdetail")
public class OrdersDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ord_id;
	@Column(name="ord_number")
	private int ord_number;
	@Column(name="ord_price")
	private long ord_price;
	@Column(name="ord_quantity")
	private int ord_quantity;
	@Column(name="ord_discount")
	private int ord_discount;
	@Column(name="ord_pay")
	private long ord_pay;
	@Column(name="or_id")
	private int or_id;
	@Column(name="pro_id")
	private int pro_id;
}
