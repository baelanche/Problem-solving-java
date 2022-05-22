package icpc.inha;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class I {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char c[] = br.readLine().toCharArray();
		int ud[] = new int[c.length];
		for(int i=0; i<c.length; i++) {
			if(c[i] < 97) ud[i] = 1; //upper
			else ud[i] = 0; //lower
		}
		
		int cnt = c.length;
		ArrayList<Integer> list = new ArrayList<Integer>();
		int len = 0;
		for(int i=0; i<c.length; i++) {
			if(ud[i] == 1) len++;
			if(ud[i] == 0) {
				if(len > 0) list.add(len);
				len = 0;
			}
			if(i == c.length-1 && len > 0) {
				list.add(len);
				if(len > 1) cnt--;
			}
		}
		
		for(int e : list) {
			if(e == 1) cnt++;
			else cnt += 2;
		}
		System.out.println(cnt);
	}
	
}
