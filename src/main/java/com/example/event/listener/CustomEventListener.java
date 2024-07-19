package com.example.event.listener;

import com.example.event.event.CustomEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class CustomEventListener implements ApplicationListener<CustomEvent> {


    public void onApplicationEvent(CustomEvent event) {
        System.out.println("Received feedback : " + event.getMessage());

    }
}
