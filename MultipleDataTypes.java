package com.demo;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class MultipleDataTypes<T extends Comparable<T>> {
    public T findMaximum(T... values) {
        if (values == null || values.length == 0) {
            throw new IllegalArgumentException("Input array must not be empty");
        }
        List<T> valueList = Arrays.asList(values);
        Collections.sort(valueList, Collections.reverseOrder());
        return valueList.get(0);
    }
    public static void main(String[] args) {
        MultipleDataTypes<Integer> integerMaximumFinder = new MultipleDataTypes<>();
        System.out.println("Maximum of 3, 7, 2, 9, 1: " +
                integerMaximumFinder.findMaximum(3, 7, 2, 9, 1));
        MultipleDataTypes<Double> doubleMaximumFinder = new MultipleDataTypes<>();
        System.out.println("Maximum of 2.5, 8.1, 5.6, 1.2, 7.8: " +
                doubleMaximumFinder.findMaximum(2.5, 8.1, 5.6, 1.2, 7.8));
        MultipleDataTypes<String> stringMaximumFinder = new MultipleDataTypes<>();
        System.out.println("Maximum of 'Apple', 'Peach', 'Banana', 'Orange', 'Grapes': " +
                stringMaximumFinder.findMaximum("Apple", "Peach", "Banana", "Orange", "Grapes"));
    }
}