package com.mentoraone.emailManagerSystem.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Notification {
    private String message;
    private String recipient;
    private NotificationType sender;
}
