package com.example.event.listener;

import com.example.event.event.CustomEvent;
import com.example.event.service.EmailService;

import jakarta.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class CustomEventListener implements ApplicationListener<CustomEvent> {

    @Autowired
    private EmailService emailService;

    public void onApplicationEvent(CustomEvent event) {

        // Gửi email khi sự kiện được nhận
        try {
            emailService.sendEmail(event.getFeedback().getEmail(), "Review feedback", "Thank you "+ event.getFeedback().getName()+" for your comments");
        } catch (MessagingException e) {
            e.printStackTrace();
        }
        
        System.out.println("Received feedback : " + event.getFeedback().getMessage());

    }
}
