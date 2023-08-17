package com.tinhthuecanhan.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tblChungMinhTaiChinh")
public class ChungMinhTaiChinhEntity extends BaseEntity {
	
	@Column
	private String hinhAnh;

	private Long thueDuocKhaiId;
	
	public ChungMinhTaiChinhEntity() {
		// TODO Auto-generated constructor stub
	}

	public String getHinhAnh() {
		return hinhAnh;
	}

	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}

	public Long getThueDuocKhaiId() {
		return thueDuocKhaiId;
	}

	public void setThueDuocKhaiId(Long thueDuocKhaiId) {
		this.thueDuocKhaiId = thueDuocKhaiId;
	}


	

}
