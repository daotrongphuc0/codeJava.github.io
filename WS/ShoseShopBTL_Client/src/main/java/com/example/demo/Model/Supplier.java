package com.example.demo.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Supplier {
	private int sup_id;
	private String sup_name;
	private String sup_address;
	private String sup_email;
	private String sup_phone;
	private String sup_payment_method;
	private String sup_note;
}
