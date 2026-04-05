package com.pict.alumni.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.pict.alumni.entity.Job;
import com.pict.alumni.service.JobService;

@RestController
@RequestMapping("/jobs")
public class JobController {

    @Autowired
    private JobService service;

    @PostMapping("/post")
    public Job postJob(@RequestBody Job job) {
        return service.postJob(job);
    }

    @GetMapping("/all")
    public List<Job> getJobs() {
        return service.getJobs();
    }
}