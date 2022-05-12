package boj.collection.prob;

import java.io.*;
import java.util.*;

public class p18258 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        Queue q = new Queue();
        int n = Integer.parseInt(br.readLine());
        while(n-->0) {
            st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();
            if(cmd.equals("push")) {
                q.push(Integer.parseInt(st.nextToken()));
            } else if(cmd.equals("pop")) {
                bw.write(q.pop() + "\n");
            } else if(cmd.equals("size")) {
                bw.write(q.size() + "\n");
            } else if(cmd.equals("empty")) {
                bw.write(q.empty() + "\n");
            } else if(cmd.equals("front")) {
                bw.write(q.front() + "\n");
            } else if(cmd.equals("back")) {
                bw.write(q.back() + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
    
    static class Queue {
        LinkedList<Integer> list = new LinkedList<Integer>();
        void push(int x) {list.addFirst(x);}
        int pop() {return list.isEmpty() == true ? -1 : list.removeLast();}
        int size() {return list.size();}
        int empty() {return list.isEmpty() == true ? 1 : 0;}
        int front() {return list.isEmpty() == true ? -1 : list.getLast();}
        int back() {return list.isEmpty() == true ? -1 : list.getFirst();}
    }
}
