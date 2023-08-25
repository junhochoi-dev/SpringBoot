package com.example.firstproject.dto;

import com.example.firstproject.entity.Article;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class ArticleForm {

    private Long id;

    private String title; // 제목을 받을 필드

    private String content; // 내용을 받을 필드

    public Article toEntity() {
        return new Article(id, title, content);
    }

    // AllArgsConstructor에서 자동으로 생성
    //    public ArticleForm(String title, String content) {
    //        this.title = title;
    //        this.content = content;
    //    }

    // ToString에서 자동으로 생성
    // 데이터를 잘 받았는 지 확인할 toString() 메서드 추가
    //    @Override
    //    public String toString() {
    //        return "ArticleForm{" +
    //                "title='" + title + '\'' +
    //                ", content='" + content + '\'' +
    //                '}';
    //    }
}
