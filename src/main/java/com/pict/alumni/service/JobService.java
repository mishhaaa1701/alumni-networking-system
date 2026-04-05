package com.pict.alumni.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.pict.alumni.entity.Job;
import com.pict.alumni.repository.JobRepository;

@Service
public class JobService {

    @Autowired
    private JobRepository repo;

    public Job postJob(Job job) {
        return repo.save(job);
    }

    public List<Job> getJobs() {
        return repo.findAll();
    }
}