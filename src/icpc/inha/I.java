package icpc.inha;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class I {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char c[] = br.readLine().toCharArray();
		int ud[] = new int[c.length];
		for(int i=0; i<c.length; i++) {
			if(c[i] < 97) ud[i] = 1; //upper
			else ud[i] = 0; //lower
		}
		
		int isud = 0;
		int cnt = c.length;
		for(int i=0; i<c.length; i++) {
			if(isud == ud[i]) continue;
			if(isud != ud[i]) {
				if(i+1 < c.length && ud[i+1] != ud[i])
					cnt++;
				if(i+1 >= c.length) cnt++;
				if(i+1 < c.length && ud[i+1] == ud[i]) {
					cnt++;
					isud = isud == 1 ? 0 : 1;
				}
			}
		}
		System.out.println(cnt);
	}
	
}
