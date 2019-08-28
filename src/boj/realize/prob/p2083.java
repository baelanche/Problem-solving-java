package boj.realize.prob;

import java.util.Scanner;

public class p2083 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            String name = sc.next();
            int age = sc.nextInt();
            int weight = sc.nextInt();
            
            if(name.equals("#") && age == 0 && weight == 0) break;
            
            if(age > 17 || weight >= 80) System.out.println(name + " Senior");
            else System.out.println(name + " Junior");
        }
    }
}
