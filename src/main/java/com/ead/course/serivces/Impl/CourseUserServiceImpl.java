package com.ead.course.serivces.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ead.course.repositories.CourseUserRepository;
import com.ead.course.serivces.CourseUserService;

@Service
public class CourseUserServiceImpl implements CourseUserService {
    
    @Autowired
    CourseUserRepository courseUserRepository;
}
