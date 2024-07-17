package com.cindytech.itravel.model;

import com.cindytech.itravel.enums.TipoPasseggero;

public class Passeggero {

    private int id;
    private String nome;
    private String cognome;
    private int eta;
    private String tipoDocumento;
    private String numeroDocumento;
    private TipoPasseggero tipo;
    private Itinerario itinerario;
    private Mezzo mezzo;
}
