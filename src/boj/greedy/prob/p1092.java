package boj.greedy.prob;

import java.util.*;

public class p1092 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Integer a[] = new Integer[n];
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a, Collections.reverseOrder());

        int m = sc.nextInt();
        List<Integer> b = new ArrayList<>();
        for (int i=0; i<m; i++) {
            b.add(sc.nextInt());
        }
        Collections.sort(b, Collections.reverseOrder());

        if (a[0] < b.get(0)) {
            System.out.println(-1);
            return;
        }

        int cnt = 0;
        while (!b.isEmpty()) {
            int r = 0;
            for (int l=0; l<n;) {
                if (r == b.size()) {
                    break;
                }
                int target = b.get(r);
                if (a[l] >= target) {
                    b.remove(r);
                    l++;
                } else {
                    r++;
                }
            }
            cnt++;
        }
        System.out.println(cnt);
    }
}
