package com.company.space.zive_tvory.Vtaky;

import com.company.space.zive_tvory.Stavovec;


public abstract class Vtak extends Stavovec {

    protected double vyskaLetu;


    public Vtak(String meno, int pocet_stavcov, double vyskaLetu) {
        super(meno, pocet_stavcov);
        this.vyskaLetu = vyskaLetu;
    }

    public double getVyskaLetu() {
        return vyskaLetu;
    }

    public void spievaj() {
        System.out.println(meno + " spieva: Cir-cir-cir!");
    }

    @Override
    public void hybsa(int dx, int dy, int dz) {
        System.out.println(meno + " leti smerom (" + dx + ", " + dy + ", " + dz + ")");
    }
}
