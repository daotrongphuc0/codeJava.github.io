package com.example.demo.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Shipper {
	private int ship_id;
	private String ship_name;
	private String ship_sex;
	private String ship_company_name;
	private String ship_phone;
}
