package boj.bruteforce.prob;

import java.util.Scanner;

public class p2798 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int card[] = new int[n];
        
        for(int i=0; i<n; i++)
            card[i] = sc.nextInt();
        
        int answer = 0;
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                for(int k=j+1; k<n; k++) {
                    int sum = card[i] + card[j] + card[k];
                    if(answer < sum && sum <= m)
                        answer = sum;
                }
            }
        }
        
        System.out.println(answer);
        sc.close();
    }
}
