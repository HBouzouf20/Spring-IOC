package com.mentoraone.emailManagerSystem.service;

import com.mentoraone.emailManagerSystem.entity.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service //@Component
public class OrderService {
    private final NotificationService notificationService;

    public OrderService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void sendOrderNotification(User recipient, String message) {
        notificationService.sendNotification(recipient, message);
        System.out.println("Order notification sent to " + recipient);
    }
}
