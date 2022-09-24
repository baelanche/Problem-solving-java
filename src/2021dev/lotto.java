class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int same = 0;
        int zero = 0;
        for (int i=0; i<lottos.length; i++) {
            if (lottos[i] == 0) {
                zero++;
                continue;
            }
            for (int j=0; j<win_nums.length; j++) {
                if (lottos[i] == win_nums[j]) {
                    same++;
                }
            }
        }
        
        int best = same + zero;
        int worst = same;
        for (int i=0; i<=6; i++) {
            if (best == i) {
                answer[0] = 7 - i;
                answer[0] = answer[0] > 6 ? 6 : answer[0];
            }
            if (worst == i) {
                answer[1] = 7 - i;
                answer[1] = answer[1] > 6 ? 6 : answer[1];
            }
        }
        return answer;
    }
}
