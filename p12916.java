package java220223;

// 문자열 내 p와 y의 개수 
public class p12916 {
	/*
	public static void main(String[] args) {
		String s1 = "pPoooyY";
		String s2 = "Pyy";
		
		System.out.println(solution(s1));
		System.out.println(solution(s2));
	}
	*/
	static boolean solution(String s) {
		s = s.toLowerCase();
		int cnt_p = 0;
		int cnt_y = 0;
		
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch == 'p') cnt_p++;
			if(ch == 'y') cnt_y++;
		}
		if(cnt_p == cnt_y) return true;
		return false;
	}
}
