package com.mycompany.jpa.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mycompany.jpa.entity.CourseEntity;
import com.mycompany.jpa.entity.Department;
import com.mycompany.jpa.entity.EmployeeEntity;

@Repository
public interface CourseCrud extends JpaRepository<CourseEntity, Long>{

}
