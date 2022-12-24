package boj.collection.prob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import java.io.*;
import java.util.*;

public class p7662 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            int k = Integer.parseInt(br.readLine());
            Map<Integer, Integer> map = new HashMap<>();
            PriorityQueue<Integer> min = new PriorityQueue<>();
            PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());

            for (int i = 0; i < k; i++) {
                String[] input = br.readLine().split(" ");
                char ch = input[0].charAt(0);
                int n = Integer.parseInt(input[1]);

                if (ch == 'I') {
                    map.put(n, map.getOrDefault(n, 0) + 1);

                    min.add(n);
                    max.add(n);
                } else {
                    if (map.size() == 0) {
                        continue;
                    }

                    PriorityQueue<Integer> q = n == 1 ? max : min;
                    removeMap(q, map);
                }
            }

            if (map.size() == 0) {
                System.out.println("EMPTY");
            } else {
                int n = removeMap(max, map);
                System.out.println(n + " " + (map.size() > 0 ? removeMap(min, map) : n));
            }

        }

    }

    public static int removeMap(PriorityQueue<Integer> q, Map<Integer, Integer> map) {
        int num;
        while (true) {
            num = q.poll();
            int cnt = map.getOrDefault(num, 0);

            if (cnt == 0) {
                continue;
            }

            if (cnt == 1) {
                map.remove(num);
            } else {
                map.put(num, cnt - 1);
            }
            
            break;
        }

        return num;
    }

}
