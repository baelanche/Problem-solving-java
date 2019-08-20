package boj.divide.prob;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class p10816 {

	public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int n = Integer.parseInt(br.readLine());
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            int num = Integer.parseInt(st.nextToken());
            if(map.get(num) == null) map.put(num, 1);
            else map.put(num, map.remove(num) + 1);
        }
        
        TreeMap<Integer, Integer> sort = new TreeMap<Integer, Integer>(map);
        Iterator<Integer> it = sort.keySet().iterator();
        LinkedHashMap<Integer, Integer> a = new LinkedHashMap<Integer, Integer>();
        while(it.hasNext()) {
            int key = it.next();
            a.put(key, sort.get(key));
        }
        
        int m = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<m; i++) {
            int key = Integer.parseInt(st.nextToken());
            if(a.get(key) == null) sb.append(0 + " ");
            else sb.append(a.get(key) + " ");
        }
        System.out.println(sb.toString());
    }
}
