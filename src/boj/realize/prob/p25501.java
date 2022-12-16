import java.util.*;

public class p25501 {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      
      int t = sc.nextInt();
      
      while (t-->0) {
          String text = sc.next();
          int result[] = isPalindrome(text);
          System.out.println(result[0] + " " + result[1]);
      }
    }
    
    public static int[] recursion(String text, int l, int r, int cnt) {
        if (l >= r) return new int[]{1, cnt};
        else if (text.charAt(l) != text.charAt(r)) return new int[]{0, cnt};
        else return recursion(text, l+1, r-1, cnt + 1);
    }
    
    public static int[] isPalindrome(String text) {
        return recursion(text, 0, text.length() - 1, 1);
    }
}
