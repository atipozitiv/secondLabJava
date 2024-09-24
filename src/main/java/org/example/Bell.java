package org.example;

public class Bell {
    int turn = 0;
    String sound() {
        this.turn += 1;
        if (this.turn % 2 == 0) {
            return "dong";
        }
        return "ding";
    }
}
