package com.mentoraone.emailManagerSystem.controller;

import com.mentoraone.emailManagerSystem.entity.User;
import com.mentoraone.emailManagerSystem.model.Notification;
import com.mentoraone.emailManagerSystem.service.OrderService;
import com.mentoraone.emailManagerSystem.tools.Constants;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class NotificationController {
    private final OrderService orderService;


    @GetMapping("/sendNotification")
    public Notification sendNotification() {
        User recipient = User.builder()
                .fullName("John Doe")
                .email("john@doe.com")
                .phoneNumber("+1234567890")
                .build();
        return orderService.sendOrderNotification(recipient, Constants.message);
    }
}
