package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Category;
import com.example.demo.Service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;
	
	@GetMapping("/getCategory")
	public List<Category> GetAllCategory(){
		List<Category> list = categoryService.GetAllCategory();
		for(Category cat : list) {
			System.err.print(cat.getCat_name());
		}
		return categoryService.GetAllCategory();
	}
}
