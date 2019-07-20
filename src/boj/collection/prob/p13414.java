package boj.collection.prob;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class p13414 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int k = sc.nextInt();
        int l = sc.nextInt();
        
        LinkedHashSet<String> set = new LinkedHashSet<String>();
        for(int i=0; i<l; i++) {
            String temp = sc.next();
            if(set.contains(temp)) set.remove(temp);
            set.add(temp);
        }
        
        Iterator<String> it = set.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
            if(--k == 0) break;
        }
    }
}
