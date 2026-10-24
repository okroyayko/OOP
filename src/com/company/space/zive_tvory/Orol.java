package com.company.space.zive_tvory;

public class Orol extends Stavovec {
    public Orol(String meno, int pocet_stavcov) {
        super(meno,pocet_stavcov);
    }

    // Можна додати унікальні методи для орла
    public void lietaj() {
        System.out.println(getMeno() + " letí vysoko!");
    }
}