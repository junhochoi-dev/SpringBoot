# SpringPractice



![image](https://github.com/junhochoi-dev/SpringPractice/assets/39554558/829b2a01-c531-47ed-bb5f-e12ebe4eca56)

## PART01 스프링 부트 개요

> 01장 :: 스프링 부트 시작하기

> 02장 :: MVC 패턴 이해와 실습

## PART02 게시판 CRUD 만들기

> 03장 :: 게시판 만들고 새 글 작성하기 (Create)

> 04장 :: 롬복과 리팩터링

> 05장 :: 게시글 읽기 (Read)

> 06장 :: 게시판 내 페이지 이동하기

> 07장 :: 게시글 수정하기 (Update)

> 08장 :: 게시글 삭제하기 (Delete)

> 09장 :: CRUD와 SQL 쿼리 종합

## PART03 REST API와 테스트 코드 작성하기

> 10장 :: REST API와 JSON

> 11장 :: HTTP와 REST 컨트롤러

> 12장 :: 서비스 계층과 트랜잭션

> 13장 :: 테스트 코드 작성하기

## PART04 댓글 CRUD 만들기

> 14장 :: 댓글 엔티티와 리파지터리 만들기

> 15장 :: 댓글 컨트롤러와 서비스 만들기

1. 댓글 CRUD를 위한 REST API

댓글 데이터를 CRUD 하기 위해서는 REST 컨트롤러, 서비스, DTO, 엔티티, 리파지터리가 필요합니다.

* REST 컨트롤러

  댓글 REST API를 위한 컨트롤러로 서비스와 협업, 클라이언트 요청을 받아 응답하며 View가 아닌 데이터 반환
  
* 서비스

  REST 컨트롤러와 리파지터리의 사이에서 비즈니스 로직, 즉 처리 흐름을 담당하며 예외 상황이 발생했을 때 `@Transactional`로 변경된 데이터 롤백
  
* DTO

  사용자에게 보여 줄 댓글 정보를 담은 것, 단순히 클라이언트와 서버 간에 댓글 JSON 데이터 전송
  
* 엔티티

  DB 데이터를 담는 자바 객체로 엔티티를 기반으로 테이블 생성, 리파지터리가 DB 속 데이터를 조회하거나 전달할 때 사용

* 리파지터리

  엔티티를 관리하는 인터페이스로 데이터 CRUD 등의 기능을 제공, 서비스의 명령을 받아 댓글 CRUD 등의 명령을 DB에 보내고 응답받음

> 16장 :: 웹 페이지에서 댓글 목록 보기



## Reference

![image](https://github.com/junhochoi-dev/SpringPractice/assets/39554558/6fef94d7-6472-4964-83f9-aa36c3909092)

https://wikidocs.net/162255

https://www.gilbut.co.kr/book/view?bookcode=BN003778
