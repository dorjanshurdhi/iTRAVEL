package com.cindytech.itravel.model;

import java.util.List;

public class Mezzo {

    private int id;
    private String marca;
    private int annoProduzione;
    private String alimentazione;
    private int capienza;
    private int postiOccupati;
    private int postiDisponibili;
    private Itinerario itinerario;
    private List<Autista> autista;
    private List<Passeggero> passeggero;
    private List<Posto> posti;
}
