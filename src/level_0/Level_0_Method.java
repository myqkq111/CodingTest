package level_0;

public class Level_0_Method {
	
		//4번
		/*
		 * public String solution(String my_string, String overwrite_string, int s) {
		 * 
		 * String a = my_string.substring(s, s+overwrite_string.length()); String[] b =
		 * my_string.split(a);
		 * 
		 * }
		 */


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
	
	
	
	
	
	
	
	
	
	
	

}
