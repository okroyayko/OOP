package com.company.space.zive_tvory.Bez;

public abstract class Hmyz extends Bezstavovce {
    public Hmyz(String meno) {
        super(meno);
    }

    @Override
    public void pohyb() {
        System.out.println(getMeno() + " sa pohybuje ako hmyz.");
    }
}