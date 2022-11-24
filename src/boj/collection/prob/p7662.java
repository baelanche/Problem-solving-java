package boj.collection.prob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class p7662 {

    public static Map<Integer, Integer> map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        while (t-->0) {
            int n = Integer.parseInt(br.readLine());
            PriorityQueue<Integer> min = new PriorityQueue<>();
            PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
            map = new HashMap<>();
            while (n-->0) {
                String input = br.readLine();
                String method = input.split(" ")[0];
                int value = Integer.parseInt(input.split(" ")[1]);

                if (method.equals("I")) {
                    min.add(value);
                    max.add(value);
                    map.put(value, map.getOrDefault(value, 0) + 1);
                } else {
                    if (!map.isEmpty()) {
                        if (value == 1) {
                            delete(max);
                        } else {
                            delete(min);
                        }
                    }
                }
            }

            if (map.isEmpty()) {
                sb.append("EMPTY").append("\n");
            } else {
                int target = delete(max);
                sb.append(target);
                if (map.size() > 0) {
                    target = delete(min);
                    sb.append(" ").append(target).append("\n");
                }
            }
        }
        System.out.println(sb.toString());
    }

    public static int delete(Queue<Integer> queue) {
        int target = 0;

        while (true) {
            target = queue.poll();

            int cnt = map.getOrDefault(target, 0);

            if (cnt == 0) {
                continue;
            }
            if (cnt == 1) {
                map.remove(target);
            } else {
                map.put(target, cnt - 1);
            }
            break;
        }

        return target;
    }
}
