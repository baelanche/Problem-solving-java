package boj.bruteforce;

import java.util.Arrays;
import java.util.Scanner;

public class p2309 {

	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int arr[] = new int[9];
        int a=0, b=0, sum=0;
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        
        Arrays.sort(arr);
        
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                int tmp = sum;
                tmp = tmp - arr[i] - arr[j];
                if(tmp == 100){
                    a = arr[i];
                    b = arr[j];
                    break;
                }
            }
        }
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] != a && arr[i] != b)
                System.out.println(arr[i]);
        }
    }
}
