package boj.realize.prob;

import java.util.Scanner;

public class p2755 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		float score[] = new float[n];
		int sumgn = 0;
		for(int i=0; i<n; i++) {
			String sbj = sc.next();
			int gn = sc.nextInt();
			String grade = sc.next();
			if(grade.equals("A+"))
				score[i] = (float)(gn * 4.3);
			else if(grade.equals("A0"))
				score[i] = (float)(gn * 4.0);
			else if(grade.equals("A-"))
				score[i] = (float)(gn * 3.7);
			else if(grade.equals("B+"))
				score[i] = (float)(gn * 3.3);
			else if(grade.equals("B0"))
				score[i] = (float)(gn * 3.0);
			else if(grade.equals("B-"))
				score[i] = (float)(gn * 2.7);
			else if(grade.equals("C+"))
				score[i] = (float)(gn * 2.3);
			else if(grade.equals("C0"))
				score[i] = (float)(gn * 2.0);
			else if(grade.equals("C-"))
				score[i] = (float)(gn * 1.7);
			else if(grade.equals("D+"))
				score[i] = (float)(gn * 1.3);
			else if(grade.equals("D0"))
				score[i] = (float)(gn * 1.0);
			else if(grade.equals("D-"))
				score[i] = (float)(gn * 0.7);
			else
				score[i] = (float)0.0;
			sumgn += gn;
		}
		float sum = 0;
		for(int i=0; i<n; i++)
			sum += score[i];
		
		sum = (sum/sumgn)*100;
		sum = (float)(Math.round(sum) / 100.0);
		String ssum = String.valueOf(sum);
		int p = ssum.indexOf(".");
		if(ssum.length() - p == 2)
			System.out.println(sum + "0");
		else
			System.out.println(sum);

	}

}
