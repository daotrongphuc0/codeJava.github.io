package com.tinhthuecanhan.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tinhthuecanhan.converter.RoleConverter;
import com.tinhthuecanhan.dto.RoleDTO;
import com.tinhthuecanhan.entity.RoleEntity;
import com.tinhthuecanhan.service.IRoleService;

@CrossOrigin
@RestController
public class RoleAPI {
	
	@Autowired
	private IRoleService roleService;
	
	@Autowired
	private RoleConverter roleConverter;
	
	@GetMapping("role/{id}")
	public RoleDTO getRoleById(@PathVariable Long id) {
	    RoleEntity entity = roleService.getRoleById(id);
	    return roleConverter.toDTO(entity);
	}
	
	@PostMapping(value = "/role")
	public RoleDTO createNew(@RequestBody RoleDTO model) {
		return roleConverter.toDTO(roleService.save(model));
	}
}
