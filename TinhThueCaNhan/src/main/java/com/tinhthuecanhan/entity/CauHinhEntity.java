package com.tinhthuecanhan.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tblCauHinh")
public class CauHinhEntity extends BaseEntity{
	
	@Column
    private float giamTruGiaCanh;
	
	@Column
    private float giamTruNguoiPhuThuoc;
	
	@Column
    private float mucDongBHYT;
	
	@Column
    private float mucLuongToiDaBHYT;
	
	@Column
    private float mucDongBHXH;
	
	@Column
    private float mucLuongToiDaBHXH;
	
	@Column
    private float mucDongBHTN;
	
	@Column
    private float mucLuongToiDaBHTN;
	
	@Column
    private float vung1;
	
	@Column
    private float vung2;
	
	@Column
    private float vung3;
	
	@Column
    private float vung4;
	
	@Column
    private float nhoHonBang5;
	
	@Column
    private float tu5den10;
	
	@Column
    private float tu10den18;
	
	@Column
    private float tu18den32;
	
	@Column
    private float tu32den52;
	
	@Column
    private float tu52den80;
	
	@Column
    private float tren80;
	
	@Column
    private String status;
	
	@ManyToOne
    @JoinColumn(name = "admin_id")
    private AdminEntity admin;
	
	@OneToMany(mappedBy = "cauHinhEntity")
    private List<ThueDuocKhaiEntity> listThueDuocKhai;

	public float getGiamTruGiaCanh() {
		return giamTruGiaCanh;
	}

	public void setGiamTruGiaCanh(float giamTruGiaCanh) {
		this.giamTruGiaCanh = giamTruGiaCanh;
	}

	public float getGiamTruNguoiPhuThuoc() {
		return giamTruNguoiPhuThuoc;
	}

	public void setGiamTruNguoiPhuThuoc(float giamTruNguoiPhuThuoc) {
		this.giamTruNguoiPhuThuoc = giamTruNguoiPhuThuoc;
	}

	public float getMucDongBHYT() {
		return mucDongBHYT;
	}

	public void setMucDongBHYT(float mucDongBHYT) {
		this.mucDongBHYT = mucDongBHYT;
	}

	public float getMucLuongToiDaBHYT() {
		return mucLuongToiDaBHYT;
	}

	public void setMucLuongToiDaBHYT(float mucLuongToiDaBHYT) {
		this.mucLuongToiDaBHYT = mucLuongToiDaBHYT;
	}

	public float getMucDongBHXH() {
		return mucDongBHXH;
	}

	public void setMucDongBHXH(float mucDongBHXH) {
		this.mucDongBHXH = mucDongBHXH;
	}

	public float getMucLuongToiDaBHXH() {
		return mucLuongToiDaBHXH;
	}

	public void setMucLuongToiDaBHXH(float mucLuongToiDaBHXH) {
		this.mucLuongToiDaBHXH = mucLuongToiDaBHXH;
	}

	public float getMucDongBHTN() {
		return mucDongBHTN;
	}

	public void setMucDongBHTN(float mucDongBHTN) {
		this.mucDongBHTN = mucDongBHTN;
	}

	public float getMucLuongToiDaBHTN() {
		return mucLuongToiDaBHTN;
	}

	public void setMucLuongToiDaBHTN(float mucLuongToiDaBHTN) {
		this.mucLuongToiDaBHTN = mucLuongToiDaBHTN;
	}

	
	public float getVung1() {
		return vung1;
	}

	public void setVung1(float vung1) {
		this.vung1 = vung1;
	}

	public float getVung2() {
		return vung2;
	}

	public void setVung2(float vung2) {
		this.vung2 = vung2;
	}

	public float getVung3() {
		return vung3;
	}

	public void setVung3(float vung3) {
		this.vung3 = vung3;
	}

	public float getVung4() {
		return vung4;
	}

	public void setVung4(float vung4) {
		this.vung4 = vung4;
	}

	public float getNhoHonBang5() {
		return nhoHonBang5;
	}

	public void setNhoHonBang5(float nhoHonBang5) {
		this.nhoHonBang5 = nhoHonBang5;
	}

	public float getTu5den10() {
		return tu5den10;
	}

	public void setTu5den10(float tu5den10) {
		this.tu5den10 = tu5den10;
	}

	public float getTu10den18() {
		return tu10den18;
	}

	public void setTu10den18(float tu10den18) {
		this.tu10den18 = tu10den18;
	}

	public float getTu18den32() {
		return tu18den32;
	}

	public void setTu18den32(float tu18den32) {
		this.tu18den32 = tu18den32;
	}

	public float getTu32den52() {
		return tu32den52;
	}

	public void setTu32den52(float tu32den52) {
		this.tu32den52 = tu32den52;
	}

	public float getTu52den80() {
		return tu52den80;
	}

	public void setTu52den80(float tu52den80) {
		this.tu52den80 = tu52den80;
	}

	public float getTren80() {
		return tren80;
	}

	public void setTren80(float tren80) {
		this.tren80 = tren80;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public AdminEntity getAdmin() {
		return admin;
	}

	public void setAdmin(AdminEntity admin) {
		this.admin = admin;
	}

	public List<ThueDuocKhaiEntity> getListThueDuocKhai() {
		return listThueDuocKhai;
	}

	public void setListThueDuocKhai(List<ThueDuocKhaiEntity> listThueDuocKhai) {
		this.listThueDuocKhai = listThueDuocKhai;
	}

	

}
