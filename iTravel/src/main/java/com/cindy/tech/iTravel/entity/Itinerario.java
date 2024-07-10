package com.cindy.tech.iTravel.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Time;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class Itinerario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_itinerario")
    private int id;

    @ManyToOne
    @JoinColumn(name = "partenza_id")
    private Luogo partenza;

    @ManyToOne
    @JoinColumn(name = "arrivo_id")
    private Luogo arrivo;

    @Column(name = "data_partenza")
    private Date dataPartenza;

    @Column(name = "data_arrivo")
    private Date dataArrivo;

    @Column(name = "durata_viaggio")
    private Time durataViaggio;

    @OneToMany(mappedBy = "itinerario", cascade = CascadeType.ALL)
    private List<Mezzo> mezzi;

}
