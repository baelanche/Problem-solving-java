package boj.collection.prob;

import java.io.*;
import java.util.*;

public class p17298 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> s = new Stack<Integer>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++)
            s.push(Integer.parseInt(st.nextToken()));
        
        while(!s.isEmpty()) {
            int p = s.pop();
            boolean b = false;
            for(int i=0; i<list.size(); i++) {
                int q = list.get(i);
                if(q > p) {
                    sb.insert(0, " " + q);
                    b = true;
                    break;
                }
            }
            if(!b) sb.insert(0, " -1");
            list.add(0, p);
        }
        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
    }
}
