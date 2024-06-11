package com.chapter1_5.structural.bridge;

public abstract class Program {
    protected Developer developer;
    protected Program(Developer developer){
        this.developer=developer;
    }
    public abstract void developProgram();
}
