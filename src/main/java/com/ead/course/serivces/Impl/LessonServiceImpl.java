package com.ead.course.serivces.Impl;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ead.course.models.LessonModel;
import com.ead.course.repositories.LessonRepository;
import com.ead.course.serivces.LessonService;

@Service
public class LessonServiceImpl implements LessonService {
    
    @Autowired
    private LessonRepository lessonRepository;

    @Override
    public LessonModel save(LessonModel lessonModel) {
        return lessonRepository.save(lessonModel);
    }

    @Override
    public Optional<LessonModel> findLessonIntoModule(UUID moduleId, UUID lessonId) {
        return lessonRepository.findLessonIntoModule(moduleId, lessonId);
    }

    @Override
    public void delete(LessonModel lessonModel) {
        lessonRepository.delete(lessonModel);
    }
}
