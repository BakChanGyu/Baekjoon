package org.example.baekjoon.two.p24060;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int answer = 0;
    static int result = -1;
    static int k;
    static int[] tmp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        tmp = new int[n];

        mergeSort(arr, 0, arr.length - 1);

        System.out.println(result);
    }

    public static void mergeSort(int[] A, int p, int r) {
        if (answer == k) return;
        int q;
        if (p < r) {
            q = (p + r) / 2;
            mergeSort(A, p, q);
            mergeSort(A, q + 1, r);
            merge(A, p, q, r);
        }
    }

    private static void merge(int[] A, int p, int q, int r) {
        int i = p;
        int j = q + 1;
        int t = 0;

        while (i <= q && j <= r) {
            if (A[i] <= A[j]) {
                tmp[t++] = A[i++];
            } else {
                tmp[t++] = A[j++];
            }
        }
        while (i <= q) {
            tmp[t++] = A[i++];
        }
        while (j <= r) {
            tmp[t++] = A[j++];
        }
        i = p;
        t = 0;
        while (i <= r) {
            answer++;
            if (answer == k) {
                result = tmp[t];
                return;
            }
            A[i++] = tmp[t++];
        }
    }
}
