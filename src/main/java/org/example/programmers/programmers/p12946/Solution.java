package org.example.programmers.programmers.p12946;

import java.util.*;

public class Solution {
    static List<Stack> stacks = new Stack<>();

    public int[][] solution(int n) {
        List<Integer[][]> answer = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            stacks.add(new Stack<>());
        }
        for (int i = n; i >= 1; i--) {
            stacks.get(0).push(i);
        }

        int i = 1;
        while (true) {
            Stack<Integer> first = stacks.get(0);
            Integer p1 = first.pop();

            Stack<Integer> second = stacks.get(i);

            if (!second.isEmpty()) {
                Integer p2 = second.pop();
                if (p1 < p2) {
                    second.push(p2);
                    second.push(p1);
                }
            } else {
                second.push(p1);
            }
            i++;
        }

        // n이 홀수면 3 시작
        // 짝수면 2 시작
        // 스택 3개 필요.
        // 가장 아래꺼를 꺼내기 위해선 스택에 하나만 남겨야함.

//        return answer;
    }

    public static void hanoi(List<Stack> stacks, int idx, int n) {
        move(stacks.get(0), stacks.get(2), 0);
    }

    public static void move(Stack<Integer> first, Stack<Integer> second, int i) {
        Integer p1 = first.pop();

        if (!second.isEmpty()) {
            Integer p2 = second.pop();
            if (p1 < p2) {
                second.push(p2);
                second.push(p1);
            }
        } else {
            second.push(p1);
        }

        move(stacks.get(i), stacks.get(i + 1), i + 1);
    }
}
