package com.example.tamakanfp.DTO;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.File;

@Setter
@Getter
@AllArgsConstructor
@Valid
public class CertificatesDTO {


    private Integer jobApplication_id;


    private File Certificates;


    private String status;
}
