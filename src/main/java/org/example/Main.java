package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        System.out.println("Addition: " + calculator.add(5,3));
        System.out.println("Subtract: " + calculator.sub(10,4));
        System.out.println("Multiplication: " + calculator.sub(6,2));
    }
}