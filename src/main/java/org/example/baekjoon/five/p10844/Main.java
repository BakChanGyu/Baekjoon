package org.example.baekjoon.five.p10844;

import java.io.*;

public class Main {
    static long[][] memo = new long[101][10];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long sum = 0;

        for (int i = 1; i <= 9; i++) {
            sum += memoization(n, i);
        }
        System.out.println(sum % 1000000000);
    }

    public static long memoization(int n, int k) {
        if (memo[n][k] != 0) {
            return memo[n][k];
        }
        return recursive(n, k);
    }
    public static long recursive(int n, int k) {
        if (n == 1) {
            return memo[n][k] = 1;
        }
        if (k == 0) {
            return memo[n][0] = memoization(n - 1, 1);
        }
        if (k == 9) {
            return memo[n][9] = memoization(n - 1, 8);
        }
        return memo[n][k] = (memoization(n - 1, k + 1) + memoization(n - 1, k - 1)) % 1000000000;
    }
}
