package com.tinhthuecanhan.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.tinhthuecanhan.entity.CauHinhEntity;


public interface CauHinhRepository extends JpaRepository<CauHinhEntity, Long>{
	CauHinhEntity findOneByStatus(String Status);
	Optional<CauHinhEntity> findOneById(Long id);

}
