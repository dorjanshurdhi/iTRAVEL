package com.cindy.tech.iTravel.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Luogo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "luogo_id")
    private int id;

    private String citta;

    private String indirizzo;

}
