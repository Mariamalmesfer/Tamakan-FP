package com.example.tamakanfp.Controller;


import com.example.tamakanfp.ApiResponse.ApiResponse;
import com.example.tamakanfp.Model.Job;
import com.example.tamakanfp.Service.JobService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/job")
@RequiredArgsConstructor
public class JobController {

    private final JobService jobService;

    @GetMapping("get-jobs")
    private ResponseEntity getJobs() {
        return ResponseEntity.status(200).body(jobService.getJobs());
    }

    @PostMapping("add-job/{providerId}")
    private ResponseEntity addJob(@RequestBody @Valid Job job,@PathVariable Integer providerId) {
        jobService.addJob(job,providerId);
        return ResponseEntity.status(200).body(new ApiResponse("Job added"));
    }

    @PutMapping("update-job/{id}")
    private ResponseEntity updateJob(@RequestBody @Valid Job job,@PathVariable Integer id) {
        jobService.updateJob(job,id);
        return ResponseEntity.status(200).body(new ApiResponse("Job updated"));

    }
    @DeleteMapping("delete-job/{id}")
    private ResponseEntity deleteJob(@PathVariable Integer id) {
        jobService.deleteJob(id);
        return ResponseEntity.status(200).body(new ApiResponse("Job deleted"));

    }
}