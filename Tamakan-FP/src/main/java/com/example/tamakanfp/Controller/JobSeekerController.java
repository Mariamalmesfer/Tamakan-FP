package com.example.tamakanfp.Controller;


import com.example.tamakanfp.ApiResponse.ApiResponse;
import com.example.tamakanfp.DTO.JobProviderDTO;
import com.example.tamakanfp.DTO.JobSeekerDTO;
import com.example.tamakanfp.Service.JobProviderService;
import com.example.tamakanfp.Service.JobSeekerService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/jobSeeker")
public class JobSeekerController {

    private final JobSeekerService jobSeekerService;


    @PostMapping("/regester")
    public ResponseEntity Regester(@RequestBody @Valid JobSeekerDTO jobSeekerDTO) {
        jobSeekerService.regester(jobSeekerDTO);
        return ResponseEntity.status(200).body(new ApiResponse("Job Seeker added"));

    }

    @PostMapping  ("/logout")
    public ResponseEntity Logoout() {
        return ResponseEntity.status(200).body(new ApiResponse("Log out successful"));

    }
}
