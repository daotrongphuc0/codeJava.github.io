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
@Table(name="product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pro_id;
	@Column(name="pro_name")
	private String pro_name;
	@Column(name="pro_description")
	private String pro_description;
	@Column(name="pro_picture")
	private String pro_picture;
	@Column(name="pro_rank")
	private int pro_rank;
	@Column(name="pro_color")
	private String pro_color;
	@Column(name="pro_size")
	private int pro_size;
	@Column(name="pro_discount")
	private int pro_discount;
	@Column(name="pro_quantity")
	private int pro_quantity;
	@Column(name="pro_price")
	private long pro_price;
	@Column(name="pro_material")
	private String pro_paterial;
	@Column(name="pro_note")
	private String pro_note;
	@Column(name="sup_id")
	private int sup_id;
	@Column(name="cat_id")
	private int cat_id;
	
}
