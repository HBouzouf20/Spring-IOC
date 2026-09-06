package com.mentoraone.emailManagerSystem.service;

import com.mentoraone.emailManagerSystem.entity.User;
import com.mentoraone.emailManagerSystem.model.Notification;

public interface NotificationService {
    public Notification sendNotification(User recipient, String message);
}
