package com.hust.schoolmanagementapi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
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

    @ManyToMany
    @JoinTable(
        name = "class_registrations",
        joinColumns = { @JoinColumn(name = "subject_class_id") },
        inverseJoinColumns = { @JoinColumn(name = "student_id") }
    )
    private List<Student> registeredStudents;

    @ManyToMany(mappedBy = "subjectClasses")
    private List<Lecturer> lecturers;


    @OneToMany(mappedBy = "subjectClass")
    private List<SubjectClassSchedule> subjectClassSchedules;
}
