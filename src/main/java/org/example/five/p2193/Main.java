package org.example.five.p2193;

import java.io.*;

public class Main {
    static long[] memo = new long[91];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        long answer = recursive(n);
        System.out.println(answer);
    }

    public static long memoization(int n) {
        if (memo[n] != 0) {
            return memo[n];
        }
        return recursive(n);
    }

    public static long recursive(int n) {
        if (n == 1 || n == 2) {
            return memo[n] = 1;
        }

        for (int i = 2; i < n; i++) {
            memo[n] += memoization(n - i);
        }

        return ++memo[n];
    }
}
