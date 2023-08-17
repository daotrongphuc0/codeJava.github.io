package com.tinhthuecanhan.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tinhthuecanhan.dto.AdminDTO;
import com.tinhthuecanhan.entity.AdminEntity;
@Component
public class AdminConverter {

	@Autowired
	private RoleConverter roleCoverter;
	
	public AdminDTO toDTO(AdminEntity enti) {
		AdminDTO dto = new AdminDTO();
		dto.setId(enti.getId());
		dto.setCreatedBy(enti.getCreatedBy());
		dto.setCreatedDate(enti.getCreatedDate());
		dto.setModifiedBy(enti.getModifiedBy());
		dto.setModifiedDate(enti.getModifiedDate());
		dto.setUsername(enti.getUsername());
		dto.setPassword(enti.getPassword());
		dto.setRole(roleCoverter.toDTO(enti.getRole()));
		dto.setName(enti.getName());
		dto.setEmail(enti.getEmail());
		dto.setSdt(enti.getSdt());
		dto.setDiaChi(enti.getDiaChi());
		return dto;
	}

	public AdminEntity toEntity(AdminDTO enti) {

		AdminEntity dto = new AdminEntity();
		dto.setUsername(enti.getUsername());
		dto.setPassword(enti.getPassword());
		dto.setRole(roleCoverter.toEntity(enti.getRole()));
		dto.setName(enti.getName());
		dto.setEmail(enti.getEmail());
		dto.setSdt(enti.getSdt());
		dto.setDiaChi(enti.getDiaChi());
		return dto;
	}

}
