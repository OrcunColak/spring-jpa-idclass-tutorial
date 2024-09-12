package com.colak.springjpaintutorial.jpa.isasrecord;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.Getter;

@Entity
@IdClass(StudentId.class)
@Getter
public class Student {

    @Id
    private String name;           //Id attribute Name with order-1

    @Id
    private Integer age;           //Id attribute Age with order-2

    @Id
    private String address;        //Id attribute Address with order-3

    private String school;
}
