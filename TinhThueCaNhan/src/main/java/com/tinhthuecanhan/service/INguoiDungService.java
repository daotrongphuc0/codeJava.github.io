package com.tinhthuecanhan.service;



import java.util.List;

import org.springframework.data.domain.Pageable;

import com.tinhthuecanhan.dto.NguoiDungDTO;
import com.tinhthuecanhan.entity.NguoiDungEntity;


public interface INguoiDungService {

	NguoiDungEntity findOne(long id);
	NguoiDungEntity save(NguoiDungDTO nguoiDungDTO);
	

	List<NguoiDungDTO> findAll(Pageable pageable);
	List<NguoiDungDTO> findAll();
	int totalItem();
	
}
