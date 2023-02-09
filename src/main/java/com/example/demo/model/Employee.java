package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long employeeId;

    String username;

    public long getId() {
        return employeeId;
    }
    public void setId(long id) {
        this.employeeId = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String employeeUsername) {
        this.username = employeeUsername;
    }

}
