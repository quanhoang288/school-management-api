package com.hust.schoolmanagementapi.entity;

import lombok.Builder;

import javax.persistence.*;
import java.util.List;

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

    @OneToMany(mappedBy = "major")
    private List<Classes> classes;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;
}
