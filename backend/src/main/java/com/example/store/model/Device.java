package com.example.store.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.DynamicUpdate;



@Getter
@Setter
@Data
@Entity
@DynamicUpdate
@Table(name = "device")


public class Device {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="dev_id") private Long id;
    @Column(name="title") private String title;

    @Column(name="description") private String description;
    @Column(name="price") private float price;
}