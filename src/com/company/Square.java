package com.company;

public class Square {

    private int lengthOfSide;
    private int areaOfSquare;

    public void setLengthOfSide(int squareLength) {
        lengthOfSide = squareLength;
    }

    public int getLengthOfSide() {
        return lengthOfSide;
    }

    public void setSquareArea(int squareArea) {
        areaOfSquare = squareArea;
    }

    public void printSquare() {
        System.out.println("\nThe length of the side of the square is " + lengthOfSide + "." + "\nThe area of the square is " + areaOfSquare +
                ".\n");
    }

}
