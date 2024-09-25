package org.example;

public class Cylinder {
    Figure base = new Circle(0);
    double height = 0;

    public void setHeight(double height) {
        this.height = height;
    }
    public void setBase(Figure base) {
        this.base = base;
    }
    public Cylinder(Circle base, double height) {
        setBase(base);
        setHeight(height);
    }
    double Volume() {
        return height * base.area();
    }
}
