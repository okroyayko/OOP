package com.company.space.vesmirnetelesa;


public class Slnecna_sustava {

    private Hviezda slnko;
    private int object_counter;

    private Vesmirne_teleso[] obezne_telesa;

    public Slnecna_sustava() {
        slnko = new Hviezda();
        obezne_telesa = new Vesmirne_teleso[10];
        setObject_counter(0);

        obezne_telesa[object_counter] = new Planeta(432432, 432432, "Mars");
        object_counter++;
        obezne_telesa[object_counter] = new Planeta(55555, 32342, "Venusa");
        object_counter++;
        obezne_telesa[object_counter] = new Hviezda("Polarka");
        object_counter++;

    }

    public void setObject_counter(int objectCounter) {
        this.object_counter = objectCounter;
    }

    public void addTeleso(Vesmirne_teleso nove_teleso)
    {
        obezne_telesa[object_counter]=nove_teleso;
        object_counter++;
    }
}