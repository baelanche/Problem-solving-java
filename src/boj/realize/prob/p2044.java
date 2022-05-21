package boj.realize.prob;

import java.util.*;

public class p2044 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int m = sc.nextInt();
        int n = sc.nextInt();
        char a[][] = new char[m][n];
        
        int edge = 0;
        for(int i=0; i<m; i++) {
            a[i] = sc.next().toCharArray();
            for(int j=0; j<n; j++)
                if(a[i][j] == '+') edge++;
        }
        
        Windows[] win = new Windows[edge/4];
        int tab = 0;
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(a[i][j] == '+') {
                    if(i+1 < m && a[i+1][j] == '|' && j+1 < n && a[i][j+1] == '-') {
                        int width = 0;
                        String title = "";
                        for(int k=j; true; k++) {
                            width++;
                            if(a[i][k] >= 'a' && a[i][k] <= 'z')
                                title += a[i][k];
                            if(k != j && a[i][k] == '+') break;
                        }
                        int height = 0;
                        for(int k=i; true; k++) {
                            height++;
                            if(k != i && a[k][j] == '+') break;
                        }
                        win[tab] = new Windows(i, j, title, width, height);
                        tab++;
                    }
                }
            }
        }
        
        Arrays.sort(win, new Comparator<Windows>() {
           public int compare(Windows o1, Windows o2) {
               int len = Math.min(o1.title.length(), o2.title.length());
               for(int i=0; i<len; i++) {
                   if(o1.title.charAt(i) != o2.title.charAt(i))
                       return o1.title.charAt(i) - o2.title.charAt(i);
               }
               return 1;
           } 
        });
        
        char[][] cascade = new char[m][n];
        for(int i=0; i<m; i++)
            Arrays.fill(cascade[i], '.');
        
        int sx = 0;
        int sy = 0;
        for(int i=0; i<win.length; i++) {
            int x = win[i].x;
            int y = win[i].y;
            int width = win[i].width;
            int height = win[i].height;
            int dx = sx;
            int dy = sy;
            for(int j=x; j<x+height; j++) {
                dy = sy;
                for(int k=y; k<y+width; k++) {
                    cascade[dx][dy] = a[j][k];
                    dy++;
                }
                dx++;
            }
            sx++;
            sy++;
        }
        
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++)
                System.out.print(cascade[i][j]);
            System.out.println();
        }
    }
    
    static class Windows {
        int x;
        int y;
        String title;
        int width;
        int height;
        
        Windows(int x, int y, String title, int width, int height) {
            this.x = x;
            this.y = y;
            this.title = title;
            this.width = width;
            this.height = height;
        }
    }
}