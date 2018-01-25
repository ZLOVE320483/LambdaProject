package com.github.lambda;

import java.util.Arrays;
import java.util.List;

/**
 * Created by zlove on 2018/1/25.
 */
public class Sample03 {

    public static void main(String[] args) {
        List<String> features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
        features.forEach(n -> System.out.println(n));
    }
}
