package boj.bfs.prob;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class p6593 {

	static int l = 1;
    static int r = 1;
    static int c = 1;
    static char[][][] a;
    static int distance[][][];
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        while(true) {
            l = scan.nextInt();
            r = scan.nextInt();
            c = scan.nextInt();
            if(l == 0 && r == 0 && c == 0) break;
            int sl = 0, sr = 0, sc = 0, gl = 0, gr = 0, gc = 0;
            a = new char[l][r][c];
            for(int i=0; i<l; i++) {
                for(int j=0; j<r; j++) {
                    a[i][j] = scan.next().toCharArray();
                    for(int k=0; k<c; k++) {
                        if(a[i][j][k] == 'S') {
                            sl = i;
                            sr = j;
                            sc = k;
                        }
                        if(a[i][j][k] == 'E') {
                            gl = i;
                            gr = j;
                            gc = k;
                        }
                    }
                }
            }
            bfs(sl, sr, sc);
            System.out.println(distance[gl][gr][gc] == 0 ? "Trapped!" : "Escaped in " + distance[gl][gr][gc] + " minute(s).");
        }
    }
    
    public static void bfs(int x, int y, int z) {
        boolean visited[][][] = new boolean[l][r][c];
        distance = new int[l][r][c];
        Queue<Pair> q = new LinkedList<Pair>();
        
        q.offer(new Pair(x, y, z));
        distance[x][y][z] = 0;
        visited[x][y][z] = true;
        int ml[] = {0, 0, 0, 0, -1, 1};
        int mr[] = {0, 0, 1, -1, 0, 0};
        int mc[] = {1, -1, 0, 0, 0, 0};
        while(!q.isEmpty()) {
            Pair point = q.poll();
            int pl = point.getX();
            int pr = point.getY();
            int pc = point.getZ();
            for(int i=0; i<6; i++) {
                int nl = pl + ml[i];
                int nr = pr + mr[i];
                int nc = pc + mc[i];
                if(0 <= nl && nl < l && 0 <= nr && nr < r && 0 <= nc && nc < c) {
                    if((a[nl][nr][nc] == '.' || a[nl][nr][nc] == 'E') && !visited[nl][nr][nc]) {
                        visited[nl][nr][nc] = true;
                        q.offer(new Pair(nl, nr, nc));
                        distance[nl][nr][nc] = distance[pl][pr][pc] + 1;
                    }
                }
            }
        }
    }
    
    static class Pair {
        int x;
        int y;
        int z;
        
        Pair(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
        
        int getX() {
            return x;
        }
        int getY() {
            return y;
        }
        int getZ() {
            return z;
        }
    }
}
