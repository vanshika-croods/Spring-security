package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Role1;

public interface RoleRepo extends JpaRepository<Role1,Long> {

}
