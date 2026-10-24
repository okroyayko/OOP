package com.company.space.vesmirnetelesa;

public class Planeta extends Vesmirne_teleso {
    private String meno;
    private double vaha;
    private int priemer;
    private double gravitacia;
    private Boolean weightSet = false;

    public Planeta(double hmotnost, double polomer, String nazov) {
        this.meno = "Merkur";
        this.vaha = 538269;
        this.priemer = 12572;
    }

    public Planeta(double vaha, int priemer, String meno) {
        setMeno(meno);
        setPriemer(priemer);
        setVaha(vaha);
        gravitacia = 9.81;
    }

    public Planeta(int priemer, String meno, double vaha, double gravitacia) {
        this.priemer = priemer;
        this.meno = meno;
        this.vaha = vaha;
        this.gravitacia = gravitacia;
    }

    public double getGravitacia() {
        return gravitacia;
    }

    private void setGravitacia(double gravitacia) {
        this.gravitacia = gravitacia;
    }

    public String getMeno() {
        return meno;
    }

    private void setMeno(String meno) {
        this.meno = meno;
    }

    public double getVaha() {
        return vaha;
    }

    public int getPriemer() {
        return priemer;
    }

    private void setPriemer(int priemer) {
        this.priemer = priemer;
    }

    private void setVaha(double vaha){
        if (vaha - this.vaha <= -1000){
            System.out.println("Ja chudnem veľmi");
            decreaseGravity(0.1);
        } else if (vaha - this.vaha < 0) {
            System.out.println("Ja chudnem");
        } else if (vaha - this.vaha <=1000) {
            System.out.println("dokelu, pribrala som");
        }else {
            System.out.print("");
            increaseGravity(0.1);
        }
        this.vaha = vaha;
    }

    public void increaseGravity(double add){
        setGravitacia(getGravitacia()+add);
    }

    public void decreaseGravity(double dec){
        setGravitacia(getGravitacia()-dec);
    }

    public void SetPlanetaryWeight(double vaha){
        if (weightSet == false){
            setVaha(vaha);
            weightSet = true;
        }
    }
}
