package com.example.event.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Feedback {
    String name;
    String phone;
    String email;
    String message;
}
