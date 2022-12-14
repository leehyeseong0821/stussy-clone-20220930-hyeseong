package com.stussy.stussyclone20220930hyeseong.service;

import com.stussy.stussyclone20220930hyeseong.domain.User;
import com.stussy.stussyclone20220930hyeseong.exception.CustomInternalServerErrorException;
import com.stussy.stussyclone20220930hyeseong.repository.AccountRepository;
import com.stussy.stussyclone20220930hyeseong.security.PrincipalDetails;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class PrincipalDetailsService implements UserDetailsService{

    private final AccountRepository accountRepository;



    @Override
    public UserDetails loadUserByUsername(String email)  throws UsernameNotFoundException {

        User user = null;



        try{
            user = accountRepository.findUserByEmail(email);

        }catch(Exception e){
            throw new CustomInternalServerErrorException("회원 정보 조회 오류");
        }
        if(user == null){
            throw new UsernameNotFoundException("잘 못된 사용자 정보");
        }

        return new PrincipalDetails(user);
    }

}
