package org.example.baekjoon.nine.p8979;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        List<Medal> medals = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int country = Integer.parseInt(st.nextToken());
            int gold = Integer.parseInt(st.nextToken());
            int silver = Integer.parseInt(st.nextToken());
            int bronze = Integer.parseInt(st.nextToken());

            medals.add(new Medal(country, gold, silver, bronze));
        }

        for (int i = 0; i < medals.size(); i++) {
            Medal cur = medals.get(i);
            for (int j = 0; j < medals.size(); j++) {
                if (i != j) {
                    Medal next = medals.get(j);
                    if (cur.gold < next.gold) {
                        cur.rank++;
                    } else if (cur.gold == next.gold) {
                        if (cur.silver < next.silver) {
                            cur.rank++;
                        } else if (cur.silver == next.silver) {
                            if (cur.bronze < next.bronze) {
                                cur.rank++;
                            }
                        }
                    }
                }
            }
        }

        for (int i = 0; i < medals.size(); i++) {
            if (medals.get(i).country == k) {
                System.out.println(medals.get(i).rank);
            }
        }
    }
}

class Medal {
    int country;
    int gold;
    int silver;
    int bronze;
    int rank;

    public Medal(int country, int gold, int silver, int bronze) {
        this.country = country;
        this.gold = gold;
        this.silver = silver;
        this.bronze = bronze;
        this.rank = 1;
    }
}
