package com.example.testProject.repositories;

import com.example.testProject.entites.Purveyor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PurveyorRepository extends JpaRepository<Purveyor, Long>{
}
