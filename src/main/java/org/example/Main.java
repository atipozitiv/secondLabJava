package org.example;

public class Main {
    public static void main(String[] args) {
        Button button = new Button();
        button.click();

        Balance balance = new Balance();
        balance.addLeft(5);
        System.out.println(balance.result());

        Bell bell = new Bell();
        System.out.println(bell.sound());
        System.out.println(bell.sound());

        OddEvenSeparator oddEvenSeparator = new OddEvenSeparator();
        oddEvenSeparator.addNumber(5);
        oddEvenSeparator.addNumber(7);
        oddEvenSeparator.even();
        oddEvenSeparator.odd();

        Table table = new Table(5,4);
        table.setValue(2, 2, 5);
        table.setValue( 3, 1, 7);
        System.out.println(table.average());

        Circle circle = new Circle(25);
        System.out.println(circle.area());
        System.out.println(circle.toString());

        Rectangle rectangle = new Rectangle(2,3);
        System.out.println(rectangle.area());
        System.out.println(rectangle.toString());

        Cylinder cylinder = new Cylinder(new Circle(5), 5);
        System.out.println(cylinder.Volume());
    }
}