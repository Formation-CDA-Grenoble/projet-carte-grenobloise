package com.example.demo.repository;

import com.example.demo.model.External_link;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<External_link, Long> {}