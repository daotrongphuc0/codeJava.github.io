package com.example.demo.Model;

import java.util.Date;

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
@Table(name="orders")
public class Orders {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int or_id;
	@Column(name="or_number")
	private int or_number;
	@Column(name="or_date")
	private Date or_date;
	@Column(name="or_deadline")
	private Date or_deadline;
	@Column(name="or_payment_date")
	private Date or_payment_date;
	@Column(name="or_state")
	private String or_state;
	@Column(name="ship_id")
	private int ship_id;
	@Column(name="pay_id")
	private int pay_id;
	@Column(name="cus_id")
	private int cus_id;
}
