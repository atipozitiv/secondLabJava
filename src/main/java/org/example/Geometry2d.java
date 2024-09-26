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
        double out;
        try {
            if (this.radius == 0) throw new ZeroException("Радиус равен нулю");
            if (this.radius < 0) throw new BelowZeroException("Радиус меньше нуля");
            out = 3.14 * this.radius * this.radius;
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
            out = 0;
        }
        return out;
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
        double out;
        try {
            if ((height == 0) || (width == 0)) throw new ZeroException("Параметры равны нулю");
            if ((height < 0) || (width <= 0)) throw new BelowZeroException("Параметры меньше нуля");
            out = height * width;
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
            out = 0;
        }
        return out;
    }
    @Override
    public String toString() {
        return "height = " + this.height + "\nwidth = " + this.width;
    }
}