package com.example.portfolio.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/* =======================================================
    * Project Name: Portfolio
    * Updated: 2023. 12. 28 AM 11:50 v1.0.0
    * Content: 백엔드개발자 포트폴리오 경로 설정
    ======================================================== */

@Controller
public class WebSiteController {

  //메인페이지
  @GetMapping("/")
  public String main() throws Exception {
    return "index";
  }

  @GetMapping("/solace")
  public String solace() throws Exception {
    return "solace";
  }
  
}
