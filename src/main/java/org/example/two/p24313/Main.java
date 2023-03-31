package org.example.two.p24313;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a1 = Integer.parseInt(st.nextToken());
        int a0 = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());
        int n = n0;
        int answer = 1;

        int fn = a1 * n + a0;
        int gn = c * n;

        // a1n + a0 <= c * n;
        // (a1 - c)n + a0 <= 0;
        if (a1 - c != 0) {
            int k = -a0 / (a1 - c);
            if (n < k) {
                answer = 0;
            }
        }

        if (fn > gn) {
            answer = 0;
        }

        System.out.println(answer);
    }
}
