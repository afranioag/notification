package com.aag.notification.adapter.input;

import com.aag.notification.adapter.output.SendEmailService;
import com.aag.notification.core.domain.model.EmailNotification;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api")
@RequiredArgsConstructor
public class NotificationController {

    private final SendEmailService sendEmailService;

    @GetMapping
    public ResponseEntity<String> api() {
        return ResponseEntity.ok("Notification API");
    }

    @PostMapping(value = "/notification")
    public ResponseEntity<String> receiveNotification(@RequestBody EmailNotification notification) {
        return ResponseEntity.ok(sendEmailService.sendEmail(notification));
    }
}
