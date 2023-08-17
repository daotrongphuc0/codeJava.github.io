package com.tinhthuecanhan.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.tinhthuecanhan.dto.ChungMinhTaiChinhDTO;
import com.tinhthuecanhan.entity.ChungMinhTaiChinhEntity;

@Component
public class ChungMinhTaiChinhConverter {
	

	

	public ChungMinhTaiChinhDTO toDTO(ChungMinhTaiChinhEntity enti) {
		ChungMinhTaiChinhDTO dto = new ChungMinhTaiChinhDTO();
		dto.setId(enti.getId());
		dto.setCreatedBy(enti.getCreatedBy());
		dto.setCreatedDate(enti.getCreatedDate());
		dto.setModifiedBy(enti.getModifiedBy());
		dto.setModifiedDate(enti.getModifiedDate());
		dto.setHinhAnh(enti.getHinhAnh());
		dto.setThueDuocKhaiId(enti.getThueDuocKhaiId());
		return dto;
	}

	public ChungMinhTaiChinhEntity toEntity(ChungMinhTaiChinhDTO enti) {

		ChungMinhTaiChinhEntity dto = new ChungMinhTaiChinhEntity();
		dto.setHinhAnh(enti.getHinhAnh());
		dto.setThueDuocKhaiId(enti.getThueDuocKhaiId());
		return dto;
	}
	
	public List<ChungMinhTaiChinhDTO> toDTO(List<ChungMinhTaiChinhEntity> entity) {
		List<ChungMinhTaiChinhDTO> res = new ArrayList<>();
		for(ChungMinhTaiChinhEntity enti:entity) {
			ChungMinhTaiChinhDTO dto = new ChungMinhTaiChinhDTO();
			dto.setId(enti.getId());
			dto.setCreatedBy(enti.getCreatedBy());
			dto.setCreatedDate(enti.getCreatedDate());
			dto.setModifiedBy(enti.getModifiedBy());
			dto.setModifiedDate(enti.getModifiedDate());
			dto.setHinhAnh(enti.getHinhAnh());
			dto.setThueDuocKhaiId(enti.getThueDuocKhaiId());
			res.add(dto);
		}
		return res;
	}

	public List<ChungMinhTaiChinhEntity> toEntity(List<ChungMinhTaiChinhDTO> entity) {
		List<ChungMinhTaiChinhEntity> res = new ArrayList<>();
		for(ChungMinhTaiChinhDTO enti:entity) {
			ChungMinhTaiChinhEntity dto = new ChungMinhTaiChinhEntity();
			dto.setHinhAnh(enti.getHinhAnh());
			dto.setThueDuocKhaiId(enti.getThueDuocKhaiId());
			res.add(dto);
		}
		return res;
	}
}
