package com.company;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {

        String s1 = "Test";
        String s2 = "Test";

        if (Objects.equals(s1, s2))
            System.out.println("Same");
        else
        if (s1.equals(s2))
            System.out.println("Equals");
    }
}