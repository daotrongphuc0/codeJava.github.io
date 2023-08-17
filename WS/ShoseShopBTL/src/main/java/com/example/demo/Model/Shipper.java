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
@Table(name="shipper")
public class Shipper {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ship_id;
	@Column(name="ship_name")
	private String ship_name;
	@Column(name="ship_sex")
	private String ship_sex;
	@Column(name="ship_company_name")
	private String ship_company_name;
	@Column(name="ship_phone")
	private String ship_phone;
}
