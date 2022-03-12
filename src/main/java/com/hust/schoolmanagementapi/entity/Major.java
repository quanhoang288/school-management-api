package com.hust.schoolmanagementapi.entity;

import lombok.Builder;

import javax.persistence.*;

@Entity
@Builder
@Table(name = "majors")
public class Major {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true)
    private String code;

    private String name;

    @ManyToOne
    private Department department;
}
