import java.io.*;
import java.util.*;

public class p7785 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        Set<String> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String act = st.nextToken();
            
            if (act.equals("enter")) {
                set.add(name);
            } else {
                set.remove(name);
            }
        }
        
        List<String> list = new ArrayList<>(set);
        Collections.sort(list, Collections.reverseOrder());
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            sb.append(it.next() + "\n");
        }
        System.out.println(sb.toString());
    }
}
