package com.tinhthuecanhan.converter;

import org.springframework.stereotype.Component;

import com.tinhthuecanhan.dto.HoaDonDTO;
import com.tinhthuecanhan.entity.HoaDonEntity;

@Component
public class HoaDonConverter {
	public HoaDonDTO toDTO(HoaDonEntity enti) {
		HoaDonDTO dto = new HoaDonDTO();
		dto.setId(enti.getId());
		dto.setCreatedBy(enti.getCreatedBy());
		dto.setCreatedDate(enti.getCreatedDate());
		dto.setModifiedBy(enti.getModifiedBy());
		dto.setModifiedDate(enti.getModifiedDate());
		
		dto.setThueDuocKhaiId(enti.getThueDuocKhaiId());
		dto.setTongTien(enti.getTongTien());
		

		return dto;
	}

	public HoaDonEntity toEntity(HoaDonDTO enti) {

		HoaDonEntity dto = new HoaDonEntity();

		dto.setThueDuocKhaiId(enti.getThueDuocKhaiId());
		dto.setTongTien(enti.getTongTien());

		return dto;
	}
}
