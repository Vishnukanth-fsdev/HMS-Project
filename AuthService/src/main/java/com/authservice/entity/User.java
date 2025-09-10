package com.authservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="user")
@Getter
@Setter
public class User {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
@Column(name="name", nullable = false)
private String name;
@Column(name="username", nullable = false, unique = true)
private String username;
@Column(name="email", nullable = false, unique = true)
private String email;
@Column(name = "password")
private String password; 
@Column(name = "role")
private String role;


}
