package com.tinhthuecanhan.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tinhthuecanhan.entity.ChungMinhTaiChinhEntity;

public interface ChungMinhTaiChinhRepository extends JpaRepository<ChungMinhTaiChinhEntity, Long>{
	List<ChungMinhTaiChinhEntity> findAllByThueDuocKhaiId(Long thueDuocKhaiId);
	ChungMinhTaiChinhEntity getOne(Long id);
}
