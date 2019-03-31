package boj.bruteforce.prob;

import java.util.Scanner;

public class p3085 {
	
	static int n;
	static char c[][];
	static int max;
	
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        c = new char[n][n];
        
        for(int i=0;i<n;i++){
            c[i] = sc.next().toCharArray();
        }
        
        max = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                char tmp = c[i][j];
                c[i][j] = c[i][j+1];
                c[i][j+1] = tmp;
                
                arrayCheck();
                
                tmp = c[i][j];
                c[i][j] = c[i][j+1];
                c[i][j+1] = tmp;
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                char tmp = c[j][i];
                c[j][i] = c[j+1][i];
                c[j+1][i] = tmp;
                
                arrayCheck();
                
                tmp = c[j][i];
                c[j][i] = c[j+1][i];
                c[j+1][i] = tmp;
            }
        }
        
        System.out.println(max);
    }
	
	public static void arrayCheck() {
		
		for(int k=0; k<n; k++){
            int cnt = 1;
            for(int l=0; l<n-1; l++){
                if(c[k][l] == c[k][l+1])
                    cnt++;
                else cnt=1;
                if(max < cnt)
                    max = cnt;
            }
        }
        
        for(int k=0; k<n; k++){
            int cnt = 1;
            for(int l=0; l<n-1; l++){
                if(c[l][k] == c[l+1][k])
                    cnt++;
                else cnt=1;
                if(max < cnt)
                    max = cnt;
            }
        }
	}
}
