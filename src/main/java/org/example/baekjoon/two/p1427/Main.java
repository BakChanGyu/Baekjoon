package org.example.baekjoon.two.p1427;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int remain = 0;
        List<Integer> list = new ArrayList<>();

        while (n > 0) {
            remain = n % 10;
            n /= 10;
            list.add(remain);
        }
        Collections.sort(list, (o1, o2) -> o2 - o1);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
    }
}
