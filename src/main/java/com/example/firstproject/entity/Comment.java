package com.example.firstproject.entity;

import com.example.firstproject.dto.CommentDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne // Comment 엔티티와 Article 엔티티를 다대일 관계로 설정
    @JoinColumn(name="article_id") // 외래키 생성, Article 엔티티의 기본키(id)와 매핑
    private Article article; // 해당 댓글의 부모 게시글

    @Column
    private String nickname; // 댓글을 단 사람

    @Column
    private String body; // 댓글 본문

    public static Comment createComment(CommentDto dto, Article article) {
        // 예외 발생
        if(dto.getId() != null){
            throw new IllegalArgumentException("댓글 생성 실패! 댓글의 id가 없어야합니다.");
        }
        if(dto.getArticleId() != article.getId()){
            throw new IllegalArgumentException("댓글 생성 실패! 게시글의 id가 잘못됐습니다.");
        }
        // 엔티티 생성 및 반환
        return new Comment(dto.getId(), article, dto.getNickname(), dto.getNickname());
    }

    public void patch(CommentDto dto){
        // 예외 발생
        if(this.id != dto.getId()){
            throw new IllegalArgumentException("댓글 수정 실패! 잘못된 id가 입력됐습니다.");
        }
        // 객체 갱신
        if(dto.getNickname() != null){ // 수정할 닉네임 데이터가 있다면
            this.nickname = dto.getNickname(); // 내용 반영
        }
        if(dto.getBody() != null){ // 수정할 본문 데이터가 있다면
            this.body = dto.getBody(); // 내용 반영
        }
    }
}
