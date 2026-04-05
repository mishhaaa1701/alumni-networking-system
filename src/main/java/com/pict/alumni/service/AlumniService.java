package com.pict.alumni.service;

import com.pict.alumni.entity.Alumni;
import com.pict.alumni.repository.AlumniRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumniService {

    @Autowired
    private AlumniRepository repo;

    public Alumni save(Alumni alumni) {
        return repo.save(alumni);
    }

    public List<Alumni> getAll() {
        return repo.findAll();
    }

    public List<Alumni> searchBySkill(String skill) {
        return repo.findBySkillsContaining(skill);
    }

    public List<Alumni> filterByCompany(String company) {
        return repo.findByCompany(company);
    }

    public List<Alumni> filterByYear(int year) {
        return repo.findByGraduationYear(year);
    }
}