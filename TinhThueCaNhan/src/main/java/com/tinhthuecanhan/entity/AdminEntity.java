package com.tinhthuecanhan.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tblAdmin")
public class AdminEntity extends AccountEntity{
	

	
	@Column
    private String diaChi;
	
	@Column
    private String email;
	
	@Column
    private String sdt;
	
	@OneToMany(mappedBy = "admin")
	private List<CauHinhEntity> cauHinhs = new ArrayList<>();

    public AdminEntity() {
    }

    
    
	public List<CauHinhEntity> getCauHinhs() {
		return cauHinhs;
	}



	public void setCauHinhs(List<CauHinhEntity> cauHinhs) {
		this.cauHinhs = cauHinhs;
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
