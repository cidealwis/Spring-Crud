package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//DTO - data tranfer object
//that data trans object
@Data //using to handle the data
@NoArgsConstructor //argument nathuwa hdala denawa construct eka
@AllArgsConstructor //eka argumnet ekek eekk hdala denawa construct eka
public class UserDTO {
    private int id;
    private String name;

}
