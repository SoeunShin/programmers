package java220222;

// 나누어 떨어지는 숫자 배열 

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class p12910 {
	public static int[] solution(int[] arr, int divisor) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % divisor == 0) {
				list.add(arr[i]);
			}
		}
		Collections.sort(list);
		
		int[] answer;
		if(list.size() > 0) {
			answer = new int[list.size()];
			for(int i=0; i<list.size(); i++) {
				answer[i] = list.get(i);
			}
		}
		else {
			answer = new int[1];
			answer[0] = -1;
		}
        return answer;
    }
}