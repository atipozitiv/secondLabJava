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
        double out;
        try {
            if ((height == 0) || (base.area() == 0)) throw new ZeroException("Параметры равны нулю");
            if ((height < 0) || (base.area() <= 0)) throw new BelowZeroException("Параметры меньше нуля");
            out = height * base.area();
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
            out = 0;
        }
        return out;
    }
}
