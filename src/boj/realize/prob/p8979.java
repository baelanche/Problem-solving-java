package boj.realize.prob;

import java.util.Scanner;

public class p8979 {

	static class Country {
        int rank;
        int num;
        int gold;
        int silver;
        int bronze;
        
        Country(int num, int gold, int silver, int bronze) {
            this.num = num;
            this.gold = gold;
            this.silver = silver;
            this.bronze = bronze;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        Country ca[] = new Country[n];
        for(int i=0; i<n; i++) {
            Country c = new Country(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
            ca[i] = c;
        }
        
        sort(ca);
        setRank(ca);
        
        System.out.println(getRank(ca, k));
        sc.close();
    }
    
    public static void sort(Country[] ca) {
        for(int i=1; i<ca.length; i++) {
            for(int j=1; j<ca.length; j++) {
                if(ca[j-1].gold < ca[j].gold) {
                    Country tmp = ca[j-1];
                    ca[j-1] = ca[j];
                    ca[j] = tmp;
                } else if(ca[j-1].gold == ca[j].gold && ca[j-1].silver < ca[j].silver) {
                    Country tmp = ca[j-1];
                    ca[j-1] = ca[j];
                    ca[j] = tmp;
                } else if(ca[j-1].gold == ca[j].gold && ca[j-1].silver == ca[j].silver && ca[j-1].bronze < ca[j].bronze) {
                    Country tmp = ca[j-1];
                    ca[j-1] = ca[j];
                    ca[j] = tmp;
                }
            }
        }
    }
    
    public static void setRank(Country[] ca) {
        int rank = 1;
        for(int i=0; i<ca.length; i++) {
            ca[i].rank = rank;
            if(i-1 > 0 && ca[i].gold == ca[i-1].gold && ca[i].silver == ca[i-1].silver && ca[i].bronze == ca[i-1].bronze)
                ca[i].rank = ca[i-1].rank;
            rank++;
        }
    }
    
    public static int getRank(Country[] ca, int k) {
        for(int i=0; i<ca.length; i++) {
            if(ca[i].num == k)
                return ca[i].rank;
        }
        return 0;
    }
}
