package boj.collection.prob;

import java.io.*;
import java.util.*;

public class p10866 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        Queue q = new Queue();
        int n = Integer.parseInt(br.readLine());
        while(n-->0) {
            st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();
            if(cmd.equals("push_front")) {
                q.push_front(Integer.parseInt(st.nextToken()));
            } else if(cmd.equals("push_back")) {
                q.push_back(Integer.parseInt(st.nextToken()));
            } else if(cmd.equals("pop_front")) {
                bw.write(q.pop_front() + "\n");
            } else if(cmd.equals("pop_back")) {
                bw.write(q.pop_back() + "\n");
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
        void push_front(int x) {list.addFirst(x);}
        void push_back(int x) {list.addLast(x);}
        int pop_front() {return list.isEmpty() == true ? -1 : list.removeFirst();}
        int pop_back() {return list.isEmpty() == true ? -1 : list.removeLast();}
        int size() {return list.size();}
        int empty() {return list.isEmpty() == true ? 1 : 0;}
        int front() {return list.isEmpty() == true ? -1 : list.getFirst();}
        int back() {return list.isEmpty() == true ? -1 : list.getLast();}
    }
}
