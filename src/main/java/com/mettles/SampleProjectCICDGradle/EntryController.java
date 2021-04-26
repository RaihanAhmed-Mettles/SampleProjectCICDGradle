package com.mettles.SampleProjectCICDGradle;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class EntryController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot! Testing poll 4";
    }
}
