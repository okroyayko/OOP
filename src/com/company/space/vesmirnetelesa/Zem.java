package com.company.space.vesmirnetelesa;

import com.company.space.zive_tvory.Tvor;

public class Zem extends Planeta {

    private Tvor[] poleTvorov;
    private int pocetTvorov;

    public Zem(double hmotnost, double polomer, String nazov) {
        super(hmotnost, polomer, nazov);
        poleTvorov = new Tvor[1000]; // максимум 1000 істот
        pocetTvorov = 0;
    }

    public void addTvor(Tvor tentoTvor) {
        if (pocetTvorov < poleTvorov.length) {
            poleTvorov[pocetTvorov] = tentoTvor;
            pocetTvorov++;
        } else {
            System.out.println("Pole tvorov je plné!");
        }
    }

    public Tvor[] getPoleTvorov() {
        return poleTvorov;
    }
}
