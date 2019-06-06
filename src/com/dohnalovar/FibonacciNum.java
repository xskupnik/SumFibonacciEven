package com.dohnalovar;
/**
 * Created by dohnalovar on 6/6/2019
 */
public class FibonacciNum {
    private int first = 1;
    private int second = 2;

    int getNextFibonacci() {
        int next = first + second;
        first = second;
        second = next;
        return next;
    }
}
