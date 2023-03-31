package org.example.three.p1783;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 세로 100 50
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int answer = 1;

        if (n >= 3 && m >= 7) {
            // 이동횟수는 3, 좌표는 (6, 0) 에서 시작함.
            answer = 4;
            answer += m - 6;
        } else {
            // 이 구간 안에서는 최대 이동횟수가 3이 나옴.
            if (n == 2) {
                answer += Math.min(3, (m - 1) / 2);
            } else if (n >= 3) {
                answer += Math.min(3, m - 1);
            }
        }
        System.out.println(answer);
    }
}

