package org.example.three.p1003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        // dp[n] = 1의 출력횟수 dp[n-1] = 0의 출력횟수
        // 즉 dp[n] + dp[n-1] 을 구하면 됨.

        int[] dp = new int[41];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                System.out.println("1 0");
                continue;
            }
            for (int j = 2; j <= n; j++) {
                dp[j] = dp[j-1] + dp[j-2];
            }

            System.out.printf("%d %d\n", dp[n-1], dp[n]);
        }
    }
}
