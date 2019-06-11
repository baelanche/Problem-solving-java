package boj.bfs.prob;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class p1963 {

static boolean prime[] = new boolean[10000];
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        for(int i=2; i<10000; i++)
            for(int j=2; i*j<10000; j++)
                prime[i*j] = true;
        
        for(int i=0; i<1000; i++)
            prime[i] = true;
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        
        while(t-->0) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bfs(a, b);
        }
    }
    
    public static void bfs(int s, int e) {
        Queue<Integer> q = new LinkedList<Integer>();
        boolean visited[] = new boolean[10000];
        q.offer(s);
        
        int cnt = 0;
        boolean success = false;
        while(!q.isEmpty()) {
            int size = q.size();
            
            while(size-->0) {
                int pop = q.poll();
                visited[pop] = true;
                if(pop == e) {
                    success = true;
                    break;
                }
                
                for(int i=1; i<=4; i++) {
                    for(int j=0; j<=9; j++) {
                        int temp = convertNumber(pop, i, j);
                        if(primeCheck(temp) && !visited[temp])
                            q.offer(temp);
                    }
                }
            }
            if(success) break;
            else cnt++;
        }
        System.out.println(success == true ? cnt : "Impossible");
    }
    
    public static int convertNumber(int pop, int i, int j) {
        String temp = String.valueOf(pop);
        String prefix = temp.substring(0, i-1);
        String suffix = temp.substring(i, 4);
        return Integer.parseInt(prefix + j + suffix);
    }
    
    public static boolean primeCheck(int pop) {
        if(!prime[pop]) return true;
        else return false;
    }
}
