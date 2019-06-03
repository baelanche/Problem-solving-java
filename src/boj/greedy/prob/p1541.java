package boj.greedy.prob;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p1541 {

	public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String s = "+" + br.readLine();
        char c[] = s.toCharArray();
        int sum = 0;
        String temp = "";
        boolean b = true;
        
        for(int i=0; i<c.length; i++) {
            if(c[i] > 45) temp += c[i];
            else if(c[i] == 45) {
                if(b) sum += Integer.parseInt(temp);
                else sum -= Integer.parseInt(temp);
                b = false;
                temp = "";
            } else {
                if(!temp.equals("")) {
                    if(b) sum += Integer.parseInt(temp);
                    else sum -= Integer.parseInt(temp);
                }
                temp = "";
            }
        }
        if(!temp.equals("")) {
            if(b) sum += Integer.parseInt(temp);
            else sum -= Integer.parseInt(temp);
        }
        
        bw.write(sum + "\n");
        bw.flush();
    }
}
