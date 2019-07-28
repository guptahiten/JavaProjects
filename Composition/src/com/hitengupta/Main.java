package com.hitengupta;

public class Main {

    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("20XL","Dell","240",dimensions);

        Monitor theMonitor = new Monitor("200 inch","Samsung",200,new Resolution(2540,1440));

        Motherboard theMotherboard = new Motherboard("ROG Strix","Asus",4,8,"v2.02");

        PC thePC = new PC(theCase,theMonitor,theMotherboard);

        thePC.powerUp();
    }
}
