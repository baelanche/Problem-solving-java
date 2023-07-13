package boj.binary.prob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class p10815 {

	public static void main(String[] args) throws IOException {
        /**
         * 2019년 binary search 풀이
         */
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++) a[i] = sc.nextInt();
        Arrays.sort(a);

        StringBuilder sb = new StringBuilder();
        int m = sc.nextInt();
        while(m-->0) {
            int card = sc.nextInt();

            int left = 0;
            int right = n-1;

            while(left + 1 < right) {
                int mid = (left + right)/2;
                if(a[mid] <= card) left = mid;
                else right = mid;
            }
            if(left == n-2 && a[left+1] ==card) sb.append(1 + " ");
            else if (a[left] == card) sb.append(1 + " ");
            else sb.append(0 + " ");
        }
        System.out.println(sb.toString());

        /**
         * Map 풀이
         */
        /*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());

        Set<Integer> map = new HashSet<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<n; i++) {
            map.add(Integer.parseInt(st.nextToken()));
        }
        int m = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        for (int i=0; i<m; i++) {
            if (map.contains(Integer.parseInt(st.nextToken()))) {
                sb.append(1 + " ");
            } else {
                sb.append(0 + " ");
            }
        }
        System.out.println(sb.toString());
        */
    }
}
