package level_0_introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
	
	
	
	
	
	
	
	//16번
//	public int solution(String my_string) {
//		
//		String[] arr = my_string.split(" "); //문자열을 띄어쓰기 기준으로 배열에 담는다.
//		
//		int res = Integer.parseInt(arr[0]); //배열의 첫번째는 무조건 숫자이기 때문에 변수에 담아준다.
//		
//		String pm = ""; //연산기호를 담을 객체
//		
//		for(int i = 1; i < arr.length; i++) {
//			if(i % 2 == 1) { //인덱스가 홀수일때
//				pm = arr[i]; //pm객체에 원소를 담아준다.(홀수 원소는 연산기호)
//			} else { //인덱스가 짝수라면
//				switch(pm) { //pm객체에 저장되어있는 연산기호가 +인지 -인지 파악한 후 계산해준다.
//				case "+":
//					res += Integer.parseInt(arr[i]);
//					break;
//				case "-":
//					res -= Integer.parseInt(arr[i]);
//					break;
//				}
//			}
//		}
//		return res;
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	
	//17번
//	public int[] solution(int[] array) {
//		
//		int[] res = {array[0], 0}; //매개변수 배열의 0번째 인덱스의 원소와 0인덱스를 배열에 담고
//		
//		for(int i = 0; i < array.length; i++) {
//			if(res[0] < array[i]) { //매개변수 배열의 원소를 비교하여 
//				res[0] = array[i]; //큰값을 새롭게 res배열에 담아준다.
//				res[1] = i;
//			}
//		}
//		return res;
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	
	//18번
//	public int[] solution(int n) {
//		
//		List<Integer> list = new ArrayList<Integer>();
//		
//		for(int i = 1; i <= n; i++) { //1부터 n까지 숫자를 차례대로 나누어 나머지가 0이면 n의 약수이기 때문에 list에 담아준다.
//			if(n % i == 0) { 
//				list.add(i);
//			}
//		}		
//		int[] res = new int[list.size()];
//		
//		for(int i = 0; i < list.size(); i++) { //list의 원소를 배열에 담는 과정
//			res[i] = list.get(i);
//		}
//		return res;
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	
	//19번
//    public String solution(String s) {
//	    String answer = "";
//	    
//	    w:for(int i = 0; i < s.length(); i ++){ //s의 문자를 다른 문자들과 비교한다
//	        for(int j = 0; j < s.length(); j++){
//	            if(i == j){ //같은 인덱스 일땐 건너뛰도록 한다.
//	                continue;
//	            }
//	            if(s.charAt(i) == s.charAt(j)){ //만약 동일한 문자가 있을경우
//	                continue w; //다음 인덱스로 넘어간다
//	            }
//	        }
//	        answer += s.charAt(i); //같은 인덱스가 없을경우 객체에 담아준다.
//	    }
//	    String[] arr = answer.split(""); //배열로 만든후
//	    Arrays.sort(arr); //오름차순으로 정렬한다
//	    
//	    answer = ""; //비어주는 이유는 오름차순으로 정렬된 문자열을 새롭게 받기 위해서이다.
//	    
//	    for(int i = 0; i < arr.length; i++){
//	        answer += arr[i];
//	    }
//	    
//	    return answer;
//	}






	//----------------------------------------------------------------------------------






	//20번
//	public String solution(String my_string, int num1, int num2) {
//		
//		char ch1 = my_string.charAt(num1); //num1,2 인덱스에 해당하는 문자를 미리 받아둔다.
//		char ch2 = my_string.charAt(num2);
//		
//		StringBuffer sb = new StringBuffer(my_string); //setCharAt()를 사용하기 위함
//		
//		sb.setCharAt(num1, ch2); //num1,2인덱스에 해당하는 문자의 위치를 서로 바꾼다.
//		sb.setCharAt(num2, ch1);
//		
//		String res = sb.toString();
//		
//		return res;
//		
//	}






	//----------------------------------------------------------------------------------





	
	//21번
//	public long solution(String numbers) {
//		
//		String str = ""; //numbers의 문자를 하나씩 담을 객체
//		String resStr = ""; //numbers의 알파벳에 맞는 숫자를 일단 문자열에 담는다.
//		
//		for(int i = 0; i < numbers.length(); i++) {			
//			str += numbers.charAt(i); //문자를 하나씩 객체에 추가하다가
//	
//			switch(str) { //맞는 영어단어가 있다면
//			case "zero":
//				resStr += 0; //그에 맞는 숫자를 담고
//				str = ""; //객체를 다시 비운다.
//				break;
//			case "one":
//				resStr += 1;
//				str = "";
//				break;
//			case "two":
//				resStr += 2;
//				str = "";
//				break;
//			case "three":
//				resStr += 3;
//				str = "";
//				break;
//			case "four":
//				resStr += 4;
//				str = "";
//				break;
//			case "five":
//				resStr += 5;
//				str = "";
//				break;
//			case "six":
//				resStr += 6;
//				str = "";
//				break;
//			case "seven":
//				resStr += 7;
//				str = "";
//				break;
//			case "eight":
//				resStr += 8;
//				str = "";
//				break;
//			case "nine":
//				resStr += 9;
//				str = "";
//				break;				
//			}
//		}
//		long res = Integer.parseInt(resStr); //문자열을 숫자로 바꿔담는다.
//		
//		return res;
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	
	//22번
//	public String solution(String my_string) {
//		
//		String res = ""; //결과값을 담을 객체
//		
//		for(int i = 0; i < my_string.length(); i++) {
//			String tocase = ""; //문자를 하나씩 담아서 대소문자로 변경을 해주기위한 용도
//			tocase += my_string.charAt(i);
//			if(my_string.charAt(i) >= 'a' && my_string.charAt(i) <= 'z') { //소문자일경우 대문자로
//				res += tocase.toUpperCase(); 
//			} else { //대문자일경우 소문자로 바꾼다.
//				res += tocase.toLowerCase();
//			}
//		}
//		return res;
//	}

	
	
	
	
	
	//----------------------------------------------------------------------------------
	
	
	
	
	
	
	//23번
//	public String solution(String cipher, int code) {
//		
//		String res = "";
//		
//		for(int i = code; i <= cipher.length(); i += code) { //code부터 시작해서 code배수만 객체에 담는다.
//			res += cipher.charAt(i-1); //code는 자릿수이고 charAt()는 인덱스를 적어야하기 때문에 -1을 해준다.
//		}
//		return res;
//	}

	
	
	
	
	
	//----------------------------------------------------------------------------------
	
	
	
	
	
	
	//24번
//	public int solution(int order) {
//		
//		int res = 0;
//		
//		String str = Integer.toString(order); //매개변수 int를 String으로 바꿔주고
//		String[] arr = str.split(""); //문자열을 문자마다 배열로 나눠준다.
//		
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[i].equals("3") || arr[i].equals("6") || arr[i].equals("9")) {
//				res++; //문자가 3,6,9라면 res변수의 값을 상승시킨다.
//			}
//		}
//		return res;
//	}

	
	
	
	
	
	//----------------------------------------------------------------------------------
	
	
	
	
	
	
	//25번
//	public int solution(int[] array, int n) {
//		
//		int res = array[0]; //array의 첫번째 원소와
//		int x; //첫번째원소와 n을 뺀 값을 담는다.
//		
//		if(array[0] > n) { //첫번째원소와 n값을 뺄때 큰값에서 작은값을 빼도록 한다. 그래야 음수가 안나오기 때문이다.
//			x = array[0] - n;
//		} else {
//			x = n - array[0];
//		}
//		
//		for(int i = 1; i < array.length; i++) {
//			int y; //i인덱스에 해당하는 원소와 n을 뺀 값을 담을 변수
//			if(array[i] > n) { //음수값이 안나오게 하기위한 조건문
//				y = array[i] - n;
//			} else {
//				y = n - array[i];
//			}
//			
//			if(x == y) { //x와y를 비교하여 두값이 같다면
//				if(res > array[i]) { //더작은 원소를 res변수에 담는다.
//					res = array[i];
//				}
//			} else if(x > y) { //y가 더 작다면 x보다 가까운 수이기 때문에
//				res = array[i]; //res에 해당 인덱스의 원소를 넣어주고
//				x = y; //그 원소와 n의 차이값을 x에 담아준다.
//			}
//		}
//		return res;
//	}

	
	
	
	
	
	//----------------------------------------------------------------------------------
	
	
	
	
	
	
	//26번
//	public int solution(int[] sides) {
//		
//		int res; //1또는2 결과값을 담을 변수
//		int max = sides[0]; //가장큰 원소의 값을 담은 변수
//		int maxidx = 0; //가장큰 원소의 인덱스
//		int sum = 0; //가장큰 원소를 제외한 나머지 원소의 합계
//		
//		if(max < sides[1]) {
//			max = sides[1];
//			maxidx = 1;
//		}
//		if(max < sides[2]) {
//			max = sides[2];
//			maxidx = 2;
//		}
//		
//		for(int i = 0; i < 3; i++) {
//			if(i != maxidx) {
//				sum += sides[i];
//			}
//		}
//		
//		if(max < sum) {
//			res = 1;
//		} else {
//			res = 2;
//		}
//		return res;
//	}

	
	
	
	
	
	//----------------------------------------------------------------------------------
	
	
	
	
	
	
	//27번
//	 public String solution(String my_string) {
//		 
//		 String[] arr = my_string.split(""); //매개변수 문자열을 배열로 나눠준후
//		 List<String> list = new ArrayList<String>(Arrays.asList(arr)); //list로 변환한다.
//		 
//		 for(int i = 0; i < list.size()-1; i++) {		 
//			 for(int j = list.size()-1; j > i; j--) {			 
//				 if(list.get(i).equals(list.get(j))) { //모든 문자를 비교하여 같은 문자가 있을경우 뒤에 있는 문자를 지운다.
//					list.remove(j);
//				 }			 
//			 }		 
//		 }
//		 
//		 String res = "";
//		 for(int i = 0; i < list.size(); i++) { //중복문자를 제거한 후 남은 list의 원소를 문자열로 바꾼다.
//			 res += list.get(i);
//		 }	 
//		 return res;
//	 }

		
		
		
		
		
	//----------------------------------------------------------------------------------
	
	
	
	 
	 
	 
	 //28번
//	 public int solution(int i, int j, int k) {
//		 
//		 int res = 0; //값을 담을 변수
//		 
//		 for(int q = i; q <= j; q++) {
//			 String str = Integer.toString(q); //i부터 j만큼 반복문을 돌리면서 숫자를 문자열로 변환시킨다.
//			 for(int w = 0; w < str.length(); w++) {
//				 if(Character.getNumericValue(str.charAt(w)) == k) { //문자열의 문자 하나씩 꺼내와 k와 비교하여 같다면
//					 res++; //변수값 상승
//				 }
//			 }
//		 }
//		 return res;
//	 }

		
		
		
		
		
	//----------------------------------------------------------------------------------
	 
	 
	 
	 
	 
	 
	//29번
//	public int solution(String before, String after) {
//		
//		String str = ""; //before의 문자열을 거꾸로 담을 객체
//		int res;
//		
//		for(int i = before.length()-1; i >= 0; i--) { //문자열을 거꾸로 담는과정
//			str += before.charAt(i);
//		}
//
//		if(str.equals(after)) { //거꾸로 담은 문자열이 after과 같다면
//			res = 1; //1을
//		} else { //아니라면
//			res = 0; //0을 넣는다.
//		}
//		return res;
//	}

	
	
	
	
	
	//----------------------------------------------------------------------------------
	
	
	
	
	
	
	//30번
//	public int solution(int chicken) {
//		
//		int res = chicken / 10; //결과값을 담을 변수(쿠폰으로 시킨 치킨의 수)
//		int a = chicken / 10; //쿠폰으로 치킨을 시키고 또 받은 쿠폰수
//		int b = chicken % 10; //쿠폰으로 치킨을 시키고 남은 쿠폰들
//		
//		while(true) { 
//			if(a + b >= 10) { 
//				res += a / 10; 
//				
//				if(a == 10) { 
//					b += 1;
//				} else {
//					b += (a % 10);
//				}
//				
//				a /= 10;
//				
//				if(a < 10 && b >= 10) {
//					res += b / 10;
//					b /= 10;
//				}			
//			} else {
//				break;
//			}
//		}		
//		return res;
//	}

	
	
	
	
	
	//----------------------------------------------------------------------------------
	
	
	
	
	
	
	//31번
//	public String solution(String[] id_pw, String[][] db) {
//	
//		String res = "";
//		
//		for(int i = 0; i < db.length; i++) {
//			if(id_pw[0].equals(db[i][0])) { //id먼저 확인한다.
//				if(id_pw[1].equals(db[i][1])) { //일치하는 id의 비밀번호도 일치한다면
//					res = "login"; //login을 담고 반복문 탈출
//					break;
//				} else { //id만 일치하고 비밀번호는 일치하지 않는다면
//					res = "wrong pw"; //wrong pw를 담고 반복문 탈출
//					break;
//				}
//			}
//		}
//		
//		if(res.isEmpty()) { //모든 id를 비교했음에도 일치하는 id가 없다면 fail을 담는다.
//			res = "fail";
//		}
//		
//		return res;
//	}






	//----------------------------------------------------------------------------------




	
	
	//32번
//	public int[] solution(int[][] score) {
//		
//		int[] res = new int[score.length]; //등수를 담을 배열
//		
//		List<Integer> list = new ArrayList<Integer>(); //매개변수 2차원 배열의 각원소 평균을 담을 list
//		
//		for(int i = 0; i < score.length; i++) {
//			int ave = (score[i][0] + score[i][1]) / 2; //평균을 구해 list에 담는다
//			list.add(ave);
//		}
//		
//		Collections.sort(list, Collections.reverseOrder()); //평균이 높은 원소가 앞으로 나오도록 정렬
//		
//		int count; //평균이 같을때 동일한 등수를 주고 그 인원만큼 다음등수에 영향이 가기 때문에 몇명인지 카운트한다.
//		
//		for(int i = 1; i <= list.size(); i += count) {
//			List<Integer> ov = new ArrayList<Integer>(); //등수별로 정렬된 list의 원소를 순서대로 비교하여 같은 평균을 가진 2차원배열 원소의 인덱스를 담을 list
//			count = 0;
//			for(int j = 0; j < score.length; j++) {
//				if(list.get(i-1) == (score[j][0] + score[j][1]) / 2) {
//					ov.add(j); //list의 해당 인덱스의 원소와 같은 평균을 가진 2차원배열의 인덱스를 담는다.
//				}
//			}
//			for(int j = 0; j < ov.size(); j++) {
//				res[ov.get(j)] = i; //res배열에 각 인덱스의 등수를 입력해주고
//				count++; //해당등수가 몇명인지 카운트한다.
//			}
//		}
//			return res;
//	}






	//----------------------------------------------------------------------------------
	
	
	
	
	
	
	//33번
//	public int[] solution(int[] numlist, int n) {
//		
//		int[] res = new int[numlist.length]; //결과를 담을 배열
//		int[] ch = new int[numlist.length]; //n과 numlist배열 원소의 거리
//		
//		for(int i = 0; i < numlist.length; i++) {
//			int a = numlist[i] - n;
//			if(a < 0) { //numlist 원소 - n이 음수라면
//				a = -(a);	//양수로 바꿔준다.
//			}
//			ch[i] = a;
//		}
//		
//		Arrays.sort(ch); //오름차순으로 정렬
//		
//		int count; 
//		
//		for(int i = 0; i < ch.length; i += count) {
//			List<Integer> list = new ArrayList<Integer>(); //결과값이 ch원소가 일치하는 원소를 담을 list
//			for(int j = 0; j < numlist.length; j++) {
//				int a = numlist[j] - n;
//				if(a < 0) {
//					a = -(a);
//				}
//				if(a == ch[i]) {
//					list.add(numlist[j]);
//				}
//			}
//			if(list.size() == 2) { //list의 size가 2라는건 거리가 같은 원소가 있다는 뚯
//				count = 2;
//				if(list.get(0) > list.get(1)) { //큰원소가 앞에 작은 원소가 뒤에 오도록 배치한다.
//					res[i] = list.get(0);
//					res[i+1] = list.get(1);
//				} else {
//					res[i] = list.get(1);
//					res[i+1] = list.get(0);
//				}
//			} else { //list의 size가 1일때
//				count = 1;
//				res[i] = list.get(0);
//			}
//		}
//		return res;
//	}

	
	
	
	
	
	//----------------------------------------------------------------------------------
	
	
	
	

	
	//34번
//	public String solution(String bin1, String bin2) {
//		
//		int a = Integer.parseInt(bin1, 2); //매개변수 문자열을 2진수로 읽어 10진수 int로 형변환한다.
//		int b = Integer.parseInt(bin2, 2);
//		
//		int c = a + b; //10진수로 바뀐 매개변수 두개를 더해준후
//		
//		String res = Integer.toBinaryString(c); //10진수를 2진수 문자열로 바꿔준다.
//		
//		return res;	
//	}

	
	
	
	
	
	//----------------------------------------------------------------------------------
	
	
	
	
	
	
	//35번
//	public int solution(int a, int b) {
//		
//		int res = 1;
//		
//		List<Integer> alist = new ArrayList<Integer>(); //a의 약수 구하기
//		for(int i = 1; i <= a; i++) {
//			if(a % i == 0) {
//				alist.add(i);
//			}
//		}
//		
//		List<Integer> blist = new ArrayList<Integer>(); //b의 약수 구하기
//		for(int i = 1; i <= b; i++) {
//			if(b % i == 0) {
//				blist.add(i);
//			}
//		}
//	
//		int max = 0; //a와b의 최대공약수 구하기
//		for(int i = 0; i < alist.size(); i++) {
//			for(int j = 0; j < blist.size(); j++) {
//				if(alist.get(i) == blist.get(j)) {
//					max = alist.get(i); 
//				}
//			}
//		}
//		
//		int fraction = b / max; //기약분수로 나타내었을때 분모
//		List<Integer> list = new ArrayList<Integer>();//기약분수 분모의 소인수를 담을 list
//		w:for(int i = 2; i <= fraction; i++) {
//			if(fraction % i == 0) {
//				for(int j = 2; j < i; j++) {
//					if(i % j == 0) {
//						continue w;
//					}
//				}
//				list.add(i);
//			}
//		}
//		
//		for(int i = 0; i < list.size(); i++) { //분모의 소인수가 2와 5만 있는지 확인
//			if(list.get(i) != 2 && list.get(i) != 5) {
//				res = 2;
//				break;
//			}
//		}
//		return res;
//	}

	
	
	
	
	
	//----------------------------------------------------------------------------------
	
	
	
	
	
	
	//36번
//	public int solution(int[][] lines) {		
//
//		int res = 0; //결과값을 저장할 변수
//		
//		Map<Integer, Integer> map = new HashMap<Integer, Integer>(); 
//		
//		for(int i = 0; i < lines.length; i++) {
//			for(int j = lines[i][0]; j < lines[i][1]; j++) { //2차원배열의 모든 원소를 map에 담을것이다.
//				if(map.get(j) == null) { 			//담을 때 0~2라고 치면 01 , 12 이런식으로 담아줄것이다.
//					map.put(j, j+1); //해당 키값이 없는경우 선분이 겹치는 부분이 없기 때문에 새로 원소를 넣어주고
//				} else { //키값이 있을경우
//					res++; //겹치는 부분이기 때문에 res변수 1증가시켜준다.
//					map.remove(j); //그리고 키를 삭제하는 이유는 2차원배열 선분이 3개 이기 때문에 겹치는 부분이 3개에 다 포함되어 있을경우 반복문으로 조회할때마다
//				}					//res변수의 값이 올라간다. 그렇기 때문에 처음에 겹칠때 삭제를 시켜주면 다음에 겹칠땐 키 값이 없기 때문에
//			}						//res변수값을 상승시키지않고 map원소만 추가하게된다.
//		}
//		return res;
//	}

	
	
	
	
	
	//----------------------------------------------------------------------------------
	
	
	
	
	
	
	//37번
//	public int solution(int[] numbers) {
//		
//		Arrays.sort(numbers); //매개변수 int배열을 오름차순으로 정렬한다
//		
//		int res = numbers[numbers.length-1] * numbers[numbers.length-2]; //int배열의 맨뒤에 두개의 원소를 곱한다.
//		
//		return res;
//		
//	}

	
	
	
	
	
	//----------------------------------------------------------------------------------
	
	
	
	
	
	
	//38번
//	public int solution(int n) {
//		
//		int res = 0; //결과를 담을 변수
//		
//		for(int i = 10; i > 0; i-- ) { //최대 정수인 10부터 곱한값을 n과 비교하여 n이 크거나 같아질때까지 돌린다.
//			
//			int su = 1;
//			
//			for(int j = i; j > 0; j--) {
//				su *= j;
//			}
//			
//			if(su <= n) {
//				res = i;
//				break;
//			}
//		}
//		return res;
//	}

	
	
	
	
	
	//----------------------------------------------------------------------------------
	
	
	
	
	
	
	//39번
//	public String solution(String my_string) {
//		
//		String[] arr = {"a","e","i","o","u"}; //다섯가지 알파벳을 배열에 담아준다
//		int idx;
//		
//		StringBuffer sb = new StringBuffer(my_string); //deleteCharAt()를 사용하기 위한 형변환
//		
//		for(int i = 0; i < arr.length; i++) {
//			while(sb.indexOf(arr[i]) != -1){ //-1이 아니라는건 매개변수에 해당 알파벳이 있다는 뜻
//				idx = sb.indexOf(arr[i]); //해당 알파벳의 index를 찾고
//				sb.deleteCharAt(idx); //그 부분을 삭제한다.
//			}
//		}
//		return sb.toString(); 
//	}

	
	
	
	
	
	//----------------------------------------------------------------------------------
	
	
	
	
	
	
	//40번
//	public int solution(int[][] dots) {
//		//평행의 조건은 두 선분의 기울기가 같다는 것.
//		//이것만 알면 간단하게 풀 수 있다.
//		int res = 0;
//		
//		if(slope(dots[0],dots[1]) == slope(dots[2],dots[3])) {
//			res = 1;
//		}else if (slope(dots[0], dots[2])==slope(dots[1],dots[3])) {
//        	res = 1;
//        } else if (slope(dots[0], dots[3])==slope(dots[1],dots[2])) {
//        	res = 1;
//        }
//		return res;
//	}
//	
//	
//	 public double slope(int[] a, int[] b) { //기울기를 구하는 메서드 생성
//	    	return (a[0]-b[0])*1.0/(a[1]-b[1]);
//	    }

		
		
		
		
		
	//----------------------------------------------------------------------------------
	
	
	 
	 
	 
	 
	 //41번
//	public int solution(int n) {
//		
//		int res = 0;
//
//		for(int i = 1; i <= n; i++) {
//			res++;
//			String str = Integer.toString(res);
//			while(str.contains("3") || res % 3 == 0) { 
//				res++; 
//				str = Integer.toString(res);
//			}
//		}
//		return res;
//	}
	//res는 i값을 따라가면서 3이 사용되거나 3의 배수 일때 값을 상승 시킨다.
	//그런데 값을 상승 시켜도 3이 사용되거나 3의 배수 일때
	//3을 사용하지않고 3의 배수가 아닐때까지 res값을 상승시킨다.
	
	
	
	
	
	
	//----------------------------------------------------------------------------------
	 
	 
	 
	 
	 
	 
	 //42번
//	public int solution(String[] spell, String[] dic) {
//		
//		int res = 2; //기본값을 2로 설정
//		
//		w:for(int i = 0; i < dic.length; i++) {
//			for(int j = 0; j < spell.length; j++) {
//				if(dic[i].contains(spell[j])) { //spell[]의 해당 인덱스값이 dic[]의 인덱스값에 속해있다면 spell[]의 다음 인덱스값도 확인해본다.
//					if(spell.length-1 == j) { //spell[]을 다 돌았다면 spell에 담긴 알파벳을 모두 사용한 dic가 존재한다는 뜻이므로
//						res = 1; //1값을 넣어주고
//						break w; //모든 반복문을 탈출후 결과를 반환한다
//					} else { //아직 spell[]을 다 안돌았다면 밑으로 안내려가고 증감식으로 넘어가 다음 인덱스값을 확인한다.
//						continue;
//					}
//				}
//				break; //알파벳이 포함되어있는지 확인하던중 포함되지않은 알파벳이 있다면 dic의 다음 원소로 이동한다.
//			}
//		}
//		return res;
//	}

	
	
	
	
	
	//----------------------------------------------------------------------------------
	
	
	
	
	
	
	//43번
//	public int solution(int[] sides) {
//		
//		int res = 0;
//		int max; //두 원소중 큰값
//		int min; //두 원소중 작은값
//		
//		if(sides[0] > sides[1]) {
//			max = sides[0];
//			min = sides[1];
//		}else {
//			max = sides[1];
//			min = sides[0];
//		}
//			
//		res += (sides[0] + sides[1]) - max -1; //나머지 한변이 가장 긴 변인 경우 개수
//		
//		for(int i = 1; i <= max; i++) { //두 원소중 가장 긴 변이 있을 경우 개수
//			if(i + min > max && i <= max) {
//				res++;
//			}
//		}
//		return res;
//	}

	
	
	
	
	
	//----------------------------------------------------------------------------------
	 
	 
	
	
	
	
	//44번
//	public int solution(String my_string) {
//		
//		int res = 0; //결과값을 담을 변수
//		String su = ""; //자연수를 담을 문자열
//		
//		for(int i = 0; i < my_string.length(); i++) { //문자열을 한글자씩 가져와
//			if(my_string.charAt(i) >= 'a' && my_string.charAt(i) <= 'z' || my_string.charAt(i) >= 'A' && my_string.charAt(i) <= 'Z') { //숫자가 아닌 문자라면
//				if(!su.isEmpty()) { //su문자열에 뭔가 담겨 있다면
//					res += Integer.parseInt(su); //int로 변환후 res변수에 더해주고
//					su = ""; //su문자열을 비워준다.
//				} //만약 su문자열이 비어있다면 아무런 이벤트없이 넘어간다.
//				
//			} else { //숫자라면 su문자열에 담는다. 문자열에 담는이유는 한자리 자연수가 아닌 두자리이상의 자연수일 수도 있기 때문에 문자열에 담아 놓는다.
//				su += my_string.charAt(i);
//			}
//		}
//		return res;
//	}

	
	
	
	
	
	//----------------------------------------------------------------------------------
	
	
	
	
	
	
	//45번
//	public int solution(int[] numbers) {
//		
//		Arrays.sort(numbers); //오름차순으로 정렬
//		
//		int res;
//		
//		//음수와 음수를 곱하면 양수가 되기 때문에 음수 두개르 곱했을때 가장큰값으로 나올 수도 있다.
//		//그렇기 때문에 오름차순으로 정렬된 배열의 앞에서 두원소를 곱한 값과 뒤에서 두원소를 곱한값을 비교하여 더 큰값을 반환한다.
//		int su1 = numbers[numbers.length-1] * numbers[numbers.length-2]; 
//		int su2 = numbers[0] * numbers[1];
//		
//		if(su1 > su2) {
//			res = su1;
//		}else {
//			res = su2;
//		}
//		return res;
//	}

	
	
	
	
	
	//----------------------------------------------------------------------------------
	
	
	
	
	
	
	//46번
//	public int[] solution(String[] strlist) {
//		
//		int[] res = new int[strlist.length];
//		
//		for(int i = 0; i < strlist.length; i++) {
//			res[i] = strlist[i].length();
//		}
//		return res;
//	}

	
	
	
	
	
	//----------------------------------------------------------------------------------
	
	
	
	
	
	
	//47번
//	public String solution(String polynomial) {
//		
//		String[] arr = polynomial.split(" "); //매개변수 문자열을 공백을 기준으로 배열에 담는다
//		
//		int su1 = 0; //일차 항의 총합
//		int su2 = 0; //상수항의 총합
//		
//		for(int i = 0; i < arr.length; i+=2) { //배열에 홀수는 +만 있고 짝수에 일차항과 상수항이 있기 때문에 2씩 증가시켜준다
//			if(arr[i].charAt(arr[i].length()-1) == 'x') { //원소에 x를 포함하고 있다면(일차항)
//				if(arr[i].length() == 1) { //x하나만 있는 일차항 이라면 1x이기 때문에
//					su1 += 1; //1을 더해준다
//				} else { //x하나만 있는게 아니라면
//					arr[i] = arr[i].replace('x', '0'); //x를 0으로 바꿔주고
//					su1 += Integer.parseInt(arr[i]) / 10; //문자열을 int로 형변환후 10을 나눠주면 x를 제외한 원래 숫자가 나오게 된다.
//				}
//			}else { //원소에 x를 포함하지 않는다면(상수항)
//				su2 += Integer.parseInt(arr[i]);
//			}
//		}
//		
//		String res; //su1이나 su2의 값이 0이라면 다항식에 일차항이나 상수항은 없는 경우이기 때문에 결과값이 밑에와 같이 조건에 따라 달라진다.
//		
//		if(su1 > 0 && su2 > 0) {
//			res = su1 + "x " + "+ " + su2;
//		} else if(su1 > 0 && su2 == 0) {
//			res = su1 + "x";
//		} else {
//			res = Integer.toString(su2);
//		}
//		
//		return res; 
//	}

	
	
	
	
	
	//----------------------------------------------------------------------------------
	
	
	
	
	
	
	//48번
//	public int[] solution(String[] keyinput, int[] board) {
//		
//		int[] res = {0,0}; //시작은 0,0에서 시작하기 때문에 초기값으로 준다.
//		int upMax = board[1] / 2; //각방향의 최대크기
//		int downMax = (board[1] / 2) * -1;
//		int rightMax = board[0] / 2;
//		int leftMax = (board[0] / 2) * -1;
//		
//		for(int i = 0; i < keyinput.length; i++) { 
//			switch(keyinput[i]) { //keyinput배열의 각 원소를 가져와 조건이 true라면 원소마다 다른 연산을 하여 값을 조정한다.
//			case "up":
//				if(res[1] < upMax) {
//					res[1] += 1;
//				}
//				break;
//			case "down":
//				if(res[1] > downMax) {
//					res[1] += -1;
//				}
//				break;
//			case "right":
//				if(res[0] < rightMax) {
//					res[0] += 1;
//				}
//				break;
//			case "left":
//				if(res[0] > leftMax) {
//					res[0] += -1;
//				}
//				break;
//			}
//		}
//		return res;
//	}

	
	
	
	
	
	//----------------------------------------------------------------------------------
	
	
	
	
	
	
	//49번
//	public int solution(String s) {
//		
//		String[] arr = s.split(" "); //공백을 기준으로 배열에 담는다.
//		
//		int res = 0; //s의 숫자원소의 값을 담을 변수
//		
//		for(int i = 0; i < arr.length; i++) { //배열의 길이만큼 반복문을 돌려
//			if(arr[i].equals("Z")) { //해당 인덱스의 원소가 "Z"라면
//				res -= Integer.parseInt(arr[i-1]); //전에 더했던 숫자를 빼고
//			} else { //"해당 인덱스의 원소가 "Z"가 아니라면
//				res += Integer.parseInt(arr[i]); //해당 원소를 더해준다.
//			}
//		}
//		return res;
//	}

	
	
	
	
	
	//----------------------------------------------------------------------------------
	
	
	
	
	
	
	//50번
//	public int[] solution(int n) {
//		
//		List<Integer> list = new ArrayList<Integer>(); 
//		
//		for(int i = 2; i <= n; i++) { 
//			while(n % i == 0) { //n 나누기 i 가 0이라면
//				list.add(i); //i를 list에 담고
//				n /= i; //n값 변경해준후 0이 안될때까지 반복한다.
//			} //0이 안된다면 다음 수로 넘어간다.
//		}
//		//스트림을 이용해 list에 중복값을 제거해주고 오름차순으로 정렬까지 간편하게 할 수 있다.
//		list = list.stream().distinct().sorted().collect(Collectors.toList());
//		
//		int[] res = new int[list.size()];
//		
//		for(int i = 0; i < res.length; i++) {
//			res[i] = list.get(i);
//		}
//		return res;
//	}

	
	
	
	
	
	//----------------------------------------------------------------------------------
	
	
	
	
	
	
	//51번
//	public int[] solution(String my_string) {
//		
//		List<Integer> list = new ArrayList<Integer>(); //숫자를 담을 list
//		
//		for(int i = 0; i < my_string.length(); i++) {
//			if(!(my_string.charAt(i) >= 'a' && my_string.charAt(i) <= 'z')) { //문자열의 글씨를 하나씩 가져와 숫자라면
//				list.add(Character.getNumericValue(my_string.charAt(i))); //list에 담는다
//			}
//		}
//		int[] res = new int[list.size()]; //list에 담긴 숫자를 int배열에 담아주고
//		
//		for(int i = 0; i < res.length; i++) {
//			res[i] = list.get(i);
//		}
//		
//		Arrays.sort(res); //오름차순으로 정렬해준다.
//		
//		return res;
//	}

	
	
	
	
	
	//----------------------------------------------------------------------------------
	
	
	
	
	
	
	//52번
//	public int solution(int n) {
//		
//		int res = 0; //합성수의 개수
//		
//		for(int i = 4; i <= n; i++) { //1,2,3은 합성수가 될수 없기 때문에 4부터 시작
//			 int x = 0; //약수의 갯수
//			 for(int j = 1; j <= i; j++) { //약수가 몇개인지 찾는다.
//				 if(i % j == 0) {
//					 x++;
//				 }
//			 }
//			 if(x >= 3) { //현재 i가 합성수라면
//				 res++; //변수값 1상승
//			 }
//		}
//		return res;
//	}

	
	
	
	
	
	//----------------------------------------------------------------------------------
	
	
	
	
	
	
	//53번
//	public int solution(int[] box, int n) {
//		
//		int res = 1;
//		
//		for(int i = 0; i < 3; i++) {
//			res *= box[i] / n; 
//		}
//		return res;
//	}
	//가로,세로,높이를 n으로 나눈값을 곱하면 된다.
	
	
	
	
	
	//----------------------------------------------------------------------------------
	
	
	
	
	
	//54번
//	public int[] solution(int[] numbers, String direction) {
//		
//		int[] res = new int[numbers.length];
//		
//		for(int i = 1; i < numbers.length; i++) {
//			if(direction.equals("right")) { //right라면
//				res[0] = numbers[numbers.length-1]; //배열의 첫번째 원소로 매개변수 배열의 마지막원소를 넣고
//				res[i] = numbers[i-1]; //두번째부터 매개변수 배열의 원소를 순서대로 넣는다.
//			} else { //left라면
//				res[numbers.length-1] = numbers[0]; //배열의 마지막 원소로 매개변수 배열의 첫번째 원소를 넣고
//				res[i-1] = numbers[i]; //매개변수 배열의 두번째 원소부터 순서대로 넣는다.
//			}
//		}
//		return res;
//	}

	
	
	
	
	
	//----------------------------------------------------------------------------------
	
	
	
	
	
	
	//55번
//	public int solution(int[] numbers, int k) {
//		
//		int idx = 1; //초기값을 1로 주고 두번째공을 던질때부터 +2를 해준다.
//		
//		for(int i = 1; i < k; i++) {
//			idx += 2;
//		}
//		
//		int res = idx % numbers.length; //idx변수 나누기 사람의 수의 나머지가 k번째로 공을 던질는 사람의 번호다. 
//		if(res == 0) { //idx변수와 사람의 수가 같을 경우 나머지가 0이 된다. 원래 의도는 마지막 사람이 공을 던진 사람이므로 마지막 사람을 idx변수 담아준다.
//			res = numbers.length;
//		}
//		
//		return res;
//	}

	
	
	
	
	
	//----------------------------------------------------------------------------------
	
	
	
	
	
	
	//56번
//	public int[][] solution(int[] num_list, int n){
//		
//		int[][] res = new int[num_list.length / n][n];; //결과값을 담을 2차원 배열
//	
//		int idx = 0; //매개변수 배열의 원소를 순서대로 가져오게 할려는 변수
//		for(int i = 0; i < res.length; i++) {
//			for(int j = 0; j < n; j++) {
//				res[i][j] = num_list[idx];
//				idx++;
//			}
//		}
//		return res;
//	}

	
	
	
	
	
	//----------------------------------------------------------------------------------
	
	
	
	
	
	
	//57번
//	public int solution(int[] dot) {
//		
//		int res;
//		
//		if(dot[0] > 0 && dot[1] > 0) {
//			res = 1;
//		} else if(dot[0] < 0 && dot[1] > 0){
//			res = 2;
//		} else if(dot[0] < 0 && dot[1] < 0){
//			res = 3;
//		} else {
//			res = 4;
//		}
//		return res;
//	}

	
	
	
	
	
	//----------------------------------------------------------------------------------
	
	
	
	
	
	
	//58번
//	public String solution(String rsp) {
//		
//		String res = "";
//		
//		//매개변수 문자열을 한글자씩 가져와 일치하는 경우의 값을 res문자열에 담는다.
//		for(int i = 0; i < rsp.length(); i++) {
//			switch(rsp.charAt(i)) {
//			case '2':
//				res += "0";
//				break;
//			case '0':
//				res += "5";
//				break;
//			case '5':
//				res += "2";
//				break;
//			}
//		}
//		return res;
//	}

	
	
	
	
	
	//----------------------------------------------------------------------------------
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
