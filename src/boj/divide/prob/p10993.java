package boj.divide.prob;

import java.util.Scanner;

public class p10993 {

	static char a[][];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int width = 1;
        int height = 1;
        int four = 4;
        int two = 2;
        for(int i=0; i<n-1; i++) {
            width += four;
            four *=2;
        }
        for(int i=0; i<n-1; i++) {
            height += two;
            two *= 2;
        }
        
        a = new char[height][width];
        
        for(int i=0; i<height; i++)
        	for(int j=0; j<width; j++)
        		a[i][j] = ' ';
        
        drawStar(0, 0, height, width, n);
        
        StringBuilder sb = new StringBuilder();
        if(n % 2 == 0) {
        	int k = 0;
	        for(int i=0; i<height; i++) {
	            for(int j=0; j<width-k; j++)
	                sb.append(a[i][j]);
	            sb.append("\n");
	            k++;
	        }
        } else {
        	int k = 1;
        	for(int i=0; i<height; i++) {
        		for(int j=0; j<width/2+k; j++)
        			sb.append(a[i][j]);
        		sb.append("\n");
        		k++;
        	}
        }
        System.out.println(sb.toString());
    }
    
    public static void drawStar(int s, int e, int hlen, int wlen, int seq) {
        if(seq <= 0) return;
        
        int mid = (s + s + wlen)/2;
        int left = s;
        int right = s + wlen;
        
        //»ï°¢Çü
        if(seq % 2 == 1) {
            int innerLeft = mid;
            int innerRight = mid;
            for(int i=e; i<e + hlen; i++) {
                for(int j=innerLeft; j<=innerRight; j++) {
                    if(i == e || i == e + hlen-1 || j == innerLeft || j == innerRight)
                        a[i][j] = '*';
                    else
                    	a[i][j] = ' ';
                }
                innerLeft--;
                innerRight++;
            }
        }
        //¿ª»ï°¢Çü
        else {
            int innerLeft = left;
            int innerRight = right;
            for(int i=e; i<e + hlen; i++) {
                for(int j=innerLeft; j<innerRight; j++) {
                    if(i == e || i == e + hlen-1 || j == innerLeft || j == innerRight-1)
                        a[i][j] = '*';
                    else
                    	a[i][j] = ' ';
                }
                innerLeft++;
                innerRight--;
            }
        }
        
        int moveRight = s + (int)Math.pow(2, seq-1);
        if(seq % 2 == 1) drawStar(moveRight, e + hlen/2, hlen/2, wlen - (int)Math.pow(2, seq), seq-1);
        else drawStar(moveRight, e+1, hlen/2, wlen - (int)Math.pow(2, seq), seq-1);
    }
}
