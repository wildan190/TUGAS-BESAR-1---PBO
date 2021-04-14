package com.tugas.besar_1.pbo;

public class GearBox {
    private float gearRatio;
    private int currentGear;

    void setGearRatio(float gearRatio){
        this.gearRatio = gearRatio;
    }

    float getGearRatio(){
        return this.gearRatio;
    }

    void setCurrentRatio(int currentGear){
        this.gearRatio = currentGear;
    }

    float getCurrentRatio(){
        return this.gearRatio;
    }
    void shiftUp(){
        // ShiftUp transmission
        System.out.println("GearBox UP");
    }
    void shiftDown(){
        //
    }
    
}
