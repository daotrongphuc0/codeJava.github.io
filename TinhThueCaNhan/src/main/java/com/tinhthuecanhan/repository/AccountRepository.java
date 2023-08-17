package com.tinhthuecanhan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tinhthuecanhan.entity.AccountEntity;

public interface AccountRepository extends JpaRepository<AccountEntity, Long>{
	AccountEntity findOneByUsernameAndPassword(String username,String password);
	AccountEntity findOneByUsername(String username);
}
