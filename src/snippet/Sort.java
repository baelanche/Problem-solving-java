package snippet;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Sort {

    // 단일 객체 이중 정렬
    public void instanceDoubleSort() {
        Dummy[] d = new Dummy[10];
        Arrays.sort(d, Comparator
                .comparingInt((Dummy dummy) -> dummy.a) // a 기준 오름차순
                .reversed() // 내림차순으로 변경
                .thenComparingInt((Dummy dummy) -> dummy.b) // b 기준 오름차순
        );
    }

    public void twoDimensionDoubleSort() {
        int[][] arr = new int[10][10];
        Arrays.sort(arr, (a, b) -> {
            if (a[0] != b[0]) {
                return a[0] - b[0]; // 첫 번째 배열 기준 오름차순 정렬
            } else {
                return b[1] - a[1]; // 두 번째 배열 기준 내림차순 정렬
            }
        });
    }

    public void priorityQueueSort() {
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(); // 오름차순
        PriorityQueue<Integer> pq2 = new PriorityQueue<>((a, b) -> b - a); // 내림차순
        PriorityQueue<Dummy> pq3 = new PriorityQueue<>((a1, a2) -> {
            if (a1.a != a2.a) {
                return a1.a - a2.a; // 첫 번째 배열 기준 오름차순 정렬
            } else {
                return a2.b - a1.b; // 두 번째 배열 기준 내림차순 정렬
            }
        });
    }
}

class Dummy {
    int a;
    int b;

    public Dummy(int a, int b) {
        this.a = a;
        this.b = b;
    }
}
