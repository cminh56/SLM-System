package com.slms.springboot_slms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomController {

    @GetMapping("/welcome")
    public String welcom(){
        return "Welcom to Springboot";
    }
}
