package com.hust.schoolmanagementapi.entity;

import lombok.Builder;

import javax.persistence.*;

@Entity
@Builder
@Table(name = "classes")
public class Classes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String code;
    private String schoolYear;
    private String name;

    @ManyToOne
    private Major major;
}
