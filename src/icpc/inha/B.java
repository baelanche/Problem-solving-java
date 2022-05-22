package icpc.inha;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		float sum = 0.0f;
		float ret = 0.0f;
		for(int i=0; i<20; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String sub = st.nextToken();
			float score = Float.parseFloat(st.nextToken());
			String grade = st.nextToken();
			if(grade.charAt(0) == 'P') continue;
			sum += score;
			float f = 0.0f;
			if(grade.charAt(0) == 'A') {
				if(grade.charAt(1) == '+')
					f = 4.5f;
				else f = 4.f;
			}
			if(grade.charAt(0) == 'B') {
				if(grade.charAt(1) == '+')
					f = 3.5f;
				else f = 3.0f;
			}
			if(grade.charAt(0) == 'C') {
				if(grade.charAt(1) == '+')
					f = 2.5f;
				else f = 2.0f;
			}
			if(grade.charAt(0) == 'D') {
				if(grade.charAt(1) == '+')
					f = 1.5f;
				else f = 1.0f;
			}
			ret += score * f;
		}
		System.out.println(ret/sum);
		
	}
}
