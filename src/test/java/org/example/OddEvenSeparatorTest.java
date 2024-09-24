package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class OddEvenSeparatorTest {
    OddEvenSeparator oddEvenSeparator = new OddEvenSeparator();

    @Test
    void even() {
        oddEvenSeparator.addNumber(6);
        ArrayList<Integer> array = new ArrayList<>();
        array.add(6);
        assertEquals(array, oddEvenSeparator.even());
    }

    @Test
    void odd() {
        oddEvenSeparator.addNumber(5);
        oddEvenSeparator.addNumber(7);
        ArrayList<Integer> array = new ArrayList<>();
        array.add(5);
        array.add(7);
        assertEquals(array, oddEvenSeparator.odd());
    }
}