package com.hust.schoolmanagementapi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "class_registrations")
@NoArgsConstructor
@AllArgsConstructor
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
