class Solution {
    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];
        int a[][] = new int[rows+1][columns+1];
        int number = 1;
        for (int i=1; i<=rows; i++) {
            for (int j=1; j<=columns; j++) {
                a[i][j] = number++;
            }
        }
        for (int k=0; k<queries.length; k++) {
            int sr = queries[k][0];
            int sc = queries[k][1];
            int er = queries[k][2];
            int ec = queries[k][3];
            int min = Integer.MAX_VALUE;
            
            int firstNumber = a[sr][sc];
            int secondNumber = 0;
            
            for (int c=sc; c<ec; c++) {
                min = Math.min(min, firstNumber);
                secondNumber = a[sr][c+1];
                a[sr][c+1] = firstNumber;
                firstNumber = secondNumber;
            }
            
            for (int r=sr; r<er; r++) {
                min = Math.min(min, firstNumber);
                secondNumber = a[r+1][ec];
                a[r+1][ec] = firstNumber;
                firstNumber = secondNumber;
            }
            
            for (int c=ec; c>sc; c--) {
                min = Math.min(min, firstNumber);
                secondNumber = a[er][c-1];
                a[er][c-1] = firstNumber;
                firstNumber = secondNumber;
            }
            
            for (int r=er; r>sr; r--) {
                min = Math.min(min, firstNumber);
                secondNumber = a[r-1][sc];
                a[r-1][sc] = firstNumber;
                firstNumber = secondNumber;
            }
            
            answer[k] = min;
        }
        
        return answer;
    }
}
