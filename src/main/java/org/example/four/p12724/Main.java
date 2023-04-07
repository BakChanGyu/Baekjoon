package org.example.four.p12724;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int[] v1 = new int[n];
            int[] v2 = new int[n];

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < n; j++) {
                v1[j] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                v2[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(v1);
            Arrays.sort(v2);

            long answer = 0;

            for (int j = n - 1; j >= 0; j--) {
                answer += (long) v1[n - 1 - j] * v2[j];
            }

            System.out.printf("Case #%d: %d\n", i + 1, answer);
        }
    }
}
