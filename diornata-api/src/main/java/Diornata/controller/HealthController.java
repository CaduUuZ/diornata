package Diornata.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/api/health")
    public String health() {
        return "Diornata is running";
    }

    @GetMapping("/api/version")
    public String version(){
        return "api version 0.1.0";
    }
}