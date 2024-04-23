package com.project1.day6pagination.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project1.day6pagination.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer>{

}
