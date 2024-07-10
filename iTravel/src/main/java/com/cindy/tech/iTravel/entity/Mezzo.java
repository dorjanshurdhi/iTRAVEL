package com.cindy.tech.iTravel.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Mezzo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_mezzo")
    private int id;

    @Column(name = "marca")
    private String marca;

    @Column(name = "anno_produzione")
    private int annoProduzione;

    @Column(name = "alimentazione")
    private String alimentazione;

    @Column(name = "capienza")
    private int capienza;

    @Column(name = "posti_occupati")
    private int postiOccupati;

    @Column(name = "posti_diponibili")
    private int postiDisponibili;

    @ManyToOne
    @JoinColumn(name = "itinerario_id")
    private Itinerario itinerario;

    @OneToMany(mappedBy = "mezzo", cascade = CascadeType.ALL)
    private List<Autista> autista;

    @OneToMany(mappedBy = "mezzo", cascade = CascadeType.ALL)
    private List<Passeggero> passeggero;

    @OneToMany(mappedBy = "mezzo", cascade = CascadeType.ALL)
    private List<Posto> posti;
}
