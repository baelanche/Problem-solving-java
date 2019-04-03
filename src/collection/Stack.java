package collection;

public class Stack {

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
    
}
