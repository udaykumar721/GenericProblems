package com.demo;
public class MaxFinder<T extends Comparable<T>> {
    public T findMax(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }
    public static void main(String[] args) {
        MaxFinder<Integer> maxFinder = new MaxFinder<>();
        Integer max1 = maxFinder.findMax(12, 4, 5);
        System.out.println("Max number is: " + max1);
        Integer max2 = maxFinder.findMax(14, 22, 17);
        System.out.println("Max number is: " + max2);
        Integer max3 = maxFinder.findMax(49, 65, 110);
        System.out.println("Max number is: " + max3);
    }
}