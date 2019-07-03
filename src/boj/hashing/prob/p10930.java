package boj.hashing.prob;

import java.security.MessageDigest;
import java.util.Scanner;

public class p10930 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(s.getBytes());
            
            byte encrypt[] = md.digest();
            
            StringBuffer sb = new StringBuffer();
            for(int i=0; i<encrypt.length; i++) {
                String b = Integer.toHexString(0xFF & encrypt[i]);
                if(b.length() == 1) sb.append('0');
                sb.append(b);
            }
            
            System.out.println(sb.toString());
        } catch (Exception e) {
            
        }
    }
}
