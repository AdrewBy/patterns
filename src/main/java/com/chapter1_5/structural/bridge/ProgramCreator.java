package com.chapter1_5.structural.bridge;


public class ProgramCreator {
    public static void main(String[] args) {
        Program[] programs = {
                new BankSystem((new CppDeveloper())),
                new StockExchange(new JavaDeveloper())
        };


        for (Program program : programs) {
            program.developProgram();
        }
    }
}
