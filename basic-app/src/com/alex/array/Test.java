package com.alex.array;

public class Test {
    public static void main(String[] args) {
        int [] scores = {15,100,10,120,150};
        int max = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores [i] > max) {
                max = scores[i];
            }

        }
        System.out.println(max);
    }
}
