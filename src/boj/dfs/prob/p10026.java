package boj.dfs.prob;

import java.util.Scanner;

public class p10026 {

	static int n;
    static String a[][];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        a = new String[n][n];
        
        for(int i=0; i<n; i++) {
            String rgb = sc.next();
            for(int j=0; j<n; j++) {
                a[i][j] = String.valueOf(rgb.charAt(j));
            }
        }
        
        int p1 = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(a[i][j].equals("R")) {
                    dfs(i, j, "R");
                    p1++;
                } else if(a[i][j].equals("G")) {
                    dfs(i, j, "G");
                    p1++;
                } else if(a[i][j].equals("B")) {
                    dfs(i, j, "B");
                    p1++;
                }
            }
        }
        
        int p2 = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(a[i][j].equals("0")) {
                    dfs(i, j, "0");
                    p2++;
                } else if(a[i][j].equals("1")) {
                    dfs(i, j, "1");
                    p2++;
                }
            }
        }
        System.out.println(p1 + " " + p2);
        sc.close();
    }
    
    public static void dfs(int x, int y, String rgb) {
        int mx[] = {0, 1, 0, -1};
        int my[] = {1, 0, -1, 0};
        for(int i=0; i<4; i++) {
            int nx = x + mx[i];
            int ny = y + my[i];
            if(0 <= nx && nx < n && 0 <= ny && ny < n) {
                if(rgb.equals("R")) {
                    a[x][y] = "0";
                    if(!a[nx][ny].equals("R") && i < 3) continue;
                    if(!a[nx][ny].equals("R") && i == 3) return;
                } else if(rgb.equals("G")) {
                    a[x][y] = "0";
                    if(!a[nx][ny].equals("G") && i < 3) continue;
                    if(!a[nx][ny].equals("G") && i == 3) return;
                } else if(rgb.equals("B")) {
                    a[x][y] = "1";
                    if(!a[nx][ny].equals("B") && i < 3) continue;
                    if(!a[nx][ny].equals("B") && i == 3) return;
                } else if(rgb.equals("0")) {
                    a[x][y] = "-1";
                    if(!a[nx][ny].equals("0") && i < 3) continue;
                    if(!a[nx][ny].equals("0") && i == 3) return;
                } else if(rgb.equals("1")) {
                    a[x][y] = "-1";
                    if(!a[nx][ny].equals("1") && i < 3) continue;
                    if(!a[nx][ny].equals("1") && i == 3) return;
                }
                dfs(nx, ny, rgb);
            }
        }
    }
}
