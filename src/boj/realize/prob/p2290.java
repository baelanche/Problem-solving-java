package boj.realize.prob;

import java.util.Scanner;

public class p2290 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int s = sc.nextInt();
        String n = sc.next();
        
        int height = 2*s + 3;
        int width = s + 2;
        int len = n.length();
        
        char a[][] = new char[height][len * width + len-1];
        
        for(int i=0; i<a.length; i++) {
            for(int j=0; j<a[0].length; j++) {
                a[i][j] = ' ';
            }
        }
        
        int blank = -1;
        for(int i=0; i<len; i++) {
            //우상 세로선
            if(n.charAt(i) != '5' && n.charAt(i) != '6') {
                for(int j=1; j<height/2; j++)
                    a[j][width * (i+1) + blank] = '|';
            }
            //우하 세로선
            if(n.charAt(i) != '2') {
                for(int j=height/2+1; j<height-1; j++)
                    a[j][width * (i+1) + blank] = '|';
            }
            //좌상 세로선
            if(n.charAt(i) == '4' || n.charAt(i) == '5' || n.charAt(i) == '6' || n.charAt(i) == '8' || n.charAt(i) == '9' || n.charAt(i) == '0') {
                for(int j=1; j<height/2; j++)
                    a[j][width * (i+1) + blank - (width-1)] = '|';
            }
            //좌하 세로선
            if(n.charAt(i) == '2' || n.charAt(i) == '6' || n.charAt(i) == '8' || n.charAt(i) == '0') {
                for(int j=height/2+1; j<height-1; j++)
                    a[j][width * (i+1) + blank - (width-1)] = '|';
            }
            //가로선
            if(n.charAt(i) != '1') {
                for(int j=0; j<height; j++) {
                    if(j == 0 && n.charAt(i) != '4') {
                        for(int k=1; k<=s; k++)
                            a[j][width * (i+1) + blank - k] = '-';
                    }
                    if(j == height/2 && n.charAt(i) != '7' && n.charAt(i) != '0')
                        for(int k=1; k<=s; k++)
                            a[j][width * (i+1) + blank - k] = '-';
                    if(j == height-1 && n.charAt(i) != '4' && n.charAt(i) != '7')
                        for(int k=1; k<=s; k++)
                            a[j][width * (i+1) + blank - k] = '-';
                }
            }
            blank++;
        }
        
        for(int i=0; i<a.length; i++) {
            for(int j=0; j<a[0].length; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}
