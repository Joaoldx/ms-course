package com.ead.course.serivces;

import com.ead.course.models.ModuleModel;

public interface ModuleService {

    ModuleModel save(ModuleModel moduleModel);

    void delete(ModuleModel moduleModel);
}
