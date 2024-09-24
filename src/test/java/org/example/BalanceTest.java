package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalanceTest {
    Balance balance = new Balance();

    @Test
    void result() {
        assertEquals("=", balance.result());
        balance.addLeft(5);
        assertEquals("L", balance.result());
    }
}