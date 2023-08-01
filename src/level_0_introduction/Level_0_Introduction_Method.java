package level_0_introduction;

import java.util.ArrayList;
import java.util.List;

public class Level_0_Introduction_Method {
	
	//Level 0 입문
	
	//1번
//	public int solution(int[] common) {
//		
//		int res; //결과값을 담을 변수
//		
//		if(common[0] - common[1] == common[1] - common[2]) { //등차수열인지 확인
//			int a = common[1] - common[0]; //등차수열이 맞다면 공차를 구하고
//			res = common[common.length-1] + a; //마지막원소 + 공차
//		} else { //등차수열이 아니라면
//			int a = common[1] / common[0]; //공비를 구하고
//			res = common[common.length-1] * a; //마지막원소 * 공비
//		}
//		return res;
//	}
	
	
	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	
	
	//2번
//	public int[] solution(int num, int total) {
//		
//		int[] res = new int[num]; //값을 담을 배열
//		
//		for(int i = -50; i <= 1000; i++) { // num의 최대값인 100과 total의 최대값인 1000을 이용해 모든 경우의 수를 계산했을때
//										   // 나올수 있는 원소가 -50부터 1000이기 때문에 반복문을 통해 돌려준다.			
//			int idx = 0; //인덱스값으로 사용
//			
//			for(int j = i; j < i+num; j++) { //-50부터 순차적으로 num의 갯수만큼 배열에 담고
//				res[idx] = j;
//				idx++;
//			}			
//			
//			int sum = 0;
//			
//			idx = 0;
//			
//			for(int j = 0; j < res.length; j++) { //배열에 담긴 원소의 합이 total인지를 확인한다.
//				sum+=res[idx];
//				idx++;
//			}
//			
//			if(sum == total) { //원소의 합이 total이라면
//				break; //반복문 종료후 배열 반환, 아니라면 다음 원소로 넘어간다.
//			}
//		}
//		return res;
//	}

	
	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	
	
	//3번
//	public int solution(int M, int N) {
//		//M과 N을 곱한 값에 -1을 하면 가위질의 횟수가 나온다는 패턴을 파악하면 풀기쉽다.
//		int res = (M * N) - 1;
//		
//		return res;
//	}

	
	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	
	
	//4번
//	public int solution(String A, String B) {
//		
//		int res = 0; //값을 담을 변수
//		
//		while(true) { //반복문을 무한으로 돌리면서
//			if(res == A.length()) { //A문자열을 한칸씩 전부 밀어봤다면 
//				res = -1;			//-1값을 가지고 반복문을 탈출한다.
//				break;
//			}
//			
//			if(!A.equals(B)) { //A와 B문자열이 같지 않다면
//				String C = ""; //기존의 A를 C에 담아 문자열을 한칸씩 밀어줄건데
//				for(int i = 0; i < A.length(); i++) { 
//					if(i == 0) { //첫번째 문자로는 A문자열의 맨마지막 문자가 들어와야하기 때문에 
//						C += A.charAt(A.length()-1); //마지막문자열을 처음으로 담아주고
//					} else { //나머지는 차례대로 담아준다.
//						C += A.charAt(i-1);
//					}
//				}
//				A = C; //B와 비교를 위해 A에 담아주고
//				res++; //문자열을 밀어준 횟수를 1증가시킨다.
//			} else { //A와 B문자열이 같다면
//				break; //그대로 반복문을 탈출한다.
//			}
//		}
//		return res;
//	}

	
	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	
	
	//5번
	public String[] solution(String my_str, int n) {
		
		String[] res;
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
