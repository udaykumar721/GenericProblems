package com.demo;

public class GenericMax {
    public static <T extends Comparable<T>> T max(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }
    public static <T> void printMax(T max) {
        System.out.println("Maximum: " + max);
    }
    public static void main(String[] args) {
        Integer intMax = max(3, 7, 1);
        printMax(intMax);
        Double doubleMax = max(5.6, 2.3, 8.1);
        printMax(doubleMax);
        String stringMax = max("apple", "orange", "banana");
        printMax(stringMax);
    }
}