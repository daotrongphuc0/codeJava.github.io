package com.tinhthuecanhan.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tinhthuecanhan.entity.NguoiDungEntity;
import com.tinhthuecanhan.entity.ThueDuocKhaiEntity;

public interface ThueDuocKhaiRepository extends JpaRepository<ThueDuocKhaiEntity, Long>{
	List<ThueDuocKhaiEntity> findAllByNguoiDungId(NguoiDungEntity nguoidungentity);
	List<ThueDuocKhaiEntity> findAllByVungAndTrangThai(Long vung, String trangThai);
	List<ThueDuocKhaiEntity> findAllByTrangThai( String trangThai);
	List<ThueDuocKhaiEntity> findAll();
	List<ThueDuocKhaiEntity> findAllByVung(Long vung);

}
