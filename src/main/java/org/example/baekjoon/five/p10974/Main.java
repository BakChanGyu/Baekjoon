package org.example.baekjoon.five.p10974;

import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder answer = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = i;
        }

        List<Integer> list = new ArrayList<>();
        recursive(list, arr, n, 0);
        System.out.println(answer);
    }
    public static void recursive(List<Integer> list, int[] arr, int n, int i) {
        if (list.size() == n) {
            for (int j = 0; j < n; j++) {
                answer.append(list.get(j) + " ");
            }
            answer.append("\n");
            return;
        }
        for (int j = 1; j < arr.length; j++) {
            if (!list.contains(j)) {
                List<Integer> newList = new ArrayList<>(list);
                newList.add(arr[j]);
                recursive(newList, arr, n, j);
            }
        }
    }
}
