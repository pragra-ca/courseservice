package com.example.course;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Course {
    private String name;
    private String desc;
}
