package com.chapter1_5.creational.prototype1_0;

public class TeamCloneRunner {
    public static void main(String[] args) {

        Team originalTeam = new BasketballTeam(1,"Lakers","Jeanie Buss",15);
        Team clonedTeam = originalTeam.clone();
 //       BasketballTeam originalTeam = new BasketballTeam(1, "Lakers", "Jeanie Buss", 15);
  //      BasketballTeam clonedTeam = originalTeam.clone();

        System.out.println("Original Team: " + originalTeam);
        System.out.println("Cloned Team: " + clonedTeam);


        System.out.println("Is same object: " + (originalTeam == clonedTeam));
        System.out.println("Is equal: " + originalTeam.equals(clonedTeam));
    }
}
