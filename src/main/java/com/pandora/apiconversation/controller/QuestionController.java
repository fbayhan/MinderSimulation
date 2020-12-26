package com.pandora.apiconversation.controller;

import com.pandora.apiconversation.dto.ContextTestDTO;
import org.springframework.web.bind.annotation.*;

@RestController
public class QuestionController {

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s! ", name);
    }

    @PostMapping("insertTest")
    public String ok(@RequestBody ContextTestDTO  contextTest){
        System.out.println(contextTest.toString());
        return "ok";
    }
}
