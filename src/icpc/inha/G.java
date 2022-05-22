package icpc.inha;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class G {

	static int n;
	static float cake[];
	static int ans = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		n = Integer.parseInt(br.readLine());
		cake = new float[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			cake[i] = 1.0f/Float.parseFloat(st.nextToken());
		}
		
		dfs(0, 0.0f);
		System.out.println(ans);
	}
	
	public static void dfs(int idx, float sum) {
		if(sum >= 99.0f/100.0f && sum <= 101.0f/100.0f) {
			ans++;
			for(int i=idx; i<n; i++)
				dfs(idx+1, sum+cake[idx]);
			return;
		}
		if(idx == n) return;
		dfs(idx+1, sum);
		dfs(idx+1, sum+cake[idx]);
	}
}
