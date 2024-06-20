package com.chapter1_5.behavior.iterator1_0;

public class BasketballPlayerRunner {
    public static void main(String[] args) {
        String[] skills = {"Run","Throw","Jump"};

        BasketballPlayer basketballPlayer = new BasketballPlayer("Tom",skills);
        Iterator iterator = basketballPlayer.getIterator();
        System.out.println("BasketballPlayer: " + basketballPlayer.getName());
        System.out.println("Skills: ");

        while (iterator.hasNext()){
            System.out.println(iterator.next().toString()+ " ");
        }
    }
}
