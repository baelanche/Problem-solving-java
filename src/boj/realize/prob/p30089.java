import java.util.*;
import java.io.*;

public class p30089 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (t-->0) {
            String plain = br.readLine();
            String reverse = "";
            for (int i=plain.length()-1; i>=0; i--) {
                reverse += plain.charAt(i);
            }
            for (int i=0; i<reverse.length(); i++) {
                String temp = plain + reverse.substring(reverse.length() - i, reverse.length());
                if (check(temp)) {
                    sb.append(temp).append("\n");
                    break;
                }
            }
        }
        System.out.println(sb.toString());
    }
    
    public static boolean check(String s) {
        int len = s.length();
        for (int i=0; i<len/2; i++) {
            if (s.charAt(i) != s.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
