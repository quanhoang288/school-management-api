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
    @JoinColumn(name = "subject_class_id")
    private SubjectClass subjectClass;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    private String status;
    private Double midtermGrade;
    private Double finalTermGrade;
}
