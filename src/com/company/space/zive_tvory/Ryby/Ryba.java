package com.company.space.zive_tvory.Ryby;

import com.company.space.zive_tvory.Stavovec;


public abstract class Ryba extends Stavovec {

    protected double rychlost;

    public Ryba(String meno, int pocet_stavcov, double rychlost) {
        super(meno, pocet_stavcov);
        this.rychlost = rychlost;
    }

    public double getRychlost() {
        return rychlost;
    }

    public void plavaj() {
        System.out.println(meno + " pláva rýchlosťou " + rychlost + " m/s.");
    }

    @Override
    public void hybsa(int dx, int dy, int dz) {
        System.out.println(meno + " sa pohybuje vo vode smerom (" + dx + ", " + dy + ", " + dz + ").");
    }
}
