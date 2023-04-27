package org.example.baekjoon.six.p2606;

import java.util.*;
import java.io.*;

public class Main {
    static List<Integer>[] adj;
    static int answer = -1;
    static boolean[] isVisited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int connect = Integer.parseInt(br.readLine());
        adj = new List[n + 1];
        isVisited = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int i = 1; i <= connect; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            adj[a].add(b);
            adj[b].add(a);
        }
        dfs(1);

        System.out.println(answer);
    }
    public static void dfs(int i) {
        isVisited[i] = true;
        answer++;

        for (int j = 0; j < adj[i].size(); j++) {
            if (isVisited[adj[i].get(j)] == false) {
                dfs(adj[i].get(j));
            }
        }
    }
}
