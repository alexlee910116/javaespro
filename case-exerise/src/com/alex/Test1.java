package com.alex;

public class Test1 {
    public static void main(String[] args) {
        double price = calculate(10000, 8, "economy");
        System.out.println("final price: " + price);
    }

    public static double calculate(double price, int month, String type) {
        if (month >= 5 && month <= 10) {
            switch (type) {
                case "first class":
                    price *= 0.9;
                    break;
                case "economy":
                    price *= 0.85;
                    break;
            }
        } else {
            switch (type) {
                case "first class":
                    price *= 0.7;
                    break;
                case "economy":
                    price *= 0.65;
                    break;
            }
        }
        return price;
    }
}
