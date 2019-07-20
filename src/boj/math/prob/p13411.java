package boj.math.prob;

import java.util.Arrays;
import java.util.Scanner;

public class p13411 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        Missile m[] = new Missile[n];
        for(int i=0; i<n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            double v = sc.nextInt();
            
            double t = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)) / v;
            m[i] = new Missile(i+1, t);
        }
        
        Arrays.sort(m);
        
        for(int i=0; i<n; i++)
            System.out.println(m[i].no);
    }
    
    static class Missile implements Comparable<Missile> {
        int no;
        double time;
        
        Missile(int no, double time) {
            this.no = no;
            this.time = time;
        }
        
        public int compareTo(Missile m) {
            if(this.time < m.time) return -1;
            else if(this.time == m.time) return 0;
            else return 1;
        }
    }
}
