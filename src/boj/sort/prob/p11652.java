package boj.sort.prob;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class p11652 {

	public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        Map<Long, Integer> map = new HashMap<Long, Integer>();
        for(int i=0; i<n; i++) {
            long temp = Long.parseLong(br.readLine());
            if(map.containsKey(temp)) map.put(temp, map.get(temp) + 1);
            else map.put(temp, 1);
        }
        
        List<Map.Entry<Long, Integer>> list = new ArrayList<Map.Entry<Long, Integer>>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Long, Integer>>() {
            public int compare(Map.Entry<Long, Integer> o1, Map.Entry<Long, Integer> o2) {
                if(o1.getValue() < o2.getValue()) return 1;
                else if(o1.getValue() > o2.getValue()) return -1;
                else {
                    if(o1.getKey() < o2.getKey()) return -1;
                    else if(o1.getKey() > o2.getKey()) return 1;
                }
                return 0;
            }
        });
        
        System.out.println(list.get(0).getKey());
    }
}
