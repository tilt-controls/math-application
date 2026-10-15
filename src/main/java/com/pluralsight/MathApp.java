package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {

        // Question 1:
        int bobSalary = 5;
        int garySalary = 256000;
        int highestSalary = Math.max(bobSalary, garySalary);
        System.out.println();
        System.out.println("The highest salary is " + highestSalary);
        System.out.println();

        // Question 2:
        double carPrice = 50000.99;
        double truckPrice = 1000.99;
        double lowestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The lowest price is " + lowestPrice);
        System.out.println();




    }
}
