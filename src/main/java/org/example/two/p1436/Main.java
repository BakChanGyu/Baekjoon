package org.example.two.p1436;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        if (n == 1) {
            System.out.println("666");
        }
        int answer = 1;
        int prevDigit = 0;
        int num = 0;

        while (n > 1) {
            // 10000번째 수가 3000000을 넘지 않으므로..
            // 1000666 ~ 2xxx666~ 까지 prevDigit를 1씩 증가시키는데, 1666000~ 1666999 포함돼있으므로 끝자리가 6인것 제외
            if (prevDigit % 10000 / 10 == 666 && prevDigit % 10 != 6) {
                for (int i = 0; i < 1000; i++) {
                    if (answer == n) {
                        System.out.println(prevDigit + "" + num);
                        return;
                    }
                    answer++;
                    num++;
                }
                prevDigit++;
            }
            else if (prevDigit % 1000 == 666) {
                num = 0;
                for (int i = 0; i < 1000; i++) {
                    if (answer == n) {
                        System.out.println(prevDigit + "" + num);
                        return;
                    }
                    answer++;
                    num++;
                }
                prevDigit++;
            }
            else if (prevDigit % 100 == 66) {
                num = 600;
                for (int i = 0; i < 100; i++) {
                    if (answer == n) {
                        System.out.println(prevDigit + "" + num);
                        return;
                    }
                    answer++;
                    num++;
                }
                prevDigit++;
            }
            else if (prevDigit % 10 == 6) {
                num = 660;
                for (int i = 0; i < 10; i++) {
                    if (answer == n) {
                        System.out.println(prevDigit + "" + num);
                        return;
                    }
                    answer++;
                    num++;
                }
                prevDigit++;
            }
            else {
                num = 666;
                if (answer == n) {
                    System.out.println(prevDigit + "" + num);
                    return;
                }
                answer++;
                prevDigit++;
            }
        }
    }
}
