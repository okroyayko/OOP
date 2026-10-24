package com.company.space.zive_tvory.stavovce_diely;


public class Stavec {
    private int poradie;

    public Stavec(int poradie) {
        this.poradie = poradie;
    }

    @Override
    public String toString() {
        return "Stavec č." + poradie;
    }
}
