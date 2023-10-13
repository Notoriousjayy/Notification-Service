package com.example.NotificationService;

import org.springframework.stereotype.Service;

// PushNotificationService
@Service
public class PushNotificationService {
    public void sendPushNotification(String recipient, String message) {
        // Implement push notification sending logic
        System.out.println("Sending push notification to " + recipient + ": " + message);
    }
}
