package boj.collection.prob;

import java.io.*;
import java.util.*;

public class p17298 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> s = new Stack<Integer>();
        int a[] = new int[n];
        int b[] = new int[n];
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            int p = Integer.parseInt(st.nextToken());
            a[i] = p;
            while(!s.isEmpty() && p > a[s.peek()]) {
                b[s.pop()] = p;
            }
            s.push(i);
        }
        while(!s.isEmpty()) b[s.pop()] = -1;
        for(int i : b) sb.append(i + " ");
        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
    }
}
