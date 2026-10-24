package com.company.space.zive_tvory.Bez;

public abstract class Vazka extends Hmyz {
    public Vazka(String meno) {
        super(meno);
    }

    public void lietaj() {
        System.out.println(getMeno() + " lieta nad vodou.");
    }
}