package com.example.firstproject.dto;

import com.example.firstproject.entity.Member;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class MemberForm {
    private Long id;
    private String email; // 이메일 받을 필드
    private String password; // 비밀번호 받을 필드

    public Member toEntity(){ return new Member(id, email, password);}
}
