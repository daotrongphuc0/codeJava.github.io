package com.tinhthuecanhan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tinhthuecanhan.converter.ChungMinhTaiChinhConverter;
import com.tinhthuecanhan.dto.ChungMinhTaiChinhDTO;
import com.tinhthuecanhan.entity.ChungMinhTaiChinhEntity;
import com.tinhthuecanhan.repository.ChungMinhTaiChinhRepository;
import com.tinhthuecanhan.service.IChungMinhTaiChinhService;

@Service
public class ChungMinhTaiChinhService implements IChungMinhTaiChinhService{
	
	@Autowired
	private ChungMinhTaiChinhRepository chungMinhTaiChinhRepository;
	
	@Autowired
	private ChungMinhTaiChinhConverter chungMinhTaiChinhConverter;

	@Override
	public List<ChungMinhTaiChinhEntity> findAllByTDKID(Long thueDuocKhaiId) {
		
		return chungMinhTaiChinhRepository.findAllByThueDuocKhaiId(thueDuocKhaiId);
	}

	@Override
	public ChungMinhTaiChinhEntity findOne(Long id) {
		// TODO Auto-generated method stub
		return chungMinhTaiChinhRepository.getOne(id);
	}

	@Override
	public ChungMinhTaiChinhEntity save(ChungMinhTaiChinhDTO cmtc) {
		
		return chungMinhTaiChinhRepository.save(chungMinhTaiChinhConverter.toEntity(cmtc));
	}

	

}
