package com.example.simpleecommerceapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.simpleecommerceapp.entity.Skill;
import com.example.simpleecommerceapp.repo.SkillRepo;

@Service
public class SkillService {

    @Autowired
    private SkillRepo skillRepo;

    public List<Skill> getAllSkills() {
        return skillRepo.findAll(Sort.by(Sort.Direction.ASC, "kalaNumber"));
    }

    public Skill getSkillBySlug(String slug) {

        Skill skill = skillRepo.findBySlug(slug);

        if (skill == null) {
            throw new RuntimeException("Skill not found: " + slug);
        }

        return skill;
    }

    public void saveSkill(Skill skill) {
        skillRepo.save(skill);
    }

    public boolean existsBySlug(String slug) {
        return skillRepo.existsBySlug(slug);
    }
}
