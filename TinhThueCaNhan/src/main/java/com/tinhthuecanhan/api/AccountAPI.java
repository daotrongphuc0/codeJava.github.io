package com.tinhthuecanhan.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tinhthuecanhan.api.input.LoginInput;
import com.tinhthuecanhan.dto.AccountDTO;
import com.tinhthuecanhan.service.IAccountService;

@CrossOrigin
@RestController
public class AccountAPI {
			
	@Autowired
	private IAccountService accountService;
	
    
    @PostMapping(value = "/checklogin")
	public ResponseEntity<AccountDTO> createNew(@RequestBody LoginInput model) {
    	AccountDTO tmp = accountService.checkLogin(model);
    	if(tmp != null) {
    		return new ResponseEntity<>(tmp, HttpStatus.OK);
    	}
    	else {
    		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    	}
	}



}