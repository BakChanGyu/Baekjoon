package org.example.programmers.programmers.p87377;

import java.util.*;

class Solution {
    public static String[] solution(int[][] line) {
        String[] answer;
        List<Coordinate> intersection = new ArrayList<>();
        long maxX = Long.MIN_VALUE;
        long maxY = Long.MIN_VALUE;
        long minX = Long.MAX_VALUE;
        long minY = Long.MAX_VALUE;

        for (int i = 0; i < line.length - 1; i++) {
            double a = line[i][0];
            double b = line[i][1];
            double e = line[i][2];
            for (int j = i + 1; j < line.length; j++) {
                double c = line[j][0];
                double d = line[j][1];
                double f = line[j][2];

                double divisor = (a * d - b * c);
                if (divisor != 0) {
                    double x = (b * f - e * d) / divisor;
                    double y = (e * c - a * f) / divisor;
                    if (x == (long) x && y == (long) y) {
                        intersection.add(new Coordinate((long) x, (long) y));

                        if ((long) x >= maxX) {
                            maxX = (long) x;
                        }
                        if ((long) y >= maxY) {
                            maxY = (long) y;
                        }
                        if ((long) x <= minX) {
                            minX = (long) x;
                        }
                        if ((long) y <= minY) {
                            minY = (long) y;
                        }
                    }
                }
            }
        }

        int height = (int) (maxY - minY);
        int width = (int) (maxX - minX);

        answer = new String[height + 1];
        for (int i = 0; i <= height; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j <= width; j++) {
                sb.append(".");
            }
            for (int j = 0; j < intersection.size(); j++) {
                Coordinate coordinate = intersection.get(j);
                int x = (int) (coordinate.x - minX);
                int y = (int) (coordinate.y - minY);
                if (y == i) {
                    sb.replace(x, x + 1, "*");
                }
            }
            answer[(int) (height - i)] = sb.toString();
        }

        return answer;
    }
}

class Coordinate {
    long x;
    long y;

    public Coordinate(long x, long y) {
        this.x = x;
        this.y = y;
    }
}