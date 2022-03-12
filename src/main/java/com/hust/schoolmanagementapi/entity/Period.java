package com.hust.schoolmanagementapi.entity;

import lombok.Builder;

import javax.persistence.*;
import java.util.Date;

@Entity
@Builder
@Table(name = "periods")
public class Period {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true)
    private String code;

    private String name;
    private Date startAt;
}
