package boj.sort.prob;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class p10825 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        Student s[] = new Student[n];
        for(int i=0; i<n; i++)
            s[i] = new Student(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        
        Arrays.sort(s, new Comparator<Student>() {
            public int compare(Student o1, Student o2) {
                if(o1.korean < o2.korean) return 1;
                else if(o1.korean > o2.korean) return -1;
                else {
                    if(o1.english < o2.english) return -1;
                    else if(o1.english > o2.english) return 1;
                    else {
                        if(o1.math < o2.math) return 1;
                        else if(o1.math > o2.math) return -1;
                        else {
                            int len = Math.min(o1.name.length(), o2.name.length());
                            for(int i=0; i<len; i++)
                                if(o1.name.charAt(i) != o2.name.charAt(i))
                                    return o1.name.charAt(i) - o2.name.charAt(i);
                        }
                    }
                }
                return 0;
            }
        });
        
        for(int i=0; i<n; i++)
            System.out.println(s[i].name);
    }
    
    static class Student {
        String name;
        int korean;
        int english;
        int math;
        
        Student(String name, int korean, int english, int math) {
            this.name = name;
            this.korean = korean;
            this.english = english;
            this.math = math;
        }
    }
}
