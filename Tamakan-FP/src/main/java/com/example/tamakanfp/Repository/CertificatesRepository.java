package com.example.tamakanfp.Repository;

import com.example.tamakanfp.Model.Certificates;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.tamakanfp.Model.Certificates;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CertificatesRepository extends JpaRepository<Certificates,Integer> {


}


