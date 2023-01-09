package com.example.LmsBackend.LmsBackend.Repositories;

import com.example.LmsBackend.LmsBackend.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
}
