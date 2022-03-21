package com.hust.schoolmanagementapi.entity;

import com.hust.schoolmanagementapi.entity.enums.AdminType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Entity
@SuperBuilder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "admins")
public class Admin extends User {
    @Enumerated(value = EnumType.STRING)
    private AdminType adminType;
}
