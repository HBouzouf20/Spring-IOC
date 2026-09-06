package com.mentoraone.emailManagerSystem.service.impl;

import com.mentoraone.emailManagerSystem.entity.User;
import com.mentoraone.emailManagerSystem.service.NotificationService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("sms")
public class SMSNotificationServiceImpl implements NotificationService {
    @Override
    public void sendNotification(User recipient, String message) {
        String text = String.format("""
                number : %s
                ==========================
                Hello %s, 
                
                %s
                
                sent via SMS
                """, recipient.getPhoneNumber(), recipient.getFullName(), message);

        System.out.println(text);
    }
}
