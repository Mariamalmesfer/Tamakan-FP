package com.example.tamakanfp.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Set;


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


    @OneToOne
    @MapsId
    @JsonIgnore
    JobSeeker jobSeeker;

    @OneToMany(cascade = CascadeType.ALL ,mappedBy = "jobSeekerProfile")
    Set<Certificates> certificates;


    @OneToMany(cascade = CascadeType.ALL ,mappedBy = "jobSeekerProfile")
    Set<Recommendation> Recommendation;

}
