package com.tinhthuecanhan.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tinhthuecanhan.dto.AccountDTO;
import com.tinhthuecanhan.dto.NguoiDungDTO;
import com.tinhthuecanhan.entity.AccountEntity;
import com.tinhthuecanhan.entity.NguoiDungEntity;

@Component
public class AccountConverter {
	@Autowired
	private RoleConverter roleCoverter;
	

	public AccountDTO toDTO(AccountEntity enti) {
		AccountDTO dto = new NguoiDungDTO();
		dto.setId(enti.getId());
		dto.setCreatedBy(enti.getCreatedBy());
		dto.setCreatedDate(enti.getCreatedDate());
		dto.setModifiedBy(enti.getModifiedBy());
		dto.setModifiedDate(enti.getModifiedDate());
		dto.setUsername(enti.getUsername());
		dto.setPassword(enti.getPassword());
		dto.setRole(roleCoverter.toDTO(enti.getRole()));
		dto.setName(enti.getName());
		return dto;
	}

	public AccountEntity toEntity(AccountDTO enti) {

		AccountEntity dto = new NguoiDungEntity();
		dto.setUsername(enti.getUsername());
		dto.setPassword(enti.getPassword());
		dto.setRole(roleCoverter.toEntity(enti.getRole()));
		dto.setName(enti.getName());
		return dto;
	}
}
