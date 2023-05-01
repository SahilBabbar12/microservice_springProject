package com.knoldus.studioservice.service.impl;

import com.knoldus.studioservice.Model.Department;
import com.knoldus.studioservice.repository.DepartmentRepository;
import com.knoldus.studioservice.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;

    @Autowired
    RestTemplate restTemplate;
    @Override
    public Department addNewStudio(Department department) {
        return departmentRepository.save(department);

    }

    @Override
    public ResponseEntity<Department> getStudioDetails(Department department) {
        return restTemplate.getForEntity("http://localhost:8080/studio",
             null   ,
                String.class);
    }
}
