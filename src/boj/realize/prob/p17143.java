package boj.realize.prob;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class p17143 {

	static int R;
    static int C;
    static int m;
    static Shark a[][];
    static ArrayList<Shark> list = new ArrayList<Shark>();
    static int sum = 0;
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        a = new Shark[R+1][C+1];
        
        for(int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());
            a[r][c] = new Shark(s, d, z);
        }
        
        dfs(0);
        System.out.println(sum);
    }
    
    public static void dfs(int human) {
        human++;
        if(human > C) return;
        
        for(int i=0; i<=R; i++) {
            if(a[i][human] != null) {
                sum += a[i][human].z;
                a[i][human] = null;
                break;
            }
        }
        
        for(int i=0; i<=R; i++) {
            for(int j=0; j<=C; j++) {
                if(a[i][j] != null)
                    moveShark(i, j, a[i][j]);
            }
        }
        setShark();
        dfs(human);
    }
    
    public static void moveShark(int r, int c, Shark s) {
        if(s.d == 1 || s.d == 2) {
            boolean up;
            if(s.d == 1) up = true;
            else up = false;
            
            int pos = r;
            for(int i=0; i<s.s; i++) {
                if(up) pos -= 1;
                else pos += 1;
                if(pos == 0) {
                    up = false;
                    pos = 2;
                }
                else if(pos == R+1) {
                    up = true;
                    pos = R-1;
                }
            }
            int d = 0;
            if(up) d = 1;
            else d = 2;
            list.add(new Shark(pos, c, s.s, d, s.z));
        }
        
        if(s.d == 3 || s.d == 4) {
            boolean right;
            if(s.d == 3) right = true;
            else right = false;
            
            int pos = c;
            for(int i=0; i<s.s; i++) {
                if(right) pos += 1;
                else pos -= 1;
                if(pos == C+1) {
                    right = false;
                    pos = C-1;
                }
                else if(pos == 0) {
                    right = true;
                    pos = 2;
                }
            }
            int d = 0;
            if(right) d = 3;
            else d = 4;
            list.add(new Shark(r, pos, s.s, d, s.z));
        }
    }
    
    public static void setShark() {
        for(int i=1; i<=R; i++)
            for(int j=1; j<=C; j++)
                a[i][j] = null;
        
        if(list.size() == 0) return;
        for(int i=0; i<list.size(); i++) {
            int r = list.get(i).r;
            int c = list.get(i).c;
            int s = list.get(i).s;
            int d = list.get(i).d;
            int z = list.get(i).z;
            if(a[r][c] == null)
                a[r][c] = new Shark(s, d, z);
            else {
                if(a[r][c].z < z)
                    a[r][c] = new Shark(s, d, z);
            }
        }
        list.clear();
    }
    
    static class Shark {
        int r;
        int c;
        int s;
        int d;
        int z;
        
        Shark(int s, int d, int z) {
            this.s = s;
            this.d = d;
            this.z = z;
        }
        
        Shark(int r, int c, int s, int d, int z) {
            this.r = r;
            this.c = c;
            this.s = s;
            this.d = d;
            this.z = z;
        }
    }
}
