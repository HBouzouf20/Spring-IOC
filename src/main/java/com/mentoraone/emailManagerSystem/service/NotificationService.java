package com.mentoraone.emailManagerSystem.service;

import com.mentoraone.emailManagerSystem.entity.User;

public interface NotificationService {
    public void sendNotification(User recipient, String message);
}
