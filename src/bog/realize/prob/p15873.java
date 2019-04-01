package bog.realize.prob;

import java.util.Scanner;

public class p15873 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String num = sc.next();
        int length = num.length();
        int sum = 0;
        if(length == 2)
            sum = num.charAt(0) + num.charAt(1) - 96;
        else if(length == 3) {
            if(num.charAt(1) == '0')
                sum = num.charAt(2) - 38;
            else
                sum = num.charAt(0) - 38;
        } else
            sum = 20;
        
        sc.close();
        System.out.println(sum);
    }
}
