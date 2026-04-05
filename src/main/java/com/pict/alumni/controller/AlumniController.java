package com.pict.alumni.controller;

import com.pict.alumni.entity.Alumni;
import com.pict.alumni.service.AlumniService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alumni")
public class AlumniController {

    @Autowired
    private AlumniService service;

    @PostMapping("/register")
    public Alumni register(@Valid @RequestBody Alumni alumni) {
        return service.save(alumni);
    }

    @GetMapping("/all")
    public List<Alumni> getAll() {
        return service.getAll();
    }

    @GetMapping("/search/skill/{skill}")
    public List<Alumni> searchSkill(@PathVariable String skill) {
        return service.searchBySkill(skill);
    }

    @GetMapping("/filter/company/{company}")
    public List<Alumni> filterCompany(@PathVariable String company) {
        return service.filterByCompany(company);
    }

    @GetMapping("/filter/year/{year}")
    public List<Alumni> filterYear(@PathVariable int year) {
        return service.filterByYear(year);
    }
}