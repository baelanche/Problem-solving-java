package icpc.inha;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class H {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int a[] = new int[n];
		int ans[] = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		int min = a[0];
		for(int i=0; i<n; i++) {
			ans[i] = Math.max(ans[i], a[i] - min);
			if(i > 0) ans[i] = ans[i] < ans[i-1] ? ans[i-1] : ans[i];
			min = Math.min(min, a[i]);
		}
		
		for(int i=0; i<n; i++)
			System.out.print(ans[i] + " ");
	}
}
