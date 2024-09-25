package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {
    Cylinder cylinder = new Cylinder(new Circle(5),5);
    @Test
    void volume() {
        assertEquals(392.5, cylinder.Volume());
    }
}