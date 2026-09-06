package com.mentoraone.emailManagerSystem.service.impl;

import com.mentoraone.emailManagerSystem.entity.User;
import com.mentoraone.emailManagerSystem.model.Notification;
import com.mentoraone.emailManagerSystem.model.NotificationType;
import com.mentoraone.emailManagerSystem.service.NotificationService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("sms")
public class SMSNotificationServiceImpl implements NotificationService {
    @Override
    public Notification sendNotification(User recipient, String message) {

        message = String.format("""
                number : %s
                ==========================
                Hello %s, 
                
                %s
                
                sent via SMS
                """, recipient.getPhoneNumber(), recipient.getFullName(), message);
        return Notification.builder().message(message).recipient(recipient.getPhoneNumber()).sender(NotificationType.SMS).build();
    }
}
