package com.example.tamakanfp.Model;

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

// @ManyToOne
//    @JoinColumn(name = "Seeker_id",referencedColumnName = "id")
//    private JobSeekerProfile jobSeekerProfile;


// @ManyToOne
//    @JoinColumn(name = "jobApplication_id",referencedColumnName = "id")
//    private JobApplication jobApplication;


// @ManyToOne
//    @JoinColumn(name = "jobProvider_id",referencedColumnName = "id")
//    private JobProvider jobProvider ;
}
