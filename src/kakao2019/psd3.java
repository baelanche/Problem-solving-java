package kakao2019;

public class psd3 {

	static boolean success = false;
	
	public static void main(String[] args) {
		int[][] key = {{0, 0, 0}, {1, 0, 0}, {0, 1, 1}};
		int[][] lock = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++)
				System.out.print(key[i][j] + " ");
			System.out.println();
		}
		keyLock(key, lock, 0, 0);
		rotate(key);
		keyLock(key, lock, 0, 0);
		rotate(key);
		keyLock(key, lock, 0, 0);
		rotate(key);
		keyLock(key, lock, 0, 0);
		System.out.println(success);
	}
	
	public static void rotate(int[][] key) {
		for(int i=0; i<=key.length/2; i++) {
			for(int j=i; j<=key.length/2; j++) {
				int temp = key[i][j];
				key[i][j] = key[j][key.length - 1 - i];
				key[j][key.length - 1 - i] = key[key.length - 1 - i][key.length - 1 - j];
				key[key.length - 1 - i][key.length - 1 - j] = key[key.length - 1 - j][i];
				key[key.length - 1 - j][i] = temp;
			}
		}
	}
	
	public static void keyLock(int[][] key, int[][] lock, int x, int y) {
		if(x + key.length > lock.length) {
			keyLock(key, lock, 0, y+1);
			return;
		}
		
		if(y + key.length > lock.length)
			return;
		
		
		for(int i=0; i<key.length; i++) {
			for(int j=0; j<key.length; j++) {
				if(key[i][j] == lock[i+y][j+x]) {
					keyLock(key, lock, x+1, y);
					return;
				}
			}
		}
		success = true;
	}
}
