package com.corejava.polymorphism;

public class MethodOverride {
    public static void main(String[] args) {
        Animal animal1 = new Dog(); // Polymorphism
        Animal animal2 = new Cat(); // Polymorphism

        animal1.sound(); // Calls Dog's sound() method
        animal2.sound(); // Calls Cat's sound() method
        
    }
}