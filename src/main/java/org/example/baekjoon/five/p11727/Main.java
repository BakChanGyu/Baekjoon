package org.example.baekjoon.five.p11727;

import java.io.*;
import java.util.*;

public class Main {
    static int[] memo = new int[1001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        memoization(n);
        System.out.println(memo[n]);
    }

    public static int memoization(int n) {
        if (memo[n] != 0) {
            return memo[n];
        }
        return recursive(n);
    }

    public static int recursive(int n) {
        if (n == 1) {
            memo[n] = 1;
            return 1;
        }
        if (n == 2) {
            memo[n] = 3;
            return 3;
        }

        return memo[n] = (memoization(n - 2) * 2 + memoization(n - 1)) % 10007;
    }
}
