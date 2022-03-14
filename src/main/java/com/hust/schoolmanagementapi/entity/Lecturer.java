package com.hust.schoolmanagementapi.entity;


import lombok.Builder;

import javax.persistence.*;
import java.util.List;

@Entity
@Builder
@Table(name = "lecturers")
public class Lecturer extends User{
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    @ManyToMany
    @JoinTable(
        name = "lecturer_subject_class",
        joinColumns = @JoinColumn(name = "lecturer_id"),
        inverseJoinColumns = @JoinColumn(name = "subject_class_id")
    )
    private List<SubjectClass> subjectClasses;
}
