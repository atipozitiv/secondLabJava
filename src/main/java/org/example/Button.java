package org.example;

public class Button {
    int clickCount = 0;
    public int click() {
        this.clickCount += 1;
        return this.clickCount;
    }
}
