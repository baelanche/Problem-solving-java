package collection;

public class DoublyLinkedList {
    
    private Node head;
    private Node tail;
    private int size = 0;
    
    private class Node {
        private Object data;
        private Node prev;
        private Node next;
        
        public Node(Object input) {
            data = input;
            prev = null;
            next = null;
        }
        
        public String toString() {
            return String.valueOf(this.data);
        }
    }
    
    private Node node(int index) {
        if(index < size/2) {
            Node node = head;
            for(int i=0; i<index; i++)
                node = node.next;
            return node;
        } else {
            Node node = tail;
            for(int i=size-1; i>index; i--)
                node = node.prev;
            return node;
        }
    }
    
    private void addFirst(Object input) {
        Node node = new Node(input);
        node.next = head;
        if(head != null)
            head.prev = node;
        head = node;
        size++;
        if(node.next == null)
            tail = node;
    }
    
    private void addLast(Object input) {
        Node node = new Node(input);
        if(size == 0) {
            addFirst(input);
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
            size++;
        }
    }
    
    private void add(int index, Object input) {
        if(index == 0) {
            addFirst(input);
        } else {
            Node prevNode = node(index-1);
            Node node = prevNode.next;
            Node newNode = new Node(input);
            
            prevNode.next = newNode;
            newNode.next = node;
            if(node != null)
                node.prev = newNode;
            newNode.prev = prevNode;
            size++;
            if(newNode.next == null)
                tail = newNode;
        }
    }
    
    private void add(Object input) {
        addLast(input);
    }
    
    private Object removeFirst() {
        Node node = head.next;
        Object data = head.data;
        head = node;
        if(head != null)
            head.prev = null;
        size--;
        return data;
    }
    
    private Object remove(int index) {
        if(index == 0)
            removeFirst();
        Node prevNode = node(index-1);
        Node node = prevNode.next;
        if(prevNode.next != null)
            prevNode.next.prev = prevNode;
        Object data = node.data;
        if(node == tail)
            tail = prevNode;
        node = null;
        size--;
        return data;
    }
    
    private Object removeLast() {
        return remove(size-1);
    }
    
    private Object get(int index) {
        Node node = node(index);
        return node.data;
    }
    
    private int indexOf(Object data) {
        Node node = head;
        int index = 0;
        while(node.data != data) {
            node = node.next;
            index++;
            if(node == null)
                return -1;
        }
        return index;
    }
    
    public String toString() {
        if(head == null) return "[]";
        String str = "[";
        for(int i=0; i<size; i++) {
            Node node = node(i);
            str += node.toString();
            if(i != size-1) str += ". ";
        }
        return str += "]";
    }
}