package org.example;

interface Figure {
    double area();
    String toString();
}

class Circle implements Figure {
    double radius = 0;

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public Circle(double radius) {
        setRadius(radius);
    }
    @Override
    public double area() {
        return 3.14 * this.radius * this.radius;
    }
    @Override
    public String toString() {
        return "radius = " + this.radius;
    }
}

class Rectangle implements Figure {
    double height = 0;
    double width = 0;

    public void setWidth(double width) {
        this.width = width;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public Rectangle(double height, double width) {
        setHeight(height);
        setWidth(width);
    }
    @Override
    public double area() {
        return height * width;
    }
    @Override
    public String toString() {
        return "height = " + this.height + "\nwidth = " + this.width;
    }
}