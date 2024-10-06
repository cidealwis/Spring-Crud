package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//that is entity
@Entity  //create the table in database automatically
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
    @Id  //use to assign the id primary key
    private int id;
    private String name;
}
