package com.hust.schoolmanagementapi.entity;

import lombok.Builder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Builder
@Table(name = "students")
public class Student extends User{
    @Column(unique = true)
    private String code;

    @ManyToOne
    private Classes studentClass;

    private Double cpa;
}
