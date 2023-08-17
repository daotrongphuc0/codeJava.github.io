package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.Model.Category;
import com.example.demo.Service.CategoryService;

@Controller
public class CategoryController {

	@Autowired
	private CategoryService categoryService;
	@GetMapping("/category")
	public String GetAllCategory() {
		List<Category> list = categoryService.GetAllCategory();
		for(Category cat : list) {
			System.err.println(cat.getCat_name());
		}
		return "pay";
	}
}
