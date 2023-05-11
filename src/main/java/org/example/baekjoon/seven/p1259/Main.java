package org.example.baekjoon.seven.p1259;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String answer = "yes";
            String str = br.readLine();
            if (str.equals("0")) {
                break;
            }

            for (int i = 0; i < str.length() / 2; i++) {
                if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                    answer = "no";
                    break;
                }
            }

            System.out.println(answer);
        }
    }
}
