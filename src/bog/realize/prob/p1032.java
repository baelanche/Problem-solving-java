package bog.realize.prob;

import java.util.Scanner;

public class p1032 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        char arr[][] = new char[n][100];
        
        for(int i=0; i<n; i++) 
            arr[i] = sc.next().toCharArray();
        
        char output[] = arr[0];
        
        for(int i=0; i<output.length; i++) {
            for(int j=0; j<n; j++) {
                if(arr[j][i] == output[i]) continue;
                else output[i] = '?';
            }
        }
        
        for(int i=0; i<output.length; i++)
            System.out.print(output[i]);
    }
}
