package com.example.NotificationService;

import org.springframework.stereotype.Service;

// SmsService
@Service
public class SmsService {
    public void sendSms(String recipient, String message) {
        // Implement SMS sending logic
        System.out.println("Sending SMS to " + recipient + ": " + message);
    }
}