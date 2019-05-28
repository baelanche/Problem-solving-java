package boj.tree.prob;

import java.util.Scanner;
import java.util.TreeSet;

public class p1269 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int an = sc.nextInt();
        int bn = sc.nextInt();
        TreeSet<Integer> a = new TreeSet<Integer>();
        TreeSet<Integer> b = new TreeSet<Integer>();
        
        for(int i=0; i<an; i++)
            a.add(sc.nextInt());
        for(int i=0; i<bn; i++)
            b.add(sc.nextInt());
        TreeSet<Integer> tmp = new TreeSet<Integer>();
        tmp.addAll(a);
        a.removeAll(b);
        b.removeAll(tmp);
        System.out.println(a.size() + b.size());
    }
}
