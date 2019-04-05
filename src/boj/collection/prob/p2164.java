package boj.collection.prob;

import java.util.Scanner;

public class p2164 {

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
    
    public void clear() {
        head = null;
        size = 0;
    }
    
    public String toString() {
        String str = "front [";
        Node temp = head;
        for(int i=0; i<size; i++) {
            str += temp.value;
            if(i != size -1)
                str += ", ";
            temp = temp.prev;
        }
        return str + "] rear";
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        p2164 q = new p2164();
        
        for(int i=1; i<=n; i++)
            q.push(i);
        
        for(int i=0; !q.isEmpty(); i++) {
            if(q.size() == 1) {
                System.out.println(q.front());
                break;
            }
            
            if(i%2==0) q.pop();
            else {q.push(q.front()); q.pop();}
        }
        sc.close();
    }
}
