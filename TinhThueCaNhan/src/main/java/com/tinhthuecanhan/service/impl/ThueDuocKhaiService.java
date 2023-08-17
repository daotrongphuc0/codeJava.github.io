package com.tinhthuecanhan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tinhthuecanhan.converter.ThueDuocKhaiConverter;
import com.tinhthuecanhan.dto.ThueDuocKhaiDTO;
import com.tinhthuecanhan.entity.NguoiDungEntity;
import com.tinhthuecanhan.entity.ThueDuocKhaiEntity;
import com.tinhthuecanhan.repository.CauHinhRepository;
import com.tinhthuecanhan.repository.ThueDuocKhaiRepository;
import com.tinhthuecanhan.service.IThueDuocKhaiService;

@Service
public class ThueDuocKhaiService implements IThueDuocKhaiService{
	
	@Autowired
	private ThueDuocKhaiRepository thueDuocKhaiRepository;
	
	@Autowired
	private CauHinhRepository cauHinhRepository;
	
	@Autowired
	private ThueDuocKhaiConverter thueDuocKhaiConverter;

	@Override
	public List<ThueDuocKhaiEntity> findAllByND(NguoiDungEntity nguoidungentity) {
		
		return thueDuocKhaiRepository.findAllByNguoiDungId(nguoidungentity);
	}

	@Override
	public List<ThueDuocKhaiEntity> findAllByVungAndSTT(Long vung, String status) {
		return thueDuocKhaiRepository.findAllByVungAndTrangThai(vung, status);
	}

	@Override
	public List<ThueDuocKhaiEntity> findAllBySTT(String status) {
		return thueDuocKhaiRepository.findAllByTrangThai(status);
	}

	@Override
	public List<ThueDuocKhaiEntity> findAll() {
		return thueDuocKhaiRepository.findAll();
	}

	@Override
	public ThueDuocKhaiEntity findById(Long id) {
		return thueDuocKhaiRepository.getOne(id);
	}

	@Override
	public ThueDuocKhaiEntity save(ThueDuocKhaiDTO model) { 
		
		ThueDuocKhaiEntity res = thueDuocKhaiConverter.toEntity(model);
		
		res.setCauHinhEntity(cauHinhRepository.findOneByStatus("active"));
		return thueDuocKhaiRepository.save(thueDuocKhaiConverter.toEntity(model));
	}

	@Override
	public List<ThueDuocKhaiEntity> findAllByVung(Long vung) {
		// TODO Auto-generated method stub
		return thueDuocKhaiRepository.findAllByVung(vung);
	}

	

}
