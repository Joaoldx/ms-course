package com.ead.course.dtos;

import java.util.UUID;

import com.ead.course.enums.CourseLevel;
import com.ead.course.enums.CourseStatus;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class CourseDto {
    
    @NotBlank
    private String name;
    @NotBlank
    private String description;
    private String imageUrl;
    @NotNull
    private CourseStatus courseStatus;
    @NotNull
    private CourseLevel courseLevel;
    @NotNull
    private UUID userInstructor;
}
