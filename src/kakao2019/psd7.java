package kakao2019;

import java.util.LinkedList;
import java.util.Queue;

public class psd7 {

	public static int answer = Integer.MAX_VALUE;
	
	public static void main(String[] args) {
		int[][] board = {{0, 0, 0, 1, 1},{0, 0, 0, 1, 0},{0, 1, 0, 1, 1},{1, 1, 0, 0, 1},{0, 0, 0, 0, 0}};
		
		bfs(board);
		System.out.println(answer);
	}
	
	public static void bfs(int[][] board) {
        Queue<Robot> q = new LinkedList<Robot>();
        
        q.offer(new Robot(0, 0, 0, 0));
        while(!q.isEmpty()) {
            int size = q.size();
            
            while(size-->0) {
                Robot p = q.poll();
                int x = p.x;
                int y = p.y;
                int wh = p.wh; //0 : 가로, 1 ; 세로
                int cnt = p.cnt;
                System.out.println(x + " " + y);
                if(wh == 0 && x+1 == board.length-1 && y == board.length-1) {
                    answer = Math.min(answer, cnt);
                    continue;
                } else if(wh == 1 && y+1 == board.length-1 && x == board.length-1) {
                    answer = Math.min(answer, cnt);
                    continue;
                }
                if(wh == 0) {
                    if(x + 2 < board.length && board[y][x+2] == 0)
                		q.offer(new Robot(x+1, y, 0, cnt+1));
                    if(y + 1 < board.length && board[y+1][x] == 0 && board[y+1][x+1] == 0) {
                		q.offer(new Robot(x, y+1, 0, cnt+1));
                		q.offer(new Robot(x+1, y, 1, cnt+1));
                    }
                } else {
                    if(x + 1 < board.length && board[y][x+1] == 0 && board[y+1][x+1] == 0) {
                        q.offer(new Robot(x+1, y, 1, cnt+1));
                        q.offer(new Robot(x, y+1, 0, cnt+1));
                    }
                    if(y + 2 < board.length && board[y+2][x] == 0)
                    	q.offer(new Robot(x, y+1, 1, cnt+1));
                }
            }
        }
    }
}

class Robot {
    int x;
    int y;
    int wh;
    int cnt;
    
    Robot(int x, int y, int wh, int cnt) {
        this.x = x;
        this.y = y;
        this.wh = wh;
        this.cnt = cnt;
    }
}
