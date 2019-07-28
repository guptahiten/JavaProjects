package com.hitengupta;

public class Main {

    public static void main(String[] args) {

        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("North");
        Wall wall4 = new Wall("South");

        Ceiling ceiling = new Ceiling(12,55);

        Bed bed = new Bed("Modern",4,3,2,1);

        Lamp lamp = new Lamp("Classic",false,95);

        Bedroom bedRoom = new Bedroom("Hiten's",wall1,wall2,wall3,wall4,ceiling,bed,lamp);
        bedRoom.makeBed();

        bedRoom.getLamp().turnOn();
    }
}
