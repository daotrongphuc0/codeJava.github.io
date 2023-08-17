package com.tinhthuecanhan.service.impl;

import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tinhthuecanhan.converter.CauHinhConverter;
import com.tinhthuecanhan.dto.CauHinhDTO;
import com.tinhthuecanhan.entity.CauHinhEntity;
import com.tinhthuecanhan.repository.CauHinhRepository;
import com.tinhthuecanhan.service.ICauHinhService;

@Service
public class CauHinhService implements ICauHinhService{
	
	@Autowired
	private CauHinhRepository cauHinhRepository;

	@Autowired
	private CauHinhConverter cauHinhConverter;

	@Override
	public CauHinhEntity findById(Long id) {
//		CauHinhEntity cauHinhEntity = cauHinhRepository.getOne(id);
//		if (cauHinhEntity == null) {
//			throw new NullPointerException("Không tìm thấy cấu hình.");
//			}
//		return cauHinhEntity;
		
		Optional<CauHinhEntity> optionalCauHinhEntity = cauHinhRepository.findOneById(id);
	    if (optionalCauHinhEntity.isPresent()) {
	        return optionalCauHinhEntity.get();
	    } else {
	        throw new EntityNotFoundException("Không tìm thấy cấu hình với id = " + id);
	    }

	}

	@Override
	public CauHinhEntity findCurrent() {
		
		return cauHinhRepository.findOneByStatus("active");
	}



	@Override
	public CauHinhEntity save(CauHinhDTO model) {
		CauHinhEntity tmp  = cauHinhRepository.findOneByStatus("active");
		if(tmp != null) {
			tmp.setStatus("inactive");
			cauHinhRepository.save(tmp);
		}
		CauHinhEntity res = cauHinhConverter.toEntity(model);
		res.setStatus("active");		
		return cauHinhRepository.save(res);
	}



}
