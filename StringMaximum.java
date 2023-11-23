package com.demo;
public class StringMaximum<T extends Comparable<T>> {
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
        StringMaximum<String> stringMaximumFinder1 = new StringMaximum<>();
        System.out.println("Maximum of 'Apple', 'Peach', 'Banana': " +
                stringMaximumFinder1.findMaximum("Apple", "Peach", "Banana"));
        StringMaximum<String> stringMaximumFinder2 = new StringMaximum<>();
        System.out.println("Maximum of 'Orange', 'Grapes', 'Kiwi': " +
                stringMaximumFinder2.findMaximum("Orange", "Grapes", "Kiwi"));
        StringMaximum<String> stringMaximumFinder3 = new StringMaximum<>();
        System.out.println("Maximum of 'Cherry', 'Blueberry', 'Strawberry': " +
                stringMaximumFinder3.findMaximum("Cherry", "Blueberry", "Strawberry"));
    }
}