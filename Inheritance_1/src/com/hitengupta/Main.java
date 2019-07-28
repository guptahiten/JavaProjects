package com.hitengupta;

public class Main{

    public static void main(String[] args) {

        Duster duster = new Duster(48);
        duster.steer(45);
        System.out.println("-------------------------------");
        duster.accelerate(30);
        System.out.println("-------------------------------");
        duster.accelerate(20);
        System.out.println("-------------------------------");
        duster.accelerate(-45);
    }
}
