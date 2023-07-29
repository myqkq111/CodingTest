package level_0;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Level_0_Method {
	
		//4번
//		  public String solution(String my_string, String overwrite_string, int s) {
//			  
//			  StringBuffer my_string_Buf = new StringBuffer(my_string); //setCharAt()사용하기 위해 StringBuffer로 변환
//			  int idx = 0; //overwrite_string 앞에서부터 문자 가져올 인덱스변수
//			  
//			  //s인덱스부터 시작해서 overwrite_string의 길이만큼 문자열을 바꿔줘야하기 때문
//			  for(int i = s; i < s + overwrite_string.length(); i++) {
//				  my_string_Buf.setCharAt(i, overwrite_string.charAt(idx));
//				  idx++;
//			  }
//			  
//			  my_string = my_string_Buf.toString(); //StringBuffer를 String으로 변환하여 my_string값 재설정
//			  
//			  return my_string;
//		  
//		  }
		 


		//---------------------------------------------------------------------------------

		

		//5번
//		public String solution(String[] arr) {
//			
//			String answer = "";
//			
//			for(int i = 0; i < arr.length; i++) {
//				answer += arr[i];
//			}
//			
//			return answer;
//		}

		
	

		//---------------------------------------------------------------------------------


		

		//6번
//		public int solution(int n) {
//			
//			int answer = 0;
//			
//			if(n % 2 == 0) {
//				for(int i = 2; i <= n; i += 2) {
//					answer += i;
//				}
//			}else {
//				for(int i = 1; i <= n; i += 2) {
//					answer += i;
//				}
//			}
//			
//			return answer;
//		}

	

		
		//---------------------------------------------------------------------------------


		

			//7번
//			public int solution(String ineq, String eq, int n, int m) {
//				
//				int su = 2;
//				
//				switch(ineq) {
//				
//				case "<":
//					
//					switch(eq) {
//					
//					case "=":
//						if(n <= m) {
//							su = 1;
//						}else {
//							su = 0;
//						}
//						break;
//						
//					case "!":
//						if(n < m) {
//							su = 1;
//						}else {
//							su = 0;
//						}
//						break;		
//						
//					}
//					
//					break;
//					
//				case ">":
//					
//					switch(eq) {
//					
//					case "=":
//						if(n >= m) {
//							su = 1;
//						}else {
//							su = 0;
//						}
//						break;
//						
//					case "!":
//						if(n > m) {
//							su = 1;
//						}else {
//							su = 0;
//						}
//						break;		
//						
//					}
//					
//					break;
//										
//				}
//				
//				return su;
//				
//				
//			}


		

		//---------------------------------------------------------------------------------

		
		

			//8번
//			public String solution(String code) {
//					
//				String mode = "0";
//				String ret = "";
//					
//				for(int i = 0; i < code.length(); i++) {
//					switch(mode) {
//						
//					case "0":
//							
//						if(code.charAt(i) == '1') {
//							mode = "1";
//						}else {
//							if(i % 2 == 0) {
//								ret += code.charAt(i);
//							}
//						}
//							
//						break;		
//							
//					case "1":
//							
//						if(code.charAt(i) == '1') {
//							mode = "0";
//						}else {
//							if(i % 2 == 1) {
//								ret += code.charAt(i);
//							}
//						}
//							
//						break;
//					}//switch				
//				}//for
//					
//				if(ret == "") {
//					return "EMPTY";
//				}else {
//					return ret;	
//				}
//						
//			}
	
	
	
	
	
	//---------------------------------------------------------------------------------
	
	
		
	
	
		//9번
//		public String solution(int[] numLog) {
//			
//			String answer = "";
//			//현재 인덱스와 전 인덱스의 값을 빼서 나온 값에 따라 answer변수에 알맞는 알파벳을 넣어준다.
//			for(int i = 1; i < numLog.length; i++) {	
//				if(numLog[i] - numLog[i-1] == 1) {
//					answer += "w";
//				}else if (numLog[i] - numLog[i-1] == -1) {
//					answer += "s";
//				}else if(numLog[i] - numLog[i-1] == 10) {
//					answer += "d";
//				}else {
//					answer += "a";
//				}
//			}//for
//			
//			return answer;
//			
//		}
	
	
	
	
	
	//---------------------------------------------------------------------------------
	
	
	
	
	
	
		//10번
//		public int[] solution(int[] arr, int[][] queries) {
//	        
//			int idx1;
//			int idx2;
//			int su;
//			
//			//2차원 배열의 i마다 들어있는 값들을 변수에 담아주고 
//			for(int i = 0; i < queries.length; i++) {
//				idx1 = queries[i][0];
//				idx2 = queries[i][1];
//				
//				//담아준 변수값과 arr변수의 인덱스에 해당하는 값을 서로 바꿔주는 작업
//				su = arr[idx1];
//				arr[idx1] = arr[idx2];
//				arr[idx2] = su;
//			}
//			
//			return arr;
//			
//	    }
	
	
	
	
	
	
	//---------------------------------------------------------------------------------
	
	
	
	
	
	
		//11번
//		public int[] solution(int[] arr, int[][] queries) {
//	        
//			int s, e, k;
//			int[] answer = new int[queries.length];
//			
//			
//			for(int i = 0; i < queries.length; i++) {
//				s = queries[i][0]; //arr[]의 시작인덱스
//				e = queries[i][1]; //arr[]의 끝인덱스
//				k = queries[i][2];
//				
//				for(int j = s; j <= e; j++) { 
//					if(arr[j] > k) { //k값보다 클경우만
//						if(answer[i] == 0) { // int는 값이 아무것도 없을 때 0을 반환한다.를 이용하여 처음 등록했을땐 그냥 등록하기
//							answer[i] = arr[j];
//						}else { //처음 등록하는게 아니라면
//							if(answer[i] >= arr[j]) { //원래있던 값과 새로 넣을 값을 비교하여 새로 넣을 값이 더 작을 경우
//								answer[i] = arr[j]; //새로운 값으로 바꾼다.
//							}else { //원래있던값이 더 작을 경우
//								continue; //가장 가까운 증감식으로 이동.(원래있던 값을 그대로 가져간다.)
//							}
//						}					 
//					}				
//				}
//				if(answer[i] == 0) { //반복문을 다 돌았을 때 answer[i]에 값이 아무것도 없을 경우 -1을 넣는다.
//					answer[i] = -1;
//				}
//			}
//			
//			return answer;
//			
//	    }
	
	
	
	
	
	//---------------------------------------------------------------------------------
	
	
	
	
	
	
		//12번
//		public int[] solution(int[] arr, int[][] queries) {
//			
//			int s, e, k;
//			
//			for(int i = 0; i < queries.length; i++) {
//				s = queries[i][0]; //arr[]의 시작인덱스
//				e = queries[i][1]; //arr[]의 끝인덱스
//				k = queries[i][2]; //배수 비교값
//				for(int j = s; j <= e; j++) {
//					if(j % k == 0) { //나눈 값이 0이라면 배열이라는 뜻
//						arr[j]+=1; //해당arr의 인덱스 값을 1 더해준다.
//					}
//				}
//			}
//			return arr;
//		}

	
	
	
	
	//---------------------------------------------------------------------------------
	
	
	
	
	
	
		//13번
//		public int[] solution(int l, int r) {
//	        
//			 String su; 
//			 String storage = "";
//			
//			w:for(int i = l; i <= r; i++) { //받은 파라미터 l부터 r까지 1씩 증가시키는 반복문
//				su = Integer.toString(i); // 숫자 i를 문자열로 바꾼다.
//				for(int j = 0; j < su.length(); j++) { // su의 자릿수를 알기위한 반복문
//					if(su.charAt(j) == '5' || su.charAt(j) == '0') { // su가 100단위이든 1000단위이든 앞에서부터 하나씩 가져와서
//						if(j == (su.length()-1)) {					 // 5나 0인지 확인한다.
//							storage += i + ","; //값 5나 0으로만 이루어져있다면 문자열 변수에 ,와 같이 담아준다.
//						}else {
//							continue; //값이 5나 0으로만 이루어져있는지 확인하기 위함. 
//						}
//					}else {
//						continue w; //값이 5나 0이 아닌 다른 숫자가 들어갔다면 다음 값으로 넘어간다.
//					}
//				}
//			}
//			 if(storage == "") { // 만약 5나 0으로만 이루어진 값이 없다면
//				 storage = -1 + ","; // -1과 ,를 변수에 담는다.
//			 }
//			 
//			 String[] StrArr = storage.split(","); // , 를 변수에 같이 담은이유 : split메서드를 이용해 ,를 기준으로 배열에 담기위해
//			 
//			 int[] arr = new int[StrArr.length];
//			 
//			 for(int i = 0; i < StrArr.length; i++) { // 값이 담긴 문자열 배열을 숫자배열로 바꿈
//				 arr[i] = Integer.parseInt(StrArr[i]);
//			 }
//			 
//			 return arr;
//			
//	    }

	
	
	
	
	//---------------------------------------------------------------------------------
	
	
	
	
	
		//14번
//		public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
//		
//			if((x1 || x2) && (x3 || x4)) {
//				return true;
//			}else {
//				return false;
//			}
//		
//		}

	
	
	
	
	//---------------------------------------------------------------------------------
	
	
	
	
	
	
		//15번
//		public String solution(String my_string, int[][] queries) {
//			
//			int start; //queries의 s
//			int end; //queries의 e
//			String subStr; //substring()로 인덱스 범위 만큼 짜른 문자열 담는곳 
//			StringBuffer my_stringBuf = new StringBuffer(my_string); //setCharAt()를 사용하기 위함
//			
//			for(int i = 0; i < queries.length; i++) {
//				
//				String turnStr = ""; //뒤집은 문자열
//				
//				start = queries[i][0];
//				end = queries[i][1];
//		
//				subStr = my_stringBuf.substring(start, end+1);
//			
//				for(int j = (subStr.length()-1); j >= 0; j--) {
//					turnStr += subStr.charAt(j);
//				}
//				
//				for(int j = start; j <= end; j++) {
//					my_stringBuf.setCharAt(j, turnStr.charAt(j-start));
//				}				
//				
//			}
//			
//			my_string = my_stringBuf.toString();
//			return my_string;
//			
//		}

	
	
	
	
	//---------------------------------------------------------------------------------
	
	
	
	
	
		//16번
//		public int solution(int a, int b, int c, int d) {
//			
//			int answer = 0;
//			
//			if(a == b && b == c && c == d) {
//				answer = 1111 * 2; 
//			} else if(a == b && b == c && c != d) {
//				answer = (10 * a + d) * (10 * a + d);
//			} else if(a == b && b == d && b != c) {
//				answer = (10 * a + c) * (10 * a + c);
//			} else if(a == c && c == d && c != b) {
//				answer = (10 * a + b) * (10 * a + b);
//			} else if(b == c && c == d && c != a) {
//				answer = (10 * c + a) * (10 * c + a);
//			} else if(a == b && c == d && b != c) {
//				answer = (b + c) * (b - c);
//			} else if(a == c && b == d && a != b) {
//				answer = (a + b) * (a - b);
//			} else if(a == d && b == c && a != b) {
//				answer = (a + b) * (a - b);
//			} else if(a == b && c != d && b != c && b != d) {
//				answer = c * d;
//			} else if(a == c && b != d && a != b && a != d) {
//				answer = b * d;
//			} else if(a == d && b != c && a != b && a != c) {
//				answer = b * c;
//			} else if(b == c && a != d && b != a && b != d) {
//				answer = a * d;
//			} else if(b == d && a != c && b != a && b != c) {
//				answer = a * c;
//			} else if(c == d && a != b && c != a && c != b) {
//				answer = a * b;
//			} else {
//				int min = 6;
//				if(min > a) {
//					min = a;
//				}
//				if(min > b) {
//					min = b;
//				}
//				if(min > c) {
//					min = c;
//				}
//				if(min > d) {
//					min = d;
//				}
//				answer = min;
//			}
//			
//			return answer;
//			
//		}

	
	
	
	
	//---------------------------------------------------------------------------------
	
	
	
	
	
	
		//17번
//		public int[] solution(String[] intStrs, int k, int s, int l) {
//			
//			String res = "";
//			
//			for(int i = 0; i < intStrs.length; i++) {
//				int subStr = Integer.parseInt(intStrs[i].substring(s, s+l)); //int로 형변환 하는이유는 k값이랑 비교하기 위해서
//				if(subStr > k) { //k값보다 클때
//					res += (subStr + ","); //rse변수에 담는다.
//				}
//			}			
//			String[] resArr = res.split(","); // ,를 기준으로 짤라서 배열에 담는다.
//			
//			int[] answer = new int[resArr.length];
//			
//			for(int i = 0; i < resArr.length; i++) {
//				answer[i] = Integer.parseInt(resArr[i]); //앞에서부터 하나씩 꺼내와 int로 형변환하고 int배열에 담는다.
//			} //처음부터 int배열에 안담는 이유는 배열을 생성할 때 방의 갯수를 정해줘야하는데 방의 갯수를 정확히 모른다.
			  //intStrs배열의 갯수만큼 만들어도 되지만 그렇게 하면 빈방이 생길수도 있다.
			  //빈방이 있다고 오류가 나는건 아니지만 마음에 안들기 때문..
//			return answer;
//		}

	
	
	
	
	//---------------------------------------------------------------------------------
	
	
	
	
	
	
		//18번
//		public String[] solution(String my_string) {
//			
//			String[] arr = new String[my_string.length()];
//			
//			for(int i = 0; i < my_string.length(); i++) {
//				arr[i] = my_string.substring(i,my_string.length());
//			}
//			
//			Arrays.sort(arr); //배열을 오름차순으로 정렬
//			
//			return arr; //정렬된 배열 반환
//		}

	
	
	
	
	//---------------------------------------------------------------------------------
	
	
	
	
	
	
	
		//19번
//		public String solution(String my_string, int m, int c) {
//			
//			String width = ""; //m글자씩 담는 변수
//			String height = ""; //c번째 적은 글자들을 모으는 변수
//			
//			for(int i = 0; i < my_string.length(); i++) {
//				if(i % m == 0) {//m글자 담았으면
//					width = ""; //초기화해서
//					width += my_string.charAt(i); //다시 담기
//				}else {
//					width += my_string.charAt(i); //m글자 안담았으면 계속담기
//				}
//				
//				if(width.length() == c ) { //담은 글자갯수가 c와 같다면
//					height += width.charAt(c-1); //c번째에 있는 값을 height변수에 담는다.
//				}
//			}
//			
//			return height;
//			//배열을 사용했더라면 좀 더 편하게 했을거같긴한데 배열을 사용하지 않고
//			//코드를 짜보고싶었기 때문에 이런 방식으로 했다.
//		}

	
	
	
	
	//---------------------------------------------------------------------------------
	
	
	
	
	
		
		//20번
//		public int[] solution(String my_string) {
//			
//			int[] res = new int[52]; //대소문자 포함 알파벳이 총 52개이다.
//			int upper = 65; //대문자 A의 아스키코드
//			int lower = 97; //소문자 a의 아스키코드
//			
//			for(int i = 0; i < 52; i++) { //52개의 알파벳을 학인하기 위함.
//				res[i] = 0; //각각의 방에 0으로 초기값을 준다.
//				for(int j = 0; j < my_string.length(); j++) {//my_string의 문자를 하나씩 확인하기 위해 길이만큼 돌린다.
//					if( i < 26 ) { // res배열의 0~25인덱스까지가 대문자
//						if( upper == my_string.charAt(j)) { //문자열을 하나씩 알파벳과 비교하여
//							res[i]++; //맞는게 있다면 그 대문자가 속해있는 배열방의 값을 1씩 올린다.
//						}
//					}else { // res배열의 26~52인덱스까지가 소문자
//						if(lower == my_string.charAt(j)) { //문자열을 하나씩 알파벳과 비교하여
//							res[i]++; //맞는게 있다면 그 대문자가 속해있는 배열방의 값을 1씩 올린다.
//						}
//					}
//				} //문자열 확인 반복문
//				//하나의 알파벳 갯수확인이 끝났다면 다음알파벳을 확인하기 위해 아스키코드가 담긴 변수값을 올려야하는데
//				if( i < 26 ) { //i가 26미만이라면 대문자알파벳
//					upper++; //값을 1증가시킴으로써 다음 알파벳의 아스키코드를 의미한다.
//				}else { //i가 26이상이라면 소문자알파벳
//					lower++; //값을 1증가시킴으로써 다음 알파벳의 아스키코드를 의미한다.
//				}
//			}
//			return res;
//		}

	
	
	
	
	//---------------------------------------------------------------------------------
	
	

			

	
	
		//21번
//		public int[] solution(int n, int k) {
//		
//			//배열은 선언할 때 방의 갯수를 지정해줘야하는데 처음에는 방의 갯수를 모른다.
//			//이럴때 list를 이용하면 편리하다.
//			//list는 방의 갯수를 지정해주지않고 값이 추가되면 방의 갯수가 늘어나고 값이 삭제되면 방의 갯수도 줄어드는
//			//유동적인 모습을 보인다.
//			List<Integer> list = new ArrayList<>(); 
//		
//			for(int i = 1; i <= n; i++) { //1이상 n이하의 값을 순서대로
//				if(i % k == 0) { //k와 나누어 나머지가 0이면 k의 배수.
//					list.add(i); //i값이 배수일경우 list에 담아주기.
//				}
//			}
//		
//			int[] mul = new int[list.size()]; //list에 담겨있는 갯수만큼 배열 방 생성
//		
//			for(int i = 0; i < mul.length; i++) {
//				mul[i] = list.get(i); //list에 담겨있는 값 배열로 옮기기
//			}
//		
//			Arrays.sort(mul); //배열 오름차순 정렬
//		
//			return mul;
//		
//		}

	



	

	//---------------------------------------------------------------

	


	

	

		//22번
//	 	public String solution(String my_string, int[] indices) {
//		 
//		 	StringBuffer sb = new StringBuffer(my_string); //deleteCharAt()를 사용하기 위함.
//			 Integer[] it = new Integer[indices.length];//Arrays.sort()내림차순으로 정렬을 할려면 int로는 안되고 Integer같은 객체로 해야한다.
//		 
//			 for(int i = 0; i < it.length; i++) {//int배열을 Integer배열로 바꿈
//				 it[i] = indices[i];
//			 }
//		 
//			 Arrays.sort(it,Collections.reverseOrder()); //Collections.reverseOrder() : 내림차순으로 정렬
//		  
//			 for(int i = 0; i < indices.length; i++) {
//				 sb.deleteCharAt(it[i]); //인덱스값 지우기
//			 }
//		 
//			 return sb.toString();
//			 //문자열의 중간값을 지우게 되면 뒤에 있던 인덱스들이 한칸씩 앞으로 당겨지게 되서 인덱스 순서가 엉망이된다.
//			 //이러한 상황을 방지하기 위해 내림차순으로 정렬해주고 인덱스값이 큰애들부터 지우면 앞에 있는 문자들의 인덱스에는 영향을 
//			 //끼치지 않기 때문에 원하는 결과값을 만들 수 있다.
//		 }


	


	

	//---------------------------------------------------------------

	
		

	
	

		//23번
//		public int solution(int[] arr, int idx) {
//		
//			int res = 0; //초기값을 0으로 설정
//		
//			for(int i = idx+1; i < arr.length; i++) { //idx + 1 을 하는이유는 idx의 값보다 커야하기 때문이다.
//				if(arr[i] == 1) { //값이 1이라면
//					res = i; //res변수에 현재 인덱스를 넣는다.
//					break; //그리고는 반복문 탈출
//						   //값이 1인 가장작은 인덱스 값을 찾는문제이기 때문에 탈출해야한다.
//						   //탈출안하면 반복문이 계속돌면서 값이 1인 인덱스를 res에 계속 넣어주게되고
//						   //결국엔 값이 1인 가장 큰 인덱스가 res변수에 들어가게 된다.
//				}			
//			}
//			//idx보다 커야하기 때문에 res에 0값이 들어갈 일이 없다.
//			if(res == 0) { //만약 res가 0이라면(일치하는 인덱스가 없을 경우)
//				res = -1; //-1을 넣는다.
//			}
//			return res;
//		}


	


	

	//---------------------------------------------------------------
	
	
	
	
	
	
		//24번
//		public int[] solution(int n, int[] slicer, int[] num_list) {
//			
//			//배열은 선언할 때 방의 갯수를 지정해줘야하는데 처음에는 방의 갯수를 모른다.
//			//이럴때 list를 이용하면 편리하다.
//			//list는 방의 갯수를 지정해주지않고 값이 추가되면 방의 갯수가 늘어나고 값이 삭제되면 방의 갯수도 줄어드는
//			//유동적인 모습을 보인다.
//			List<Integer> list = new ArrayList<Integer>();
//			
//			if(n == 1) {
//				for(int i = 0; i < slicer[1]; i++) {
//					list.add(num_list[i]); 
//				}
//			} else if(n == 2) {
//				for(int i = slicer[0]; i < num_list.length; i++) {
//					list.add(num_list[i]);
//				}
//			} else if(n == 3) {
//				for(int i = slicer[0]; i <= slicer[1]; i++) {
//					list.add(num_list[i]);
//				}
//			} else if(n == 4) {
//				for(int i = slicer[0]; i <= slicer[1]; i+=slicer[2]) {
//					list.add(num_list[i]);
//				}
//			}
//			
//			int[] res = new int[list.size()];
//			//list에 있는 값을 배열에 담기
//			for(int i = 0; i < list.size(); i++) {
//				res[i] = list.get(i);
//			}
//			
//			return res;
//			
//		}


	

	

	//---------------------------------------------------------------
	
	
	
	
	
	
		//25번
//		public int[] solution(int[] arr, int[][] intervals) {
//			
//			List<Integer> list = new ArrayList<Integer>();
//			
//			for(int i = 0; i < intervals.length; i++) { //2차원 배열의 모든 배열을 돌기위한 반복문
//				for(int j = intervals[i][0]; j <= intervals[i][1]; j++) {//닫힌구간을 돌기 위한 반복문 
//					list.add(arr[j]); //값을 list에 담아주고
//				}
//			}
//			
//			int[] res = new int[list.size()];
//			
//			for(int i = 0; i < res.length; i++) {
//				res[i] = list.get(i); //list의 값을 순서대로 배열에 담는다.
//			}
//			
//			return res;
//		}


	

	

	//---------------------------------------------------------------
	
	
	
	
		
		
		//26번
//		public int[] solution(int[] arr) {
//		
//			List<Integer> list1 = new ArrayList<>(); //arr배열에 값이 2인 인덱스들을 담을 list
//			List<Integer> list2 = new ArrayList<>(); //부분배열을 담을 list
//		
//			for(int i = 0; i < arr.length; i++) {
//				if(arr[i] == 2) { //값이 2인 인덱스를
//					list1.add(i); //list에 담는다
//				}
//			}
//		
//			if(list1.size() >= 2) { //값이 2인 인덱스가 2개 이상일 경우
//				for(int i = list1.get(0); i <= list1.get(list1.size()-1); i++) {
//					list2.add(arr[i]); //list1에 담긴 첫번째와 마지막 인덱스의 부분배열을 list2에 담는다.
//				}
//			} else if(list1.size() == 1) { //값이 2인 인덱스가 1개일 경우
//				list2.add(arr[list1.get(0)]); //list1의 담긴 인덱스와 일치하는 arr배열의 값을 list2에 담는다(어쩌피 2가 담긴다)
//			} else if(list1.size() == 0) { //값이 2인 인덱스가 하나도 없을경우
//				list2.add(-1); //-1을 담는다.
//			}
//		
//			int[] res = new int[list2.size()]; //list2의 갯수만큼 배열의 방의갯수를 만들어준다.
//		
//			for(int i = 0; i < list2.size(); i++) {
//				res[i] = list2.get(i); //list2의 값들을 순서대로 res배열에 담는다.
//			}
//		
//			return res;
//		
//	}

	

	
	
	
	

	//---------------------------------------------------------------------------------------

	

	

	

	

	 	//27번
//		public int[] solution(int[] arr, int[] query) {	
//			List<Integer> list = new ArrayList<>(); //arr배열을 list에 담는다 
//												//조건에 맞는 인덱스를 지우기 위해
//			for(int i = 0; i < arr.length; i++) {
//				list.add(arr[i]);
//			}
//		
//			for(int i = 0; i < query.length; i++) {
//				if(i % 2 == 0) { //인덱스가 짝수일때
//					//내림차순으로 값을 자른이유는 오름차순으로 하면 인덱스 4번을 지우고 5번을 지워야하는데
//					//4번을 지우는순간 뒤에 있는 인덱스들이 하나씩 당겨지기 때문에 내림차순으로 잘라야 문제없다.	
//					for(int j = list.size()-1; j > query[i]; j--) { //인덱스 뒷부분을 잘라버린다.
//						list.remove(j); //remove()를 사용하기 위해 배열을 list에 담았다.
//					}
//				} else if(i % 2 == 1) { //인덱스가 홀수일때
//					for(int j = query[i]-1; j >= 0; j--) { //인덱스 앞부분을 잘라버린다.
//						list.remove(j);
//					}
//				}
//			}
//		
//			int[] res = new int[list.size()]; //작업을 마치고 남은 값들을 배열에 담는다.
//		
//			for(int i = 0; i < list.size(); i++) { 
//				res[i] = list.get(i);
//			}
//		
//			return res;
//		}



	

	

	//---------------------------------------------------------------------------------------

	

	

	

		//28번
//		public int[] solution(int[] num_list, int n) {
//		
//			List<Integer> list = new ArrayList<>(); //조건에 맞게 원소들을 담을 list
//		
//			for(int i = n; i < num_list.length; i++) {
//				list.add(num_list[i]); //먼저 n번째 원소 이후의 원소를 list에 담는다.
//			}
//		
//			for(int i = 0; i < n; i++) {
//				list.add(num_list[i]); // 그 다음 n번째까지의 원소들을 담으면
//			}		//n번째 원소 이후의 원소가 앞에붙고 n번째까지의 원소들이 뒤에 붙게 된다.
//		
//			int[] res = new int[list.size()];
//		
//			for(int i = 0; i < list.size(); i++) { //list를 배열로 바꿈.
//				res[i] = list.get(i);
//			}
//	
//			return res;
//		}




	

	//---------------------------------------------------------------------------------------

	

	

		
		//29번
//		public String[] solution(String[] str_list) {
//			
//			List<String> list = new ArrayList<>(); //기준에 맞는 문자열들을 담을 list
//		 
//			for(int i = 0; i < str_list.length; i++) { //str_list를 순서대로 돌리면서 가장 먼저 나오는 l이나 r을 찾는다
//				if(str_list[i].equals("l")) { //가장 먼저 나온 문자열이 l이라면
//					for(int j = 0; j < i; j++) { //왼쪽 문자열을
//						list.add(str_list[j]); //list에 담는다
//					}
//					break; //그리고 반복문 탈출
//				}else if(str_list[i].equals("r")) { //가장 먼저 나온 문자열이 r이라면
//					for(int j = i+1; j < str_list.length; j++) { //오른쪽 문자열을
//						list.add(str_list[j]); //list에 담는다
//					}
//					break; //그리고 반복문 탈출
//				}	 											
//			}
//			String[] res = new String[list.size()];
//			//list를 배열에 담고 반환한다
//			//만약 문자열에 l이나 r이 없을경우 list는 비어있고 배열의 방도 생성되지않는다
//			//비어있는 배열이 반환되는것
//			for(int i = 0; i < list.size(); i++) {
//				res[i] = list.get(i);
//			}		
//			
//			return res;
//	
//		}




	

	//---------------------------------------------------------------------------------------
	
	
	
	
	
	
		 //30번
//		 public String[] solution(String[] names) {
//			 
//			 List<String> list = new ArrayList<String>();
//			 
//			 for(int i =0; i < names.length; i+=5) {
//				 list.add(names[i]);
//			 }
//			 
//			 String[] res = new String[list.size()];
//			 
//			 for(int i = 0; i < list.size(); i++) {
//				 res[i] = list.get(i);
//			 }
//			 return res;
//		 }
		 //쉽게 생각해서 결과물이 그룹 가장 앞에있는 사람들의 이름을 담은 리스트이다.
		 //그렇기 때문에 한그룹에 5명씩이니깐 i의 값을 5씩 증가시키면서 해당인덱스의 있는 사람의 이름을
		 //담으면 된다.



			

	
	//---------------------------------------------------------------------------------------
		
		
		
		
		
		
		
		  //31번
//		  public String[] solution(String[] todo_list, boolean[] finished) {
//			  
//			  List<String> list = new ArrayList<String>();
//			  
//			  for(int i = 0; i < todo_list.length; i++) { //순서대로 인덱스를 조회하여 
//				  if(finished[i] == false) {  //값이 false라면
//					  list.add(todo_list[i]); //해당 인덱스를 가진 todo_list의 값을 list에 담는다.
//				  }
//			  }
//			  
//			  String[] res = new String[list.size()];
//			  
//			  for(int i = 0; i < list.size(); i++) {
//				  res[i] = list.get(i);
//			  }
//			  return res;
//		  }



			

			
	//---------------------------------------------------------------------------------------
		
		
	
	
	
	
		  //32번
//		  public int[] solution(int[] arr, int[][] queries) {
//			  
//			  for(int i = 0; i < queries.length; i++) { //2차원배열의 조건값을 가져오기 위해 2차원배열의 길이만큼 반복문을 돌린다.
//				  for(int j = 0; j < arr.length; j++) { //arr배열의 갯수만큼 인덱스를 돌려
//					  if(queries[i][0] <= j && queries[i][1] >= j) { //조건에 맞는다면
//						  arr[j]++; //arr배열의 해당 인덱스 값을 올린다.
//					  }
//				  }
//			  }
//			  
//			  return arr;
//			  
//		  }



			

			
	//---------------------------------------------------------------------------------------
	
	
	
	
	
	
		  //33번
//		  public int solution(int[] arr) {
//			  
//			  int x = 0; //반복횟수
//			  
//			  while(true) { //무한반복
//				  
//				  int count = 0; //무한반복을 탈출하기위한 조건
//				  
//				  for(int i = 0; i < arr.length; i++) {
//					  if(arr[i] >= 50 && arr[i] % 2 == 0) {
//						  arr[i]/=2;
//					  } else if(arr[i] < 50 && arr[i] % 2 == 1) {
//						  arr[i] = (arr[i] * 2) + 1;
//					  } else {
//						count++;  //arr의 값이 안바뀌는 인덱스가 있을때마다 1씩상승
//					  }
//				  }  
//		
//				  if(count == 6) { //모든 값이 안바뀌면 6이 되고 6이 되었다는건 더이상 반복해봤자
//					  			   //arr배열의 값은 안바뀐다는 뜻이다.
//					  break;	   //그렇다면 무한반복을 탈출하고 반복한 횟수를 반환한다.
//				  }	
//				  
//				  x++; //반복횟수를 증가시키는 코드를 맨 마지막에 쓴이유는
//				  	   //더 이상 모든 값이 바뀌지 않을때 가장 작은 반복값을 반환해야하기 때문에
//				  	   //탈출문break뒤에다 사용
//				  	   //한마디로 값이 바뀌었을때 x값은 증가한다.
//				  
//			  } //while
//			  return x;
//		  }


		  

			

			
	//---------------------------------------------------------------------------------------
	
		  
		  
		  
		  
		  
		  
		  //34번
//		  public int solution(int[] num_list) {
//			  
//			  int count = 0; //나누기 연산의 횟수
//			  
//			  for(int i = 0; i < num_list.length; i++) { //int배열의 길이만큼 돌린다
//				  while(true) { //반복문을 몇번 돌려야하는지 명확하지 않기 때문에 무한반복으로 돌린다.
//					  if(num_list[i] != 1) { //해당 인덱스의 값이 1이 아니라면
//						  if(num_list[i] % 2 == 0) { //값을 짝수인지 홀수 인지 구별하고
//							  num_list[i] /= 2;		 //각자 맞는 연산을 해준다.
//							  count++;				 //그리고 count를 1증가시킨다.
//						  } else {
//							  num_list[i] = (num_list[i]-1) / 2;
//							  count++;
//						  }
//					  } else { //인덱스의 값이 1이라면
//						  break; //무한반복을 탈출하여 다음 인덱스 값으로 넘어간다.
//					  }
//				  }
//			  }		  
//			  return count;		  
//		  }


		  

			

			
	//---------------------------------------------------------------------------------------
		  
		  
		  
		 
		  
		   //35번
//		    public int solution(String myString, String pat) {
//			  
//			    String lowMy = myString.toLowerCase(); //대소문자를 구분하지 않는다고 했으니
//			    String lowPat = pat.toLowerCase();	   //두 문자열을 소문자로 바꿔준다.
//			    int res;
//			    
//			    if(lowMy.contains(lowPat)) { //contains는 대소문자를 구분하기 때문에 두 문자열을 소문자로 바꿔준것이다.(대문자로 해도 된다.)
//			    	res = 1;				 
//			    } else {
//			    	res = 0;
//			    }
//			    
//			    return res;
//			  
//		    }


			  

			

			
	//---------------------------------------------------------------------------------------
	
	
	
	
	
	
	
		  //36번
//		  public String[] solution(String[] strArr) {
//			  
//			  for(int i = 0; i < strArr.length; i++) {
//				  if(i % 2 == 0) {
//					  strArr[i] = strArr[i].toLowerCase();
//				  }else {
//					  strArr[i] = strArr[i].toUpperCase();
//				  }
//			  }
//			  return strArr;
//		  }
		  //인덱스가 짝수인지 홀수인지만 구하면 쉽게 풀수있는 문제다.

		  

			

			
	//---------------------------------------------------------------------------------------
	
	
	
	
	
	
	
		  //37번
//		  public String solution(String myString) {
//			  //A를 제외한 모든 알파벳은 소문자로 변환하기 때문에 넘어온 문자열을 소문자로 바꿔주고 Buffer로 변환시켜준다.
//			  StringBuffer sb = new StringBuffer(myString.toLowerCase());
//			  
//			  for(int i = 0; i < myString.length(); i++) { 
//				  if(sb.charAt(i) == 'a') { //소문자로 바꾼 문자열중 a가 있다면
//					  sb.setCharAt(i, 'A'); //a를 대문자로 바꿔준다.
//				  }				  
//			  }
//			  String res = sb.toString(); //Buffer을 문자열형태로 다시 변환하고 반환.
//			  
//			  return res;
//		  }

		  

			

			
	//---------------------------------------------------------------------------------------
		  
		  
		  
		  
		  
		  
		  
		  //38번
//		  public String solution(String myString, String pat) {
//			  
//			  String res = "";
//			  
//			  if(myString.contains(pat)) { //myString문자열에 pat이 있는지없는지 확인
//				  int idx = myString.lastIndexOf(pat); //lastIndexOf() = 해당값의 가장 마지막에 있는 인덱스를 반환
//				  res = myString.substring(0,idx) + pat; //그렇게 찾은 인덱스를 이용해서 문자열 만들기
//			  }
//			  
//			  return res;
//			  
//		  }

		  

			

			
	//---------------------------------------------------------------------------------------
		  
		  
		  
		  
		  
		  
		  
		  //39번
//		  public int solution(String myString, String pat) {
//			  
//			  StringBuffer sb = new StringBuffer(myString); //deleteCharAt()를 사용하기 위함
//			  
//			  int count = 0; //등장하는 횟수 카운트
//			  
//			  while(true) {
//				  if(myString.contains(pat)) { //myString에 pat가 있다면
//					  int idx = sb.indexOf(pat); //인덱스값을 구해서
//					  myString = sb.deleteCharAt(idx).toString(); //첫번째 문자만 삭제시킨다.
//					  //등장하는 횟수를 1카운트하고 해당값의 문자하나를 삭제한다.
//					  //그러면 다음 반복문때는 또다른 중복 문자열을 찾게된다.
//					  count++;
//				  } else {
//					  break;
//				  }
//			  }
//			  return count;
//		  }

		  

			

			
	//---------------------------------------------------------------------------------------
	
	
	
	
	
	
		  //40번
//		  public String[] solution(String my_string) {
//			  // \\s+ = 한개이상의 공백을 한개로 처리하는것
//			  // 대신 문자열 앞뒤에 공백이 있다면 그 공백도 배열에 담는다
//			  // 그렇기 때문에 trim()으로 앞뒤 공백을 지운뒤 split()사용
//			  String[] res = my_string.trim().split("\\s+"); 
//			  
//			  return res;
//			  
//		  }

		  

			

			
	//---------------------------------------------------------------------------------------
	
		  
		  
		  
		  
		  
		  //41번
//		  public int solution(String binomial) {
//			  
//			  int res = 0;			  
//			  String[] spl = binomial.split(" "); //매개변수를 공백으로 나누어 배열에 담아준다.  
//			  
//			  switch(spl[1]) { //1인덱스 값에 따른 계산법
//			  case "+":
//				  res = Integer.parseInt(spl[0]) + Integer.parseInt(spl[2]); //문자열이기 때문에 연산을 할려면 int로 바꿔줘야한다.
//				  break;
//			  case "-":
//				  res = Integer.parseInt(spl[0]) - Integer.parseInt(spl[2]);
//				  break;
//			  case "*":
//				  res = Integer.parseInt(spl[0]) * Integer.parseInt(spl[2]);
//				  break;
//			  }
//			  
//			  return res;
//			  
//		  }

		  

			

			
	//---------------------------------------------------------------------------------------
		  
		  
		 
		  
		  
		  
		  
		  //42번
//		  public int solution(String myString, String pat) {
//			  
//			  int res;
//			  StringBuffer sb = new StringBuffer(myString); //setCharAt() 를 사용하기 위함
//			  
//			  for(int i = 0; i < sb.length(); i++) { //문자열의 길이만큼 반복문
//				  if(sb.charAt(i) == 'A') { //인덱스값이 A라면
//					  sb.setCharAt(i, 'B'); //B로
//				  } else { //B라면
//					  sb.setCharAt(i, 'A'); // A로 바꾼다.
//				  }				  
//			  }
//			  String chString = sb.toString(); //contains() 사용하기 위해 다시 String으로 변환
//			  if(chString.contains(pat)) { //A와 B를 바꾼 문자열에 pat문자열이 포함되어 있다면 1 아니면 0
//				  res = 1;
//			  } else {
//				  res = 0;
//			  }			  
//			  return res;
//		  }
		  
		  

			

			
	//---------------------------------------------------------------------------------------
		  
		  
		  
		  
		  
		  
		  //43번
//		  public String solution(String rny_string) {
//			  
//			  String res = rny_string.replace("m", "rn"); //문자열 중에 지정한 문자를 다른 문자로 바꾸는 메서드
//			  
//			  return res;
//		  }

		  

			

			
	//---------------------------------------------------------------------------------------
		  
		 
	
	
	
	
	
		  //44번
//		  public String[] solution(String myStr) {	
//			  
//			  String a = myStr.replaceAll("[a-c]", " "); //문자열의 a,b,c를 공백으로 바꿔준다.
//			  String[] res;
//			  
//			  if(a.trim().isEmpty()) { // 공백으로 바꿔준 문자열이 비어있는지 확인
//				  res = new String[]{"EMPTY"}; //비어있다면 EMPTY값을 넣어주고
//			  } else {
//				  res = a.trim().split(" "); //아니라면 공백제거후 문자열 사이에 있는 공백을 기준으로 배열에 담는다.
//			  }								
//			  return res;
//		  }

		  

			
	

			
	//---------------------------------------------------------------------------------------
	
	
	
	
	
	
	
	
		 	//45번
//			public int[] solution(int[] arr, boolean[] flag) {
//			
//			List<Integer> list = new ArrayList<>();
//			
//			for(int i = 0; i < flag.length; i++) { //boolean배열의 길이만큼 반복문을 돌린다.
//				if(flag[i] == true) { //boolean배열의 인덱스 값이 true인지 아닌지 확인한다.
//					for(int j = 0; j < arr[i]*2; j++) { //true라면 
//						list.add(arr[i]); //arr[i]의 값을 그 값만큼 list에 담는다.
//					}
//				} else { //false라면
//					int size = list.size(); //else로 왔을때 list에 담긴 갯수
//					for(int j = list.size()-1; j >= size-arr[i]; j--) { //뒤에서 arr[i]의 값만큼 삭제한다.
//						list.remove(j);      //처음에는 j >= list.size[]-arr[i]; 로 했었는데 오류가나서 확인해보니깐
//					}						 //list.remove로 뒤에서 값을 지울때마다 list 사이즈도 1씩 줄어들면서 값이 계속 바뀌고 있었다.
//				}							 //그렇기 때문에 else문으로 들어왔을때 list에 갯수를 size 변수에 담아준것이다.
//			}
//			
//			int[] res = new int[list.size()]; //list에 담긴 최종값을 배열에 담는과정
//			
//			for(int i = 0; i < list.size(); i++) {
//				res[i] = list.get(i);
//			}
//			return res;
//		}


	
	
	
	


	//---------------------------------------------------------------------------------------


	
	
	
	
	
	
			//46번
//			public int[] solution(int[] arr) {
//				
//				List<Integer> list = new ArrayList<>(); //값을 담을 list
//				
//				for(int i = 0; i < arr.length; i++) { //arr배열의 길이만큼 반복문을 돌리면서
//					if(list.size() == 0 || list.get(list.size()-1) != arr[i]) { //list에 아무것도 안담겨 있거나 list의 마지막값이 arr[i]의 값과 다르다면
//						list.add(arr[i]); //list에 값을 추가한다.
//					} else if(list.get(list.size()-1) == arr[i]) { //또는 list의 마지막값이 arr[i]의 값과 같다면
//						list.remove(list.size()-1); //list의 마지막원소를 삭제한다
//					}
//				}
//				
//				int[] res; //if문을 사용하여 배열에 값을 넣어주고 반환을 해야하기 때문에 전역변수로 생성한다.
//				
//				if(list.size() != 0) { //list의 원소가 하나라도 있다면
//					res = new int[list.size()]; //배열의 방의 갯수를 정해주고
//					for(int i = 0; i < list.size(); i++) {
//						res[i] = list.get(i); //배열에 값을 넣어준다.
//					}
//				} else { //list의 원소가 하나도 없다면
//					res = new int[] {-1}; //배열에 -1원소를 넣는다.
//				}
//				return res;
//			}







	//---------------------------------------------------------------------------------------

	
	
	
	
	
	
			//47번
//			public int[] solution(int[] arr, int k) {
//						
//				List<Integer> list = new ArrayList<>();
//				
//				int e = 0; //일단 list에 arr[i]의 값을 넣고 list에 있는 나머지 값들과 비교하여 동일한 값이 있을경우 삭제하는데
//						   //list의 길이를 1씩 증가하는 i에서 삭제한 갯수만큼 빼줘야 오류가 안난다.
//				
//				for(int i = 0; i < arr.length; i++) {
//					list.add(arr[i]); //일단 list에 arr[i]의 값을 넣어준다.
//					for(int j = 0; j < list.size()-1; j++) { //list.size()-1을 해준이유는 마지막에 들어있는 원소는 방금 넣었기 때문에 나머지 원소들과 비교를 해야한다.
//						if(list.get(i-e) == list.get(j)) { //마지막에 들어간 원소와 나머지 원소를 처음부터 순서대로 비교하여 원소 값이 같다면
//							list.remove(i-e); 			   //마지막원소를 삭제한다.
//							e++;						   //그리고 e변수의 값을 1올려준다.
//							break;     					   //삭제후 더는 비교할 값이 없기 때문에 반복문 탈출
//						}
//					}
//				}
//				
//				if(list.size() < k) { //위의 코드대로 원소를 list에 담아줬을때 list의 길이가 k보다 작다면
//					for(int i = list.size(); i < k; i++) { //k길이와 같아지게 남은자리에 -1을 넣어준다.
//						list.add(-1);
//					}
//				}
//				
//				int[] res = new int[k]; 
//				
//				for(int i = 0; i < k; i++) { //list의 원소를 배열에 담는다.
//					res[i] = list.get(i);
//				}
//				return res;
//			}







	//---------------------------------------------------------------------------------------
	
	
	
	
	
	
	
		  //48번
//		  public int solution(String[] strArr) {
//			  
//			  int[] su = new int[30]; //strArr[] 원소의 길이는 1부터 최대 30이기 때문에 방의 갯수가 30개인 배열을 생성한다.
//			  
//			  for(int i = 0; i < strArr.length; i++) {
//				  int r = strArr[i].length(); //strArr[]해당인덱스의 문자열의 길이를 변수에 담아주고
//				  su[r-1]++; //문자열의 길이가 해당되는 배열의 인덱스 값을 1올려준다.
//			  }
//			  
//			  int res = su[0]; //su[]의 첫번째 인덱스값을 변수에 담아주고
//			  
//			  for(int i = 1; i < su.length; i++) { //su[]의 모든 인덱스를 돌면서
//				  if(su[i] > res ) {  //크기비교를 하여
//					  res = su[i]; //큰 원소를 변수에 담아주면 마지막에 가장큰 원소가 담기게 된다.
//				  }
//			  }
//			  return res;
//		  }







	//---------------------------------------------------------------------------------------
	
	
	
	
	
	
	
		  //49번
//		  public int[] solution(int[] num_list) {
//			  
//			  Arrays.sort(num_list); //매개변수로 받은 파라미터를 오름차순으로 정렬해준다.
//			  
//			  List<Integer> list = new ArrayList<Integer>();
//			  
//			  for(int i = 5; i < num_list.length; i++) { //오름차순으로 정렬된 num_list[]의 작은수 5개를 뺀 나머지를 list에 담는다.
//				  list.add(num_list[i]);
//			  }
//			  
//			  int[] res = new int[list.size()];
//			 
//			  for(int i = 0; i < list.size(); i++) { //작은 수 5개를 뺀 나머지를 담은 list를 배열로 바꿔준다.
//				  res[i] = list.get(i);
//			  }
//			  return res;	  
//		  }







	//---------------------------------------------------------------------------------------
	
	
	
	
	
	
	
		  //50번
//		  public int solution(int[] rank, boolean[] attendance) {
//			  
//			  List<Integer> list = new ArrayList<Integer>();
//			  
//			  for(int i = 0; i < attendance.length; i++) { 
//				  if(attendance[i] == true) { //원소 값이 true인 인덱스와 같은 rank[] 인덱스의 원소값을 list에 담는다.
//					  list.add(rank[i]);
//				  }
//			  }
//			  
//			  Integer[] att = list.toArray(new Integer[list.size()]); //값을 담은 list를 배열로 변환한다.
//			  
//			  Arrays.sort(att); //배열을 오름차순으로 정렬(대회에 참여하는 학생들의 등수가 높은 순으로 정렬)
//			  
//			  int[] high = new int[3]; //대회에 참여하는 등수가 높은 3명의 인덱스값을 담을 배열
//			  
//			  for(int i = 0; i < 3; i++) {
//				  for(int j = 0; j < rank.length; j++) {
//					  if(att[i] == rank[j]) { //대회에 참여하는 등수가 높은 3명의 원래 인덱스값을 찾는과정
//						  high[i] = j;
//					  }
//				  }
//			  }
//			  
//			  int res = (10000 * high[0]) + (100 * high[1]) + high[2];
//			  
//			  return res;
//			  
//		  }







	//---------------------------------------------------------------------------------------
		  
	
	
	
	
	
	
		  //51번
//		  public int solution(double flo) {
//			  
//			  int res = (int)flo; //자기보다 작은 타입으로 형변환을 할려면 강제로 형변환을 해줘야한다.
//			  
//			  return res;
//		  }







	//---------------------------------------------------------------------------------------
	
	
	
	
	
	
	
		  //52번
//		  public int solution(String num_str) {		  
//			  
//			  int res = 0; //문자열의 정수를 하나씩 더해줄 변수
//			  
//			  for(int i = 0; i < num_str.length(); i++) {
//				  String str = ""; //문자열의 각자리수의 정수를 가져올 방법으로 charAt()메서드를 사용하였는데 그러면 반환값이 char이 되기 때문에 
//				  				   //바로 int변수에 담게 되면 char특성상 아스키코드로 int변수에 담기기 때문에 우리가 원하는 결과를 만들수가없다.
//				  				   //그렇기 때문에 일단 문자열에 담아주고 문자열을  int로 바꾸는 메서드를 통해 int변수에 담아줄것이다.
//				  str += num_str.charAt(i);
//				  res += Integer.parseInt(str);
//			  }
//			  return res;
//		  }







	//---------------------------------------------------------------------------------------
	
	
	
	
	
		  
		  
		  //53번
//		  public String solution(String n_str) {
//			  
//			  StringBuffer sb = new StringBuffer(n_str); //deleteCharAt()를 사용하기 위한 형변환
//			  
//			  for(int i = 0; i < sb.length(); i++) {
//				  if(sb.charAt(0) == '0') { //매개변수 문자열의 첫번째 인덱스의 값이 0이라면 삭제를 한다.
//					  sb.deleteCharAt(0);   //인덱스 값을 0으로 고정한 이유는 왼쪽부터 값이 0일때 삭제를 하는데 그렇게 되면 다음 인덱스들이 한칸씩 당겨지게 된다.
//					  						//원래 인덱스가 1이였다면 0번 인덱스가 삭제된 순간 0으로 가게 된다.
//				  } else { //0이 아니라면 반복문 탈출.
//					  break;
//				  }
//			  }
//			  
//			  String res = sb.toString();
//			  
//			  return res;
//			  
//		  }







	//---------------------------------------------------------------------------------------
		  
		  
		  
		  
		  
		  
		  //54번
//			public String solution(String a, String b) {
//		
//			//정수타입인 int와 long을 사용해도 되지만 int와 long이 담을수없는 크기의 매개변수가 들어오게 되면 오류가 난다.
//			//그렇기 때문에 가장 높은 타입인 BigInteger을 사용하면 된다.
//		
//			BigInteger ab = new BigInteger(a); //생성자에 문자열을 담아주면 정수로 변환된다.
//			BigInteger bb = new BigInteger(b);
//		
//			String res = ab.add(bb).toString(); //ab와 bb를 더하고 문자열로 변환한다.
//		
//			return res;
//		}
	
	
	
	
	
	//------------------------------------------------------------------------
	
	
	
	
		//55번
//		public int[] solution(int[] arr, int[] delete_list) {
//		
//			List<Integer> list = new ArrayList<Integer>(); //매개변수인 두 배열의 중복되지 않은 원소값을 저장하는 list
//		
//			w:for(int i = 0; i < arr.length; i++) { //arr[] 처음부터 끝까지 순차적으로 돌리면서
//				for(int j = 0; j < delete_list.length; j++) { //delete_list[]의 원소값과 비교하여
//					if(arr[i] == delete_list[j]) { //두 배열의 원소값이 중복된다면 
//						continue w;				   //반복문을 탈출하여 arr[]의 다음 원소값을 비교하러 간다.
//					}
//				}
//				list.add(arr[i]); //만약 arr[]의 i인덱스 값이 delete_list[]과 중복되지 않는 값이라면 list에 담는다.
//			}
//			int[] res = new int[list.size()];
//		
//			for(int i = 0; i < list.size(); i++) {
//				res[i] = list.get(i);
//			}
//		
//			return res;
//		
//		}
	
	
	
	
	
	//------------------------------------------------------------------------
	
	
	
	
		//56번
//		public int solution(String my_string, String target) {
//		
//			int res;
//		
//			if(my_string.contains(target)) { //contains()메서드는 문자열안에 매개변수 문자가 포함되어 있는지 true, false로 반환해준다.
//				res = 1;
//			} else {
//				res = 0;
//			}
//			return res;
//		}
	
	
	
	
	
	
	//------------------------------------------------------------------------

	
		  
		  
		  
		  
		  //57번
//		  public String solution(String[] str_list, String ex) {
//			  
//			  String res = "";
//			  
//			  for(int i = 0; i < str_list.length; i++) { // str_list[]의 인덱스값을 하나씩 가져와서
//				  if(str_list[i].contains(ex)) {  //ex변수값이 포함되어 있다면
//					  continue; 				  //문자열에 담지않고 다음 인덱스로 넘어간다.
//				  } else {
//					  res += str_list[i]; //ex변수값이 포함되어 있지 않다면 res문자열 끝에 붙인다.
//				  }
//			  }			  
//			  	return res;		  
//		  }

			
			
			
			
			
	//------------------------------------------------------------------------  
		  
		  
		  
		  
		  
		  
		  //58번
//		  public int solution(int[] date1, int[] date2) {
//			  
//			  String str1 = ""; //매개변수 int배열 두개를 문자열로 바꿔줄것이다.
//			  String str2 = "";
//			  int res;
//			  
//			  for(int i = 0; i < 3; i++) {  
//				 str1 += date1[i];
//				 str2 += date2[i];
//			  }
//			  
//			  if(Integer.parseInt(str1) < Integer.parseInt(str2) ) { //문자열로 바꾼 배열을 int로 변환하여 두개의 값을 비교한다.
//				  res = 1;
//			  } else {
//				  res = 0;
//			  }
//			  return res;
//		  }

			
			
			
			
			
	//------------------------------------------------------------------------   
		  
		  
		  
		  
		  
		  
		  //59번
//		  public int solution(String[] order) {
//			  
//			  int res = 0; //커피 가격 합
//			  
//			  //차가운것과 뜨거운것 상관없이 아메리카노냐 카페 라테냐만 구하면 쉽게 풀 수 있는 문제다.
//			  for(int i = 0; i < order.length; i++) {
//				  if(order[i].contains("americano") || order[i].contains("anything")) {
//					  res += 4500;
//				  } else {
//					  res += 5000;
//				  }
//			  }
//			  return res;
//		  }

			
			
			
			
			
	//------------------------------------------------------------------------
		  
		  
		  
		
		  
		  
		  //60번
//		  public int[][] solution(int n){
//			  
//			  int[][] res = new int[n][n];
//			  
//			  for(int i = 0; i < res.length; i++) {
//				  for(int j = 0; j < res[i].length; j++) { //2중반복문을 이용해
//					  if( i == j ) { //i와j가 같다면 해당 인덱스에 값은 1이고 다르다면 0으로 담아준다.
//						  res[i][j] = 1;
//					  } else {
//						  res[i][j] = 0;
//					  }
//				  }
//			  }
//			  return res;
//		  }

			
			
			
			
			
	//------------------------------------------------------------------------
		  
		  
		  
		  
		  
	
		  //61번
//		  public String[] solution(String[] picture, int k) {
//			  
//			  List<String> list = new ArrayList<String>();
//			  
//			  for(int i = 0; i < picture.length; i++) {	//picture[]의 모든 원소에 접근
//				  for(int j = 0; j < k; j++) {
//					  String pic = "";
//					  for(int g = 0; g < picture[i].length(); g++) { //각 원소의 문자에 하나하나 접근하여 k번만큼 문자열에 담아주고
//						  for(int f = 0; f < k; f++) {
//							  pic += picture[i].charAt(g);
//						  }
//					  }  
//					  list.add(pic); //k번만큼 문자를 추가한 문자열을 list에 담는다.(가로)
//				  } //위 문자열과 같은 문자열을 k번만큼 list에 담는다(세로)
//			  }
//			  String[] res = list.toArray(new String[picture.length * k]); //모든 값을 담은 list를 배열로 변환한다.
//			  
//			  return res;
//		  }

			
			
			
			
			
	//------------------------------------------------------------------------	  
	
	
	
	
	
	
		  //62번
//		  public int solution(int[][] arr){
//			  
//			  int res = 1; //반환할 변수의 기본값을 1로 해놓고
//			  
//			  w:for(int i = 0; i < arr.length; i++) {
//				  for(int j = 0; j < arr[i].length; j++) {
//					  if(arr[i][j] != arr[j][i]) { //조건을 비교 해봤을 때
//						  res = 0; //두 배열의 특정인덱스 값이 같지않다면 변수의 값을 0으로 바꾸고 
//						  break w; //반복문 탈출
//					  }
//				  }
//			  }
//			  return res; //만약 조건을 비교 해봤을 때 값이 같다면 그대로 1값을 반환한다.
//		  }

			
			
			
			
			
	//------------------------------------------------------------------------	 
	
	
		  
		  
		  
		  
		  //63번
//		  public int[][] solution(int[][] arr){
//			  
//			  int[][] res;
//			  
//			  if(arr.length > arr[0].length) {
//				  res = new int[arr.length][arr.length];
//			  } else {
//				  res = new int[arr[0].length][arr[0].length];
//			  }
//			  
//			  for(int i = 0; i < arr.length; i++) {
//				  for(int j = 0; j < arr[i].length; j++) {
//					  res[i][j] = arr[i][j];
//				  }
//			  }
//			  return res;
//		  }
		  //2중배열의 방 갯수를 정사각형으로 생성해주고 매개변수인 arr[][]의 원소를 그대로 옮기면 값이 채워지지않은
		  //빈자리는 int의 기본값인 0으로 자동으로 채워진다.
			
			  
		  
			


	//------------------------------------------------------------------------
		  
		  
		  
		  
		  
		  
		  //64번
//		  public int solution(int[][] board, int k) {
//			  
//			  int res = 0;
//			  
//			  for(int i = 0; i < board.length; i++) { //i와j를 순회하는 반복문을 만들어
//				  for(int j = 0; j < board[i].length; j++) {
//					  if(i+j <= k) { //조건을 만족하면
//						  res += board[i][j]; //i와j의 해당하는 인덱스값을 더해준다.
//					  }
//				  }
//			  }
//			  return res;
//		  }
			
		  
		  
			


	//------------------------------------------------------------------------ 
		  
	
		  
		  
		  
		  
		  //65번
//		  public int[][] solution(int n){
//			  
//			  int[][] res = new int[n][n]; //n*n크기의 배열생성
//			  
//			  int val = 1; //배열의 원소값
//			  int right = 0; 
//			  int bottom = 1;
//			  int left = n-2;
//			  int top = n-2;
//			  
//			  while(val <= n*n) { //배열의 원소값으로 n*n이 마지막으로 들어가야하기 때문에 val의 값이 그보다 크다면 반복문 종료
//				  for(int i = right; i < n-right; i++) {
//					  res[right][i] =  val++;
//				  }
//				  right++;
//				  
//				  for(int i = bottom; i <= n-bottom; i++) {
//					  res[i][n-bottom] = val++; 
//				  }
//				  bottom++;
//				  
//				  for(int i = left; i >= (n-2)-left; i--) {
//					  res[left+1][i] = val++;
//				  }
//				  left--;
//				  
//				  for(int i = top; i > (n-2)-top; i--) {
//					  res[i][(n-2)-top] = val++;
//				  }
//				  top--;  
//			  }
//			  
//			  return res;
//		  }
			
		  
		  
			


	//------------------------------------------------------------------------ 
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
	
	
	
	
	
		
		
	
	
	

}
