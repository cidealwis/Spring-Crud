package com.example.demo.repo;

import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//JpaRepository<User Model,UserModel Primary key Data type>
@Repository
public interface UserRepo extends JpaRepository<User,Integer> {
    //define the types of services and controllers
}
