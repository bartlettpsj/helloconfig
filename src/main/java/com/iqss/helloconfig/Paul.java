package com.iqss.helloconfig;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Paul {
    @GetMapping("/paul")
    String getPaul() {
        return "Paul";
    }
}
