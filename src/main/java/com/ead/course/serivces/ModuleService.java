package com.ead.course.serivces;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.ead.course.models.ModuleModel;

public interface ModuleService {

    ModuleModel save(ModuleModel moduleModel);

    void delete(ModuleModel moduleModel);

    Optional<ModuleModel> findModuleIntoCourse(UUID courseId, UUID moduleId);

    List<ModuleModel> findAllByCourse(UUID courseId);

    Optional<ModuleModel> findById(UUID moduleId);
}
