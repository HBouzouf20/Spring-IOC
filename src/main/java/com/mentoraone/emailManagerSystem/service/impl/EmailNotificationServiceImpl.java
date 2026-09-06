package com.mentoraone.emailManagerSystem.service.impl;

import com.mentoraone.emailManagerSystem.entity.User;
import com.mentoraone.emailManagerSystem.model.Notification;
import com.mentoraone.emailManagerSystem.model.NotificationType;
import com.mentoraone.emailManagerSystem.service.NotificationService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("email")
public class EmailNotificationServiceImpl implements NotificationService {
    @Override
    public Notification sendNotification(User recipient, String message) {
        message = String.format("""
                number : %s
                ==========================
                Hello %s,\s
               \s
                %s
               \s
                sent via %s
               \s""", recipient.getPhoneNumber(), recipient.getFullName(), message, NotificationType.EMAIL);
        return Notification.builder().message(message).recipient(recipient.getEmail()).sender(NotificationType.EMAIL).build();

    }
}
