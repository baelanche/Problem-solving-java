import java.util.Scanner;

public class p1735 {
    
    public static int gcd(int x, int y) {
        while(y != 0) {
            int tmp = y;
            y = x % y;
            x = tmp;
        }
        return x;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
      
        int num = a * d + b * c;
        int dem = b * d;
        System.out.println(num/gcd(num, dem) + " " + dem/gcd(num, dem));
    }
}
