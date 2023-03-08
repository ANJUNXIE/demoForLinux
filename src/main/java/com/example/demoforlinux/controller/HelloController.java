/**
 * @Description:
 * @author: Junan Xie
 * @date: 2023/3/8
 */
package com.example.demoforlinux.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping("")
    public String hello(){
        System.out.println("hello world...");
        return "OK";
    }

}
