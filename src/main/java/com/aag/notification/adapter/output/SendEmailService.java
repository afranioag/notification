package com.aag.notification.adapter.output;

import com.aag.notification.core.domain.model.EmailNotification;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class SendEmailService {

    private final EmailNotificationRepository emailNotificationRepository;

    public String sendEmail(EmailNotification notification) {
        notification.setDateSend(LocalDateTime.now());
        return emailNotificationRepository.save(notification).getId();
    }
}
