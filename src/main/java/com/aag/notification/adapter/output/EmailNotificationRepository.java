package com.aag.notification.adapter.output;

import com.aag.notification.core.domain.model.EmailNotification;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailNotificationRepository extends MongoRepository<EmailNotification, String> {
}
