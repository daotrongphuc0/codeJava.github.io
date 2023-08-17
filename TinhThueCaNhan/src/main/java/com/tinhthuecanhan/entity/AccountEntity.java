package com.tinhthuecanhan.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tblAccount")
public abstract class AccountEntity extends BaseEntity{
	
	@Column
	private String username;
	
	@Column
	private String password;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "role_id")
	private RoleEntity role;
	
	@Column
	private String name;
	
	public AccountEntity() {
	}
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public RoleEntity getRole() {
		return role;
	}
	public void setRole(RoleEntity role) {
		this.role = role;
	}
    
    
    
    
}
