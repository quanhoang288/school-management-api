package com.hust.schoolmanagementapi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.List;

@Entity
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "students")
public class Student extends User{
    @Column(unique = true)
    private String code;

    @ManyToOne
    @JoinColumn(name = "class_id")
    private Classes studentClass;

    @ManyToMany(mappedBy = "registeredStudents")
    private List<SubjectClass> registeredClasses;

    private Double cpa;
}
