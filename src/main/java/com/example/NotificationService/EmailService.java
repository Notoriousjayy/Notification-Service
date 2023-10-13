package com.example.NotificationService;

import org.springframework.stereotype.Service;

// EmailService
@Service
public class EmailService {
    public void sendEmail(String recipient, String message) {
        // Implement email sending logic
        System.out.println("Sending email to " + recipient + ": " + message);
    }
}
