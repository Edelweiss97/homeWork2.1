package com.company;

public class Main {

    public static void main(String[] args) {
        int temperature = 24;
        boolean isSunny = true;
        int age = 35;

        if (temperature >= -20 && temperature <= 30 && age >= 20 && age <= 45) {
            System.out.println("Можно идти гулять");
        }

        if (temperature >= 0 && temperature <= 28 && age < 20) {
            System.out.println("Можно идти гулять");
        }

        if (temperature >= -10 && temperature <= 25 && age > 45) {
            System.out.println("Можно идти гулять");



        }

    }
}
