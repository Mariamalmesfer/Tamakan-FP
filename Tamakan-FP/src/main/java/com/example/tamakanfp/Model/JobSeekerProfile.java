package com.example.tamakanfp.Model;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class JobSeekerProfile {

    @Id
    private Integer id;

    private Integer out0fGPA;

    @ElementCollection
    private List<String> courses;

    @ElementCollection
    private List<String> skills;

    private Double GPA;

    private String major;

    private String university;

    private String academicQualification;

    private Integer expectedGraduationYear;

    private String resume;

}
