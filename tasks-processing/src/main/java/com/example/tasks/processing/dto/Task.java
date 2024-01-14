package com.example.tasks.processing.dto;

import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

@Component
public class Task {
    @Id
    private Long id;
    private String status;
    private String position;
    private String progress;
    private Integer length;
}
