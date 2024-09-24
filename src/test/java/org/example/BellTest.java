package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class BellTest {
    Bell bell = new Bell();

    @Test
    void sound() {
        assertEquals("ding", bell.sound());
        assertEquals("dong", bell.sound());
    }
}