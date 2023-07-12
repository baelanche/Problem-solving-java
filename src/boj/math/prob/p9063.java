import java.util.*;

public class p9063 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int fx = sc.nextInt();
        int fy = sc.nextInt();
        int minX = fx;
        int maxX = fx;
        int minY = fy;
        int maxY = fy;
        for (int i=0; i<n-1; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            minX = Math.min(minX, x);
            maxX = Math.max(maxX, x);
            minY = Math.min(minY, y);
            maxY = Math.max(maxY, y);
        }
        System.out.println((maxX - minX) * (maxY - minY));
    }
}
