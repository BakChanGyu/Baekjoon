package org.example.baekjoon.five.p2331;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        List<Integer> D = new ArrayList<>();
        boolean[] isVisited = new boolean[240000];
        D.add(a);
        isVisited[a] = true;

        int i = 1;
        int lastIndex = 0;
        int answer = 0;

        while (true) {
            int sum = 0;
            int pre = D.get(i - 1);

            while (pre > 0) {
                int digit = pre % 10;
                sum += Math.pow(digit, p);
                pre /= 10;
            }
            if (isVisited[sum] == true) {
                lastIndex = D.lastIndexOf(sum);
                break;
            } else {
                D.add(sum);
                isVisited[sum] = true;
            }
            i++;
        }
        for (int j = 0; j < lastIndex; j++) {
            answer++;
        }
        System.out.println(answer);
    }
}
