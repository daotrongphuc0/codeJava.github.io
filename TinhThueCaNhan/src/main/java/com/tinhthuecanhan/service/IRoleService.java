package com.tinhthuecanhan.service;

import com.tinhthuecanhan.dto.RoleDTO;
import com.tinhthuecanhan.entity.RoleEntity;


public interface IRoleService {
	RoleEntity findOne(Long Id);

	RoleEntity getRoleById(Long id);
	
	RoleEntity save(RoleDTO roleDTO);
}
