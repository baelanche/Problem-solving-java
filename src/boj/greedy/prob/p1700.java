package boj.greedy.prob;

import java.util.Scanner;

public class p1700 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a[] = new int[k];
        int c[] = new int[n];
        for(int i=0; i<k; i++)
            a[i] = sc.nextInt();
        
        int cnt = 0;
        for(int i=0; i<k; i++) {
            for(int j=0; j<n; j++) {
                if(c[j] == 0) {
                    //플러그에 아무것도 안 꽂혀있다면
                    connectFlug(a[i], j, c);
                    //a[i]를 꽂는다
                } else {
                    //플러그에 이미 꽂혀있다면
                    cnt += disconnectFlug(a, i, c);
                    //다른 플러그가 비어있는지, 같은 기기인지 여부 확인 후 플러그를 뽑는다
                    connectFlug(a[i], j, c);
                    //a[i]를 꽂는다
                }
            }
        }
        System.out.println(cnt);
    }
    
    public static void connectFlug(int input, int tap, int[] c) {
        for(int i=0; i<c.length; i++) {
            if(c[i] == input) return;
            //같은 기기가 이미 있다면 꽂지 않는다
        }
        if(c[tap] == 0) c[tap] = input;
        //비어있다면 꽂는다
    }
    
    public static int disconnectFlug(int[] a, int input, int[] c) {
        for(int i=0; i<c.length; i++) {
            if(c[i] == 0) return 0; //비어있다면 뽑을 수 없다
            if(c[i] == a[input]) return 0; //같은기기라면 뽑지 않는다
        }
        
        int temp[] = new int[c.length];
        for(int l=0; l<temp.length; l++) {
            for(int i=input+1; i<a.length; i++) {
                if(a[i] == c[l]) {
                    temp[l] = i;
                    break;
                    //뽑을 플러그가 다음에 몇번째에 사용되는지 체크한다
                }
            }
        }
        
        int max = 0;
        int idx = 0;
        for(int i=0; i<temp.length; i++) {
            if(temp[i] == 0) {
                //이후에 사용안할 플러그일 때
                idx = i;
                break;
            }
            if(temp[i] > max) {
                //temp 배열을 비교하여 가장 오랫동안 사용안할 기기의 플러그를 뽑는다
                max = temp[i];
                idx = i;
            }
        }
        c[idx] = 0; //플러그를 뽑는다
        
        return 1;
    }
}
