package com.example.tamakanfp.Model;

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
//    @JoinColumn(name = "Seeker_id",referencedColumnName = "id")
//    private JobSeekerProfile jobSeekerProfile;

// @ManyToOne
//    @JoinColumn(name = "jobProvider_id",referencedColumnName = "id")
//    private JobProvider jobProvider ;




}
