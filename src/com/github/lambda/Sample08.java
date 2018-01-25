package com.github.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by zlove on 2018/1/25.
 */
public class Sample08 {

    public static void main(String[] args) {
        List<String> strList = Arrays.asList("abcd", "abcde", "abc", "ab");
        List<String> filtered = strList.stream().filter(x->x.length()>2).collect(Collectors.toList());
        System.out.printf("Original List : %s, filtered list : %s %n", strList, filtered);
    }
}
