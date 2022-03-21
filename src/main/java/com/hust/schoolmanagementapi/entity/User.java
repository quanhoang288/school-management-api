package com.hust.schoolmanagementapi.entity;


import com.hust.schoolmanagementapi.listener.UserListener;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
@SuperBuilder
@Data
@NoArgsConstructor
@EntityListeners(UserListener.class)
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int id;

    @Column(unique = true, name = "login_id")
    protected String loginId;

    protected String password;

    protected String fullName;

    protected String dateOfBirth;

    protected String email;

    protected String address;

    @ManyToMany
    @JoinTable(
        name = "user_roles",
        joinColumns = @JoinColumn(name = "user_id"),
        inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    protected List<Role> roles;
}
