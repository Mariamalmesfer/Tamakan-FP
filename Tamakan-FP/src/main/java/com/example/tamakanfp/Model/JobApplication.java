package com.example.tamakanfp.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class JobApplication {

    @Id
    private Integer id;

    private String status;


    @ManyToOne
    @JoinColumn(name = "jobSeeker_id" , referencedColumnName = "User_id")
    @JsonIgnore
    private JobSeeker jobSeeker;



    @OneToOne(cascade =CascadeType.ALL,mappedBy = "jobApplication")
    @PrimaryKeyJoinColumn
    Certificates certificates;


    @OneToOne(cascade =CascadeType.ALL,mappedBy = "jobApplication")
    @PrimaryKeyJoinColumn
    Recommendation recommendation;

}
