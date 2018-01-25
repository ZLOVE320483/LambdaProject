package com.github.lambda;

import java.util.Arrays;
import java.util.List;

/**
 * Created by zlove on 2018/1/25.
 */
public class Sample07 {

    public static void main(String[] args) {
        List<Integer> costBeforeTax = Arrays.asList(100, 200, 300, 400);
        double bill = costBeforeTax.stream().map(cost->cost + .12*cost).reduce((sum, cost)->sum + cost).get();
        System.out.println("Total:" + bill);
    }
}
