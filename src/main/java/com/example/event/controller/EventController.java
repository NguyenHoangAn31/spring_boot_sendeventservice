package com.example.event.controller;

import com.example.event.dto.Feedback;
import com.example.event.service.EventService;

import jakarta.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/feedback")
public class EventController {

    @Autowired
    private EventService eventService;

    @PostMapping()
    public String publishEvent(@RequestBody Feedback feedback) throws MessagingException {
        eventService.publishEvent(feedback);
        return "Review has been submitted";
    }
}
