package com.example.firstproject.controller;

import com.example.firstproject.dto.ArticleForm;
import com.example.firstproject.entity.Article;
import com.example.firstproject.repository.ArticleRepository;
import com.example.firstproject.service.ArticleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Slf4j
@RestController
public class ArticleApiController {
    @Autowired
    private ArticleService articleService;

    @GetMapping("/api/articles")
    public List<Article> index(){
        return articleService.index();
    }

    @GetMapping("/api/articles/{id}")
    public Article show(@PathVariable Long id){
        return articleService.show(id);
    }

    @PostMapping("/api/articles")
    public ResponseEntity<Article> create(@RequestBody ArticleForm dto){
        Article created = articleService.create(dto);
        return (created != null) ?
                ResponseEntity.status(HttpStatus.OK).body(created) :
                ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }


    // PATCH
    @PatchMapping("/api/articles/{id}")
    public ResponseEntity<Article> update(@PathVariable Long id, @RequestBody ArticleForm dto){
        Article updated = articleService.update(id, dto);
        return (updated != null) ?
                ResponseEntity.status(HttpStatus.OK).body(updated) :
                ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }

    @PostMapping("/api/transaction-test")
    public ResponseEntity<List<Article>> transactionTest(@RequestBody List<ArticleForm> dtos){
        List<Article> createdList = articleService.createArticles(dtos);
        return (createdList != null) ?
                ResponseEntity.status(HttpStatus.OK).body(createdList) :
                ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }

//    @Autowired // 게시글 리파지터리 주입
//    private ArticleRepository articleRepository;
//
//    // GET
//    @GetMapping("/api/articles")
//    public List<Article> index(){
//        return articleRepository.findAll();
//    }
//    @GetMapping("/api/articles/{id}")
//    public Article show(@PathVariable Long id){
//        return articleRepository.findById(id).orElse(null);
//    }
//
//    // POST
//    @PostMapping("/api/articles")
//    public Article create(@RequestBody ArticleForm dto){
//        Article article = dto.toEntity();
//        return articleRepository.save(article);
//    }
//
//    // PATCH
//    @PatchMapping("/api/articles/{id}")
//    public ResponseEntity<Article> update(@PathVariable Long id, @RequestBody ArticleForm dto){
//        // 1. DTO -> 엔티티 변환하기
//        Article article = dto.toEntity();
//        log.info("id : {}, article: {}", id, article.toString());
//        // 2. 타깃 조회하기
//        Article target = articleRepository.findById(id).orElse(null);
//        // 3. 잘못된 요청 처리하기
//        log.info(id + " " + article.getId());
//        if(target == null || id != article.getId()){
//            // 400, 잘못된 응답 !
//            log.info("잘못된 요청! id: {}, article: {}", id, article.toString());
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
//        }
//        // 4. 업데이트 및 정상(200) 응답하기
//        target.patch(article);
//        Article updated = articleRepository.save(target);
//        return ResponseEntity.status(HttpStatus.OK).body(updated);
//
//    }
//
//    // DELETE
//    @DeleteMapping("/api/articles/{id}")
//    public ResponseEntity<Article> delete(@PathVariable Long id){
//        // 1. 대상 찾기
//        Article target = articleRepository.findById(id).orElse(null);
//        // 2. 잘못된 요청 처리하기
//        if(target == null){
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
//        }
//        // 3. 대상 삭제하기
//        articleRepository.delete(target);
//        // body(null) 대신 build를 작성해도 된다.
//        // build 메서드는 HTTP 응답의 body가 없는 ResponseEntity 객체를 생성한다.
//        return ResponseEntity.status(HttpStatus.OK).build();
//    }
}