package level_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Level_2_Method {
	
	//1. 최댓값과 최솟값
//	public String solution(String s) {
//		
//		String[] str = s.split(" ");
//		int[] intr = new int[str.length];
//		
//		for(int i = 0; i < str.length; i++) {
//			intr[i] = Integer.parseInt(str[i]);
//		}
//		Arrays.sort(intr);
//		
//		String res = intr[0] + " " + intr[intr.length-1];
//		
//		return res;
//	}
	
	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	//2. JadenCase 문자열만들기
//	public String solution(String s) {
//		
//		s = s.toLowerCase();
//		String[] str = s.split(" ");
//		String res = "";
//		String up;
//		
//		for(int i = 0; i < str.length; i++) {
//			StringBuffer sb = new StringBuffer(str[i]);
//			up = Character.toString(sb.charAt(0));
//			sb.setCharAt(0, up.toUpperCase().charAt(0));
//			res += sb + " ";
//		}
//		return res;
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	//3. 올바른 괄호
//	boolean solution(String s) {
//		
//		boolean res = false;
//		int left = 0;
//		int right = 0;
//		
//		for(int i = 0; i < s.length(); i++) {
//			if(s.charAt(i) == '(') {
//				left++;
//			} else {
//				right++;
//			}
//		}
//		if(left == right) {
//			res = true;
//		}
//		return res;
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	//4. 이진 변환 반복하기
//	public int[] solution(String s) {
//		
//		int[] res = {0,0};
//		
//		while(true) {
//			StringBuffer sb = new StringBuffer(s);
//			
//			for(int i = sb.length()-1; i >= 0; i--) {
//				if(sb.charAt(i) == '0') {
//					sb.deleteCharAt(i);
//					res[1]++;
//				}
//			}
//			int str = sb.toString().length();
//			
//			s = Integer.toBinaryString(str);
//			res[0]++;
//			
//			if(s.equals("1")) {
//				break;
//			}
//		}
//		return res;
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	//5. 숫자의 표현
//	public int solution(int n) {
//		
//		int res = 0;
//		int su = 1;
//		
//		while(su <= n) {
//			int sum = 0;
//			for(int i = su; i <= n; i++) {
//				sum += i;
//				if(sum == n) {
//					res++;
//					su++;
//					break;
//				} else if(sum > n) {
//					su++;
//					break;
//				}
//			}
//		}
//		return res;
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
