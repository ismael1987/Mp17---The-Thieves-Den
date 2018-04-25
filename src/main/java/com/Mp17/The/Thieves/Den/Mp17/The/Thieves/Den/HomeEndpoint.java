package com.Mp17.The.Thieves.Den.Mp17.The.Thieves.Den;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeEndpoint {
    @GetMapping
    String message() {
        return "welcome ali baba";
    }
}
