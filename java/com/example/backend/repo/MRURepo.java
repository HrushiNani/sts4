package com.example.backend.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.backend.entity.Students;

public interface MRURepo extends JpaRepository<Students, Integer> {

}
