package boj.backtrac.prob;

import java.util.Arrays;
import java.util.Scanner;

public class p1759 {

	static int l;
    static int c;
    static char a[];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        l = sc.nextInt();
        c = sc.nextInt();
        a = new char[c];
        sc.nextLine();
        a = sc.nextLine().replaceAll(" ", "").toCharArray();
        
        Arrays.sort(a);
        dfs(0, (char)0, "", 0, 0);
    }
    
    public static void dfs(int cnt, char ch, String dic, int con, int vow) {
        if(cnt == l && con >= 2 && vow >= 1) {
            System.out.println(dic);
            return;
        }
        
        for(int i=0; i<c; i++)
            if(a[i] > ch) {
                if(a[i] == 'a' || a[i] == 'e' || a[i] == 'i' || a[i] == 'o' || a[i] == 'u')
                    dfs(cnt + 1, a[i], dic + a[i], con, vow + 1);
                else
                    dfs(cnt + 1, a[i], dic + a[i], con + 1, vow);
            }
    }
}
