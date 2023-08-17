package com.example.demo.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

	private int pro_id;
	private String pro_name;
	private String pro_description;
	private String pro_picture;
	private int pro_rank;
	private String pro_color;
	private int pro_size;
	private int pro_discount;
	private int pro_quantity;
	private long pro_price;
	private String pro_paterial;
	private String pro_note;
	private int sup_id;
	private int cat_id;
	
}
