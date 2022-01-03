package boj.math.prob;

import java.util.*;

public class p1002
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) 
        {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int r1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int r2 = sc.nextInt();
			double d = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
            if (r1 > r2)
            {
                int temp = r1;
                r1 = r2;
                r2 = temp;
            }
            if (r2 - r1 < d && d < r2 + r1)
            {
                System.out.println(2);
            }
            else if (r1 + r2 == d)
            {
                System.out.println(1);
            }
            else if (r2 - r1 == d && d != 0)
            {
                System.out.println(1);
            }
            else if (r1 + r2 < d || r2 - r1 > d)
            {
                System.out.println(0);
            }
            else if (d == 0)
            {
                if (r1 == r2)
                    System.out.println(-1);
            }
		}
    }
}