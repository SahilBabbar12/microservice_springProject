package com.knoldus.studioservice.service;

import com.knoldus.studioservice.Model.Department;
import org.springframework.http.ResponseEntity;

public interface DepartmentService {
   Department addNewStudio(Department department);
   ResponseEntity<Department> getStudioDetails(Department department);
}
