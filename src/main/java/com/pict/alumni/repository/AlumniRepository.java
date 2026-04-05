package com.pict.alumni.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pict.alumni.entity.Alumni;
import java.util.List;

public interface AlumniRepository extends JpaRepository<Alumni, Long> {

    // 👇 ADD THESE HERE
    List<Alumni> findBySkillsContaining(String skills);
    List<Alumni> findByCompany(String company);
    List<Alumni> findByGraduationYear(int year);
}