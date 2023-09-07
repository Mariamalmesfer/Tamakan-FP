package com.example.tamakanfp.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty(message = "Status must not be empty")
    @Pattern(regexp = "accepted|in-progress|rejected|hiring-process", message = "Status must be available or unavailable")
    @Column(columnDefinition = "varchar(14) not null check(status REGEXP 'accepted|in-progress|rejected|hiring-process')")
    private String status;

    @ManyToOne
    @JoinColumn(name = "job_id",referencedColumnName = "id")
    @JsonIgnore
    private Job job;

    @ManyToOne
    @JoinColumn(name = "job_seeker_id",referencedColumnName = "user_id")
    @JsonIgnore
    private JobSeeker jobSeeker;


}
