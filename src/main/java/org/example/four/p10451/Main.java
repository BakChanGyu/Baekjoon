package org.example.four.p10451;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int[] P = new int[n + 1];
            StringTokenizer st = new StringTokenizer(br.readLine());
            int answer = 0;
            Queue<Integer> q = new LinkedList<>();
            boolean[] isVisited = new boolean[n + 1];

            for (int j = 1; j <= n; j++) {
                P[j] = Integer.parseInt(st.nextToken());
            }

            for (int j = 1; j <= n; j++) {
                if (isVisited[P[j]] == false) {
                    q.add(P[j]);
                    while (true) {
                        int v = q.poll();

                        if (isVisited[v] == true) {
                            answer++;
                            break;
                        } else {
                            isVisited[v] = true;
                            q.add(P[v]);
                        }
                    }
                }
            }
            System.out.println(answer);
        }
    }
}
