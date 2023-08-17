package com.tinhthuecanhan.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tblHoaDon")
public class HoaDonEntity extends BaseEntity{
	
	@Column
    private float tongTien;
	

    private Long thueDuocKhaiId;

    public HoaDonEntity() {
    }


    
    public Long getThueDuocKhaiId() {
		return thueDuocKhaiId;
	}



	public void setThueDuocKhaiId(Long thueDuocKhaiId) {
		this.thueDuocKhaiId = thueDuocKhaiId;
	}



	public float getTongTien() {
        return tongTien;
    }

    public void setTongTien(float tongTien) {
        this.tongTien = tongTien;
    }

}
