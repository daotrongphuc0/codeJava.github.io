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
@Table(name="category")
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cat_id;
	@Column(name="cat_name")
	private String cat_name;
	@Column(name="cat_description")
	private String cat_description;
	@Column(name="cat_picture")
	private String cat_picture;
	@Column(name="cat_active")
	private boolean cat_active;
}
