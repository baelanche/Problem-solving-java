package boj.collection.prob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashSet;

public class p11723 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashSet<Integer> set = new HashSet<>();

        int m = Integer.parseInt(br.readLine());

        while(m-->0) {
            String input = br.readLine();
            if (input.contains("add")) {
                set.add(Integer.parseInt(input.split(" ")[1]));
            } else if (input.contains("remove")) {
                set.remove(Integer.parseInt(input.split(" ")[1]));
            } else if (input.contains("check")) {
                sb.append(set.contains(Integer.parseInt(input.split(" ")[1])) == true ? 1 : 0).append("\n");
            } else if (input.contains("toggle")) {
                if (set.contains(Integer.parseInt(input.split(" ")[1]))) {
                    set.remove(Integer.parseInt(input.split(" ")[1]));
                } else {
                    set.add(Integer.parseInt(input.split(" ")[1]));
                }
            } else if (input.contains("all")) {
                set.clear();
                for (int i=1; i<=20; i++) {
                    set.add(i);
                }
            } else if (input.contains("empty")) {
                set.clear();
            }
        }

        System.out.println(sb.toString());
    }
}