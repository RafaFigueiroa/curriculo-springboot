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
@Table(name = "profiles")
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String lastName;

    @Column
    private String title;

    @Column
    private String about;

    @Column
    private String number;

    @Column
    private String location;

    @Column
    private String email;

    @Column
    private String github;

    @Column
    private String linkedin;
}
