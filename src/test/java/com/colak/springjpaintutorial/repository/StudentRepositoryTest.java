package com.colak.springjpaintutorial.repository;

import com.colak.springjpaintutorial.jpa.isasrecord.Student;
import com.colak.springjpaintutorial.jpa.isasrecord.StudentId;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository repository;

    @Test
    void findById() {
        StudentId studentId = new StudentId("123 Maple Street", 16, "John Doe");
        Optional<Student> optional = repository.findById(studentId);
        assertThat(optional)
                .isPresent();

        Student student = optional.get();
        assertThat(student.getName())
                .isEqualTo("John Doe");

    }

}