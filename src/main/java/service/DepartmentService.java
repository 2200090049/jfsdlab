package com.jfsd.demo.service;

import com.klef.jfsd.exam.entity.Department;
import com.klef.jfsd.exam.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository repository;

    public Department saveDepartment(Department department) {
        return repository.save(department);
    }

    public void deleteDepartmentById(int id) {
        repository.deleteByIdWithHQL(id);
    }
}
