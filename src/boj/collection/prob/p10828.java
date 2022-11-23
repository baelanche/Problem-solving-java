package boj.collection.prob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p10828 {

    Node head;
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
        if(size >= 1)
            node.prev = head;
        head = node;
        size++;
    }

    public Object pop() {
        if(size == 0) {
            return -1;
        }

        Node temp = head;
        head = head.prev;
        size--;
        
        return temp.value;
    }

    public Object top() {
        if(size == 0) {
            return -1;
        }
        return head.value;
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
        p10828 s = new p10828();
        
        for(int i=0; i<n; i++) {
            String command = br.readLine();
            if(command.contains("push")) {
                int push = Integer.parseInt(command.split(" ")[1]);
                s.push(push);
            } else if(command.contains("pop")) {
                sb.append(s.pop()).append("\n");
            } else if(command.contains("size")) {
                sb.append(s.size()).append("\n");
            } else if(command.contains("empty")) {
                if(s.isEmpty()) sb.append(1).append("\n");
                else sb.append(0).append("\n");
            } else {
                sb.append(s.top()).append("\n");
            }
        }
        System.out.println(sb.toString());
    }
}