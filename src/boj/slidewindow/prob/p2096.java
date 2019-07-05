package boj.slidewindow.prob;

import java.util.Arrays;
import java.util.Scanner;

public class p2096 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int colMin[] = new int[3];
        int colMax[] = new int[3];
        int tempMin[] = new int[3];
        int tempMax[] = new int[3];
        
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            for(int j=0; j<3; j++) {
                tempMax[j] = sc.nextInt();
                tempMin[j] = tempMax[j];
                tempMax[j] += Math.max(colMax[1], j==1 ? Math.max(colMax[0], colMax[2]) : colMax[j]);
                tempMin[j] += Math.min(colMin[1], j==1 ? Math.min(colMin[0], colMin[2]) : colMin[j]);
            }
            for(int j=0; j<3; j++) {
                colMax[j] = tempMax[j];
                colMin[j] = tempMin[j];
            }
        }
        Arrays.sort(colMax);
        Arrays.sort(colMin);
        System.out.println(colMax[2] + " " + colMin[0]);
    }
}
