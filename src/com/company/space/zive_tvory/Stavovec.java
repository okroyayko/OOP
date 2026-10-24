package com.company.space.zive_tvory;
import com.company.space.zive_tvory.stavovce_diely.*;
import java.util.ArrayList;
import java.util.List;


public class Stavovec extends Tvor {

    protected Chrbtica chrbtica;
    protected List<Sustava> sustavy;


    public Stavovec(String meno, int pocet_stavcov) {

        super(meno);

        this.chrbtica = new Chrbtica(pocet_stavcov);

        this.sustavy = create_sustavy();
    }

    private List<Sustava> create_sustavy() {
        List<Sustava> zoznam = new ArrayList<>();

        for (Typ_sustavy t : Typ_sustavy.values()) {
            zoznam.add(new Sustava(t));
        }
        return zoznam;
    }

    public Chrbtica getChrbtica() {
        return chrbtica;
    }

    public List<Sustava> getSustavy() {
        return sustavy;
    }


    @Override
    public void hybsa(int dx, int dy, int dz) {
        System.out.println(meno + " sa pohol ako genericky stavovec.");
    }
}
