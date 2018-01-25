package com.github.lambda;

import javax.swing.*;

/**
 * Created by zlove on 2018/1/25.
 */
public class Sample02 {

    public static void main(String[] args) {
        JButton show = new JButton("Show");
        show.addActionListener((e) -> {
            System.out.println("This is Lambda Sample For Action");
        });
    }
}
