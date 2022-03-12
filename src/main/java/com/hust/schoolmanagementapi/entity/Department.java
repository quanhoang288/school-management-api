package com.hust.schoolmanagementapi.entity;

import lombok.Builder;

import javax.persistence.*;

@Entity
@Builder
@Table(name = "departments")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true)
    private String code;

    private String name;
}
