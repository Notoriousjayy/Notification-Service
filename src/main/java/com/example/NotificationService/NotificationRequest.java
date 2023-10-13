package com.example.NotificationService;

// NotificationRequest DTO
public class NotificationRequest {
    private String recipient; // Recipient's contact information (e.g., email address, phone number)
    private String message;   // Notification message
    private NotificationType type; // Notification type (EMAIL, SMS, PUSH)
    // getters and setters
}
