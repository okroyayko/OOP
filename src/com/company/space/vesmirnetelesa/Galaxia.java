package com.company.space.vesmirnetelesa;

import java.util.ArrayList;
import java.util.List;

public class Galaxia {
    private String nazov;
    private List<Slnecna_sustava> sustavy;
    private Fantastic objekt;

    public Galaxia(String nazov) {
        this.nazov = nazov;
        this.sustavy = new ArrayList<>();
    }

    public void addSustava(Slnecna_sustava tato_sustava) {
        sustavy.add(tato_sustava);
    }

    public void pridajObjekt(Fantastic objekt) {
        this.objekt = objekt;
    }

    public void aktivujObjekt() {
        if (objekt != null) {
            objekt.vykonajAkciu();
        }
    }

    public void posliSpravu(Galaxia cielovaGalaxia, String sprava) {
        System.out.println("Galaxia " + nazov + " posiela správu galaxii " + cielovaGalaxia.nazov + ": " + sprava);
    }
}