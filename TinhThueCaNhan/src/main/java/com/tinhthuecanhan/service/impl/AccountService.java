package com.tinhthuecanhan.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tinhthuecanhan.api.input.LoginInput;
import com.tinhthuecanhan.converter.AccountConverter;
import com.tinhthuecanhan.dto.AccountDTO;
import com.tinhthuecanhan.entity.AccountEntity;
import com.tinhthuecanhan.repository.AccountRepository;
import com.tinhthuecanhan.service.IAccountService;

@Service
public class AccountService implements IAccountService{
	
	@Autowired
	private AccountRepository accountRepository;
	
	@Autowired
	private AccountConverter accountConverter;

	@Override
	public AccountDTO checkLogin(LoginInput loginInput) {
		AccountEntity res = accountRepository.findOneByUsernameAndPassword(loginInput.getUsername(), loginInput.getPassword());
		if(res != null) {
			return accountConverter.toDTO(accountRepository.findOneByUsernameAndPassword(loginInput.getUsername(), loginInput.getPassword()));
		}
		else {
			return null;
		}
	}

}
