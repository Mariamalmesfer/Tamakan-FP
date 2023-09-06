package com.example.tamakanfp.Controller;



import com.example.tamakanfp.ApiResponse.ApiResponse;
import com.example.tamakanfp.Model.Recommendation;
import com.example.tamakanfp.Service.RecommendationService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/recommendation")
public class RecommendationController {

    private final RecommendationService recommendationService;

    @GetMapping("/get-all-recommendation")
    public ResponseEntity getAllrecommend(){
        return ResponseEntity.status(200).body(recommendationService.getAllRecommend());
    }


    @PostMapping("/add-recommendation")
    public ResponseEntity addRecommendation(@RequestBody @Valid Recommendation recommendation){
        recommendationService.addRecommendation(recommendation);
        return ResponseEntity.status(200).body(new ApiResponse("Recommendation added"));
    }
}
