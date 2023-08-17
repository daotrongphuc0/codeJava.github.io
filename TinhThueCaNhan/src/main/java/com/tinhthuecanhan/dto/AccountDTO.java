package com.tinhthuecanhan.dto;


public class AccountDTO extends BaseDTO{
    protected String username,password;
    protected RoleDTO role;
    protected String name;

    public AccountDTO() {
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

    public RoleDTO getRole() {
        return role;
    }

    public void setRole(RoleDTO role) {
        this.role = role;
    }


    
}
