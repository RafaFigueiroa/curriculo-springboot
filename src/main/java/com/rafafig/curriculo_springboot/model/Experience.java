package com.rafafig.curriculo_springboot.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "experiences")
public class Experience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String position;

    @Column
    private String company;

    @Column
    private String employmentType;

    @Column
    private String location;

    @Column
    private String modality;

    @Column
    private String startDate;

    @Column
    private String endDate;
}
