package com.company.space.zive_tvory.Bez;

import com.company.space.zive_tvory.Bez.Mucha;

public abstract class vcela_medonosna extends Vcela {
    public vcela_medonosna(String meno) {
        super(meno);
    }

    public void lietaj() {
        System.out.println(getMeno() + " lieta okolo vína.");
    }
}