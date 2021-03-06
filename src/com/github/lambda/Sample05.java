package com.github.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by zlove on 2018/1/25.
 */
public class Sample05 {

    public static void main(String[] args) {
        List<String> languages = Arrays.asList("Java", "Scala", "Basic", "Haskell", "Lisp");

        Predicate<String> startWithJ = n->n.startsWith("J");
        Predicate<String> fourLengthLetter = n->n.length() == 4;
        languages.stream().filter(startWithJ.and(fourLengthLetter)).forEach(n-> System.out.println("nName, which starts with 'J' and four letter long is : " + n));

        Predicate<String> endWithA = n->n.endsWith("a");
        Predicate<String> fiveLengthLetter = n->n.length() == 5;
        languages.stream().filter(endWithA.or(fiveLengthLetter)).forEach(n-> System.out.println("nName, which end with 'a' or five letter long is : " + n));
    }
}
