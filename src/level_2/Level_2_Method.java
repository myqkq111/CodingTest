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
	
	
	
	
	
	//6. 다음 큰 숫자
//	public int solution(int n) {
//		
//		String str1 = Integer.toBinaryString(n);
//		int su1 = 0;
//		for(int i = 0; i < str1.length(); i++) {
//			if(str1.charAt(i) == '1') {
//				su1++;
//			}
//		}
//		
//		while(true) {
//			n += 1;
//			String str2 = Integer.toBinaryString(n);
//			int su2 = 0;
//			for(int i = 0; i < str2.length(); i++) {
//				if(str2.charAt(i) == '1') {
//					su2++;
//				}
//			}
//			if(su1 == su2) {
//				break;
//			}
//		}
//		return n;
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	//7. 피보나치 수
//	public int solution(int n) {
//		
//		int su1 = 0;
//		int su2 = 1;
//		
//		for(int i = 2; i <= n; i++) {
//			int su3 = su2;
//			su2 += su1;
//			su1 = su3;
//		}
//		return su2 % 1234567;
//	}

	
	
	
	
	
	//-------------------------------------------------------------------------- 
	
	
	
	
	
	//8. 짝지어 제거하기
//	public int solution(String s) {
//		
//		int res;
//		StringBuffer sb = new StringBuffer(s);
//		
//		w:while(true) {
//			for(int i = 1; i < sb.length(); i++) {
//				if(sb.charAt(i) == sb.charAt(i-1)) {
//					sb.deleteCharAt(i);
//					sb.deleteCharAt(i-1);
//					
//					if(sb.length() == 0) {
//						res = 1;
//						break w;
//					} else {
//						continue w;
//					}
//				} 
//			}
//			res = 0;
//			break;
//		}
//		return res;
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	//9. 카펫
//	public int[] solution(int brown, int yellow) {
//		
//		int[] res = new int[2];
//		int x = brown / 2 - 1;
//		int y = 1;
//		
//		while(x >= y) {
//			if((x-2) * y == yellow) {
//				res[0] = x;
//				res[1] = y + 2;
//				break;
//			}
//			x--;
//			y++;
//		}
//		return res;
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	//10. 영어 끝말잇기
//	public int[] solution(int n, String[] words) {
//		
//		int[] res = {0,0};
//		int count = 1;
//		int length = 0;
//		
//		w:while(true) {
//			for(int i = 1; i <= n; i++) {
//				if(length == 0) {
//					length++;
//				} else {
//					char end = words[length-1].charAt(words[length-1].length()-1);
//					char start = words[length].charAt(0);
//					if(end == start) {
//						for(int j = 0; j < length; j++) {
//							if(words[j].equals(words[length])) {
//								res[0] = i;
//								res[1] = count;
//								break w;
//							}
//						}
//					} else {
//						res[0] = i;
//						res[1] = count;
//						break w;
//					}
//					if(length < words.length-1) {
//						length++;
//					} else {
//						break w;
//					}
//				}
//			}
//			count++;
//		}
//		return res;
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
