package com.stussy.stussyclone20220930hyeseong.api;

import com.stussy.stussyclone20220930hyeseong.aop.annotation.LogAspect;
import com.stussy.stussyclone20220930hyeseong.dto.CMRespDto;
import com.stussy.stussyclone20220930hyeseong.dto.RegisterReqDto;
import com.stussy.stussyclone20220930hyeseong.dto.validation.ValidationSequence;
import com.stussy.stussyclone20220930hyeseong.exception.CustomValidationException;
import com.stussy.stussyclone20220930hyeseong.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.naming.Binding;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/api/account")
@RequiredArgsConstructor
public class AccountApi {

    private final AccountService accountService;



     @LogAspect
     @PostMapping("/register")
    public ResponseEntity<?> register(@Validated(ValidationSequence.class) @RequestBody RegisterReqDto registerReqDto,
                                      BindingResult bindingResult)throws Exception{

        accountService.register(registerReqDto);

         return ResponseEntity.created(null).body(new CMRespDto<>("회원가입 성공",registerReqDto));

    }

}
