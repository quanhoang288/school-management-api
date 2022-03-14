package com.hust.schoolmanagementapi.entity;


import javax.persistence.*;

@Entity
@Table(name = "users")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true)
    private String loginId;

    private String password;

    private String fullName;

    private String dateOfBirth;

    private String email;

    private String address;

}
