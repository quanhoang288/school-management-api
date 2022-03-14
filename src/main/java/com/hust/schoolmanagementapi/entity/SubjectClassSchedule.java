package com.hust.schoolmanagementapi.entity;

import lombok.Builder;

import javax.persistence.*;

@Entity
@Builder
@Table(name = "subject_class_schedules")
public class SubjectClassSchedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "subject_class_id")
    private SubjectClass subjectClass;

    @ManyToOne
    @JoinColumn(name = "start_period")
    private Period startPeriod;

    @ManyToOne
    @JoinColumn(name = "end_period")
    private Period endPeriod;

    private int schoolDay;
}
