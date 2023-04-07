package org.example.four.p11725;

import java.io.*;
import java.util.*;

public class Main {
    static List<Integer>[] tree;
    static boolean[] isVisited;
    static Queue<Integer> queue;
    static int[] parent;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        tree = new List[n + 1];
        isVisited = new boolean[n + 1];
        queue = new LinkedList<>();
        parent = new int[n + 1];

        for (int i = 1; i < tree.length; i++) {
            tree[i] = new LinkedList<>();
        }
        for (int i = 0; i < n - 1; i++) {
            st = new StringTokenizer(br.readLine());
            int nodeA = Integer.parseInt(st.nextToken());
            int nodeB = Integer.parseInt(st.nextToken());

            tree[nodeA].add(nodeB);
            tree[nodeB].add(nodeA);
        }

        queue.add(1);
        bfs();
        for (int i = 2; i < n + 1; i++) {
            sb.append(parent[i] + "\n");
        }
        System.out.println(sb);
    }
    public static void bfs() {
        while (!queue.isEmpty()) {
            int p = queue.poll();

            for (int i = 0; i < tree[p].size(); i++) {
                Integer next = tree[p].get(i);
                if (isVisited[next] == false) {
                    parent[next] = p;
                    isVisited[p] = true;
                    queue.add(next);
                }
            }
        }
    }
}