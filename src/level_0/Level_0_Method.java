package level_0;

public class Level_0_Method {
	
		//4��
		//������
		  public String solution(String my_string, String overwrite_string, int s) {
			  
			  StringBuffer my_string_Buf = new StringBuffer(my_string);
			  int idx = 0;
			  for(int i = s; i < i + overwrite_string.length(); i++) {
				  my_string_Buf.setCharAt(i, overwrite_string.charAt(idx));
				  idx++;
			  }
			  
			  my_string = my_string_Buf.toString();
			  
			  return my_string;
		  
		  }
		 


		//---------------------------------------------------------------------------------

		

		//5��
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


		

		//6��
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


		

			//7��
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

		
		

			//8��
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
	
	
		
	
	
		//9��
//		public String solution(int[] numLog) {
//			
//			String answer = "";
//			//���� �ε����� �� �ε����� ���� ���� ���� ���� ���� answer������ �˸´� ���ĺ��� �־��ش�.
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
	
	
	
	
	
	
		//10��
//		public int[] solution(int[] arr, int[][] queries) {
//	        
//			int idx1;
//			int idx2;
//			int su;
//			
//			//2���� �迭�� i���� ����ִ� ������ ������ ����ְ� 
//			for(int i = 0; i < queries.length; i++) {
//				idx1 = queries[i][0];
//				idx2 = queries[i][1];
//				
//				//����� �������� arr������ �ε����� �ش��ϴ� ���� ���� �ٲ��ִ� �۾�
//				su = arr[idx1];
//				arr[idx1] = arr[idx2];
//				arr[idx2] = su;
//			}
//			
//			return arr;
//			
//	    }
	
	
	
	
	
	
	//---------------------------------------------------------------------------------
	
	
	
	
	
	
		//11��
//		public int[] solution(int[] arr, int[][] queries) {
//	        
//			int s, e, k;
//			int[] answer = new int[queries.length];
//			
//			
//			for(int i = 0; i < queries.length; i++) {
//				s = queries[i][0]; //arr[]�� �����ε���
//				e = queries[i][1]; //arr[]�� ���ε���
//				k = queries[i][2];
//				
//				for(int j = s; j <= e; j++) { 
//					if(arr[j] > k) { //k������ Ŭ��츸
//						if(answer[i] == 0) { // int�� ���� �ƹ��͵� ���� �� 0�� ��ȯ�Ѵ�.�� �̿��Ͽ� ó�� ��������� �׳� ����ϱ�
//							answer[i] = arr[j];
//						}else { //ó�� ����ϴ°� �ƴ϶��
//							if(answer[i] >= arr[j]) { //�����ִ� ���� ���� ���� ���� ���Ͽ� ���� ���� ���� �� ���� ���
//								answer[i] = arr[j]; //���ο� ������ �ٲ۴�.
//							}else { //�����ִ����� �� ���� ���
//								continue; //���� ����� ���������� �̵�.(�����ִ� ���� �״�� ��������.)
//							}
//						}					 
//					}				
//				}
//				if(answer[i] == 0) { //�ݺ����� �� ������ �� answer[i]�� ���� �ƹ��͵� ���� ��� -1�� �ִ´�.
//					answer[i] = -1;
//				}
//			}
//			
//			return answer;
//			
//	    }
	
	
	
	
	
	//---------------------------------------------------------------------------------
	
	
	
	
	
	
		//12��
//		public int[] solution(int[] arr, int[][] queries) {
//			
//			int s, e, k;
//			
//			for(int i = 0; i < queries.length; i++) {
//				s = queries[i][0]; //arr[]�� �����ε���
//				e = queries[i][1]; //arr[]�� ���ε���
//				k = queries[i][2]; //��� �񱳰�
//				for(int j = s; j <= e; j++) {
//					if(j % k == 0) { //���� ���� 0�̶�� �迭�̶�� ��
//						arr[j]+=1; //�ش�arr�� �ε��� ���� 1 �����ش�.
//					}
//				}
//			}
//			return arr;
//		}

	
	
	
	
	//---------------------------------------------------------------------------------
	
	
	
	
	
	
		//13��
//		public int[] solution(int l, int r) {
//	        
//			 String su; 
//			 String storage = "";
//			
//			w:for(int i = l; i <= r; i++) { //���� �Ķ���� l���� r���� 1�� ������Ű�� �ݺ���
//				su = Integer.toString(i); // ���� i�� ���ڿ��� �ٲ۴�.
//				for(int j = 0; j < su.length(); j++) { // su�� �ڸ����� �˱����� �ݺ���
//					if(su.charAt(j) == '5' || su.charAt(j) == '0') { // su�� 100�����̵� 1000�����̵� �տ������� �ϳ��� �����ͼ�
//						if(j == (su.length()-1)) {					 // 5�� 0���� Ȯ���Ѵ�.
//							storage += i + ","; //�� 5�� 0���θ� �̷�����ִٸ� ���ڿ� ������ ,�� ���� ����ش�.
//						}else {
//							continue; //���� 5�� 0���θ� �̷�����ִ��� Ȯ���ϱ� ����. 
//						}
//					}else {
//						continue w; //���� 5�� 0�� �ƴ� �ٸ� ���ڰ� ���ٸ� ���� ������ �Ѿ��.
//					}
//				}
//			}
//			 if(storage == "") { // ���� 5�� 0���θ� �̷���� ���� ���ٸ�
//				 storage = -1 + ","; // -1�� ,�� ������ ��´�.
//			 }
//			 
//			 String[] StrArr = storage.split(","); // , �� ������ ���� �������� : split�޼��带 �̿��� ,�� �������� �迭�� �������
//			 
//			 int[] arr = new int[StrArr.length];
//			 
//			 for(int i = 0; i < StrArr.length; i++) { // ���� ��� ���ڿ� �迭�� ���ڹ迭�� �ٲ�
//				 arr[i] = Integer.parseInt(StrArr[i]);
//			 }
//			 
//			 return arr;
//			
//	    }

	
	
	
	
	//---------------------------------------------------------------------------------
	
	
	
	
	
		//14��
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
	
	
	
	
	
	
		//15��
//		public String solution(String my_string, int[][] queries) {
//			
//			int start; //queries�� s
//			int end; //queries�� e
//			String subStr; //substring()�� �ε��� ���� ��ŭ ¥�� ���ڿ� ��°� 
//			StringBuffer my_stringBuf = new StringBuffer(my_string); //setCharAt()�� ����ϱ� ����
//			
//			for(int i = 0; i < queries.length; i++) {
//				
//				String turnStr = ""; //������ ���ڿ�
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
	
	
	
	
	
		//16��
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
	
	
	
	
	
	
	
	
	

}
