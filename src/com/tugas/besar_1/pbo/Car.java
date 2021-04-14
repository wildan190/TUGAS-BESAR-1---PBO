package com.tugas.besar_1.pbo;

public class Car {

    private String registrationNum;
    private int year;
    private String licenseNumber;

    void setregistrationNum(String registrationNum){
        this.registrationNum = registrationNum;
    }

    String getregistrationNum(){
        return this.registrationNum;
    }

    void setyear(int year){
        this.year = year;
    }

    int getyear(){
        return this.year;
    }
    
}