package collection;

public class Queue {

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
}
