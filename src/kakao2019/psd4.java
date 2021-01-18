package kakao2019;

public class psd4 {

	public static void main(String[] args) {
		String s = "fro??";
		
		int left = 0;
		int right = 0;
		if(s.startsWith("?")) {
			for(int i=0; i<s.length(); i++) {
				if(s.charAt(i) != '?') {
					left = i;
					break;
				}
			}
			right = s.length();
		} else if(s.endsWith("?")) {
			for(int i=s.length()-1; i>=0; i--) {
				if(s.charAt(i) != '?') {
					right = i+1;
					break;
				}
			}
		}
	}
}
