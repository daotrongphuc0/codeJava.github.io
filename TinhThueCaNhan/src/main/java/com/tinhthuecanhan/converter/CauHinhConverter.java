package com.tinhthuecanhan.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tinhthuecanhan.dto.CauHinhDTO;
import com.tinhthuecanhan.entity.CauHinhEntity;
import com.tinhthuecanhan.repository.CauHinhRepository;
@Component
public class CauHinhConverter {
	
	@Autowired
	private CauHinhRepository cauHinhRepository;
	
	public CauHinhDTO toDTO(CauHinhEntity enti) {
		CauHinhDTO dto = new CauHinhDTO();
		dto.setId(enti.getId());
		dto.setCreatedBy(enti.getCreatedBy());
		dto.setCreatedDate(enti.getCreatedDate());
		dto.setModifiedBy(enti.getModifiedBy());
		dto.setModifiedDate(enti.getModifiedDate());
		
		dto.setStatus(enti.getStatus());
	    dto.setGiamTruGiaCanh(enti.getGiamTruGiaCanh());
	    dto.setGiamTruNguoiPhuThuoc(enti.getGiamTruNguoiPhuThuoc());
	    dto.setMucDongBHYT(enti.getMucDongBHYT());
	    dto.setMucLuongToiDaBHYT(enti.getMucLuongToiDaBHYT());
	    dto.setMucDongBHXH(enti.getMucDongBHXH());
	    dto.setMucLuongToiDaBHXH(enti.getMucLuongToiDaBHXH());
	    dto.setMucDongBHTN(enti.getMucDongBHTN());
	    dto.setMucLuongToiDaBHTN(enti.getMucLuongToiDaBHTN());
	    dto.setVung1(enti.getVung1());
	    dto.setVung2(enti.getVung2());
	    dto.setVung3(enti.getVung3());
	    dto.setVung4(enti.getVung4());
	    dto.setNhoHonBang5(enti.getNhoHonBang5());
	    dto.setTu5den10(enti.getTu5den10());
	    dto.setTu10den18(enti.getTu10den18());
	    dto.setTu18den32(enti.getTu18den32());
	    dto.setTu32den52(enti.getTu32den52());
	    dto.setTu52den80(enti.getTu52den80());
	    dto.setTren80(enti.getTren80());

		return dto;
	}

	public CauHinhEntity toEntity(CauHinhDTO enti) {
		if(enti == null) {
			return cauHinhRepository.findOneByStatus("active");
		}
		CauHinhEntity dto = new CauHinhEntity();
		dto.setGiamTruGiaCanh(enti.getGiamTruGiaCanh());
	    dto.setGiamTruNguoiPhuThuoc(enti.getGiamTruNguoiPhuThuoc());
	    dto.setMucDongBHYT(enti.getMucDongBHYT());
	    dto.setMucLuongToiDaBHYT(enti.getMucLuongToiDaBHYT());
	    dto.setMucDongBHXH(enti.getMucDongBHXH());
	    dto.setMucLuongToiDaBHXH(enti.getMucLuongToiDaBHXH());
	    dto.setMucDongBHTN(enti.getMucDongBHTN());
	    dto.setMucLuongToiDaBHTN(enti.getMucLuongToiDaBHTN());
	    dto.setVung1(enti.getVung1());
	    dto.setVung2(enti.getVung2());
	    dto.setVung3(enti.getVung3());
	    dto.setVung4(enti.getVung4());
	    dto.setNhoHonBang5(enti.getNhoHonBang5());
	    dto.setTu5den10(enti.getTu5den10());
	    dto.setTu10den18(enti.getTu10den18());
	    dto.setTu18den32(enti.getTu18den32());
	    dto.setTu32den52(enti.getTu32den52());
	    dto.setTu52den80(enti.getTu52den80());
	    dto.setTren80(enti.getTren80());

		return dto;
	}
}
