package com.example.demo.Service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.Model.Category;

@Service
public class CategoryService {

	@Autowired
	private RestTemplate restTemplate;
	
	public List<Category> GetAllCategory(){
		String url ="http://localhost:8084/category/getCategory";
		ResponseEntity<Category[]> responseEntity = restTemplate.getForEntity(url, Category[].class);
		Category[] categorys = responseEntity.getBody();
		List<Category> list = Arrays.asList(categorys);
        return list;
	}
}
