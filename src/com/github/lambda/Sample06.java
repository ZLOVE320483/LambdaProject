package com.github.lambda;

import java.util.Arrays;
import java.util.List;

/**
 * Created by zlove on 2018/1/25.
 */
public class Sample06 {

    public static void main(String[] args) {
        List<Integer> costBeforeTax = Arrays.asList(100, 200, 300, 400);
        costBeforeTax.stream().map(cost->cost * 1.12).forEach(cost-> System.out.println(cost));
    }
}
