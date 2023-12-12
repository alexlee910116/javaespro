package com.alex.loop;

public class While {
    public static void main(String[] args) {
        double peakHeight = 8848860;
        double paperThickness = 0.1;

        int count = 0;

        while (paperThickness < peakHeight) {
            paperThickness *= 2;
            count++;
        }
        System.out.println( count + " times to fold to over the Himalaya"  );
    }
}
