package com.company.space.vesmirnetelesa;

public class Hviezda extends Vesmirne_teleso {
    private long vek;
    private long teplota;
    private String meno;
    private boolean svietim;
    private double temperature;

    public Hviezda() {
    }
    public void sviet() {
        svietim = true;
        temperature = 5778.0;
        System.out.println("Hviezda svieti. Teplota: " + temperature + " K");
    }

    public void zhasni() {
        svietim = false;
        temperature = 0.0;
        System.out.println("Hviezda zhasla.");
    }

    public boolean jeSvietiaca() {
        return svietim;
    }

    public double getTemperature() {
        return temperature;
    }

    public Hviezda(String meno) {
        this.meno = meno;
    }
}
