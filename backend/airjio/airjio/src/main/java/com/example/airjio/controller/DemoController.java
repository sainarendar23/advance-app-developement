package com.example.airjio.controller;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo-controller")
@PreAuthorize("hasRole('ADMIN')")
public class DemoController {
    
    @GetMapping
    @PreAuthorize("hasAuthority('admin:READ')")
    public ResponseEntity<String> sayHello(){
        return ResponseEntity.ok("Hello");
    }
}
