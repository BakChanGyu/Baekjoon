package org.example.p2941;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int answer = 0;

        for (int i = 0; i < n; i++) {
            // 한번 나온 단어가 다시 나오면 그룹단어로 안쳐준다
            // int[br.] 해가지고 count가 0이 아닌데 나중에 또 나오면 빼는걸로.
            String str = br.readLine();
            boolean[] count = new boolean[26];
            boolean isGroup = false;

            for (int j = 0; j < str.length(); j++) {
                isGroup = false;
                int idx = str.charAt(j);
                if (!count[idx - 97]) {
                    count[idx - 97] = true;
                } else {
                    if (str.charAt(j - 1) != str.charAt(j)) {
                        break;
                    }
                }
                isGroup = true;
            }
            if (isGroup) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}