package org.example;

import java.util.ArrayList;

public class OddEvenSeparator {
    ArrayList<Integer> odd = new ArrayList<>();
    ArrayList<Integer> even = new ArrayList<>();
    void addNumber(int digit) {
        if (digit % 2 == 0) {
            this.even.add(digit);
        } else {
            this.odd.add(digit);
        }
    }
    ArrayList<Integer> even() {
        return even;
    }
    ArrayList<Integer> odd() {
//       for (Integer turn : this.odd) {
//            System.out.print(turn + " ");
//        }
//        System.out.println();
        return odd;
    }
}
