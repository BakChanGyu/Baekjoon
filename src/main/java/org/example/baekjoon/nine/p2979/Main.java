package org.example.baekjoon.nine.p2979;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int[] timeStamp = new int[101];
        int answer = 0;

        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            for (int j = start; j < end; j++) {
                timeStamp[j]++;
            }
        }

        for (int i = 1; i < timeStamp.length; i++) {
            if (timeStamp[i] == 1) answer += a;
            if (timeStamp[i] == 2) answer += 2 * b;
            if (timeStamp[i] == 3) answer += 3 * c;
        }
        System.out.println(answer);
    }
}
