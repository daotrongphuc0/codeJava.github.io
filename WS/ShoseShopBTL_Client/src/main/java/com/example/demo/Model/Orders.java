package com.example.demo.Model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Orders {
	private int or_id;
	private int or_number;
	private Date or_date;
	private Date or_deadline;
	private Date or_payment_date;
	private String or_state;
	private int ship_id;
	private int pay_id;
	private int cus_id;
}
