package com.aag.notification.core.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmailNotification {

    @Id
    private String id;

    private String emailDestin;
    private String emailSend;
    private String message;
    private LocalDateTime dateSend;

}
