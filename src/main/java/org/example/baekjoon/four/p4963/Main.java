package org.example.baekjoon.four.p4963;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int w = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());
            int[][] map = new int[h + 2][w + 2];
            int answer = 0;

            if (w == 0 && h == 0) {
                break;
            }

            for (int i = 1; i <= h; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 1; j <= w; j++) {
                    int land = Integer.parseInt(st.nextToken());
                    if (land == 1) {
                        answer++;
                        map[i][j] = land;
                        if (map[i + 1][j - 1] == 1 || map[i + 1][j] == 1 || map[i + 1][j + 1] == 1 || map[i][j - 1] == 1 ||
                                map[i + 1][j - 1] == 1 || map[i + 1][j] == 1 || map[i + 1][j + 1] == 1 || map[i][j + 1] == 1) {
                            answer--;
                        }
                    }
                }
            }
//            for (int i = 1; i <= h; i++) {
//                for (int j = 1; j <= w; j++) {
//                    if (map[i][j] == 1) {
//                        if (map[i + 1][j - 1] == 0 && map[i + 1][j] == 0 && map[i + 1][j + 1] == 0 && map[i][j + 1] == 0) {
//                            answer++;
//                        }
//                    }
//                }
//            }
            System.out.println(answer);
        }
    }
}
