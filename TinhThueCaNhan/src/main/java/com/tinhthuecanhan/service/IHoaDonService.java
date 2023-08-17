package com.tinhthuecanhan.service;

import com.tinhthuecanhan.dto.HoaDonDTO;
import com.tinhthuecanhan.entity.HoaDonEntity;

public interface IHoaDonService {
	HoaDonEntity findById(Long id);
	HoaDonEntity save(HoaDonDTO hoaDonDTO);
}
