package boj.bruteforce.prob;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p14500 {

static int a[][];
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        a = new int[n][m];
        
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<m; j++)
                a[i][j] = Integer.parseInt(st.nextToken());
        }
        
        int max = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(i+1 < n && j+2 < m) {
                    /* けけ
                     *   けけ
                     */
                    int sum = a[i][j] + a[i][j+1] + a[i+1][j+1] + a[i+1][j+2];
                    max = Math.max(max, sum);
                    /*   けけ
                     * けけ
                     */
                    sum = a[i][j+1] + a[i][j+2] + a[i+1][j] + a[i+1][j+1];
                    max = Math.max(max, sum);
                    /* けけけ
                     * け
                     */
                    sum = a[i][j] + a[i][j+1] + a[i][j+2] + a[i+1][j];
                    max = Math.max(max, sum);
                    /* けけけ
                     *     け
                     */
                    sum = a[i][j] + a[i][j+1] + a[i][j+2] + a[i+1][j+2];
                    max = Math.max(max, sum);
                    /* け
                     * けけけ
                     */
                    sum = a[i][j] + a[i+1][j] + a[i+1][j+1] + a[i+1][j+2];
                    max = Math.max(max, sum);
                    /*     け
                     * けけけ
                     */
                    sum = a[i][j+2] + a[i+1][j] + a[i+1][j+1] + a[i+1][j+2];
                    max = Math.max(max, sum);
                    /*   け
                     * けけけ
                     */
                    sum = a[i][j+1] + a[i+1][j] + a[i+1][j+1] + a[i+1][j+2];
                    max = Math.max(max, sum);
                    /* けけけ
                     *   け
                     */
                    sum = a[i][j] + a[i][j+1] + a[i+1][j+1] + a[i][j+2];
                    max = Math.max(max, sum);
                }
                if(i+2 < n && j+1 < m) {
                    /* け
                     * けけ
                     *   け
                     */
                    int sum = a[i][j] + a[i+1][j] + a[i+1][j+1] + a[i+2][j+1];
                    max = Math.max(max, sum);
                    /*   け
                     * けけ
                     * け
                     */
                    sum = a[i][j+1] + a[i+1][j] + a[i+1][j+1] + a[i+2][j];
                    max = Math.max(max, sum);
                    /* け
                     * け
                     * けけ
                     */
                    sum = a[i][j] + a[i+1][j] + a[i+2][j] + a[i+2][j+1];
                    max = Math.max(max, sum);
                    /*   け
                     *   け
                     * けけ
                     */
                    sum = a[i][j+1] + a[i+1][j+1] + a[i+2][j] + a[i+2][j+1];
                    max = Math.max(max, sum);
                    /* けけ
                     * け
                     * け
                     */
                    sum = a[i][j] + a[i][j+1] + a[i+1][j] + a[i+2][j];
                    max = Math.max(max, sum);
                    /* けけ
                     *   け
                     *   け
                     */
                    sum = a[i][j] + a[i][j+1] + a[i+1][j+1] + a[i+2][j+1];
                    max = Math.max(max, sum);
                    /* け
                     * けけ
                     * け
                     */
                    sum = a[i][j] + a[i+1][j] + a[i+1][j+1] + a[i+2][j];
                    max = Math.max(max, sum);
                    /*   け
                     * けけ
                     *   け
                    */
                    sum = a[i][j+1] + a[i+1][j] + a[i+1][j+1] + a[i+2][j+1];
                    max = Math.max(max, sum);
                }
                if(j+3 < m) {
                    /* けけけけ
                     */
                    int sum = a[i][j] + a[i][j+1] + a[i][j+2] + a[i][j+3];
                    max = Math.max(max, sum);
                }
                if(i+3 < n) {
                    /* け
                     * け
                     * け
                     * け
                     */
                    int sum = a[i][j] + a[i+1][j] + a[i+2][j] + a[i+3][j];
                    max = Math.max(max, sum);
                }
                if(i+1 < n && j+1 < m) {
                    /* けけ
                     * けけ
                     */
                    int sum = a[i][j] + a[i+1][j] + a[i][j+1] + a[i+1][j+1];
                    max = Math.max(max, sum);
                }
            }
        }
        System.out.println(max);
    }	
}
