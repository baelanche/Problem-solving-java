package boj.realize.prob;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class p16235 {

	public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int a[][] = new int[n+1][n+1]; //초기 양분
        int energy[][] = new int[n+1][n+1]; //추가 양분
        PriorityQueue<Integer> list[][] = new PriorityQueue[n+1][n+1]; //나무
        int dead[][] = new int[n+1][n+1]; //죽은 나무
        Queue<Integer> temp = new LinkedList<Integer>(); //나무 저장할 임시 리스트
        int dx[] = {-1, -1, -1, 0, 0, 1, 1, 1};
        int dy[] = {-1, 0, 1, -1, 1, -1, 0, 1};
        
        for(int i=1; i<=n; i++)
            for(int j=1; j<=n; j++)
                list[i][j] = new PriorityQueue<Integer>();
        
        for(int i=1; i<=n; i++)
            for(int j=1; j<=n; j++)
                a[i][j] = 5;
        
        for(int i=1; i<=n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<=n; j++)
                energy[i][j] = Integer.parseInt(st.nextToken());
        }
        
        for(int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());
            list[x][y].add(z);
        }
        
        while(k-->0) {
            //spring
            for(int i=1; i<=n; i++) {
                for(int j=1; j<=n; j++) {
                    while(!list[i][j].isEmpty()) {
                        int z = list[i][j].poll();
                        if(a[i][j] >= z) {
                            a[i][j] -= z;
                            temp.add(z+1);
                        } else
                            dead[i][j] += z/2;
                    }
                    list[i][j].addAll(temp);
                    temp.clear();
                }
            }
            
            //summer
            for(int i=1; i<=n; i++)
                for(int j=1; j<=n; j++) {
                    a[i][j] += dead[i][j];
                    dead[i][j] = 0;
                }
            
            //autumn
            for(int i=1; i<=n; i++) {
                for(int j=1; j<=n; j++) {
                    while(!list[i][j].isEmpty()) {
                        int z = list[i][j].poll();
                        temp.add(z);
                        if(z % 5 == 0) {
                            for(int q=0; q<8; q++) {
                                int nx = i + dx[q];
                                int ny = j + dy[q];
                                if(1 <= nx && nx <= n && 1 <= ny && ny <= n)
                                    list[nx][ny].add(1);
                            }
                        }
                    }
                    list[i][j].addAll(temp);
                    temp.clear();
                    //winter
                    a[i][j] += energy[i][j];
                }
            }
        }
        
        int cnt = 0;
        for(int i=1; i<=n; i++)
            for(int j=1; j<=n; j++)
                cnt += list[i][j].size();
        
        System.out.println(cnt);
    }
}
