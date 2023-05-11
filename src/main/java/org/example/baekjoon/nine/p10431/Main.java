package org.example.baekjoon.nine.p10431;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            st.nextToken();
            int[] height = new int[20];
            int[] line = new int[20];
            int answer = 0;

            for (int j = 0; j < 20; j++) {
                height[j] = Integer.parseInt(st.nextToken());
            }

            for (int j = 0; j < 20; j++) {
                line[j] = height[j];
                for (int k = 0; k < j; k++) {
                    if (line[k] > height[j]) {
                        answer++;
                    }
                }
            }

            System.out.println(i + 1 + " " + answer);
        }
    }
}
