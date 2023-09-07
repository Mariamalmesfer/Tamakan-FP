package com.example.tamakanfp.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Job {

    @Id
    private Integer id;

    @Column(columnDefinition = "varchar(30) not null")
    private String jobName;

    @Column(columnDefinition = "varchar(50) not null")
    private String jobDescription;

    @Column(columnDefinition = "int not null")
    private Integer workingDays;

    @Column(columnDefinition = "int not null")
    private Integer workingHours;

    @Column(columnDefinition = "DATE ")
    private LocalDate startDate;

    @Column(columnDefinition = "DATE ")
    private LocalDate endDate;

    @Column(columnDefinition = "varchar(15) not null")
    private String city;

    @Column(columnDefinition = "varchar(15) not null")
    private String address;

    @Column(columnDefinition = "Double not null")
    private Double salary;

    @Column(columnDefinition = "varchar(15) not null")
    private String sector;

    @Column(columnDefinition = "varchar(7) not null")
    private String status;

    @ManyToOne
    @JoinColumn(name = "jobProvider_id ",referencedColumnName = "User_id")
    @JsonIgnore
    private JobProvider jobProvider ;

}
