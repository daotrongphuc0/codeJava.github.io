package com.tinhthuecanhan.service;

import java.util.List;

import com.tinhthuecanhan.dto.ThueDuocKhaiDTO;
import com.tinhthuecanhan.entity.NguoiDungEntity;
import com.tinhthuecanhan.entity.ThueDuocKhaiEntity;

public interface IThueDuocKhaiService {
	List<ThueDuocKhaiEntity> findAllByND(NguoiDungEntity nguoidungentity);
	List<ThueDuocKhaiEntity> findAllByVungAndSTT(Long vung, String status);
	List<ThueDuocKhaiEntity> findAllBySTT( String status);
	List<ThueDuocKhaiEntity> findAll();
	ThueDuocKhaiEntity findById(Long id);
	ThueDuocKhaiEntity save(ThueDuocKhaiDTO model);
	List<ThueDuocKhaiEntity> findAllByVung(Long vung);
	
	
}
