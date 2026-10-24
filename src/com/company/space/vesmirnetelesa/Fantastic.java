package com.company.space.vesmirnetelesa;

public class Fantastic {
    private String nazva;
    private int energia;

    public Fantastic(String nazov) {
        this.nazva = nazov;
        this.energia = 100;
    }

    public void vykonajAkciu() {
        if (energia > 0) {
            System.out.println("Objekt " + nazva + " aktivovaný! Vysiela gravitačné vlny.");
            energia -= 10;
        } else {
            System.out.println("Objekt " + nazva + " je vyčerpaný. Potrebuje dobíjanie.");
        }
    }

    public void dobijSa() {
        energia = 100;
        System.out.println("Objekt " + nazva + " bol dobitý.");
    }

    public int getEnergia() {
        return energia;
    }
}