import java.io.*;
import java.util.*;

public class p9935 {
    
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String b = br.readLine();
        StringBuilder sb = new StringBuilder();
        
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            sb.append(c);
            if (sb.length() >= b.length()) {
                boolean f = true;
                for (int j=0; j<b.length(); j++) {
                    char l = sb.charAt(sb.length() - b.length() + j);
                    char r = b.charAt(j);
                    if (l != r) {
                        f = false;
                        break;
                    }
                }
                
                if (f) {
                    sb.delete(sb.length() - b.length(), sb.length());
                }
            }
        }
        
        if (sb.length() == 0) {
            System.out.println("FRULA");
        } else {
            System.out.println(sb.toString());
        }
    }
}
