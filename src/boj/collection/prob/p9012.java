package boj.collection.prob;

import java.util.Scanner;

public class p9012 {
    
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
    
    public void clear() {
        head = null;
        size = 0;
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
        
        int t = sc.nextInt();
        p9012 s = new p9012();
        
        while(t-->0) {
            String temp = sc.next();
            String[] ps = new String[temp.length()];
            for(int i=0; i<ps.length; i++)
                ps[i] = String.valueOf(temp.charAt(i));
            
            for(int i=0; i<ps.length; i++) {
                if(ps[i].equals("("))
                    s.push(ps[i]);
                if(ps[i].equals(")")) {
                    if(s.top().equals("("))
                        s.pop();
                    else {
                        s.push("fail~~");
                        break;
                    }
                }
            }
            
            if(s.isEmpty())
                System.out.println("YES");
            else System.out.println("NO");
            
            s.clear();
        }
        sc.close();
    }
}