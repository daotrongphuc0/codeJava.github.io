package com.tinhthuecanhan.service;

import java.util.List;

import com.tinhthuecanhan.dto.ChungMinhTaiChinhDTO;
import com.tinhthuecanhan.entity.ChungMinhTaiChinhEntity;

public interface IChungMinhTaiChinhService {
	List<ChungMinhTaiChinhEntity> findAllByTDKID(Long thueDuocKhaiId);
	ChungMinhTaiChinhEntity findOne(Long id);
	ChungMinhTaiChinhEntity save(ChungMinhTaiChinhDTO cmtc);
	
}
