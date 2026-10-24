package com.company.space.zive_tvory.stavovce_diely;


public class Chrbtica {

    private Stavec[] stavce;

    public Chrbtica(int pocetStavcov) {
        stavce = new Stavec[pocetStavcov];
        for (int i = 0; i < pocetStavcov; i++) {
            stavce[i] = new Stavec(i + 1);
        }
    }

    public Stavec[] getStavce() {
        return stavce;
    }

    @Override
    public String toString() {
        return "Chrbtica so " + stavce.length + " stavcami";
    }
}
