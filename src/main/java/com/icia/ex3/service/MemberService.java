package com.icia.ex3.service;

import com.icia.ex3.dto.MemberDTO;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

@Service
public class MemberService {
    public String method1() {
        System.out.println("MemberService.method1");
        return "good";
    }

    public void method2(MemberDTO memberDTO) {
        System.out.println("MemberService.method2");
        System.out.println("memberDTO = " + memberDTO);
    }

}
