package boj.realize.prob;

import java.util.Arrays;
import java.util.Scanner;

public class p16677 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String m = sc.next();
        int n = sc.nextInt();
        
        Dictionary dic[] = new Dictionary[n];
        for(int i=0; i<n; i++) {
            String name = sc.next();
            double level = sc.nextInt();
            dic[i] = new Dictionary("No Jam", 0);
            
            int left = 0;
            int right = 0;
            double k = 0;
            while(true) {
                if(right == name.length()) break;
                if(left == m.length()) {
                    right++;
                    k++;
                } else {
                    if(m.charAt(left) == name.charAt(right)) {
                        left++;
                        right++;
                    } else {
                        right++;
                        k++;
                    }
                }
            }
            
            if(left == m.length()) {
                dic[i].name = name;
                dic[i].level = level/k;
            }
        }
        
        Arrays.sort(dic);
        
        System.out.println(dic[0].name);
    }
    
    static class Dictionary implements Comparable<Dictionary> {
        String name;
        double level;
        
        Dictionary(String name, double level) {
            this.name = name;
            this.level = level;
        }
        
        public int compareTo(Dictionary d) {
            if(this.level > d.level)
                return -1;
            else if(this.level == d.level)
                return 0;
            else return 1;
        }
    }
}
