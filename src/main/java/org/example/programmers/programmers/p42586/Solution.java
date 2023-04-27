package org.example.programmers.programmers.p42586;

import java.util.*;

class Solution {
    public List<Integer> solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        int[] remainTime = new int[progresses.length];
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < progresses.length; i++) {
            queue.add((100 - progresses[i] - 1) / speeds[i] + 1);
        }

        int cur = queue.poll();
        int count = 0;

        while (!queue.isEmpty()) {
            int next = queue.poll();
            count++;

            if (cur < next) {
                cur = next;
                answer.add(count);
                count = 0;
                break;
            }
        }

        return answer;
    }
}
