package org.example.baekjoon.two.p2839;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int answer = 0;
        int result = Integer.MAX_VALUE;

        if (n % 5 == 0) {
            answer += n / 5;
            result = answer;
        } else if (n % 3 == 0) {
            answer += n / 3;
            result = answer;
        }
        int quote = n / 5;
        while (quote > 0) {
            answer = 0;
            int copy = n;
            copy -= 5 * quote;
            answer += quote;
            if (copy % 3 == 0) {
                answer += copy / 3;
                result = Math.min(result, answer);
                break;
            }
            quote--;
        }

        if (result == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(result);
        }
    }
}
