package com.company;

import java.util.Scanner;

public class MakeAShape {

    public static void main(String[] args) {

        boolean keepGoing = true;

        Scanner myScanner = new Scanner(System.in);

        System.out.println("What shape would you like to make? [PLEASE ENTER: circle, square, or triangle");
        String userChoice = myScanner.next();

        do {
            if (userChoice.equals("circle")) {
                Circle userCircle = new Circle();
                System.out.println("What is the radius of your circle?");
                userCircle.setRadius(myScanner.nextInt());

                System.out.println("What is the diameter of your circle?");
                userCircle.setDiameter(myScanner.nextInt());

                System.out.println("What is the circumference of your circle?");
                userCircle.setCircumference(myScanner.nextInt());

                userCircle.printCircle();

                System.out.println("Would you like to create another shape? [y or n]");
                String another = myScanner.next();

                if(another.equals("n")) {
                    keepGoing = false;
                    }

            } else if (userChoice.equals("square")) {
                Square userSquare = new Square();
                System.out.println("What is the length of the side of the square?");
                userSquare.setLengthOfSide(myScanner.nextInt());

                System.out.println("What is the area of the square?");
                userSquare.setSquareArea(myScanner.nextInt());

                userSquare.printSquare();

                System.out.println("Would you like to create another shape? [y or n]");
                String another = myScanner.next();

                if(another.equals("n")) {
                    keepGoing = false;
                }
            }

        } while (keepGoing);


    }
}
