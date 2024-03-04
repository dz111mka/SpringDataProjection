package ru.chepikov.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private String position;

    private Double salary;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;
}
