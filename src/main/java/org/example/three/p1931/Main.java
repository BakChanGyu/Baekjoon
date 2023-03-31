package org.example.three.p1931;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        List<Meeting> list = new ArrayList<>();
        int answer = 1;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            list.add(new Meeting(start, end));

        }

        Collections.sort(list, new Comparator<Meeting>() {
                    @Override
                    public int compare(Meeting o1, Meeting o2) {
                        if (o1.end == o2.end) {
                            return o1.start - o2.start;
                        } else {
                            return o1.end - o2.end;
                        }
                    }
                }
        );

        int endTime = list.get(0).end;
        for (int i = 1; i < n; i++) {
            Meeting meetingTime = list.get(i);
            if (meetingTime.start >= endTime) {
                answer++;
                endTime = meetingTime.end;
            }
        }
        System.out.println(answer);
    }
}

class Meeting {
    int start;
    int end;

    public Meeting(int start, int end) {
        this.start = start;
        this.end = end;
    }
}
