package boj.realize.prob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class p9946 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int c = 0;
        while(true) {
            c++;
            String a = sc.next();
            String b = sc.next();
            if(a.equals("END") && b.equals("END")) break;
            
            ArrayList<Character> al = new ArrayList<Character>();
            ArrayList<Character> bl = new ArrayList<Character>();
            
            for(int i=0; i<a.length(); i++) al.add(a.charAt(i));
            for(int i=0; i<b.length(); i++) bl.add(b.charAt(i));
            
            Collections.sort(al);
            Collections.sort(bl);
            
            if(al.size() != bl.size()) {
                System.out.println("Case " + c + ": different");
                continue;
            }
            
            boolean success = true;
            for(int i=0; i<al.size(); i++) {
                if(al.get(i) != bl.get(i)) {
                    System.out.println("Case " + c + ": different");
                    success = false;
                    break;
                }
            }
            
            if(success) System.out.println("Case " + c + ": same");
        }
    }
}
