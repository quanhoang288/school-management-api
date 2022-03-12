package com.hust.schoolmanagementapi.entity;

import lombok.Builder;

import javax.persistence.*;

@Entity
@Builder
@Table(name = "admins")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(unique = true)
    private String loginId;

    private String password;
    private String name;
}
