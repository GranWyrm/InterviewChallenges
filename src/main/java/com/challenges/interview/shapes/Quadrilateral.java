package com.challenges.interview.shapes;

public class Quadrilateral implements Shape {
    private double a;
    private double b;
    private double c;
    private double d;

    public Quadrilateral() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    @Override
    public double getArea() {
        double semiperimeter = (a + b + c + d) / 2;
        return Math.sqrt((semiperimeter - a) *
                (semiperimeter - b) *
                (semiperimeter - c) *
                (semiperimeter - d));
    }

    @Override
    public double getPerimeter() {
        return a + b + c + d;
    }

    @Override
    public String toString() {
        return "Quadrilateral{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                '}';
    }
}
