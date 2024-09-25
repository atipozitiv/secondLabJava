package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    Rectangle rectangle = new Rectangle(2,3);

    @Test
    void area() {
        assertEquals(6, rectangle.area());
    }

    @Test
    void testToString() {
        assertEquals("height = 2.0\nwidth = 3.0", rectangle.toString());
    }
}