package com.company.space.zive_tvory.Bez;

import com.company.space.zive_tvory.Bez.Mucha;

public abstract class modra_vazka extends Vazka {
    public modra_vazka(String meno) {
        super(meno);
    }


    public void lietaj() {
        System.out.println(getMeno() + " lieta okolo vína.");
    }
}