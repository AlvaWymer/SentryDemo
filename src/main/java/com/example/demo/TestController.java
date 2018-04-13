package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    /** 方法会发生500错误
     * @return
     */
    @GetMapping("/helloworld")
    public String helloworld() {
        int x = 1 / 0;

        return "Hello World!";
    }
}