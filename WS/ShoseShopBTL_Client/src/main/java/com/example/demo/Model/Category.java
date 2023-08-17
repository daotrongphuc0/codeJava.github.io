package com.example.demo.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Category {
	private int cat_id;
	private String cat_name;
	private String cat_description;
	private String cat_picture;
	private boolean cat_active;
}
