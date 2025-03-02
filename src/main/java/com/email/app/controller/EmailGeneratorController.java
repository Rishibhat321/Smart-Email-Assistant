package com.email.app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/email")
public class EmailGeneratorController {


    public ResponseEntity<String> generateEmail(EmailRequest ) {

        return ResponseEntity.ok();
    }
}
