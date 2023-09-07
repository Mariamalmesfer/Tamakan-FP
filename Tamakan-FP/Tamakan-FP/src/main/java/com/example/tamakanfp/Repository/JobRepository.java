package com.example.tamakanfp.Repository;

import com.example.tamakanfp.Model.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends JpaRepository<Job,Integer> {

    Job findJobById(Integer id);
}
