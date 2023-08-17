package com.tinhthuecanhan.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tinhthuecanhan.converter.RoleConverter;
import com.tinhthuecanhan.dto.RoleDTO;
import com.tinhthuecanhan.entity.RoleEntity;
import com.tinhthuecanhan.repository.RoleRepository;
import com.tinhthuecanhan.service.IRoleService;

@Service
public class RoleService implements IRoleService{
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private RoleConverter roleConverter;

	@Override
	public RoleEntity findOne(Long id) {
		return roleRepository.findOne(id); 
	}

	@Override
	public RoleEntity getRoleById(Long id) {
		
		return roleRepository.getOne(id);
	}

	@Override
	public RoleEntity save(RoleDTO roleDTO) {
		
		return roleRepository.save(roleConverter.toEntity(roleDTO));
	}

}
