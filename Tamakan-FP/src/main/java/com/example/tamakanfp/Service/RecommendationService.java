package com.example.tamakanfp.Service;


import com.example.tamakanfp.ApiResponse.ApiException;
import com.example.tamakanfp.Model.Recommendation;
import com.example.tamakanfp.Repository.RecommendationRepositoory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class RecommendationService {
    private final RecommendationRepositoory recommendationRepositoory;


    public List<Recommendation> getAllRecommend(){

        return recommendationRepositoory.findAll();
    }


    public void addRecommendation(Recommendation recommendation){
//        User user=authRepository.findUserById(user_id);
//        if (user==null){
//            throw new ApiException("id is null");
//        }
        recommendationRepositoory.save(recommendation);
    }

    public void deleteRecommendation(Integer id){

//        User user=authRepository.findUserById(user_id);
//        if (user==null){
//            throw new ApiException("id is null");


Recommendation recommendation=recommendationRepositoory.findRecommendationById(id);
if(recommendation==null) {

    throw new ApiException("id is null");
}
        recommendationRepositoory.deleteById(id);}

}






