package com.naver.hackathon.service.impl;

import com.naver.hackathon.domain.Account;
import com.naver.hackathon.domain.dto.AccountJoinDto;
import com.naver.hackathon.domain.repositories.AccountRepository;
import com.naver.hackathon.service.specification.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    private AccountRepository accountRepository;

    @Autowired
    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public Account joinNewAccount(AccountJoinDto dto) {
        return accountRepository.save(dto.generateModel());
    }
}
