package org.example.baekjoon.three.p2873;

import java.io.*;
import java.util.*;

public class Main {
    static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int r = Integer.parseInt(st.nextToken()); // 가로
        int c = Integer.parseInt(st.nextToken()); // 세로
        int[][] pleasure = new int[r][c];
        boolean[][] isVisited = new boolean[r][c];

        for (int i = 0; i < r; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < c; j++) {
                pleasure[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        stack.push(pleasure[0][0]);
        int row = 0;
        int col = 0;
        int max = 0;
        int sum = 0;
        while (true) {
            // "U"
            while (row >= 0 && row < r) {
                row++;
                if (isVisited[row][col] == false) {
                    stack.push(pleasure[row][col]);
                }
            }

            // "R"
            // "L"
            // "D"

            // 더는 방문할 곳이 없으면 방문하지 않은 쪽으로 이동
            if (isVisited[row][col] == false) {

            }
            // row = r - 1, col = c - 1일때 종료
            if (row == r - 1 && col == c - 1) {
                if (max <= sum) {
                    max = sum;
                }
                break;
            }
        }
    }

    public int move() {

        return 0;
    }
}
