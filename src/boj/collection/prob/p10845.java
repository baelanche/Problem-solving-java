package boj.collection.prob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class p10845 {

	Node head;
    Node tail;
    int size = 0;
    
    class Node {
        Node prev;
        Object value;
        
        Node(Object value) {
            this.value = value;
        }
    }
    
    public void push(Object value) {
        Node node = new Node(value);
        if(size == 0) {
            head = node;
            tail = node;
        }
        tail.prev = node;
        tail = node;
        size++;
    }
    
    public Object pop() {
        if(size == 0) return -1;
        Node temp = head;
        head = head.prev;
        size--;
        return temp.value;
    }
    
    public Object front() {
        if(size == 0) return -1;
        return head.value;
    }
    
    public Object back() {
        if(size == 0) return -1;
        return tail.value;
    }
    
    public int size() {
        return size;
    }
    
    public boolean isEmpty() {
        if(size == 0) return true;
        return false;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        
        p10845 q = new p10845();
        
        for (int i=0; i<n; i++) {
            String str = br.readLine();
            if(str.contains("push")) {
                int push = Integer.parseInt(str.split(" ")[1]);
                q.push(push);
            } else if(str.contains("pop")) {
                sb.append(q.pop()).append("\n");
            } else if(str.contains("size")) {
                sb.append(q.size()).append("\n");
            } else if(str.contains("empty")) {
                if(q.isEmpty()) sb.append(1).append("\n");
                else sb.append(0).append("\n");;
            } else if(str.contains("front")) {
                sb.append(q.front()).append("\n");
            } else if(str.contains("back")) {
                sb.append(q.back()).append("\n");
            }
        }
        System.out.println(sb.toString());
    }
}
