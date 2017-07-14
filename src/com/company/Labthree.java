package com.company;

import java.util.Arrays;

public class Labthree {

    public static void main(String[] args) {
        int[] A = {1,8,2,6,5,3,5,0};
        Arrays.sort(A);
        int max = A[A.length -1];
        int min = A[A.length -2];
        System.out.println("" + max);
        System.out.println("" + min);
    }
}