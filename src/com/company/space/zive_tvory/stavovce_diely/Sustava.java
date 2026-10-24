package com.company.space.zive_tvory.stavovce_diely;


public class Sustava {
    private Typ_sustavy typSustavy;

    public Sustava(Typ_sustavy typ) {
        this.typSustavy = typ;
    }

    public Typ_sustavy getTypSustavy() {
        return typSustavy;
    }

    @Override
    public String toString() {
        return "Sústava: " + typSustavy;
    }
}
