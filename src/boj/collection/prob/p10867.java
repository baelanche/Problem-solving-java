package boj.collection.prob;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class p10867 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        Set<Integer> set = new TreeSet<Integer>();
        while(n-->0) {
            set.add(sc.nextInt());
        }
        
        Iterator it = set.iterator();
        
        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}
