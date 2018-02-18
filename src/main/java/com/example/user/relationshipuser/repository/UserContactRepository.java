package com.example.user.relationshipuser.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.user.relationshipuser.entity.UserContact;

public interface UserContactRepository extends JpaRepository<UserContact, Integer> {

}
