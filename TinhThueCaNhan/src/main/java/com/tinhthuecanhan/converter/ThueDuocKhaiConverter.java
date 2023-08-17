package com.tinhthuecanhan.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tinhthuecanhan.dto.ThueDuocKhaiDTO;
import com.tinhthuecanhan.entity.ThueDuocKhaiEntity;
@Component
public class ThueDuocKhaiConverter {
	
	@Autowired
	private CauHinhConverter cauHinhConverter;


	public ThueDuocKhaiDTO toDTO(ThueDuocKhaiEntity enti) {
		ThueDuocKhaiDTO dto = new ThueDuocKhaiDTO();
		dto.setId(enti.getId());
		dto.setCreatedBy(enti.getCreatedBy());
		dto.setCreatedDate(enti.getCreatedDate());
		dto.setModifiedBy(enti.getModifiedBy());
		dto.setModifiedDate(enti.getModifiedDate());
		dto.setNguoiDungId(enti.getNguoiDungId());
		dto.setCauHinhDTO(cauHinhConverter.toDTO(enti.getCauHinhEntity()));
		dto.setThuNhap(enti.getThuNhap());
		dto.setMucLuongDongBH(enti.getMucLuongDongBH());
		dto.setVung(enti.getVung());
		dto.setNguoiPhuThuoc(enti.getNguoiPhuThuoc());
		dto.setTrangThai(enti.getTrangThai());
		dto.setThangKhai(enti.getThangKhai());
		dto.setNamKhai(enti.getNamKhai());
		return dto;
	}

	public ThueDuocKhaiEntity toEntity(ThueDuocKhaiDTO enti) {

		ThueDuocKhaiEntity dto = new ThueDuocKhaiEntity();
		dto.setNguoiDungId(enti.getNguoiDungId());
		dto.setThuNhap(enti.getThuNhap());
		dto.setMucLuongDongBH(enti.getMucLuongDongBH());
		dto.setCauHinhEntity(cauHinhConverter.toEntity(enti.getCauHinhDTO()));
		dto.setVung(enti.getVung());
		dto.setNguoiPhuThuoc(enti.getNguoiPhuThuoc());
		dto.setTrangThai(enti.getTrangThai());
		dto.setThangKhai(enti.getThangKhai());
		dto.setNamKhai(enti.getNamKhai());
		return dto;
	}
	
	public List<ThueDuocKhaiDTO> toDTO(List<ThueDuocKhaiEntity> entity) {
		List<ThueDuocKhaiDTO> res = new ArrayList<>();
		for(ThueDuocKhaiEntity enti:entity) {
			ThueDuocKhaiDTO dto = new ThueDuocKhaiDTO();
			dto.setId(enti.getId());
			dto.setCreatedBy(enti.getCreatedBy());
			dto.setCreatedDate(enti.getCreatedDate());
			dto.setModifiedBy(enti.getModifiedBy());
			dto.setCauHinhDTO(cauHinhConverter.toDTO(enti.getCauHinhEntity()));
			dto.setModifiedDate(enti.getModifiedDate());
			dto.setNguoiDungId(enti.getNguoiDungId());
			dto.setThuNhap(enti.getThuNhap());
			dto.setMucLuongDongBH(enti.getMucLuongDongBH());
			dto.setVung(enti.getVung());
			dto.setNguoiPhuThuoc(enti.getNguoiPhuThuoc());
			dto.setTrangThai(enti.getTrangThai());
			dto.setThangKhai(enti.getThangKhai());
			dto.setNamKhai(enti.getNamKhai());


			res.add(dto);
		}
		return res;
	}

	public List<ThueDuocKhaiEntity> toEntity(List<ThueDuocKhaiDTO> entity) {
		List<ThueDuocKhaiEntity> res = new ArrayList<>();
		for(ThueDuocKhaiDTO enti:entity) {
			ThueDuocKhaiEntity dto = new ThueDuocKhaiEntity();
			dto.setNguoiDungId(enti.getNguoiDungId());
			dto.setThuNhap(enti.getThuNhap());
			dto.setMucLuongDongBH(enti.getMucLuongDongBH());
			dto.setVung(enti.getVung());
			dto.setNguoiPhuThuoc(enti.getNguoiPhuThuoc());
			dto.setCauHinhEntity(cauHinhConverter.toEntity(enti.getCauHinhDTO()));
			dto.setTrangThai(enti.getTrangThai());
			dto.setThangKhai(enti.getThangKhai());
			dto.setNamKhai(enti.getNamKhai());

			res.add(dto);
		}
		return res;
	}

}
