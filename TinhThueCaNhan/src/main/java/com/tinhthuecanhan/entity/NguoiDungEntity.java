package com.tinhthuecanhan.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "tblNguoiDung")
public class NguoiDungEntity extends AccountEntity{
	

	
	@Column
    private String diaChi;
	
	@Column
    private String email;
	
	@Column
    private String sdt;
	
	@Column
    private String maSoThue;

    public NguoiDungEntity() {
    }



    public String getMaSoThue() {
        return maSoThue;
    }

    public void setMaSoThue(String maSoThue) {
        this.maSoThue = maSoThue;
    }


    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }


    
    
    
}
