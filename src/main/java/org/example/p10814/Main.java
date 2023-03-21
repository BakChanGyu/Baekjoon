package org.example.p10814;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        List<Member> members = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();

            members.add(new Member(age, name, i));
        }

        Collections.sort(members, new Comparator<Member>() {
            @Override
            public int compare(Member o1, Member o2) {
                if (o1.age == o2.age) {
                    return o1.seq - o2.seq;
                } else {
                    return o1.age - o2.age;
                }
            }
        });
        for (int i = 0; i < members.size(); i++) {
            System.out.println(members.get(i).age + " " + members.get(i).name);
        }
    }
}
class  Member{
    int age;
    String name;
    int seq;

    public Member(int age, String name, int seq) {
        this.age = age;
        this.name = name;
        this.seq = seq;
    }
}

