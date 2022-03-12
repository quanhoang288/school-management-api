package com.hust.schoolmanagementapi.entity;

import lombok.Builder;

import javax.persistence.*;
import java.util.List;

@Entity
@Builder
@Table(name = "subject_classes")
public class SubjectClass {
    @Id
    private int id;

    @ManyToOne
    private Subject subject;

    @Column(unique = true)
    private String code;

    private String name;
    private String status;

    @OneToMany
    private List<SubjectClassSchedule> subjectClassSchedules;
}
