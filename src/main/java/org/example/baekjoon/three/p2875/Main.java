package org.example.baekjoon.three.p2875;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int noInternMaxTeam = 0;
        int maxN = n / 2;
        if (maxN >= m) {
            noInternMaxTeam = m;
        } else {
            noInternMaxTeam = maxN;
        }

        int remain = m + n - noInternMaxTeam * 3;
        int internMember = k - remain;
        if (internMember > 0) {
            while (internMember > 0) {
                noInternMaxTeam--;
                internMember -= 3;
            }
        }
        System.out.println(noInternMaxTeam);
    }
}
