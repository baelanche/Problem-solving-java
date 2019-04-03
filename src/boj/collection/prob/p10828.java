package boj.collection.prob;

import java.util.Scanner;

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
    
    public String toString() {
        String str = "top [";
        Node temp = head;
        for(int i=0; i<size; i++) {
            str += temp.value;
            if(i != size-1) {
                temp = temp.prev;
                str += ", ";
            }
        }
        return str += "] bottom";
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.nextLine();
        p10828 s = new p10828();
        
        for(int i=0; i<n; i++) {
            String command = sc.nextLine();
            if(command.contains("push")) {
                int push = Integer.parseInt(command.split(" ")[1]);
                s.push(push);
            } else if(command.contains("pop")) {
                System.out.println(s.pop());
            } else if(command.contains("size")) {
                System.out.println(s.size());
            } else if(command.contains("empty")) {
                if(s.isEmpty()) System.out.println(1);
                else System.out.println(0);
            } else {
                System.out.println(s.top());
            }
        }
        sc.close();
    }
}