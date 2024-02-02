package com.ead.course.serivces.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ead.course.repositories.LessonRepository;
import com.ead.course.serivces.LessonService;

@Service
public class LessonServiceImpl implements LessonService {
    
    @Autowired
    private LessonRepository lessonRepository;
}
