package level_0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Level_0_Method {
	
		//4��
//		  public String solution(String my_string, String overwrite_string, int s) {
//			  
//			  StringBuffer my_string_Buf = new StringBuffer(my_string); //setCharAt()����ϱ� ���� StringBuffer�� ��ȯ
//			  int idx = 0; //overwrite_string �տ������� ���� ������ �ε�������
//			  
//			  //s�ε������� �����ؼ� overwrite_string�� ���̸�ŭ ���ڿ��� �ٲ�����ϱ� ����
//			  for(int i = s; i < s + overwrite_string.length(); i++) {
//				  my_string_Buf.setCharAt(i, overwrite_string.charAt(idx));
//				  idx++;
//			  }
//			  
//			  my_string = my_string_Buf.toString(); //StringBuffer�� String���� ��ȯ�Ͽ� my_string�� �缳��
//			  
//			  return my_string;
//		  
//		  }
		 


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
	
	
	
	
	
	
		//17��
//		public int[] solution(String[] intStrs, int k, int s, int l) {
//			
//			String res = "";
//			
//			for(int i = 0; i < intStrs.length; i++) {
//				int subStr = Integer.parseInt(intStrs[i].substring(s, s+l)); //int�� ����ȯ �ϴ������� k���̶� ���ϱ� ���ؼ�
//				if(subStr > k) { //k������ Ŭ��
//					res += (subStr + ","); //rse������ ��´�.
//				}
//			}			
//			String[] resArr = res.split(","); // ,�� �������� ©�� �迭�� ��´�.
//			
//			int[] answer = new int[resArr.length];
//			
//			for(int i = 0; i < resArr.length; i++) {
//				answer[i] = Integer.parseInt(resArr[i]); //�տ������� �ϳ��� ������ int�� ����ȯ�ϰ� int�迭�� ��´�.
//			} //ó������ int�迭�� �ȴ�� ������ �迭�� ������ �� ���� ������ ��������ϴµ� ���� ������ ��Ȯ�� �𸥴�.
			  //intStrs�迭�� ������ŭ ���� ������ �׷��� �ϸ� ����� ������� �ִ�.
			  //����� �ִٰ� ������ ���°� �ƴ����� ������ �ȵ�� ����..
//			return answer;
//		}

	
	
	
	
	//---------------------------------------------------------------------------------
	
	
	
	
	
	
		//18��
//		public String[] solution(String my_string) {
//			
//			String[] arr = new String[my_string.length()];
//			
//			for(int i = 0; i < my_string.length(); i++) {
//				arr[i] = my_string.substring(i,my_string.length());
//			}
//			
//			Arrays.sort(arr); //�迭�� ������������ ����
//			
//			return arr; //���ĵ� �迭 ��ȯ
//		}

	
	
	
	
	//---------------------------------------------------------------------------------
	
	
	
	
	
	
	
		//19��
//		public String solution(String my_string, int m, int c) {
//			
//			String width = ""; //m���ھ� ��� ����
//			String height = ""; //c��° ���� ���ڵ��� ������ ����
//			
//			for(int i = 0; i < my_string.length(); i++) {
//				if(i % m == 0) {//m���� �������
//					width = ""; //�ʱ�ȭ�ؼ�
//					width += my_string.charAt(i); //�ٽ� ���
//				}else {
//					width += my_string.charAt(i); //m���� �ȴ������ ��Ӵ��
//				}
//				
//				if(width.length() == c ) { //���� ���ڰ����� c�� ���ٸ�
//					height += width.charAt(c-1); //c��°�� �ִ� ���� height������ ��´�.
//				}
//			}
//			
//			return height;
//			//�迭�� ����ߴ���� �� �� ���ϰ� �����Ű����ѵ� �迭�� ������� �ʰ�
//			//�ڵ带 ¥����;��� ������ �̷� ������� �ߴ�.
//		}

	
	
	
	
	//---------------------------------------------------------------------------------
	
	
	
	
	
		
		//20��
//		public int[] solution(String my_string) {
//			
//			int[] res = new int[52]; //��ҹ��� ���� ���ĺ��� �� 52���̴�.
//			int upper = 65; //�빮�� A�� �ƽ�Ű�ڵ�
//			int lower = 97; //�ҹ��� a�� �ƽ�Ű�ڵ�
//			
//			for(int i = 0; i < 52; i++) { //52���� ���ĺ��� �����ϱ� ����.
//				res[i] = 0; //������ �濡 0���� �ʱⰪ�� �ش�.
//				for(int j = 0; j < my_string.length(); j++) {//my_string�� ���ڸ� �ϳ��� Ȯ���ϱ� ���� ���̸�ŭ ������.
//					if( i < 26 ) { // res�迭�� 0~25�ε��������� �빮��
//						if( upper == my_string.charAt(j)) { //���ڿ��� �ϳ��� ���ĺ��� ���Ͽ�
//							res[i]++; //�´°� �ִٸ� �� �빮�ڰ� �����ִ� �迭���� ���� 1�� �ø���.
//						}
//					}else { // res�迭�� 26~52�ε��������� �ҹ���
//						if(lower == my_string.charAt(j)) { //���ڿ��� �ϳ��� ���ĺ��� ���Ͽ�
//							res[i]++; //�´°� �ִٸ� �� �빮�ڰ� �����ִ� �迭���� ���� 1�� �ø���.
//						}
//					}
//				} //���ڿ� Ȯ�� �ݺ���
//				//�ϳ��� ���ĺ� ����Ȯ���� �����ٸ� �������ĺ��� Ȯ���ϱ� ���� �ƽ�Ű�ڵ尡 ��� �������� �÷����ϴµ�
//				if( i < 26 ) { //i�� 26�̸��̶�� �빮�ھ��ĺ�
//					upper++; //���� 1������Ŵ���ν� ���� ���ĺ��� �ƽ�Ű�ڵ带 �ǹ��Ѵ�.
//				}else { //i�� 26�̻��̶�� �ҹ��ھ��ĺ�
//					lower++; //���� 1������Ŵ���ν� ���� ���ĺ��� �ƽ�Ű�ڵ带 �ǹ��Ѵ�.
//				}
//			}
//			return res;
//		}

	
	
	
	
	//---------------------------------------------------------------------------------
	
	

			

	
	
		//21��
//		public int[] solution(int n, int k) {
//		
//			//�迭�� ������ �� ���� ������ ����������ϴµ� ó������ ���� ������ �𸥴�.
//			//�̷��� list�� �̿��ϸ� ���ϴ�.
//			//list�� ���� ������ �����������ʰ� ���� �߰��Ǹ� ���� ������ �þ�� ���� �����Ǹ� ���� ������ �پ���
//			//�������� ����� ���δ�.
//			List<Integer> list = new ArrayList<>(); 
//		
//			for(int i = 1; i <= n; i++) { //1�̻� n������ ���� �������
//				if(i % k == 0) { //k�� ������ �������� 0�̸� k�� ���.
//					list.add(i); //i���� ����ϰ�� list�� ����ֱ�.
//				}
//			}
//		
//			int[] mul = new int[list.size()]; //list�� ����ִ� ������ŭ �迭 �� ����
//		
//			for(int i = 0; i < mul.length; i++) {
//				mul[i] = list.get(i); //list�� ����ִ� �� �迭�� �ű��
//			}
//		
//			Arrays.sort(mul); //�迭 �������� ����
//		
//			return mul;
//		
//		}

	



	

	//---------------------------------------------------------------

	


	

	

		//22��
//	 	public String solution(String my_string, int[] indices) {
//		 
//		 	StringBuffer sb = new StringBuffer(my_string); //deleteCharAt()�� ����ϱ� ����.
//			 Integer[] it = new Integer[indices.length];//Arrays.sort()������������ ������ �ҷ��� int�δ� �ȵǰ� Integer���� ��ü�� �ؾ��Ѵ�.
//		 
//			 for(int i = 0; i < it.length; i++) {//int�迭�� Integer�迭�� �ٲ�
//				 it[i] = indices[i];
//			 }
//		 
//			 Arrays.sort(it,Collections.reverseOrder()); //Collections.reverseOrder() : ������������ ����
//		  
//			 for(int i = 0; i < indices.length; i++) {
//				 sb.deleteCharAt(it[i]); //�ε����� �����
//			 }
//		 
//			 return sb.toString();
//			 //���ڿ��� �߰����� ����� �Ǹ� �ڿ� �ִ� �ε������� ��ĭ�� ������ ������� �Ǽ� �ε��� ������ �����̵ȴ�.
//			 //�̷��� ��Ȳ�� �����ϱ� ���� ������������ �������ְ� �ε������� ū�ֵ���� ����� �տ� �ִ� ���ڵ��� �ε������� ������ 
//			 //��ġ�� �ʱ� ������ ���ϴ� ������� ���� �� �ִ�.
//		 }


	


	

	//---------------------------------------------------------------

	
		

	
	

		//23��
//		public int solution(int[] arr, int idx) {
//		
//			int res = 0; //�ʱⰪ�� 0���� ����
//		
//			for(int i = idx+1; i < arr.length; i++) { //idx + 1 �� �ϴ������� idx�� ������ Ŀ���ϱ� �����̴�.
//				if(arr[i] == 1) { //���� 1�̶��
//					res = i; //res������ ���� �ε����� �ִ´�.
//					break; //�׸���� �ݺ��� Ż��
//						   //���� 1�� �������� �ε��� ���� ã�¹����̱� ������ Ż���ؾ��Ѵ�.
//						   //Ż����ϸ� �ݺ����� ��ӵ��鼭 ���� 1�� �ε����� res�� ��� �־��ְԵǰ�
//						   //�ᱹ�� ���� 1�� ���� ū �ε����� res������ ���� �ȴ�.
//				}			
//			}
//			//idx���� Ŀ���ϱ� ������ res�� 0���� �� ���� ����.
//			if(res == 0) { //���� res�� 0�̶��(��ġ�ϴ� �ε����� ���� ���)
//				res = -1; //-1�� �ִ´�.
//			}
//			return res;
//		}


	


	

	//---------------------------------------------------------------
	
	
	
	
	
	
		//24��
//		public int[] solution(int n, int[] slicer, int[] num_list) {
//			
//			//�迭�� ������ �� ���� ������ ����������ϴµ� ó������ ���� ������ �𸥴�.
//			//�̷��� list�� �̿��ϸ� ���ϴ�.
//			//list�� ���� ������ �����������ʰ� ���� �߰��Ǹ� ���� ������ �þ�� ���� �����Ǹ� ���� ������ �پ���
//			//�������� ����� ���δ�.
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
//			//list�� �ִ� ���� �迭�� ���
//			for(int i = 0; i < list.size(); i++) {
//				res[i] = list.get(i);
//			}
//			
//			return res;
//			
//		}


	

	

	//---------------------------------------------------------------
	
	
	
	
	
	
		//25��
//		public int[] solution(int[] arr, int[][] intervals) {
//			
//			List<Integer> list = new ArrayList<Integer>();
//			
//			for(int i = 0; i < intervals.length; i++) { //2���� �迭�� ��� �迭�� �������� �ݺ���
//				for(int j = intervals[i][0]; j <= intervals[i][1]; j++) {//���������� ���� ���� �ݺ��� 
//					list.add(arr[j]); //���� list�� ����ְ�
//				}
//			}
//			
//			int[] res = new int[list.size()];
//			
//			for(int i = 0; i < res.length; i++) {
//				res[i] = list.get(i); //list�� ���� ������� �迭�� ��´�.
//			}
//			
//			return res;
//		}


	

	

	//---------------------------------------------------------------
	
	
	
	
		
		
		//26��
//		public int[] solution(int[] arr) {
//		
//			List<Integer> list1 = new ArrayList<>(); //arr�迭�� ���� 2�� �ε������� ���� list
//			List<Integer> list2 = new ArrayList<>(); //�κй迭�� ���� list
//		
//			for(int i = 0; i < arr.length; i++) {
//				if(arr[i] == 2) { //���� 2�� �ε�����
//					list1.add(i); //list�� ��´�
//				}
//			}
//		
//			if(list1.size() >= 2) { //���� 2�� �ε����� 2�� �̻��� ���
//				for(int i = list1.get(0); i <= list1.get(list1.size()-1); i++) {
//					list2.add(arr[i]); //list1�� ��� ù��°�� ������ �ε����� �κй迭�� list2�� ��´�.
//				}
//			} else if(list1.size() == 1) { //���� 2�� �ε����� 1���� ���
//				list2.add(arr[list1.get(0)]); //list1�� ��� �ε����� ��ġ�ϴ� arr�迭�� ���� list2�� ��´�(��¼�� 2�� ����)
//			} else if(list1.size() == 0) { //���� 2�� �ε����� �ϳ��� �������
//				list2.add(-1); //-1�� ��´�.
//			}
//		
//			int[] res = new int[list2.size()]; //list2�� ������ŭ �迭�� ���ǰ����� ������ش�.
//		
//			for(int i = 0; i < list2.size(); i++) {
//				res[i] = list2.get(i); //list2�� ������ ������� res�迭�� ��´�.
//			}
//		
//			return res;
//		
//	}

	

	
	
	
	

	//---------------------------------------------------------------------------------------

	

	

	

	

	 	//27��
//		public int[] solution(int[] arr, int[] query) {	
//			List<Integer> list = new ArrayList<>(); //arr�迭�� list�� ��´� 
//												//���ǿ� �´� �ε����� ����� ����
//			for(int i = 0; i < arr.length; i++) {
//				list.add(arr[i]);
//			}
//		
//			for(int i = 0; i < query.length; i++) {
//				if(i % 2 == 0) { //�ε����� ¦���϶�
//					//������������ ���� �ڸ������� ������������ �ϸ� �ε��� 4���� ����� 5���� �������ϴµ�
//					//4���� ����¼��� �ڿ� �ִ� �ε������� �ϳ��� ������� ������ ������������ �߶�� ��������.	
//					for(int j = list.size()-1; j > query[i]; j--) { //�ε��� �޺κ��� �߶������.
//						list.remove(j); //remove()�� ����ϱ� ���� �迭�� list�� ��Ҵ�.
//					}
//				} else if(i % 2 == 1) { //�ε����� Ȧ���϶�
//					for(int j = query[i]-1; j >= 0; j--) { //�ε��� �պκ��� �߶������.
//						list.remove(j);
//					}
//				}
//			}
//		
//			int[] res = new int[list.size()]; //�۾��� ��ġ�� ���� ������ �迭�� ��´�.
//		
//			for(int i = 0; i < list.size(); i++) { 
//				res[i] = list.get(i);
//			}
//		
//			return res;
//		}



	

	

	//---------------------------------------------------------------------------------------

	

	

	

		//28��
//		public int[] solution(int[] num_list, int n) {
//		
//			List<Integer> list = new ArrayList<>(); //���ǿ� �°� ���ҵ��� ���� list
//		
//			for(int i = n; i < num_list.length; i++) {
//				list.add(num_list[i]); //���� n��° ���� ������ ���Ҹ� list�� ��´�.
//			}
//		
//			for(int i = 0; i < n; i++) {
//				list.add(num_list[i]); // �� ���� n��°������ ���ҵ��� ������
//			}		//n��° ���� ������ ���Ұ� �տ��ٰ� n��°������ ���ҵ��� �ڿ� �ٰ� �ȴ�.
//		
//			int[] res = new int[list.size()];
//		
//			for(int i = 0; i < list.size(); i++) { //list�� �迭�� �ٲ�.
//				res[i] = list.get(i);
//			}
//	
//			return res;
//		}




	

	//---------------------------------------------------------------------------------------

	

	

		
		//29��
//		public String[] solution(String[] str_list) {
//			
//			List<String> list = new ArrayList<>(); //���ؿ� �´� ���ڿ����� ���� list
//		 
//			for(int i = 0; i < str_list.length; i++) { //str_list�� ������� �����鼭 ���� ���� ������ l�̳� r�� ã�´�
//				if(str_list[i].equals("l")) { //���� ���� ���� ���ڿ��� l�̶��
//					for(int j = 0; j < i; j++) { //���� ���ڿ���
//						list.add(str_list[j]); //list�� ��´�
//					}
//					break; //�׸��� �ݺ��� Ż��
//				}else if(str_list[i].equals("r")) { //���� ���� ���� ���ڿ��� r�̶��
//					for(int j = i+1; j < str_list.length; j++) { //������ ���ڿ���
//						list.add(str_list[j]); //list�� ��´�
//					}
//					break; //�׸��� �ݺ��� Ż��
//				}	 											
//			}
//			String[] res = new String[list.size()];
//			//list�� �迭�� ��� ��ȯ�Ѵ�
//			//���� ���ڿ��� l�̳� r�� ������� list�� ����ְ� �迭�� �浵 ���������ʴ´�
//			//����ִ� �迭�� ��ȯ�Ǵ°�
//			for(int i = 0; i < list.size(); i++) {
//				res[i] = list.get(i);
//			}		
//			
//			return res;
//	
//		}




	

	//---------------------------------------------------------------------------------------
	
	
	
	
	
	
		 //30��
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
		 //���� �����ؼ� ������� �׷� ���� �տ��ִ� ������� �̸��� ���� ����Ʈ�̴�.
		 //�׷��� ������ �ѱ׷쿡 5���̴ϱ� i�� ���� 5�� ������Ű�鼭 �ش��ε����� �ִ� ����� �̸���
		 //������ �ȴ�.



			

	
	//---------------------------------------------------------------------------------------
		
		
		
		
		
		
		
		  //31��
//		  public String[] solution(String[] todo_list, boolean[] finished) {
//			  
//			  List<String> list = new ArrayList<String>();
//			  
//			  for(int i = 0; i < todo_list.length; i++) { //������� �ε����� ��ȸ�Ͽ� 
//				  if(finished[i] == false) {  //���� false���
//					  list.add(todo_list[i]); //�ش� �ε����� ���� todo_list�� ���� list�� ��´�.
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
		
		
	
	
	
	
		  //32��
//		  public int[] solution(int[] arr, int[][] queries) {
//			  
//			  for(int i = 0; i < queries.length; i++) { //2�����迭�� ���ǰ��� �������� ���� 2�����迭�� ���̸�ŭ �ݺ����� ������.
//				  for(int j = 0; j < arr.length; j++) { //arr�迭�� ������ŭ �ε����� ����
//					  if(queries[i][0] <= j && queries[i][1] >= j) { //���ǿ� �´´ٸ�
//						  arr[j]++; //arr�迭�� �ش� �ε��� ���� �ø���.
//					  }
//				  }
//			  }
//			  
//			  return arr;
//			  
//		  }



			

			
	//---------------------------------------------------------------------------------------
	
	
	
	
	
	
		  //33��
//		  public int solution(int[] arr) {
//			  
//			  int x = 0; //�ݺ�Ƚ��
//			  
//			  while(true) { //���ѹݺ�
//				  
//				  int count = 0; //���ѹݺ��� Ż���ϱ����� ����
//				  
//				  for(int i = 0; i < arr.length; i++) {
//					  if(arr[i] >= 50 && arr[i] % 2 == 0) {
//						  arr[i]/=2;
//					  } else if(arr[i] < 50 && arr[i] % 2 == 1) {
//						  arr[i] = (arr[i] * 2) + 1;
//					  } else {
//						count++;  //arr�� ���� �ȹٲ�� �ε����� ���������� 1�����
//					  }
//				  }  
//		
//				  if(count == 6) { //��� ���� �ȹٲ�� 6�� �ǰ� 6�� �Ǿ��ٴ°� ���̻� �ݺ��غ���
//					  			   //arr�迭�� ���� �ȹٲ�ٴ� ���̴�.
//					  break;	   //�׷��ٸ� ���ѹݺ��� Ż���ϰ� �ݺ��� Ƚ���� ��ȯ�Ѵ�.
//				  }	
//				  
//				  x++; //�ݺ�Ƚ���� ������Ű�� �ڵ带 �� �������� ��������
//				  	   //�� �̻� ��� ���� �ٲ��� ������ ���� ���� �ݺ����� ��ȯ�ؾ��ϱ� ������
//				  	   //Ż�⹮break�ڿ��� ���
//				  	   //�Ѹ���� ���� �ٲ������ x���� �����Ѵ�.
//				  
//			  } //while
//			  return x;
//		  }


		  

			

			
	//---------------------------------------------------------------------------------------
	
		  
		  
		  
		  
		  
		  
		  //34��
//		  public int solution(int[] num_list) {
//			  
//			  int count = 0; //������ ������ Ƚ��
//			  
//			  for(int i = 0; i < num_list.length; i++) { //int�迭�� ���̸�ŭ ������
//				  while(true) { //�ݺ����� ��� �������ϴ��� ��Ȯ���� �ʱ� ������ ���ѹݺ����� ������.
//					  if(num_list[i] != 1) { //�ش� �ε����� ���� 1�� �ƴ϶��
//						  if(num_list[i] % 2 == 0) { //���� ¦������ Ȧ�� ���� �����ϰ�
//							  num_list[i] /= 2;		 //���� �´� ������ ���ش�.
//							  count++;				 //�׸��� count�� 1������Ų��.
//						  } else {
//							  num_list[i] = (num_list[i]-1) / 2;
//							  count++;
//						  }
//					  } else { //�ε����� ���� 1�̶��
//						  break; //���ѹݺ��� Ż���Ͽ� ���� �ε��� ������ �Ѿ��.
//					  }
//				  }
//			  }		  
//			  return count;		  
//		  }


		  

			

			
	//---------------------------------------------------------------------------------------
		  
		  
		  
		 
		  
		   //35��
//		    public int solution(String myString, String pat) {
//			  
//			    String lowMy = myString.toLowerCase(); //��ҹ��ڸ� �������� �ʴ´ٰ� ������
//			    String lowPat = pat.toLowerCase();	   //�� ���ڿ��� �ҹ��ڷ� �ٲ��ش�.
//			    int res;
//			    
//			    if(lowMy.contains(lowPat)) { //contains�� ��ҹ��ڸ� �����ϱ� ������ �� ���ڿ��� �ҹ��ڷ� �ٲ��ذ��̴�.(�빮�ڷ� �ص� �ȴ�.)
//			    	res = 1;				 
//			    } else {
//			    	res = 0;
//			    }
//			    
//			    return res;
//			  
//		    }


			  

			

			
	//---------------------------------------------------------------------------------------
	
	
	
	
	
	
	
		  //36��
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
		  //�ε����� ¦������ Ȧ�������� ���ϸ� ���� Ǯ���ִ� ������.

		  

			

			
	//---------------------------------------------------------------------------------------
	
	
	
	
	
	
	
		  //37��
//		  public String solution(String myString) {
//			  //A�� ������ ��� ���ĺ��� �ҹ��ڷ� ��ȯ�ϱ� ������ �Ѿ�� ���ڿ��� �ҹ��ڷ� �ٲ��ְ� Buffer�� ��ȯ�����ش�.
//			  StringBuffer sb = new StringBuffer(myString.toLowerCase());
//			  
//			  for(int i = 0; i < myString.length(); i++) { 
//				  if(sb.charAt(i) == 'a') { //�ҹ��ڷ� �ٲ� ���ڿ��� a�� �ִٸ�
//					  sb.setCharAt(i, 'A'); //a�� �빮�ڷ� �ٲ��ش�.
//				  }				  
//			  }
//			  String res = sb.toString(); //Buffer�� ���ڿ����·� �ٽ� ��ȯ�ϰ� ��ȯ.
//			  
//			  return res;
//		  }

		  

			

			
	//---------------------------------------------------------------------------------------
		  
		  
		  
		  
		  
		  
		  
		  //38��
//		  public String solution(String myString, String pat) {
//			  
//			  String res = "";
//			  
//			  if(myString.contains(pat)) { //myString���ڿ��� pat�� �ִ��������� Ȯ��
//				  int idx = myString.lastIndexOf(pat); //lastIndexOf() = �ش簪�� ���� �������� �ִ� �ε����� ��ȯ
//				  res = myString.substring(0,idx) + pat; //�׷��� ã�� �ε����� �̿��ؼ� ���ڿ� �����
//			  }
//			  
//			  return res;
//			  
//		  }

		  

			

			
	//---------------------------------------------------------------------------------------
		  
		  
		  
		  
		  
		  
		  
		  //39��
//		  public int solution(String myString, String pat) {
//			  
//			  StringBuffer sb = new StringBuffer(myString); //deleteCharAt()�� ����ϱ� ����
//			  
//			  int count = 0; //�����ϴ� Ƚ�� ī��Ʈ
//			  
//			  while(true) {
//				  if(myString.contains(pat)) { //myString�� pat�� �ִٸ�
//					  int idx = sb.indexOf(pat); //�ε������� ���ؼ�
//					  myString = sb.deleteCharAt(idx).toString(); //ù��° ���ڸ� ������Ų��.
//					  //�����ϴ� Ƚ���� 1ī��Ʈ�ϰ� �ش簪�� �����ϳ��� �����Ѵ�.
//					  //�׷��� ���� �ݺ������� �Ǵٸ� �ߺ� ���ڿ��� ã�Եȴ�.
//					  count++;
//				  } else {
//					  break;
//				  }
//			  }
//			  return count;
//		  }

		  

			

			
	//---------------------------------------------------------------------------------------
	
	
	
	
	
	
		  //40��
//		  public String[] solution(String my_string) {
//			  // \\s+ = �Ѱ��̻��� ������ �Ѱ��� ó���ϴ°�
//			  // ��� ���ڿ� �յڿ� ������ �ִٸ� �� ���鵵 �迭�� ��´�
//			  // �׷��� ������ trim()���� �յ� ������ ����� split()���
//			  String[] res = my_string.trim().split("\\s+"); 
//			  
//			  return res;
//			  
//		  }

		  

			

			
	//---------------------------------------------------------------------------------------
	
		  
		  
		  
		  
		  
		  //41��
//		  public int solution(String binomial) {
//			  
//			  int res = 0;			  
//			  String[] spl = binomial.split(" "); //�Ű������� �������� ������ �迭�� ����ش�.  
//			  
//			  switch(spl[1]) { //1�ε��� ���� ���� ����
//			  case "+":
//				  res = Integer.parseInt(spl[0]) + Integer.parseInt(spl[2]); //���ڿ��̱� ������ ������ �ҷ��� int�� �ٲ�����Ѵ�.
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
		  
		  
		 
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
	
	
	
	
	
		
		
	
	
	

}
