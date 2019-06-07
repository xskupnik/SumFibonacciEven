package com.dohnalovar;
/**
 * Created by dohnalovar on 6/6/2019
 */
public class FibonacciNum {
    private int previous = 1;
    private int last = 2;

    int getNextFibonacci() {
        int next = previous + last;
        previous = last;
        last = next;
        return next;
    }
}
