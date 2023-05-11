package org.example.baekjoon.six.p7562;

import java.io.*;
import java.util.*;

public class Main {
    static int[] moveX = {2, 1, -1, -2, -2, -1, 1, 2};
    static int[] moveY = {1, 2, 2, 1, -1, -2, -2, -1};
    static int targetX = 0;
    static int targetY = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int l = Integer.parseInt(br.readLine());
            boolean[][] board = new boolean[l][l];

            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            board[x][y] = true;

            st = new StringTokenizer(br.readLine());
            targetX = Integer.parseInt(st.nextToken());
            targetY = Integer.parseInt(st.nextToken());

            Queue<Point> queue = new LinkedList<>();
            int answer = bfs(board, queue, l, x, y);

            System.out.println(answer);
        }
    }

    public static int bfs(boolean[][] board, Queue<Point> queue, int l, int x, int y) {
        queue.add(new Point(x, y, 0));

        while (!queue.isEmpty()) {
            Point p = queue.poll();

            if (p.x == targetX && p.y == targetY) {
                return p.cnt;
            }

            for (int i = 0; i < moveX.length; i++) {
                int nextX = p.x + moveX[i];
                int nextY = p.y + moveY[i];

                if (nextX >= 0 && nextX < l && nextY >= 0 && nextY < l && board[nextX][nextY] == false) {
                    board[nextX][nextY] = true;
                    queue.add(new Point(nextX, nextY, p.cnt + 1));
                }
            }
        }

        return 0;
    }
}

class Point {
    int x;
    int y;
    int cnt;

    public Point(int x, int y, int cnt) {
        this.x = x;
        this.y = y;
        this.cnt = cnt;
    }
}

