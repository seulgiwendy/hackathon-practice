package com.naver.hackathon.service.specification;

import com.naver.hackathon.domain.Account;
import com.naver.hackathon.domain.dto.AccountJoinDto;

public interface AccountService {

    Account joinNewAccount(AccountJoinDto dto);
}
