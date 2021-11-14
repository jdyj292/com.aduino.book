package com.jojoldu.book.springboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//controller를 json을 반환하는 컨트롤러로 만들어 줍니다.
//예전에 @responsebody 를 대체
public class HelloController {

    @GetMapping("/hello") //get의 요청을 받을 수 있는 api를 만들어 준다.
    public String hello() {
        return "hello";
    }


}
