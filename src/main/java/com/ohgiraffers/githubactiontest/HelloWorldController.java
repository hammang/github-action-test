package com.ohgiraffers.githubactiontest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public ResponseEntity<ResponseMessage> sayHello() {

        return ResponseEntity.ok().body(new ResponseMessage("hello world!"/*, "say hello method"*/));
    }
}
