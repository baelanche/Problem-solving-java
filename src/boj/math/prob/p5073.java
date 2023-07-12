import java.util.*;

public class p5073 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int a[] = new int[3];
            a[0] = sc.nextInt();
            a[1] = sc.nextInt();
            a[2] = sc.nextInt();
            
            if (a[0] == 0 && a[1] == 0 && a[2] == 0) break;
            
            Arrays.sort(a);
            
            if (a[0] + a[1] <= a[2]) {
                System.out.println("Invalid");
            } else if (a[0] == a[1] && a[0] == a[2]) {
                System.out.println("Equilateral");
            } else if (a[1] == a[2] || a[0] == a[1]) {
                System.out.println("Isosceles");
            }else if (a[0] != a[1] && a[1] != a[2]) {
                System.out.println("Scalene");
            }
        }
    }
}
