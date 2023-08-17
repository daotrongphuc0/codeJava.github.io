package com.tinhthuecanhan.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tblThueDuocKhai")
public class ThueDuocKhaiEntity  extends BaseEntity{
	
	@Column
    private Long thangKhai;
	@Column
    private Long namKhai;
	
	@Column
    private float thuNhap;
	
	@Column
    private float mucLuongDongBH;
	
	@Column
    private Long vung;
	
	@Column
    private Long nguoiPhuThuoc;
	
	@Column
    private String trangThai;
	
	@Column
    private Long nguoiDungId;
	
	@ManyToOne
    private CauHinhEntity cauHinhEntity;
	

	
    public ThueDuocKhaiEntity() {
    }

    
	public Long getThangKhai() {
		return thangKhai;
	}


	public void setThangKhai(Long thangKhai) {
		this.thangKhai = thangKhai;
	}


	public Long getNamKhai() {
		return namKhai;
	}


	public void setNamKhai(Long namKhai) {
		this.namKhai = namKhai;
	}








	public Long getNguoiDungId() {
		return nguoiDungId;
	}


	public void setNguoiDungId(Long nguoiDungId) {
		this.nguoiDungId = nguoiDungId;
	}





	public CauHinhEntity getCauHinhEntity() {
		return cauHinhEntity;
	}


	public void setCauHinhEntity(CauHinhEntity cauHinhEntity) {
		this.cauHinhEntity = cauHinhEntity;
	}


	

	public float getThuNhap() {
		return thuNhap;
	}


	public void setThuNhap(float thuNhap) {
		this.thuNhap = thuNhap;
	}


	public float getMucLuongDongBH() {
		return mucLuongDongBH;
	}


	public void setMucLuongDongBH(float mucLuongDongBH) {
		this.mucLuongDongBH = mucLuongDongBH;
	}


	public Long getVung() {
		return vung;
	}

	public void setVung(Long vung) {
		this.vung = vung;
	}

	public Long getNguoiPhuThuoc() {
		return nguoiPhuThuoc;
	}

	public void setNguoiPhuThuoc(Long nguoiPhuThuoc) {
		this.nguoiPhuThuoc = nguoiPhuThuoc;
	}

	public String getTrangThai() {
		return trangThai;
	}

	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}


    

 
}
