package com.example.tamakanfp.Model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Certificates {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;





//    @ManyToOne
//    @JoinColumn(name = "jobSeekerProfile_id",referencedColumnName = "")
//    private JobSeekerProfile jobSeekerProfile;

// @ManyToOne
//    @JoinColumn(name = "jobApplication_id",referencedColumnName = "id")
//    private JobApplication jobApplication;

//    @ManyToOne
//    @JoinColumn(name = "jobProvider_id",referencedColumnName = "id")
//    @JsonIgnore
//    private JobProvider jobProvider ;

//    @OneToOne
//    @MapsId
//    @JsonIgnore
//    JobApplication jobApplication;

}
