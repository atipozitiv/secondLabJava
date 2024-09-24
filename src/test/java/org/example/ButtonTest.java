package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ButtonTest {
    Button button = new Button();

    @Test
    void click() {
        assertEquals(1, button.click());
    }
}