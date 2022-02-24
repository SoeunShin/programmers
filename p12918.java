package java220224;

/* programmers 12918. 문자열 다루기 기본 
 * 
 * 문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요. 
 * 예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.
 */
import java.util.Scanner;

public class p12918 {
	/*
	public static void main(String[] args) {
		System.out.println(solution("1234"));
		System.out.println(solution("a123"));
	}
	*/
	public static boolean solution(String s) {
		if (s.length() == 4 || s.length() == 6) { // 길이가 4 또는 6이면 
			for(int i=0; i<s.length(); i++) {
				char ch = s.charAt(i); // 한 글자씩 확인 
				if(Character.isDigit(ch) == false) return false;
			}
			return true;
		}
		return false;
	}
}
