package com.example.firstproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Entity
public class Member {
    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String email;
    @Column
    private String password;

    // Member 생성자 추가
//    public Member(Long id, String email, String password) {
//        this.id = id;
//        this.email = email;
//        this.password = password;
//    }

    // toString() 메서드 추가
//    @Override
//    public String toString() {
//        return "Member{" +
//                "id=" + id +
//                ", email='" + email + '\'' +
//                ", password='" + password + '\'' +
//                '}';
//    }
}
