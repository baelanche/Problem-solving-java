package boj.realize.prob;

import java.util.Scanner;

public class p10997 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int width = 1 + (n-1)*4;
        int height = 1;
        
        for(int i=0; i<n-1; i++) {
            if(i == 0) height += 6;
            else height += 4;
        }
        
        char a[][] = new char[height][width];
        
        for(int i=0; i<height; i++)
            for(int j=0; j<width; j++)
                a[i][j] = ' ';
        
        int left = 0;
        int right = width;
        int top = 0;
        int bottom = height;
        for(int i=0; i<height; i++) {
            for(int j=0; j<width; j++) {
                if(i % 2 == 0) {
                    if(j >= left && j < right)
                        a[i][j] = '*';
                }
            }
            if(i < height/2) {
                left++;
                if(i > 1)
                    right--;
            } else {
                if(i == height/2) right = height/2 - 1;
                left--;
                right++;
            }
        }
        
        for(int i=0; i<width; i++) {
            for(int j=0; j<height; j++) {
                if(i % 2 == 0) {
                    if(j >= top && j < bottom)
                        a[j][i] = '*';
                    if(i == width-1 && j == 1)
                        a[j][i] = ' ';
                }
            }
            if(i < width/2) {
                top++;
                bottom--;
            } else {
                if(i == width/2) top = width/2 + 2;
                top--;
                bottom++;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<height; i++) {
            for(int j=0; j<width; j++) {
                if(i == 1) {
                    sb.append(a[i][0]);
                    break;
                }
                sb.append(a[i][j]);
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}
