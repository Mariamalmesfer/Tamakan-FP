package com.example.tamakanfp.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.File;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Certificates {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "varchar(255)")
    private File Certificates;

    @Column(columnDefinition = "varchar(255)")
    private String status;



 @ManyToOne
    @JoinColumn(name = "jobSeekerProfile_id",referencedColumnName = "")
    private JobSeekerProfile jobSeekerProfile;


    @OneToOne
    @MapsId
    @JsonIgnore
    JobApplication jobApplication;


}
