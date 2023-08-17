package com.example.demo.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Customer {

	private int cus_id;
	private String cus_name;
	private String cus_sex;
	private String cus_address;
	private String cus_phone;
	private String cus_email;
	private String password;
	private String cus_ship_address;
	private long cus_money;
}
