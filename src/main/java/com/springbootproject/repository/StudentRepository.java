package com.springbootproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootproject.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
