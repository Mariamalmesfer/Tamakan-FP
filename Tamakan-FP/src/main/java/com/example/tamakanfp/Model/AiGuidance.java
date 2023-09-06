package com.example.tamakanfp.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class AiGuidance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @NotEmpty
    @Column(columnDefinition = "varchar(255) not null ")
    private String question;

    @NotEmpty
    @Column(columnDefinition = "varchar(255) not null ")
    private String answer;









}
