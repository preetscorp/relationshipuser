package com.example.user.relationshipuser.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.user.relationshipuser.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
