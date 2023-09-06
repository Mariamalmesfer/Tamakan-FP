package com.example.tamakanfp.Controller;



import com.example.tamakanfp.ApiResponse.ApiResponse;
import com.example.tamakanfp.DTO.JobProviderDTO;
import com.example.tamakanfp.Service.JobProviderService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/jobProvider")
public class JobProviderController {

       private final JobProviderService jobProviderService;


    @PostMapping("/regester")
    public ResponseEntity Regester(@RequestBody @Valid JobProviderDTO jobProviderDTO) {
        jobProviderService.regester(jobProviderDTO);
        return ResponseEntity.status(200).body(new ApiResponse("Job Provider added"));

    }

    @PostMapping("/logout")
    public ResponseEntity Logoout() {
        return ResponseEntity.status(200).body(new ApiResponse("Log out successful"));

    }


}
