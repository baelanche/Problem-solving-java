import java.util.*;

public class p14215 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int a[] = new int[3];
        a[0] = sc.nextInt();
        a[1] = sc.nextInt();
        a[2] = sc.nextInt();
        Arrays.sort(a);
        
        while (true) {
            if (a[0] + a[1] > a[2]) break;
            a[2]--;
        }
        System.out.println(a[0] + a[1] + a[2]);
    }
}
