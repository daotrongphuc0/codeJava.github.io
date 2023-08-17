package com.tinhthuecanhan.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tinhthuecanhan.dto.NguoiDungDTO;
import com.tinhthuecanhan.entity.NguoiDungEntity;


@Component
public class NguoiDungConverter {
	
	@Autowired
	private RoleConverter roleCoverter;
	

	public NguoiDungDTO toDTO(NguoiDungEntity enti) {
		NguoiDungDTO dto = new NguoiDungDTO();
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
		dto.setMaSoThue(enti.getMaSoThue());
		dto.setDiaChi(enti.getDiaChi());
		return dto;
	}

	public NguoiDungEntity toEntity(NguoiDungDTO enti) {

		NguoiDungEntity dto = new NguoiDungEntity();
		dto.setUsername(enti.getUsername());
		dto.setPassword(enti.getPassword());
		dto.setRole(roleCoverter.toEntity(enti.getRole()));
		dto.setName(enti.getName());
		dto.setEmail(enti.getEmail());
		dto.setSdt(enti.getSdt());
		dto.setMaSoThue(enti.getMaSoThue());
		dto.setDiaChi(enti.getDiaChi());
		return dto;
	}



}
