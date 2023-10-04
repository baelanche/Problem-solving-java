import java.io.*;
import java.util.*;

public class p19605 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String t = br.readLine();
        String s = br.readLine();
        int len = s.length();
        for (int i=0; i<len; i++) {
            String left = s.substring(0, i);
            String right = s.substring(i, len);
            String temp = right + left;
            if (t.contains(temp)) {
                len = -1;
                break;
            }
        }
        System.out.println(len == -1 ? "yes" : "no");
    }
}
