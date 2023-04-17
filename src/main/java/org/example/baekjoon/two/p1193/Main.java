package org.example.baekjoon.two.p1193;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        // 1, 2, 6, 7, 15, 16, 28, 29, 45, 46
        // 4, 8, 12, ,,,
        // 2 에서 3갈때 4
        // 4 에서 5갈때 8
        // 6 에서 7갈때 12
        // 8 에서 9갈때 16
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[3200][3200];
        for (int i = 1; i < 3200; i++) {
            for (int j = 1; j < 3200; j++) {
                arr[i][j] = i + j;
            }
        }
        int i = 1;
        String fraction;
        while (i < n) {
            int num = (n - 1) / 2;
//            int demo =
        }
    }
}
