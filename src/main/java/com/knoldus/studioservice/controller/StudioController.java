package com.knoldus.studioservice.controller;

import com.knoldus.studioservice.Model.Department;
import com.knoldus.studioservice.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class StudioController{
    @Autowired
    DepartmentService studioService;

    @PostMapping("/newstudio")
    public Department createNewStudio(@RequestBody Department department){
        return studioService.addNewStudio(department);
    }

    @GetMapping("/studio/{id}")
    public ResponseEntity<Department>getStudioDetails(@RequestBody Department department){
        return studioService.getStudioDetails(department);
    }


}
