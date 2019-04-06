package com.andrewprogramming.acutatortest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloAcutator {

    @RequestMapping("/sayHi")
    public void sayHi() {
        System.out.printf("say hi!");
    }

    @RequestMapping("/sayNo")
    public void sayNo() {
        System.out.printf("say no!");
    }
}
