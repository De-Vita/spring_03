package com.icia.ex3.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class MemberDTO {
    private Long id;
    private String email;
    private String password;
    private String name;
    private String mobile;
    private String gender;
    private String city;
    private String[] lang;
}