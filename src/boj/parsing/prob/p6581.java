package boj.parsing.prob;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p6581 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringBuilder sb = new StringBuilder();
        
        int cnt = 0;
        String line;
        String split[];
        while((line = br.readLine()) != null) {
            split = line.split(" |    ");
            String word;
            for(int i=0; i<split.length; i++) {
                word = split[i];
                if(word.equals("<br>")) {
                    sb.append("\n");
                    cnt = 0;
                } else if(word.equals("<hr>")) {
                    if(cnt != 0) {
                        cnt = 0;
                        sb.append("\n");
                    }
                    sb.append("--------------------------------------------------------------------------------\n");
                } else if(word.equals("")) {
                } else {
                    if(cnt + word.length() <= 80)
                        cnt += word.length();
                    else {
                        cnt = word.length();
                        sb.append("\n");
                    }
                    sb.append(word);
                    if(cnt < 80) {
                        sb.append(" ");
                        cnt++;
                    }
                }
            }
        }
        sb.append("\n");
        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}
