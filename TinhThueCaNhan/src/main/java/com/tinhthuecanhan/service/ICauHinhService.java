package com.tinhthuecanhan.service;

import com.tinhthuecanhan.dto.CauHinhDTO;
import com.tinhthuecanhan.entity.CauHinhEntity;

public interface ICauHinhService {
	CauHinhEntity findById(Long id);
	CauHinhEntity findCurrent();
	CauHinhEntity save(CauHinhDTO model);
}
