package com.hust.schoolmanagementapi.entity;

import com.hust.schoolmanagementapi.entity.enums.AdminType;
import lombok.Builder;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Builder
@Getter
@Table(name = "admins")
public class Admin extends User {
    @Enumerated(value = EnumType.STRING)
    private AdminType adminType;
}
