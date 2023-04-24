package com.icia.ex3.controller;

import com.icia.ex3.dto.MemberDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/monday1")
    public String monday1() {
        return "monday1";
    }

    @GetMapping("/monday1-param")
    public String monday1Param(@RequestParam("month") int month, @RequestParam("day") int day) {
        System.out.println("month = " + month + ", day = " + day);
        return "monday1";
    }

    @GetMapping("/monday2")
    public String monday2() {
        return "monday2";
    }

    @GetMapping("/monday2-param")
    public String monday2Param(Model model, @RequestParam("name") String name, @RequestParam("mobile") String mobile) {
        System.out.println("model = " + model + ", name = " + name + ", mobile = " + mobile);
        model.addAttribute("name",name);
        model.addAttribute("mobile",mobile);
        return "result2";
    }

    @GetMapping("/monday3")
    public String monday3() {
        return "monday3";
    }

    @PostMapping("/monday3-param")
    public String monday3Param(Model model, @RequestParam("email") String email, @RequestParam("password") String password) {
        System.out.println("model = " + model + ", email = " + email + ", password = " + password);
        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setEmail(email);
        memberDTO.setPassword(password);
        model.addAttribute("member", memberDTO);
        return "result3";
    }

    @GetMapping("/monday4")
    public String monday4(Model model) {
        List<MemberDTO> memberDTOList = new ArrayList<>();
        for (int i=0; i<=10; i++) {
            memberDTOList.add(newMember(i));
        }
        model.addAttribute("memberList", memberDTOList);


        return "monday4";
    }

    public MemberDTO newMember(int i) {
        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setEmail("email"+i);
        memberDTO.setPassword("password"+i);
        return memberDTO;
    }


}
