package org.example;

public class Main {
    public static void main(String[] args) {

        Multiplication multiplication = new Multiplication();
        System.out.println("Результат множення: " + multiplication.multiply(5, 3));

     
        Plus plus = new Plus();
        System.out.println("Результат додавання: " + plus.add(5, 3));

        System.out.println("Andrew molodec!");

    }
}