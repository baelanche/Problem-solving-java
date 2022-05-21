package boj.collection.prob;

import java.util.*;
import java.io.*;

public class p1406 {
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String s = br.readLine();
        int n = Integer.parseInt(br.readLine());
        
        Stack<Character> s1 = new Stack<Character>();
        Stack<Character> s2 = new Stack<Character>();
        
        for(int i=0; i<s.length(); i++)
        	s1.add(s.charAt(i));
        
        while(n-->0) {
        	char temp[] = br.readLine().toCharArray();
        	if(temp[0] == 'L') {
        		if(!s1.isEmpty())
        			s2.add(s1.pop());
        	}
        	if(temp[0] == 'D') {
        		if(!s2.isEmpty())
        			s1.add(s2.pop());
        	}
        	if(temp[0] == 'B') {
        		if(!s1.isEmpty())  
        			s1.pop();
        	}
        	if(temp[0] == 'P') {
        		s1.add(temp[2]);
        	}
        }
        
        StringBuilder sb = new StringBuilder();
        while(!s2.isEmpty())
        	s1.add(s2.pop());
        while(!s1.isEmpty())
        	sb.append(s1.pop());
        System.out.print(sb.reverse());
    }
}