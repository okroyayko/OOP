package com.company.space.zive_tvory.Bez;

import com.company.space.zive_tvory.Bez.Mucha;

public abstract class vinna_muska extends Mucha {
    public vinna_muska(String meno) {
        super(meno);
    }


    public void lietaj() {
        System.out.println(getMeno() + " lieta okolo vína.");
    }
}