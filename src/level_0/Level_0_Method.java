package level_0;

import java.util.ArrayList;
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
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	

}
