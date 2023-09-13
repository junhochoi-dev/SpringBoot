package com.example.firstproject.service;

import com.example.firstproject.dto.CommentDto;
import com.example.firstproject.entity.Comment;
import com.example.firstproject.repository.ArticleRepository;
import com.example.firstproject.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private ArticleRepository articleRepository;

    public List<CommentDto> comments(Long articleId) {
//        // 1. 댓글 조회
//        List<Comment> comments = commentRepository.findByArticleId(articleId);
//        // 2. 엔티티 -> DTO 변환
//        List<CommentDto> dtos = new ArrayList<CommentDto>();
//        for(int i = 0; i < comments.size(); i++){ // 조회한 댓글 엔티티 수만 큼 반복하기
//            Comment c = comments.get(i); // 조회한 댓글 엔티티 하나씩 가져오기
//            CommentDto dto = CommentDto.createCommentDto(c); // 엔티티를 DTO로 변환
//            dtos.add(dto);
//        }
//        // 3. 결과 반환
//        return dtos;
        return commentRepository.findByArticleId(articleId)// 댓글 엔티티 목록 조회
                .stream() // 댓글 엔티티 목록을 스트림으로 변환
                .map(comment -> CommentDto.createCommentDto(comment)) // 엔티티를 DTO에 매핑
                .collect(Collectors.toList()); // 스트림을 리스트로 변환
    }





    // 1. 댓글 조회

    // 2. 댓글 생성
    
    // 3. 댓글 수정
    
    // 4. 댓글 삭제

}
