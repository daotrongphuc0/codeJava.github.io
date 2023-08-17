package com.tinhthuecanhan.service;

import com.tinhthuecanhan.api.input.LoginInput;
import com.tinhthuecanhan.dto.AccountDTO;

public interface IAccountService {
	AccountDTO checkLogin(LoginInput loginInput);
}
