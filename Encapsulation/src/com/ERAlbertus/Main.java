package com.ERAlbertus;

public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Eric";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("remaining health = " + player.healthRemaining());
//
//       damage = 11;
//        player.loseHealth(damage);
//        System.out.println("remaining health = " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Eric", 500, "sword");
        System.out.println("Initial health is " + player.getHealth());
    }
}
