package boj.realize.prob;

import java.util.Scanner;

public class p5355 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0) {
            String s = sc.nextLine();
            String array[] = s.split(" ");
            
            float f = Float.parseFloat(array[0]);
            for(int i=1; i<array.length; i++) {
                if(array[i].equals("@")) f *= 3;
                if(array[i].equals("%")) f += 5;
                if(array[i].equals("#")) f -= 7;
            }
            
            System.out.printf("%.2f\n", f);
        }
    }
}
