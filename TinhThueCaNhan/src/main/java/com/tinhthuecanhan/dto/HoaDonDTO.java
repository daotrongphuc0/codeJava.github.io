package com.tinhthuecanhan.dto;

public class HoaDonDTO extends BaseDTO {

	private Long thueDuocKhaiId;
	private float tongTien;

	public HoaDonDTO() {
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
