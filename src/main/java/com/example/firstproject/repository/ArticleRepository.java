package com.example.firstproject.repository;

import com.example.firstproject.entity.Article;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface ArticleRepository extends CrudRepository<Article, Long> {
    // ArrayList로 반환하게 만드는 방법
    @Override
    ArrayList<Article> findAll(); // Iterable → ArrayList 수정
}
