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

        // Question 3:
        double circleRadius = 7.25;
        double circleArea = 3.14 * (circleRadius * circleRadius);
        System.out.println("The area of the circle is " + circleArea);
        System.out.println();

        // Question 4:
        double number1 = 5.0;
        System.out.println("The square root of " + number1 + " is " + (Math.sqrt(number1)));
        System.out.println();

        // Question 5:
        double x1 = 5;
        double y1 = 10;
        double x2 = 85;
        double y2 = 50;

        double xDistance = Math.pow(x2 - x1, 2);
        double yDistance = Math.pow(y2 - y1, 2);

        double totalDistance = Math.sqrt(xDistance + yDistance);
        System.out.println("The distance between the two points is " + totalDistance);
        System.out.println();

        // Question 6:
        double firstVariable = -3.8;
        System.out.println("The absolute (positive) value of " + firstVariable + " is " + Math.abs(firstVariable));
        System.out.println();

        // Question 7:
        double randomNumber = Math.random();
        System.out.println("Random number generated is " + randomNumber);
        System.out.println();









    }
}
