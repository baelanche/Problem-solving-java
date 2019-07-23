package boj.realize.prob;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p10820 {

	public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String line = "";
        while((line = br.readLine()) != null) {
            int lower = 0;
            int upper = 0;
            int number = 0;
            int blank = 0;
            for(int i=0; i<line.length(); i++) {
                if(line.charAt(i) >= 'a' && line.charAt(i) <= 'z') lower++;
                else if(line.charAt(i) >= 'A' && line.charAt(i) <= 'Z') upper++;
                else if(line.charAt(i) >= '0' && line.charAt(i) <= '9') number++;
                else blank++;
            }
            System.out.println(lower + " " + upper + " " + number + " " + blank);
        }
    }
}
