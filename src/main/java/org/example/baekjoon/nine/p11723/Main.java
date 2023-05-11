package org.example.baekjoon.nine.p11723;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int m = Integer.parseInt(br.readLine());
        boolean[] S = new boolean[21];

        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String operator = st.nextToken();
            int operand = 0;
            if (!operator.equals("all") && !operator.equals("empty")) {
                operand = Integer.parseInt(st.nextToken());
            }

            if (operator.equals("add")) {
                S[operand] = true;
            }
            else if (operator.equals("remove")) {
                S[operand] = false;
            }
            else if (operator.equals("check")) {
                if (S[operand]) {
                    sb.append("1\n");
                } else {
                    sb.append("0\n");

                }
            }
            else if (operator.equals("toggle")) {
                if (S[operand]) {
                    S[operand] = false;
                } else {
                    S[operand] = true;
                }
            }
            else if (operator.equals("all")) {
                Arrays.fill(S, true);
            }
            else if (operator.equals("empty")) {
                Arrays.fill(S, false);
            }
        }
        System.out.println(sb);
    }
}
