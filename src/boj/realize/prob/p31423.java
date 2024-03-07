import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p31423 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        String[] univ = new String[N+1];
        int[] linked = new int[N+1];
        int[] block = new int[N+1];
        int last = 0;

        for (int i=1; i<=N; i++) {
            univ[i] = br.readLine();
            block[i] = i;
        }

        for (int i=0; i<N-1; i++) {
            st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());

            linked[block[l]] = r;
            block[l] = block[r];
            last = l;
        }

        while (last != 0) {
            sb.append(univ[last]);
            last = linked[last];
        }

        System.out.println(sb.toString());
    }
}
