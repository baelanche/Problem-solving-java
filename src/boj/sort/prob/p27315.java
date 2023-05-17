package boj.sort.prob;

import java.util.*;

public class p27315 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        Problem p[] = new Problem[n];
        for (int i=0; i<n; i++) {
            p[i] = new Problem(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        }
        int hd = sc.nextInt();
        int hp = sc.nextInt();
        int solve = 0;
        int fail = 0;
        for (int i=0; i<n; i++) {
            if (solve == m) {
                System.out.println(fail);
                return;
            }
            if (p[i].data == 1) {
                hd++;
                hp++;
                solve++;
                continue;
            }
            if (p[i].editorial == 1) {
                if (hd * 2 >= p[i].idea) {
                    p[i].idea /= 2;
                    p[i].realize /= 2;
                }
            }
            if (hd < p[i].idea) {
                continue;
            }
            if (hp < p[i].realize) {
                fail += p[i].realize - hp;
                hd++;
                hp++;
                solve++;
            }
        }
        
        System.out.println(-1);
    }
}

class Problem {
    int idea;
    int realize;
    int data;
    int editorial;
    
    public Problem(int idea, int realize, int data, int editorial) {
        this.idea = idea;
        this.realize = realize;
        this.data = data;
        this.editorial = editorial;
    }
}
