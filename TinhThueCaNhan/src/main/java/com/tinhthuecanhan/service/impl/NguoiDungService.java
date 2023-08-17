package com.tinhthuecanhan.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.tinhthuecanhan.converter.NguoiDungConverter;
import com.tinhthuecanhan.dto.NguoiDungDTO;
import com.tinhthuecanhan.entity.NguoiDungEntity;
import com.tinhthuecanhan.repository.NguoiDungRepository;
import com.tinhthuecanhan.service.INguoiDungService;

@Service
public class NguoiDungService implements INguoiDungService{
	@Autowired
	private NguoiDungRepository nguoiDungRepository;

	@Autowired
	private NguoiDungConverter nguoiDungConverter;
	

	


	@Override
	public NguoiDungEntity findOne(long id) {
		return nguoiDungRepository.getOne(id);
	}




	@Override
	public NguoiDungEntity save(NguoiDungDTO nguoiDungDTO) {
				
		NguoiDungEntity nde = new NguoiDungEntity();
		nde = nguoiDungRepository.save(nguoiDungConverter.toEntity(nguoiDungDTO));
		return nde;
	}




	@Override
	public List<NguoiDungDTO> findAll(Pageable pageable) {
		List<NguoiDungDTO> results = new ArrayList<>();
		List<NguoiDungEntity> entities = nguoiDungRepository.findAll(pageable).getContent();
		for (NguoiDungEntity item: entities) {
			NguoiDungDTO newDTO = nguoiDungConverter.toDTO(item);
			results.add(newDTO);
		}
		return results;
	}




	@Override
	public List<NguoiDungDTO> findAll() {
		List<NguoiDungDTO> results = new ArrayList<>();
		List<NguoiDungEntity> entities = nguoiDungRepository.findAll();
		for (NguoiDungEntity item: entities) {
			NguoiDungDTO nguoiDungDTO = nguoiDungConverter.toDTO(item);
			results.add(nguoiDungDTO);
		}
		return results;

	}




	@Override
	public int totalItem() {
		return (int) nguoiDungRepository.count();
	}
	
	
}
