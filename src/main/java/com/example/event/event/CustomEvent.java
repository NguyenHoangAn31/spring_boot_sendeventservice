package com.example.event.event;

import org.springframework.context.ApplicationEvent;

import com.example.event.dto.Feedback;

public class CustomEvent extends ApplicationEvent {
    private Feedback feedback;

    public CustomEvent(Object source, Feedback feedback) {
        super(source);
        this.feedback = feedback;
    }

    public Feedback getFeedback() {
        return feedback;
    }
}
