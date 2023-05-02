package com.timolisa.crudApp.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/oauth2/app")
public class AuthenticationController {

    @GetMapping("/sign-in")
    public ResponseEntity<String> authenticate() {
        log.info("");
        return null;
    }
}
