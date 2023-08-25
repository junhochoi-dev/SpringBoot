package com.example.firstproject.controller;

// 컨트롤러 선언과 동시에 자동으로 임포트
import org.springframework.stereotype.Controller;
// URL 연결 요청(@GetMapping())과 동시에 자동으로 임포트
import org.springframework.web.bind.annotation.GetMapping;
// Model 클래스 패키지 자동 임포트
import org.springframework.ui.Model;

@Controller
public class FirstController {
    @GetMapping("/hi")
    public String niceToMeetyou(Model model){
        // model 객체가 "홍팍"값을 "username"에 연결해 웹 브라우저로 보냄
        model.addAttribute("username", "Junho Choi");
        return "greetings"; // greetings.mustache 파일 변환
    }

    @GetMapping("/bye")
    public String seeYouNext(Model model){
        model.addAttribute("username", "Junho Choi");
        return "goodbye"; // goodbye.mustache 반환
    }
}