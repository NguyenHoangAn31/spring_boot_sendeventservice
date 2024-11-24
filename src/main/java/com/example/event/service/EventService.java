package com.example.event.service;

import com.example.event.dto.Feedback;
import com.example.event.event.CustomEvent;

import jakarta.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class EventService {

    @Autowired
    private ApplicationEventPublisher eventPublisher;

    public void publishEvent(Feedback feedback) throws MessagingException {
        CustomEvent customEvent = new CustomEvent(this, feedback);
        eventPublisher.publishEvent(customEvent);
    }
}
