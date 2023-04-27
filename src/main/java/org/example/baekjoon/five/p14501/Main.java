package org.example.baekjoon.five.p14501;

import java.io.*;
import java.util.*;

public class Main {
    static List<Schedule> schedules = new ArrayList<>();
    static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());
            schedules.add(new Schedule(t, p));
        }

        for (int i = 0; i < schedules.size(); i++) {
            int totalPrice = 0;
            dfs (schedules.get(i), n, i, totalPrice);
        }

        System.out.println(answer);
    }

    public static void dfs(Schedule schedule, int n, int i, int totalPrice) {
        if (i + schedule.time > n) {
            return;
        }
        totalPrice += schedule.price;

        for (int j = i + schedule.time; j < schedules.size(); j++) {
            dfs(schedules.get(j), n,  j, totalPrice);
        }
        answer = Math.max(answer, totalPrice);

    }
}

class Schedule {
    int time;
    int price;

    public Schedule(int time, int price) {
        this.time = time;
        this.price = price;
    }
}