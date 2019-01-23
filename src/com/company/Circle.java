package com.company;

public class Circle {

    private int radius;
    private int diameter;
    private int circumference;

    public void setRadius(int circleRadius) {
        radius = circleRadius;
    }

    public int getRadius() {
        return radius;
    }

    public void setDiameter(int circleDiameter) {
        diameter = circleDiameter;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setCircumference(int circleCircumference) {
        circumference = circleCircumference;
    }

    public int getCircumference() {
        return circumference;
    }

    public void printCircle() {
        System.out.println("\nThe radius of the circle is " + radius + "." + "\nThe diameter of the circle is " + diameter +
                "." + "\nThe circumference of the circle is " + circumference + ".\n");
    }

}
