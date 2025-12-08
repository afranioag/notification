package com.aag.notification.adapter.input;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {

    @GetMapping(value = "/api")
    public ResponseEntity<String> api() {
        return ResponseEntity.ok("Notification API");
    }
}
