package collection;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class HashMap {
    
    private int size = 0;
    private Element head;
    
    private class Element {
        private Element next;
        private String key;
        private Object value;
        
        public Element() {
            next = null;
        }
        
        public String toString() {
            return key + " = " + value;
        }
    }
    
    private Element element(int index) {
        Element el = head;
        for(int i=0; i<index; i++) {
            el = el.next;
        }
        return el;
    }
    
    public int size() {
        return size;
    }
    
    public Object put(String key, Object value) {
        for(int i=0; i<size; i++) {
            Element temp = element(i);
            if(key.equals(temp.key) || key == temp.key) {
                temp.value = value;
                return temp;
            }
        }
        Element map = new Element();
        map.key = key;
        map.value = value;
        if(size == 0) {
            head = map;
        } else {
            Element temp = element(size-1);
            temp.next = map;
        }
        size++;
        return map;
    }
    
    public Object get(String key) {
        for(int i=0; i<size; i++) {
            Element el = element(i);
            if(el.key.equals(key) || el.key == key) {
                return el.value;
            }
        }
        return null;
    }
    
    public Object remove(String key) {
        for(int i=0; i<size; i++) {
            Element el = element(i);
            if(el.key.equals(key) || el.key == key) {
                size--;
                Object obj = el.value;
                if(el.equals(head) || el == head) {
                    head = el.next;
                } else {
                    Element temp = element(i-1);
                    if(el.next != null) {
                        temp.next = el.next;
                    } else {
                        temp.next = null;
                    }
                }
                el = null;
                return obj;
            }
        }
        return null;
    }
    
    public Set keySet() {
        Set set = new TreeSet();
        for(int i=0; i<size; i++) {
            Element el = element(i);
            set.add(el.key);
        }
        return set;
    }
    
    public Collection values() {
        Collection coll = new java.util.LinkedList();
        for(int i=0; i<size; i++) {
            Element el = element(i);
            coll.add(el.value);
        }
        return coll;
    }
    
    public boolean isEmpty() {
        boolean empty;
        empty = (head == null) ? true : false;
        return empty;
    }
    
    public boolean containsKey(Object key) {
        for(int i=0; i<size; i++) {
            Element el = element(i);
            if(el.key.equals(key) || el.key == key) {
                return true;
            }
        }
        return false;
    }
    
    public boolean containsValue(Object value) {
        for(int i=0; i<size; i++) {
            Element el = element(i);
            if(el.value.equals(value) || el.value == value) {
                return true;
            }
        }
        return false;
    }
    
    public Set entrySet() {
        Set set = new TreeSet();
        for(int i=0; i<size; i++) {
            Element el = element(i);
            set.add(el.toString());
        }
        return set;
    }
    
    public void putAll(Map <String, Object> map) {
        for(String key : map.keySet()) {
            Object value = map.get(key);
            Element el = new Element();
            el.key = key;
            el.value = value;
            if(head == null)
                head = el;
            else {
                Element temp = element(size-1);
                temp.next = el;
            }
            size++;
        }
    }
    
    public void clear() {
        head = null;
        size = 0;
    }
    
    @Override
    public String toString() {
        if(head == null) return "{}";
        Element el = head;
        String str = "{";
        for(int i=0; i<size; i++) {
            str += el.toString();
            if(i != size-1) {
                str += ", ";
            }
            el = el.next;
        }
        return str + "}";
    }
}