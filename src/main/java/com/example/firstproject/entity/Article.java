package com.example.firstproject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor // 기본생성자로 빈 껍데기를 만들고 데이터 넣기
@ToString
@Getter
@Entity
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // DB가 id를 자동 생성
    private Long id;

    @Column
    private String title;

    @Column
    private String content;


    public void patch(Article article){
        if(article.title != null) this.title = article.title;
        if(article.content != null) this.content = content;
    }
    // @AllArgsConstructor에서 자동 생성
    // Article 생성자 추가
    //    public Article(Long id, String title, String content) {
    //        this.id = id;
    //        this.title = title;
    //        this.content = content;
    //    }

    // @ToString에서 자동 생성
    // toString() 메서드 추가
    //    @Override
    //    public String toString() {
    //        return "Article{" +
    //                "id=" + id +
    //                ", title='" + title + '\'' +
    //                ", content='" + content + '\'' +
    //                '}';
    //    }
}
