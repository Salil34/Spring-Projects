package com.example.first.dao;

import com.example.first.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
