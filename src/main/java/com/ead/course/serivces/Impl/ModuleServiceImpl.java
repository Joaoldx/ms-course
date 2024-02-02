package com.ead.course.serivces.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ead.course.repositories.ModuleRepository;
import com.ead.course.serivces.ModuleService;

@Service
public class ModuleServiceImpl implements ModuleService {
    
    @Autowired
    private ModuleRepository moduleRepository;
}
