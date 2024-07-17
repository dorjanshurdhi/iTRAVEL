package com.cindytech.itravel.model;

import java.sql.Time;
import java.util.Date;
import java.util.List;

public class Itinerario {

    private int id;
    private Luogo partenza;
    private Luogo arrivo;
    private Date dataPartenza;
    private Date dataArrivo;
    private Time durataViaggio;
    private List<Mezzo> mezzi;

}
