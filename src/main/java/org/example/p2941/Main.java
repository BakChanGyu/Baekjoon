package org.example.p2941;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int answer = 0;

        String[] croatia = {"c=", "c-", "dz=", "d-", "lj",
                "nj", "s=", "z=", "a", "b", "c", "d", "e", "f", "g", "h",
                "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
                "t", "u", "v", "w", "x", "y", "z"};

        // 끝까지 갔다는걸 어떻게 체크할까? split?

        while (true) {
            for (int i = 0; i < croatia.length; i++) {
                if (str.contains(croatia[i])) {
                    answer++;
                    str = str.replaceFirst(croatia[i], " ");
                    break;
                }
            }
            String sub = str.replace(" ", "");
            if (sub.equals("")) {
                break;
            }
        }
        System.out.println(answer);
    }
}
