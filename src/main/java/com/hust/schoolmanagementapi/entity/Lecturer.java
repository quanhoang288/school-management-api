package com.hust.schoolmanagementapi.entity;


import lombok.Builder;

import javax.persistence.*;
import java.util.List;

@Entity
@Builder
@Table(name = "lecturers")
public class Lecturer extends User{
    @ManyToOne
    private Department department;

    @ManyToMany
    @JoinColumn(name = "lecturer_id")
    private List<SubjectClass> subjectClasses;
}
