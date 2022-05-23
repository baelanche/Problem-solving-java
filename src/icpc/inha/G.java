package icpc.inha;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class G {

	static int n;
	static double cake[];
	static int ans = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		n = Integer.parseInt(br.readLine());
		cake = new double[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++)
			cake[i] = 1.0d/Double.parseDouble(st.nextToken());
		
		dfs(0, 0.0d);
		System.out.println(ans);
	}
	
	public static void dfs(int idx, double sum) {
		if(sum >= 99.0f/100.0d && sum <= 101.0f/100.0d) {
			ans++;
			return;
		}
		if(idx == n) return;
		dfs(idx+1, sum);
		dfs(idx+1, sum+cake[idx]);
	}
}
