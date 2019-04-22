package boj.greedy.prob;

import java.util.Scanner;

public class p1969 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        char a[][] = new char[n][m];
        
        for(int i=0; i<n; i++)
            a[i] = sc.next().toCharArray();
        
        int cnt = 0;
        for(int i=0; i<m; i++) {
            int dna[] = new int[4];
            for(int j=0; j<n; j++) {
                if(a[j][i] == 'A') dna[0]++;
                if(a[j][i] == 'C') dna[1]++;
                if(a[j][i] == 'G') dna[2]++;
                if(a[j][i] == 'T') dna[3]++;
            }
            int max = max(max(max(dna[0], dna[1]), dna[2]), dna[3]);
            cnt += n - max;
            
            int idx = max(dna);
            System.out.print(idx == 0 ? "A" : idx == 1 ? "C" : idx == 2 ? "G" : "T");
        }
        System.out.println("\n" + cnt);
    }
    
    public static int max(int[] a) {
        int max = 0;
        int idx = 0;
        for(int i=0; i<a.length; i++) {
            if(max < a[i]) {
                max = a[i];
                idx = i;
            }
        }
        return idx;
    }
    
    public static int max(int a, int b) {
        return a >= b ? a : b;
    }
}
