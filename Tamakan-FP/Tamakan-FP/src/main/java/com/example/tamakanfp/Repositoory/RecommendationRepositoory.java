package com.example.tamakanfp.Repositoory;

import com.example.tamakanfp.Model.Recommendation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecommendationRepositoory extends JpaRepository<Recommendation,Integer> {

    Recommendation findRecommendationById(Integer id);



}
