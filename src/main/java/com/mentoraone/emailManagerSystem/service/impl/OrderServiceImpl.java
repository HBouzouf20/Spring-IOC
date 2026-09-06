package com.mentoraone.emailManagerSystem.service.impl;

import com.mentoraone.emailManagerSystem.entity.User;
import com.mentoraone.emailManagerSystem.model.Notification;
import com.mentoraone.emailManagerSystem.service.NotificationService;
import com.mentoraone.emailManagerSystem.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class OrderServiceImpl implements OrderService {
    @Value("${app.notification.type}")
    private String typeNotification;
    private final ApplicationContext context;

    public Notification sendOrderNotification(User recipient, String message) {
        NotificationService notificationService = context.getBean(typeNotification, NotificationService.class);
        Notification notif = notificationService.sendNotification(recipient, message);
        System.out.println("Order notification sent to " + recipient);
        return notif;
    }
}
