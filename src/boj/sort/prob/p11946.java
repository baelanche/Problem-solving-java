package boj.sort.prob;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class p11946 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int q = sc.nextInt();
        
        int t[][] = new int[n+1][m+1];
        Team team[] = new Team[n+1];
        for(int i=0; i<=n; i++)
            team[i] = new Team(i, 0, 0);
        
        for(int i=0; i<q; i++) {
            int elapsed = sc.nextInt();
            int teamNo = sc.nextInt();
            int problem = sc.nextInt();
            String result = sc.next();
            
            if(result.equals("WA") || result.equals("RE") || result.equals("TLE"))
                t[teamNo][problem] += 20;
            
            else {
                if(t[teamNo][problem] >= 50000) continue;
                team[teamNo].solve++;
                team[teamNo].time += elapsed + t[teamNo][problem];
                t[teamNo][problem] = 50000;
            }
        }
        
        Arrays.sort(team, new Comparator<Team>() {
           public int compare(Team t1, Team t2) {
               if(t1.solve > t2.solve) {
                   return -1;
               } else if(t1.solve == t2.solve) {
                   return t1.time - t2.time;
               }
               return 1;
           } 
        });
        
        for(int i=0; i<=n; i++) {
            if(team[i].no == 0) continue;
            System.out.println(team[i].no + " " + team[i].solve + " " + team[i].time);
        }
    }
    
    static class Team {
        int no;
        int solve;
        int time;
        
        Team(int no, int solve, int time) {
            this.no = no;
            this.solve = solve;
            this.time = time;
        }
    }
}
