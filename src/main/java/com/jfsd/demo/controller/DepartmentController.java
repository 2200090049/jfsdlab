package com.jfsd.demo.controller;

import com.klef.jfsd.exam.entity.Department;
import com.klef.jfsd.exam.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService service;

    @PostMapping
    public Department addDepartment(@RequestBody Department department) {
        return service.saveDepartment(department);
    }

    @DeleteMapping("/{id}")
    public String deleteDepartment(@PathVariable int id) {
        service.deleteDepartmentById(id);
        return "Department deleted with ID: " + id;
    }
}
