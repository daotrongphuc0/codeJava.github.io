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
@Table(name="supplier")
public class Supplier {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sup_id;
	@Column(name="sup_name")
	private String sup_name;
	@Column(name="sup_address")
	private String sup_address;
	@Column(name="sup_email")
	private String sup_email;
	@Column(name="sup_phone")
	private String sup_phone;
	@Column(name="sup_payment_method")
	private String sup_payment_method;
	@Column(name="sup_note")
	private String sup_note;
}
