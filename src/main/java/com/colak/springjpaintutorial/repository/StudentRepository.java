package com.colak.springjpaintutorial.repository;

import com.colak.springjpaintutorial.jpa.isasrecord.Student;
import com.colak.springjpaintutorial.jpa.isasrecord.StudentId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, StudentId> {
}
