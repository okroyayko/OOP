package com.company.space.zive_tvory;

import java.util.Date;

public abstract class Tvor implements bornable, dieable {

    protected String meno;           // meno tvora
    protected Date day_of_birth;     // datum narodenia
    protected Date day_of_death;     // datum smrti

    public Tvor(String meno) {
        this.meno = meno;
    }

    public String getMeno() {
        return meno;
    }

    public Date getDay_of_birth() {
        return day_of_birth;
    }


    @Override
    public void born(Date day_of_birth) {
        this.day_of_birth = day_of_birth;
        System.out.println(" " + meno + " sa narodil " + day_of_birth);
    }


    @Override
    public void die(Date day_of_death) {
        this.day_of_death = day_of_death;
        System.out.println(" " + meno + " zomrel " + day_of_death);
    }


    public abstract void hybsa(int dx, int dy, int dz);
}
