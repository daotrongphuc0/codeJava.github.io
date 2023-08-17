package com.tinhthuecanhan.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "tblRole")
public class RoleEntity extends BaseEntity {
	
	@Column
	private int isAdmin;
	
	@Column
	private int xemDanhSach;
	
	@Column
	private int xuatBaoCao;
	
	@Column
	private int cauHinh;
	
	@OneToMany(mappedBy = "role")
	private List<AccountEntity> accounts = new ArrayList<>();

	public int getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(int isAdmin) {
		this.isAdmin = isAdmin;
	}

	public int getXemDanhSach() {
		return xemDanhSach;
	}

	public void setXemDanhSach(int xemDanhSach) {
		this.xemDanhSach = xemDanhSach;
	}

	public int getXuatBaoCao() {
		return xuatBaoCao;
	}

	public void setXuatBaoCao(int xuatBaoCao) {
		this.xuatBaoCao = xuatBaoCao;
	}

	public int getCauHinh() {
		return cauHinh;
	}

	public void setCauHinh(int cauHinh) {
		this.cauHinh = cauHinh;
	}

	public List<AccountEntity> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<AccountEntity> accounts) {
		this.accounts = accounts;
	}

}
