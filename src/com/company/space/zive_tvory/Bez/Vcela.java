package com.company.space.zive_tvory.Bez;

public abstract class Vcela extends Hmyz {
    public Vcela(String meno) {
        super(meno);
    }

    public void zbierajNektar() {
        System.out.println(getMeno() + " zbiera nektár.");
    }
}