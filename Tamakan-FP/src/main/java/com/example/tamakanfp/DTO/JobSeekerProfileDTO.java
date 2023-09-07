package com.example.tamakanfp.DTO;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Id;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@Valid
public class JobSeekerProfileDTO {

    private Integer jobSeeker_id;

    private Integer out0fGPA;

    private List<String> courses;

    private List<String> skills;

    private Double GPA;

    private String major;

    private String university;

    private String academicQualification;

    private Integer expectedGraduationYear;

    private String resume;
}
