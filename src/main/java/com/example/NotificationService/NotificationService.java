package com.example.NotificationService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.example.NotificationService.NotificationType.*;

// NotificationService
@Service
public class NotificationService {
    @Autowired
    private EmailService emailService;
    @Autowired
    private SmsService smsService;
    @Autowired
    private PushNotificationService pushNotificationService;

    public void sendNotification(NotificationRequest request) {
        switch (request.getType()) {
            case EMAIL:
                emailService.sendEmail(request.getRecipient(), request.getMessage());
                break;
            case SMS:
                smsService.sendSms(request.getRecipient(), request.getMessage());
                break;
            case PUSH:
                pushNotificationService.sendPushNotification(request.getRecipient(), request.getMessage());
                break;
            default:
                throw new IllegalArgumentException("Invalid notification type");
        }
    }
}