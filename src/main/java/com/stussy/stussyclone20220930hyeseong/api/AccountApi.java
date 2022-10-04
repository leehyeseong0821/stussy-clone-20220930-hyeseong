package com.stussy.stussyclone20220930hyeseong.api;

import com.stussy.stussyclone20220930hyeseong.dto.RegisterReqDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/account")
public class AccountApi {

     @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody RegisterReqDto registerReqDto){
         System.out.println("회원가입 요청 데이터:" + registerReqDto);
         return null;

    }

}
