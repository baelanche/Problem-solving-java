package icpc.inha;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class D {

	static int n;
	static int m;
	static char a[][];
	static int dx[] = {-1, 0, 1, 0};
	static int dy[] = {0, 1, 0, -1};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		a = new char[n][m];
		for(int i=0; i<n; i++) {
			char c[] = br.readLine().toCharArray();
			for(int j=0; j<c.length; j++)
				a[i][j] = c[j];
		}
		
		
	}
	
	public static void bfs() {
		Queue<Box> q = new LinkedList<Box>();
		q.add(new Box(1, 1, 0));
		
		while(!q.isEmpty()) {
			Box b = q.poll();
			int x = b.x;
			int y = b.y;
			int hole = b.hole;
			for(int i=0; i<4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				if(nx >= 1 && nx < n && a[nx][ny] != '#') {
					
				}
			}
		}
	}
	
	public static int role(int pos, int hole) {
		if(pos == 0) {
			if(hole == 0) return 1;
			if(hole == 1) return 2;
			if(hole == 2) return 3;
			if(hole == 3) return 0;
			if(hole == 4) return 2;
			//if(hole == 5)
		}
		return 0;
	}

	static class Box {
		int x;
		int y;
		int hole;
		
		Box(int x, int y, int hole) {
			this.x = x;
			this.y = y;
			this.hole = hole;
		}
	}
}

