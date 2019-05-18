package boj.sort.prob;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p10989 {

	public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int a[] = new int[10001];
        for(int i=0; i<n; i++) {
            int num = Integer.parseInt(br.readLine());
            a[num]++;
        }
        
        for(int i=1; i<=10000; i++) {
            for(int j=0; j<a[i]; j++) {
                bw.write(i + "\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
