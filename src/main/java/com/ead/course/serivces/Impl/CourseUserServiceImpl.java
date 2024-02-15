package com.ead.course.serivces.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ead.course.repositories.CourseRepository;
import com.ead.course.serivces.CourseUserService;

@Service
public class CourseUserServiceImpl implements CourseUserService {
    
    @Autowired
    CourseRepository courseRepository;
}
