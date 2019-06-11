package boj.realize.prob;

import java.util.Scanner;

public class p10551 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char c[] = sc.next().toCharArray();
        int finger[] = new int[8];
        
        for(int i=0; i<c.length; i++)
            pressKey(c[i], finger);
        
        for(int i=0; i<finger.length; i++)
            System.out.println(finger[i]);
    }
    
    public static void pressKey(char c, int f[]) {
        if(c == '1' || c == 'Q' || c == 'A' || c == 'Z')
            f[0]++;
        else if(c == '2' || c == 'W' || c == 'S' || c == 'X')
            f[1]++;
        else if(c == '3' || c == 'E' || c == 'D' || c == 'C')
            f[2]++;
        else if(c == '4' || c == '5' || c == 'R' || c == 'T' || c == 'F' || c == 'G' || c == 'V' || c == 'B')
            f[3]++;
        else if(c == '6' || c == '7' || c == 'Y' || c == 'U' || c == 'H' || c == 'J' || c == 'N' || c == 'M')
            f[4]++;
        else if(c == '8' || c == 'I' || c == 'K' || c == ',')
            f[5]++;
        else if(c == '9' || c == 'O' || c == 'L' || c == '.')
            f[6]++;
        else f[7]++;
    }
}
