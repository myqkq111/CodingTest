package level_0;

public class Level_0_Method {
	
		//4번
		public String solution(String my_string, String overwrite_string, int s) {
		
			String a = my_string.substring(s, s+overwrite_string.length());
			String[] b = my_string.split(a);			

		}


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
//				public String solution(String code) {
//					
//					String mode = "0";
//					String ret = "";
//					
//					for(int i = 0; i < code.length(); i++) {
//						switch(mode) {
//						
//						case "0":
//							
//							if(code.charAt(i) == '1') {
//								mode = "1";
//							}else {
//								if(i % 2 == 0) {
//									ret += code.charAt(i);
//								}
//							}
//							
//							break;		
//							
//						case "1":
//							
//							if(code.charAt(i) == '1') {
//								mode = "0";
//							}else {
//								if(i % 2 == 1) {
//									ret += code.charAt(i);
//								}
//							}
//							
//							break;
//						}//switch				
//					}//for
//					
//					if(ret == "") {
//						return "EMPTY";
//					}else {
//						return ret;	
//					}
//						
//				}

}
