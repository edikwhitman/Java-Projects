package com.company;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        char[] a = {'a', 'b', 'c'};

        for (int i = 0; i < a.length-1; ++i) {
            for (int j = i; j < a.length; ++j) {
                if (a[j] < a[i]) {
                    char tmp = a[j];
                    a[j] = a[i];
                    a[i] = tmp;
                }
            }
        }
    }
}
