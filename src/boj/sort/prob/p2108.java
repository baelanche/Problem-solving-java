package boj.sort.prob;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class p2108 {

	public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int a[] = new int[n];
        Pair fre[] = new Pair[8001];
        for(int i=-4000; i<fre.length/2+1; i++)
            fre[i+4000] = new Pair(i, 0);
        
        int sum = 0;
        int min = 4001;
        int max = -4001;
        for(int i=0; i<n; i++) {
            a[i] = Integer.parseInt(br.readLine());
            sum += a[i];
            min = a[i] < min ? a[i] : min;
            max = a[i] > max ? a[i] : max;
            fre[a[i] + 4000].cnt++;
        }
        
        Arrays.sort(a);
        Arrays.sort(fre);
        
        int second = fre[0].cnt == fre[1].cnt ? fre[1].x : fre[0].x;
        
        bw.write((Math.round((float)sum/n)) + "\n");
        bw.write(a[n/2] + "\n");
        bw.write(second + "\n");
        bw.write(max - min + "\n");
        bw.flush();
    }
    
    static class Pair implements Comparable<Pair> {
        int x;
        int cnt;
        
        Pair(int x, int cnt) {
            this.x = x;
            this.cnt = cnt;
        }
        
        public int compareTo(Pair o) {
            return o.cnt - this.cnt;
        }
    }
}
