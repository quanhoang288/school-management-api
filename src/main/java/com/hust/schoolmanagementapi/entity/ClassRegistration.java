package com.hust.schoolmanagementapi.entity;

import lombok.Builder;

import javax.persistence.*;

@Entity
@Table(name = "class_registrations")
@Builder
public class ClassRegistration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private SubjectClass subjectClass;

    @ManyToOne
    private Student student;

    private String status;
    private Double midtermGrade;
    private Double finalTermGrade;
}
