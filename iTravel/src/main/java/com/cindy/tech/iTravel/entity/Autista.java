package com.cindy.tech.iTravel.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Autista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_autista")
    private int id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "cognome")
    private String cognome;

    @Column(name = "data_nascita")
    private Date dataNascita;

    @Column(name = "documento")
    private String documento;

    @Column(name = "tipo_patente")
    private String tipoPatente;

    @ManyToOne
    @JoinColumn(name = "mezzo_id")
    private Mezzo mezzo;
}
