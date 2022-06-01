package com.sha.springbootjwtauthorization.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username",nullable = false,length = 100)
    private String username;

    @Column(name = "password",nullable = false)
    private String password;

    @Column(name = "name",nullable = false)
    private String name;

    @Column(name = "create_time", nullable = false)
    private LocalDateTime create_time;

    @Enumerated(EnumType.STRING)
    @Column (name = "role",nullable = false)
    private Role role;

    @Transient
    private String accessToken;

    @Transient
    private String refreshToken;

}
