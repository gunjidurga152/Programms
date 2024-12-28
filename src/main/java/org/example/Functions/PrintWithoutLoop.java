package org.example.Functions;

import java.net.StandardSocketOptions;

public class PrintWithoutLoop {
    public static void main(String[] args) {
        WithOutLoop(1);
    }

    public static void WithOutLoop(int n) {
        if (n <= 10) {
            System.out.println(n);
            WithOutLoop(n + 1);
        }
    }
}

