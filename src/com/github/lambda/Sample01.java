package com.github.lambda;

/**
 * Created by zlove on 2018/1/25.
 */
public class Sample01 {

    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("This is Lambda Test!");
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
