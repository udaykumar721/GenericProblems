package com.demo;
public class FloatMaximum<T extends Comparable<T>> {
    public T findMaximum(T x, T y, T z) {
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
        FloatMaximum<Float> FloatMaximumFinder = new FloatMaximum<>();
        System.out.println("Maximum of 13.8, 6.3, 2.5: " + FloatMaximumFinder.findMaximum(13.8f, 2.3f, 2.5f));
        FloatMaximum<Float> floatMaximumFinder = new FloatMaximum<>();
        System.out.println("Maximum of 2.5, 8.1, 5.0: " + floatMaximumFinder.findMaximum(2.5f, 8.1f, 5.6f));
        System.out.println("Maximum of 9.8, 12.5, 12.6: " + FloatMaximumFinder.findMaximum(9.8f, 12.5f, 12.6f));
    }
}