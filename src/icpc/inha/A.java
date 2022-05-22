package icpc.inha;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		String s = br.readLine();
		char c = s.charAt(s.length()-1);
		if(c == 'q' || c == 'w' || c == 'e' || c == 'r' || c == 't' || c == 'a' || c == 's' || c == 'd' || c == 'f' || c == 'g' || c == 'z' || c == 'x' || c == 'c' || c == 'v')
			System.out.println(1);
		else System.out.println(0);
	}
}
