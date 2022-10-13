package com.stussy.stussyclone20220930hyeseong.service;

import com.stussy.stussyclone20220930hyeseong.dto.RegisterReqDto;

public interface AccountService {

    public void duplicateEmail(RegisterReqDto registerReqDto) throws Exception;
    public void register(RegisterReqDto register) throws Exception;


}
