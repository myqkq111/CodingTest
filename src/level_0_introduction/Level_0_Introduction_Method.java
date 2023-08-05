package level_0_introduction;

import java.util.ArrayList;
import java.util.Arrays;
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
//	public String[] solution(String my_str, int n) {
//		
//		List<String> list = new ArrayList<String>(); //배열에 담기전 list
//		String a = ""; //n개씩 문자열을 담을 객체
//		
//		for(int i = 0; i < my_str.length(); i++) { //my_str의 길이만큼 반복문을 돌려
//			
//			a += my_str.charAt(i); //처음부터 하나씩 a객체에 문자를 담고
//			
//			if(a.length() == n) { //담은 문자가 n개가 되었을때
//				list.add(a); //list에 담고
//				a = ""; //a객체는 초기화한다.
//			} else if(i == my_str.length()-1) { //n개는 아니지만 더이상 담을 문자가 없다면 지금 담긴 문자를 list에 담는다.
//				list.add(a);
//			}		
//		}
//		
//		String[] res = list.toArray(new String[list.size()]); //list를 배열로 변환시킨다.
//		
//		return res;
//		
//	}

	
	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	
	
	//6번
//	public int solution(int[] array) {
//		
//		int res = 0; //7의 갯수를 담을 변수
//		
//		for(int i = 0; i < array.length; i++) {
//			String num = Integer.toString(array[i]); //배열의 원소값을 문자열로 바꾸고
//			
//			for(int j = 0; j < num.length(); j++ )  { //문자열의 문자 하나하나 비교하여 7이 있다면 개수만큼 res변수값을 증가시킨다.
//				if(num.charAt(j) == '7') {
//					res++; 
//				}
//			}
//		}
//		return res;
//	}

	
	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	
	
	//7번
//	public String solution(String my_string) {
//		
//		my_string = my_string.toLowerCase(); //대소문자 문자열을 소문자로 만들고		
//		
//		char[] array = my_string.toCharArray(); //문자열을 문자배열로 만들어준다.
//		
//		Arrays.sort(array); //배열을 오름차순으로 설정해주고
//		
//		String res = "";
//		
//		for(int i = 0; i < array.length; i++) { //배열을 처음부터 순서대로 문자열의 끝에 붙혀서 문자열로 만들어준다.
//			res += array[i];
//		}
//		return res;
//	}

	
	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	
	//8번
//	public int solution(int n, int t) {
//		
//		int res = n;
//		
//		for(int i = 0; i < t; i++) { //1시간에 두배씩 늘어나니깐 t값만큼 반복문을 돌리면서 곱하기 2를 해주면 된다.
//			res *= 2;
//		}
//		return res;
//	}

	
	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	
	
	//9번
//	public int solution(String str1, String str2) {
//		
//		int res;
//		
//		if(str1.contains(str2)) { //contains : 문자열 안에 매개변수 문자열이 포함되어있는지 확인하는 메서드
//			res = 1;
//		} else {
//			res = 2;
//		}
//		return res;
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	
	//10번
//	public int solution(int n) {
//		
//		int res = 2; //값이 2인 변수 생성
//		
//		for(int i = 1; i <= 1000; i++) { //1000까지 돌린이유는 n의 최대치인 1000000이 1000의 제곱이기 때문이다.
//			if(i * i == n) {
//				res = 1;
//				break;
//			}
//		}
//		return res;
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	
	//11번
//	public int solution(int n) {
//		int answer = 0;
//		String [] arr = Integer.toString(n).split(""); //매개변수 n을 문자열로 바꾸고 각자리의 문자를 배열에 담는다.
//		
//		for(String a : arr) { //배열에 담긴 원소를 하나씩
//			answer += Integer.parseInt(a); //int로 형변환 후 변수에 값을 더해준다.
//		}
//		return answer;
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	
	
	//12번
//	public int[] solution(int n, int[] numlist) {
//		
//		List<Integer> list = new ArrayList<Integer>(); //값을 담을 list
//		
//		for(int i = 0; i < numlist.length; i++) {
//			if(numlist[i] % n == 0) { //numlist의 원소가 n의 배수 일때
//				list.add(numlist[i]); //원소를 list에 담고
//			}
//		}
//		int[] res = new int[list.size()]; 
//		
//		for(int i = 0; i < list.size(); i++) { //list에 담긴 원소를 배열에 담는다.
//			res[i] = list.get(i);
//		}
//		
//		return res;
//		
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	
	//13번
//	public int solution(int num, int k) {
//		
//		int res;
//		
//		String strnum = Integer.toString(num); //매개변수 두개를 문자열로 형변환 해주고
//		String strk = Integer.toString(k);
//		
//		if(strnum.contains(strk)) { //num안에 k가 포함이 되어있다면
//			res = strnum.indexOf(strk) + 1; //k가 있는 자리수를 반환하고
//		} else { //없다면
//			res = -1; //-1을 반환한다.
//		}
//		
//		return res;
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	
	//14번
//	public int solution(String[] s1, String[] s2) {
//		
//		int res = 0;
//		
//		for(int i = 0; i < s1.length; i++) {
//			for(int j = 0; j < s2.length; j++) {
//				if(s1[i].equals(s2[j])) {
//					res++;
//				}
//			}
//		}
//		return res;
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	
	//15번
//	public String[] solution(String[] quiz) {
//		
//		String[] res = new String[quiz.length];
//		
//		for(int i = 0; i < quiz.length; i++) { //quiz배열의 원소를 하나씩 가져온다.
//			
//			String[] arr = quiz[i].split(" "); //원소를 split메서드를 이용해 배열에 담아주면 arr배열의 길이는 언제나 5가 된다.
//			
//			int x = Integer.parseInt(arr[0]); //숫자 문자열들을 int로 형변환 해준다.
//			int y = Integer.parseInt(arr[2]);
//			int z = Integer.parseInt(arr[4]);
//			
//			switch(arr[1]) { //[연산자]가 + 인지 - 인지 구분하고
//			case "+":
//				if(x + y == z) { //연산값이 맞다면 res배열에 O를 아니라면 X를 넣는다.
//					res[i] = "O";
//				} else {
//					res[i] = "X";
//				}
//				break;
//			case "-":
//				if(x - y == z) {
//					res[i] = "O";
//				} else {
//					res[i] = "X";
//				}
//				break;
//			}		
//		}
//		
//		return res;
//		
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
