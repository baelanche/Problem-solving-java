package boj.tree.prob;

import java.util.ArrayList;
import java.util.Scanner;

public class p16437 {

	static ArrayList<Integer> a[];
    static char sw[];
    static int score[];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        a = new ArrayList[n+1];
        sw = new char[n+1];
        score = new int[n+1];
        for(int i=0; i<n+1; i++)
            a[i] = new ArrayList<Integer>();
        
        for(int i=2; i<n+1; i++) {
            char t[] = sc.next().toCharArray();
            int s = sc.nextInt();
            int p = sc.nextInt();
            sw[i] = t[0];
            score[i] = s;
            a[p].add(i);
        }
        
        System.out.println(postOrder(1));
    }
    
    public static long postOrder(int node) {
        long sum = 0;
        for(int next : a[node]) {
            sum += postOrder(next);
        }
        
        if(sw[node] == 'S') return sum + score[node];
        else return (sum - score[node] >= 0) ? sum - score[node] : 0;
    }
}
