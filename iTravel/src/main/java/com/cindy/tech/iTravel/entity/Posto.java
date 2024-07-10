package com.cindy.tech.iTravel.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Posto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_posto")
    private Long id;

    @Column(name = "numero")
    private String numeroPosto;

    @OneToOne
    @JoinColumn(name = "passeggero_id")
    private Passeggero passeggero;

    @ManyToOne
    @JoinColumn(name = "mezzo_id")
    private Mezzo mezzo;

}
