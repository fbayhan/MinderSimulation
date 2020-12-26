package com.pandora.apiconversation.controller;

import com.pandora.apiconversation.dto.ContextTestDTO;
import org.springframework.web.bind.annotation.*;

@RestController
public class QuestionController {

    @GetMapping("/gettest")
    public String hello(@RequestParam(value = "value", defaultValue = "jesus") String name) {
        return String.format(name);
    }

    @PostMapping("insertTest")
    public String ok(@RequestBody ContextTestDTO  contextTest){
        System.out.println(contextTest.toString());
        return "ok";
    }
}
