package com.example.tamakanfp.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Recommendation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "varchar(255) ")
    private  String Reccomendations;



//    @ManyToOne
//    @JoinColumn(name = "jobProvider_id",referencedColumnName = "id")
//    @JsonIgnore
//    private JobProvider jobProvider ;


    @ManyToOne
    @JoinColumn(name = "jobSeekerProfile_id" , referencedColumnName = "")
    @JsonIgnore
    private JobSeekerProfile jobSeekerProfile;


    @OneToOne
    @MapsId
    @JsonIgnore
    JobApplication jobApplication;


}
