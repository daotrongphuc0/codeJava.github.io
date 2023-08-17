package com.tinhthuecanhan.converter;

import org.springframework.stereotype.Component;

import com.tinhthuecanhan.dto.RoleDTO;
import com.tinhthuecanhan.entity.RoleEntity;

@Component
public class RoleConverter {

	public RoleDTO toDTO(RoleEntity enti) {
		RoleDTO res = new RoleDTO();
		res.setId(enti.getId());
		res.setCreatedBy(enti.getCreatedBy());
		res.setCreatedDate(enti.getCreatedDate());
		res.setModifiedBy(enti.getModifiedBy());
		res.setModifiedDate(enti.getModifiedDate());
		res.setIsAdmin(enti.getIsAdmin());
		res.setXemDanhSach(enti.getXemDanhSach());
		res.setCauHinh(enti.getCauHinh());
		res.setXuatBaoCao(enti.getXuatBaoCao());
		
		return res;
	}
	
	public RoleEntity toEntity(RoleDTO enti) {
		RoleEntity res = new RoleEntity();
		res.setIsAdmin(enti.getIsAdmin());
		res.setXemDanhSach(enti.getXemDanhSach());
		res.setCauHinh(enti.getCauHinh());
		res.setXuatBaoCao(enti.getXuatBaoCao());
		return res;
	}

}
