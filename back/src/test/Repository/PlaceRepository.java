package com.example.demo.repository;

import com.example.demo.model.Mayor_name;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends JpaRepository<Mayor_name, Long> {}