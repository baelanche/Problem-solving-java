package boj.bfs.prob;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class p16236 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        
        int x = 0, y = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                a[i][j] = sc.nextInt();
                if(a[i][j] == 9) {
                    x = i;
                    y = j;
                }
            }
        }
        //처음 위치 저장
        
        int dx[] = {-1, 0, 1, 0};
        int dy[] = {0, -1, 0, 1};
        int size = 2; //아기 상어의 처음 크기
        int eat = 0; //물고기 잡아먹은 횟수
        int time = 0; //총 사냥 시간
        while(true) {
            Queue<Shark> q = new LinkedList<Shark>(); //BFS 할 큐
            ArrayList<Shark> fish = new ArrayList<Shark>(); //잡아먹을 물고기를 보관할 리스트
            boolean visited[][] = new boolean[n][n]; //방문 기록(반복문을 중지하기 위해 필요)
            
            q.offer(new Shark(x, y, 0));
            visited[x][y] = true;
            
            int find = -1; //물고기를 하나도 발견하지 못했다면 정지시키는 변수
            while(!q.isEmpty()) {
                Shark shark = q.poll();
                int sx = shark.x;
                int sy = shark.y;
                int move = shark.move;
                
                if(find == move) break; //아래 로직에서 물고기를 먹었다면 BFS를 종료시킨다
                
                for(int i=0; i<4; i++) {
                    int nx = sx + dx[i];
                    int ny = sy + dy[i];
                    if(0 <= nx && nx < n && 0 <= ny && ny < n) {
                        if(a[nx][ny] <= size && !visited[nx][ny]) {
                            if(0 < a[nx][ny] && a[nx][ny] < size) {
                                find = move + 1; //먹었다면 find 변수에 이동거리를 대입
                                fish.add(new Shark(nx, ny, move + 1)); //먹은 물고기 리스트에 추가
                            }
                            q.offer(new Shark(nx, ny, move + 1)); //BFS 큐에 추가
                            visited[nx][ny] = true;
                        }
                    }
                }
            }
            
            if(find == -1) break; //먹을 물고기가 없다면 로직을 종료시킨다
            else {
                Shark f = fish.get(0);
                for(int i=1; i<fish.size(); i++) {
                    if(f.x > fish.get(i).x) {
                        f = fish.get(i);
                        continue;
                    } else if(f.x == fish.get(i).x) {
                        if(f.y > fish.get(i).y) {
                            f = fish.get(i);
                        }
                    }
                }
                //잡아먹은 물고기가 여러마리라면 위 -> 왼쪽 물고기를 우선으로 먹게함

                time += find; //경과시간 변수에 이동거리를 더해준다
                a[x][y] = 0; //처음 아기상어의 위치 초기화
                a[f.x][f.y] = 9; //다시 BFS할 시작 위치를 물고기를 잡아먹은 위치로 지정함
                x = f.x;
                y = f.y;
                if(size == ++eat) {
                    size++;
                    eat = 0;
                }
                //상어의 크기가 잡아먹은 횟수와 같다면 크기를 키운다
            }
        }
        System.out.println(time);
    }
    
    static class Shark {
        int x;
        int y;
        int move;
        
        Shark(int x, int y, int move) {
            this.x = x;
            this.y = y;
            this.move = move;
        }
    }
}
