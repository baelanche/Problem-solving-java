package boj.realize.prob;

import java.util.Scanner;

public class p2979 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int truck[][] = new int[3][2];
        for(int i=0; i<3; i++)
            for(int j=0; j<2; j++)
                truck[i][j] = sc.nextInt();
        
        int cost = 0;
        for(int time=1; true; time++) {
            int cnt = 0;
            for(int i=0; i<3; i++)
                if(truck[i][0] <= time && truck[i][1] > time)
                    cnt++;
            
            if(cnt == 1) cost += a;
            else if(cnt == 2) cost += b*2;
            else if(cnt == 3) cost += c*3;
            
            if(time > truck[0][1] && time > truck[1][1] && time > truck[2][1]) break;
        }
        System.out.println(cost);
    }
}
