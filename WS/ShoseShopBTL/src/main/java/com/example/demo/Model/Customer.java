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
@Table(name="customer")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cus_id;
	@Column(name="cus_name")
	private String cus_name;
	@Column(name="cus_sex")
	private String cus_sex;
	@Column(name="cus_address")
	private String cus_address;
	@Column(name="cus_phone")
	private String cus_phone;
	@Column(name="cus_email")
	private String cus_email;
	@Column(name="password")
	private String password;
	@Column(name="cus_ship_address")
	private String cus_ship_address;
	@Column(name="cus_money")
	private long cus_money;
}
