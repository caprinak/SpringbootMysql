package com.caprinak.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caprinak.demo.model.Users;

public interface UserRepository extends JpaRepository<Users, Integer> {

}
