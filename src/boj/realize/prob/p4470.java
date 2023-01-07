import java.util.*;

public class p4470 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        int n = sc.nextInt();
        sc.nextLine();
        for (int i=1; i<=n; i++) {
            String s = sc.nextLine();
            sb.append(i).append(". ").append(s).append("\n");
        }
        System.out.println(sb.toString());
    }
}
