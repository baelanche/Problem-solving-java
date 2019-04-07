package collection;

import java.util.ArrayList;
import java.util.Collections;

public class Graph {

	int n;
	ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
	ArrayList<Boolean> visited = new ArrayList<Boolean>();
	
	Graph(int n) {
		ArrayList<Integer> temp = new ArrayList<Integer>();
		this.n = n;
		for(int i=0; i<n; i++)
			temp.add(0);
		for(int i=0; i<n; i++)
			adj.add(temp);
	}
	
	//간선 추가
	void addEdge(int u, int v) {
		adj.get(u).set(v, v);
		System.out.println(adj);
	}
	
	//정점 번호 정렬
	void sortList() {
		for(int i=0; i<n; i++)
			Collections.sort(adj.get(i));
	}
	
	void dfs() {
		for(int i=0; i<n; i++)
			visited.add(false);
		dfs(0);
	}
	
	private void dfs(int curr) {
		visited.set(curr, true);
		System.out.println("node " + curr + " visited");
		for(int next : adj.get(curr))
			if(!visited.get(next)) dfs(next);
	}
	
	public static void main(String[] args) {
		Graph g = new Graph(9);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 3);
		g.addEdge(1, 5);
		//g.addEdge(3, 4);
		//g.addEdge(4, 5);
		//g.addEdge(2, 6);
		//g.addEdge(2, 8);
		//g.addEdge(6, 7);
		//g.addEdge(6, 8);
		g.dfs();
	}
}
