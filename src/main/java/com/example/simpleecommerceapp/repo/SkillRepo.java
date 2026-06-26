package com.example.simpleecommerceapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.simpleecommerceapp.entity.Skill;

@Repository
public interface SkillRepo extends JpaRepository<Skill, Long> {

    Skill findBySlug(String slug);

    boolean existsBySlug(String slug);

}