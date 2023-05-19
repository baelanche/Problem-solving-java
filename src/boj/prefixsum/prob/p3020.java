package boj.prefixsum.prob;

import java.util.Scanner;

public class p3020 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int h = sc.nextInt();

        int d[] = new int[h+1];
        int u[] = new int[h+1];
        int ds[] = new int[h+1];
        int du[]= new int[h+1];

        for (int i=0; i<n/2; i++) {
            d[sc.nextInt()]++;
            u[sc.nextInt()]++;
        }

        for (int i=1; i<=h; i++) {
            ds[i] = ds[i-1] + d[i];
            du[i] = du[i-1] + u[i];
        }

        int min = n;
        int cnt = 0;
        for (int i=1; i<=h; i++) {
            int s = 0;
            s += ds[h] - ds[i - 1];
            s += du[h] - du[h - i];
            if (s < min) {
                min = s;
                cnt = 1;
            } else if (s == min) {
                cnt++;
            }
        }

        System.out.println(min + " " + cnt);
    }
}
