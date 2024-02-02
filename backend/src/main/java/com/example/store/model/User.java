package com.example.store.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

@Data
@Entity
@DynamicUpdate
@Table(name = "user")

public class User {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="user_id") private Long id;
    @Column(name="firstname") private String firstname;
    @Column(name="lastname") private String lastname;
    @Column(name="email") private String email;

}