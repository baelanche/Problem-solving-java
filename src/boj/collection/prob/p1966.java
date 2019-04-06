package boj.collection.prob;

import java.util.ArrayList;
import java.util.Scanner;

public class p1966 {

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

		p1966 q = new p1966();
		
		int t = sc.nextInt();
		
		while(t-->0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			ArrayList<Integer> order = new ArrayList<Integer>();
			
			for(int i=0; i<n; i++) {
				order.add(sc.nextInt());
				if(i == m) q.push("this");
				else q.push("docu");
			}
			
			int cnt = 0;
			while(true) {
				int bigest = 0;
				for(int j=0; j<order.size(); j++) {
					if(bigest < order.get(j))
						bigest = order.get(j);
				}
				System.out.println("ť : " + q.toString());
				System.out.println("�迭 : " + order.toString());
				if(bigest == order.get(0)) {
					cnt++;
					if(q.front().equals("this")) break;
					q.pop();
					order.remove(0);
				} else {
					q.push(q.front());
					q.pop();
					order.add(order.get(0));
					order.remove(0);
				}
			}
			
			System.out.println(cnt);
			order.clear();
			q.clear();
		}
		sc.close();
	}

}
