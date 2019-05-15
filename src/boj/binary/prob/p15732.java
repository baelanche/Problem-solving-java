package boj.binary.prob;

import java.util.ArrayList;
import java.util.Scanner;

public class p15732 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        int d = sc.nextInt();
        ArrayList<Box> box = new ArrayList<Box>();
        
        for(int i=0; i<k; i++)
            box.add(new Box(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        
        int left = 1;
        int right = n;
        while(left <= right) {
            int mid = (left + right)/2;
            long cnt = 0;
            for(int i=0; i<box.size(); i++) {
                if(box.get(i).end <= mid)
                    cnt += (box.get(i).end - box.get(i).start)/box.get(i).unit + 1;
                else if(box.get(i).start > mid) continue;
                else
                    cnt += (mid - box.get(i).start) == 0 ? 1 : (mid - box.get(i).start)/box.get(i).unit + 1;
            }
            if(cnt >= d) right = mid - 1;
            else left = mid + 1;
        }
        System.out.println(left);
    }
    
    static class Box {
        int start;
        int end;
        int unit;
        
        Box(int start, int end, int unit) {
            this.start = start;
            this.end = end;
            this.unit = unit;
        }
    }
}
