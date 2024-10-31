package org.example;

public class Main {
    public static void main(String[] args) {

        Multiplication multiplication = new Multiplication();
        System.out.println("Результат множення: " + multiplication.multiply(5, 3));

     
        Plus plus = new Plus();
        System.out.println("Результат додавання: " + plus.add(5, 3));

        Dilenya dilenya = new Dilenya();
        System.out.println("Результат ділення: " + dilenya.add(10, 2));


        System.out.println("vadim lox");
    }
}