package boj.bruteforce.prob;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class p15683 {

	static int n;
    static int m;
    static ArrayList<Camera> cctv = new ArrayList<Camera>();
    static int ans = Integer.MAX_VALUE;
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int a[][] = new int[n][m];
        
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<m; j++) {
                a[i][j] = Integer.parseInt(st.nextToken());
                if(a[i][j] != 0 && a[i][j] != 6) cctv.add(new Camera(i, j, a[i][j]));
            }
        }
        
        bruteforce(0, 0, a);
        System.out.println(ans);
    }
    
    public static void bruteforce(int idx, int cnt, int a[][]) {
        if(cnt == cctv.size()) {
            int c = 0;
            for(int i=0; i<n; i++)
                for(int j=0; j<m; j++)
                    if(a[i][j] == 0)
                        c++;
            
            ans = Math.min(ans, c);
            return;
        }
        
        int temp[][] = new int[n][m];
        
        for(int i=idx; i<cctv.size(); i++) {
            int no = cctv.get(i).no;
            
            if(no == 1) {
                for(int j=0; j<4; j++) {
                    for(int k=0; k<n; k++)
                        for(int l=0; l<m; l++)
                            temp[k][l] = a[k][l];
                    camera(cctv.get(i), j, temp);
                    bruteforce(i+1, cnt+1, temp);
                }
            }
            if(no == 2) {
                for(int j=0; j<2; j++) {
                    for(int k=0; k<n; k++)
                        for(int l=0; l<m; l++)
                            temp[k][l] = a[k][l];
                    camera(cctv.get(i), j, temp);
                    camera(cctv.get(i), j+2, temp);
                    bruteforce(i+1, cnt+1, temp);
                }
            }
            if(no == 3) {
                for(int j=0; j<4; j++) {
                    for(int k=0; k<n; k++)
                        for(int l=0; l<m; l++)
                            temp[k][l] = a[k][l];
                    camera(cctv.get(i), j, temp);
                    camera(cctv.get(i), (j+1)%4, temp);
                    bruteforce(i+1, cnt+1, temp);
                }
            }
            if(no == 4) {
                for(int j=0; j<4; j++) {
                    for(int k=0; k<n; k++)
                        for(int l=0; l<m; l++)
                            temp[k][l] = a[k][l];
                    camera(cctv.get(i), j, temp);
                    camera(cctv.get(i), (j+1)%4, temp);
                    camera(cctv.get(i), (j+2)%4, temp);
                    bruteforce(i+1, cnt+1, temp);
                }
            }
            if(no == 5) {
                for(int j=0; j<4; j++) {
                    for(int k=0; k<n; k++)
                        for(int l=0; l<m; l++)
                            temp[k][l] = a[k][l];
                    camera(cctv.get(i), 0, temp);
                    camera(cctv.get(i), 1, temp);
                    camera(cctv.get(i), 2, temp);
                    camera(cctv.get(i), 3, temp);
                    bruteforce(i+1, cnt+1, temp);
                }
            }
        }
    }
    
    /* d
     * 0 : 위
     * 1 : 우측
     * 2 : 아래
     * 3 : 좌측
     * */
    public static void camera(Camera c, int d, int a[][]) {
        int x = c.r;
        int y = c.c;
        if(d == 0) {
            while(x >= 0) {
                if(a[x][y] == 6) break;
                a[x][y] = 7;
                x--;
            }
        }
        if(d == 1) {
            while(y < m) {
                if(a[x][y] == 6) break;
                a[x][y] = 7;
                y++;
            }
        }
        if(d == 2) {
            while(x < n) {
                if(a[x][y] == 6) break;
                a[x][y] = 7;
                x++;
            }
        }
        if(d == 3) {
            while(y >= 0) {
                if(a[x][y] == 6) break;
                a[x][y] = 7;
                y--;
            }
        }
    }
    
    static class Camera {
        int r;
        int c;
        int no;
        
        Camera(int r, int c, int no) {
            this.r = r;
            this.c = c;
            this.no = no;
        }
    }
}
