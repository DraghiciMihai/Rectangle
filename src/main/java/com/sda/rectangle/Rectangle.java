package com.sda.rectangle;

public class Rectangle {
    private double latime = 1;
    private double lungime = 1;

    public Rectangle() {
    }

    public Rectangle(double latime, double lungime) {
        this.latime = latime;
        this.lungime = lungime;
    }

    public double getArea() {
        return this.latime * this.lungime;
    }

    public double getPerimeter() {
        return 2 * this.lungime + 2 * this.latime;
    }
}
