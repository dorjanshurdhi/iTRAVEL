package com.cindy.tech.iTravel.entity;

import com.cindy.tech.iTravel.enums.TipoPasseggero;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Passeggero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_passeggero")
    private int id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "cognome")
    private String cognome;

    @Column(name = "eta")
    private int eta;

    @Column(name = "tipo_documento")
    private String tipoDocumento;

    @Column(name = "numero_documento")
    private String numeroDocumento;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo")
    private TipoPasseggero tipo;

    @ManyToOne
    @JoinColumn(name = "itinerario_id")
    private Itinerario itinerario;

    @ManyToOne
    @JoinColumn(name = "mezzo_id")
    private Mezzo mezzo;
}
