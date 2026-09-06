package com.mentoraone.emailManagerSystem.service.impl;

import com.mentoraone.emailManagerSystem.entity.User;
import com.mentoraone.emailManagerSystem.service.NotificationService;
import org.springframework.stereotype.Service;

@Service("email")
public class EmailNotificationServiceImpl implements NotificationService {
    @Override
    public void sendNotification(User recipient, String message) {
        String text = String.format("""
                to : %s
                ==========================
                Hello %s, 
                
                %s
                
                sent via EMAIL
                """,recipient.getEmail(), recipient.getFullName(), message);

        System.out.println(text);
    }
}
