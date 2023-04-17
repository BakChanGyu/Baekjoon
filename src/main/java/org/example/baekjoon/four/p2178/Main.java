package org.example.baekjoon.four.p2178;

import java.io.*;
import java.util.*;

public class Main {

    static int[][] map;
    static int[][] move = {
            {-1, 0}, {1, 0}, {0, -1}, {0, 1}
    };
    static boolean[][] isVisited;
    static Queue<Item> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        map = new int[n + 2][m + 2];
        isVisited = new boolean[n + 2][m + 2];

        for (int i = 1; i <= n; i++) {
            String str = br.readLine();
            for (int j = 1; j <= str.length(); j++) {
                if (str.charAt(j - 1) == '1') {
                    map[i][j] = 1;
                }
            }
        }
        int answer = bfs(1, 1, n, m, 1);
        System.out.println(answer);
    }

    public static int bfs(int x, int y, int n, int m, int count) {
        isVisited[x][y] = true;
        queue.add(new Item(x, y, count));
        int answer = count;
        while (!queue.isEmpty()) {
            Item p = queue.poll();

            if (p.x == n && p.y == m) {
                return p.count;
            }

            for (int i = 0; i < move.length; i++) {
                int nextX = p.x + move[i][0];
                int nextY = p.y + move[i][1];
                if (map[nextX][nextY] == 1 && isVisited[nextX][nextY] == false) {
                    isVisited[nextX][nextY] = true;
                    queue.add(new Item(nextX, nextY, p.count + 1));
                }
            }
            answer = p.count;
        }

        return answer;
    }
}

class Item {
    int x;
    int y;
    int count;

    public Item(int x, int y, int count) {
        this.x = x;
        this.y = y;
        this.count = count;
    }
}
