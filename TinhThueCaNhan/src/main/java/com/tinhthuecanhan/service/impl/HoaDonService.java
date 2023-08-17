package com.tinhthuecanhan.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tinhthuecanhan.converter.HoaDonConverter;
import com.tinhthuecanhan.dto.HoaDonDTO;
import com.tinhthuecanhan.entity.HoaDonEntity;
import com.tinhthuecanhan.repository.HoaDonRepository;
import com.tinhthuecanhan.service.IHoaDonService;

@Service
public class HoaDonService implements IHoaDonService{

	@Autowired
	private HoaDonRepository hoaDonRepository;
	
	@Autowired
	private HoaDonConverter hoaDonConverter;
	
	@Override
	public HoaDonEntity findById(Long id) {
		
		return hoaDonRepository.getOne(id);
	}

	@Override
	public HoaDonEntity save(HoaDonDTO hoaDonDTO) {
		// TODO Auto-generated method stub
		return hoaDonRepository.save(hoaDonConverter.toEntity(hoaDonDTO));
	}

	
}
