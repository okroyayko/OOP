package com.company.space;

public class Vesmir {
    private boolean state;
    private long size;
    private String meno;

    public Vesmir() {
        state = false;
        size = 0;
    }

    public void startVesmir(){
        state = true;
        System.out.println("Vesmir je nastartovany");
        increaseSize();
    }

    public void stopVesmir(){
        state = false;
        System.out.println("Vesmir je vypnuty");
        decreaseSize(10);
    }

    public void increaseSize(){
        while (size < 999000){
            size ++;
        }
    }

    public void decreaseSize(long desiredSize){
        while (size > desiredSize){
            size --;
        }
    }
}
