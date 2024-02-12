package com.ead.course.serivces;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import com.ead.course.models.ModuleModel;

public interface ModuleService {

    ModuleModel save(ModuleModel moduleModel);

    void delete(ModuleModel moduleModel);

    Optional<ModuleModel> findModuleIntoCourse(UUID courseId, UUID moduleId);

    List<ModuleModel> findAllByCourse(UUID courseId);
    
    Page<ModuleModel> findAllByCourse(Specification<ModuleModel> spec, Pageable pageable);

    Optional<ModuleModel> findById(UUID moduleId);

}
