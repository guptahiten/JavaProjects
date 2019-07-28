package com.hitengupta;

public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
////        player.name= "Tim";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health " + player.healthRemaning());
//
//        damage = 11;
//        player.health  = 200;
//        player.loseHealth(damage);
//        System.out.println("Remaining health " + player.healthRemaning());

        EnhancedPlayer player = new EnhancedPlayer("Hiten",175,"AWP");
        System.out.println("Initial health "  + player.getHealth());
    }
}
