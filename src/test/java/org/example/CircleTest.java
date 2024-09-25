package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    Circle circle = new Circle(5);

    @Test
    void area() {
        assertEquals(78.5, circle.area());
    }

    @Test
    void testToString() {
        assertEquals("radius = 5.0", circle.toString());
    }
}