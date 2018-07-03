package com.lrh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liangronghua on 2018/6/20 0020.
 */
@RestController
@EnableAutoConfiguration
public class Example2 {

    @RequestMapping("/")
    String home() {
        return "Hello World1";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Example2.class, args);
    }

}
