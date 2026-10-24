package com.company.space.zive_tvory.Bez;

import com.company.space.zive_tvory.Tvor;
public abstract class Bezstavovce extends Tvor {
    public Bezstavovce(String meno) {
        super(meno);
    }

    public abstract void pohyb();
}