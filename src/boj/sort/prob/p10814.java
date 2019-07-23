package boj.sort.prob;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class p10814 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        Member m[] = new Member[n];
        for(int i=0; i<n; i++)
            m[i] = new Member(sc.nextInt(), sc.next());
        
        Arrays.sort(m, new Comparator<Member>() {
           public int compare(Member o1, Member o2) {
               if(o1.age < o2.age) return -1;
               else if(o1.age == o2.age) return 0;
               return 1;
           } 
        });
        
        for(int i=0; i<n; i++)
            System.out.print(m[i].age + " " + m[i].name + "\n");
    }
    
    static class Member {
        int age;
        String name;
        
        Member(int age, String name) {
            this.age = age;
            this.name = name;
        }
    }
}
