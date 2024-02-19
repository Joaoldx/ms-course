package com.ead.course.serivces.Impl;

import java.util.UUID;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.ead.course.serivces.UtilsService;

@Service
public class UtilsServiceImpl implements UtilsService {

    String REQUEST_URI = "http://localhost:8087/users";
    
    public String createUrl(UUID courseId, Pageable pageable) {
        String url = REQUEST_URI + "/users?courseId=" + courseId + "&page=" + pageable.getPageNumber() + "&size=" 
        + pageable.getPageSize() + "&sort=" + pageable.getSort().toString().replaceAll(":", ",");

        return url;
    }
}
