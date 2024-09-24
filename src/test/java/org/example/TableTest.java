package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TableTest {
    Table table = new Table(3,3);

    @Test
    void getValue() {
        table.setValue(2,2,25);
        assertEquals(25, table.getValue(2,2));
    }

    @Test
    void rows() {
        assertEquals(3, table.rows());
    }

    @Test
    void cols() {
        assertEquals(3, table.cols());
    }

    @Test
    void average() {
        table.setValue(2,2,25);
        table.setValue(1,1, 2);
        assertEquals(3, table.average());
    }
}