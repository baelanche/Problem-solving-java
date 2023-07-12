import java.util.*;

public class p11005 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        String[] tf = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        int n = sc.nextInt();
        int b = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        
        while (n != 0) {
            int num = n % b;
            sb.insert(0, tf[num]);
            n -= num;
            n /= b;
        }
        
        System.out.println(sb.toString());
    }
}
