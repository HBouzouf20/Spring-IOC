package com.mentoraone.emailManagerSystem.service;

import com.mentoraone.emailManagerSystem.entity.User;
import com.mentoraone.emailManagerSystem.model.Notification;

public interface OrderService {
    Notification sendOrderNotification(User recipient, String message);
}
