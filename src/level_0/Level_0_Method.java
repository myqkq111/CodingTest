package level_0;

import java.sql.Date;
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
		  
		  
		 
		  
		  
		  
		  
		  //42��
//		  public int solution(String myString, String pat) {
//			  
//			  int res;
//			  StringBuffer sb = new StringBuffer(myString); //setCharAt() �� ����ϱ� ����
//			  
//			  for(int i = 0; i < sb.length(); i++) { //���ڿ��� ���̸�ŭ �ݺ���
//				  if(sb.charAt(i) == 'A') { //�ε������� A���
//					  sb.setCharAt(i, 'B'); //B��
//				  } else { //B���
//					  sb.setCharAt(i, 'A'); // A�� �ٲ۴�.
//				  }				  
//			  }
//			  String chString = sb.toString(); //contains() ����ϱ� ���� �ٽ� String���� ��ȯ
//			  if(chString.contains(pat)) { //A�� B�� �ٲ� ���ڿ��� pat���ڿ��� ���ԵǾ� �ִٸ� 1 �ƴϸ� 0
//				  res = 1;
//			  } else {
//				  res = 0;
//			  }			  
//			  return res;
//		  }
		  
		  

			

			
	//---------------------------------------------------------------------------------------
		  
		  
		  
		  
		  
		  
		  //43��
//		  public String solution(String rny_string) {
//			  
//			  String res = rny_string.replace("m", "rn"); //���ڿ� �߿� ������ ���ڸ� �ٸ� ���ڷ� �ٲٴ� �޼���
//			  
//			  return res;
//		  }

		  

			

			
	//---------------------------------------------------------------------------------------
		  
		 
	
	
	
	
	
		  //44��
//		  public String[] solution(String myStr) {	
//			  
//			  String a = myStr.replaceAll("[a-c]", " "); //���ڿ��� a,b,c�� �������� �ٲ��ش�.
//			  String[] res;
//			  
//			  if(a.trim().isEmpty()) { // �������� �ٲ��� ���ڿ��� ����ִ��� Ȯ��
//				  res = new String[]{"EMPTY"}; //����ִٸ� EMPTY���� �־��ְ�
//			  } else {
//				  res = a.trim().split(" "); //�ƴ϶�� ���������� ���ڿ� ���̿� �ִ� ������ �������� �迭�� ��´�.
//			  }								
//			  return res;
//		  }

		  

			
	

			
	//---------------------------------------------------------------------------------------
	
	
	
	
	
	
	
	
		 	//45��
//			public int[] solution(int[] arr, boolean[] flag) {
//			
//			List<Integer> list = new ArrayList<>();
//			
//			for(int i = 0; i < flag.length; i++) { //boolean�迭�� ���̸�ŭ �ݺ����� ������.
//				if(flag[i] == true) { //boolean�迭�� �ε��� ���� true���� �ƴ��� Ȯ���Ѵ�.
//					for(int j = 0; j < arr[i]*2; j++) { //true��� 
//						list.add(arr[i]); //arr[i]�� ���� �� ����ŭ list�� ��´�.
//					}
//				} else { //false���
//					int size = list.size(); //else�� ������ list�� ��� ����
//					for(int j = list.size()-1; j >= size-arr[i]; j--) { //�ڿ��� arr[i]�� ����ŭ �����Ѵ�.
//						list.remove(j);      //ó������ j >= list.size[]-arr[i]; �� �߾��µ� ���������� Ȯ���غ��ϱ�
//					}						 //list.remove�� �ڿ��� ���� ���ﶧ���� list ����� 1�� �پ��鼭 ���� ��� �ٲ�� �־���.
//				}							 //�׷��� ������ else������ �������� list�� ������ size ������ ����ذ��̴�.
//			}
//			
//			int[] res = new int[list.size()]; //list�� ��� �������� �迭�� ��°���
//			
//			for(int i = 0; i < list.size(); i++) {
//				res[i] = list.get(i);
//			}
//			return res;
//		}


	
	
	
	


	//---------------------------------------------------------------------------------------


	
	
	
	
	
	
			//46��
//			public int[] solution(int[] arr) {
//				
//				List<Integer> list = new ArrayList<>(); //���� ���� list
//				
//				for(int i = 0; i < arr.length; i++) { //arr�迭�� ���̸�ŭ �ݺ����� �����鼭
//					if(list.size() == 0 || list.get(list.size()-1) != arr[i]) { //list�� �ƹ��͵� �ȴ�� �ְų� list�� ���������� arr[i]�� ���� �ٸ��ٸ�
//						list.add(arr[i]); //list�� ���� �߰��Ѵ�.
//					} else if(list.get(list.size()-1) == arr[i]) { //�Ǵ� list�� ���������� arr[i]�� ���� ���ٸ�
//						list.remove(list.size()-1); //list�� ���������Ҹ� �����Ѵ�
//					}
//				}
//				
//				int[] res; //if���� ����Ͽ� �迭�� ���� �־��ְ� ��ȯ�� �ؾ��ϱ� ������ ���������� �����Ѵ�.
//				
//				if(list.size() != 0) { //list�� ���Ұ� �ϳ��� �ִٸ�
//					res = new int[list.size()]; //�迭�� ���� ������ �����ְ�
//					for(int i = 0; i < list.size(); i++) {
//						res[i] = list.get(i); //�迭�� ���� �־��ش�.
//					}
//				} else { //list�� ���Ұ� �ϳ��� ���ٸ�
//					res = new int[] {-1}; //�迭�� -1���Ҹ� �ִ´�.
//				}
//				return res;
//			}







	//---------------------------------------------------------------------------------------

	
	
	
	
	
	
			//47��
//			public int[] solution(int[] arr, int k) {
//						
//				List<Integer> list = new ArrayList<>();
//				
//				int e = 0; //�ϴ� list�� arr[i]�� ���� �ְ� list�� �ִ� ������ ����� ���Ͽ� ������ ���� ������� �����ϴµ�
//						   //list�� ���̸� 1�� �����ϴ� i���� ������ ������ŭ ����� ������ �ȳ���.
//				
//				for(int i = 0; i < arr.length; i++) {
//					list.add(arr[i]); //�ϴ� list�� arr[i]�� ���� �־��ش�.
//					for(int j = 0; j < list.size()-1; j++) { //list.size()-1�� ���������� �������� ����ִ� ���Ҵ� ��� �־��� ������ ������ ���ҵ�� �񱳸� �ؾ��Ѵ�.
//						if(list.get(i-e) == list.get(j)) { //�������� �� ���ҿ� ������ ���Ҹ� ó������ ������� ���Ͽ� ���� ���� ���ٸ�
//							list.remove(i-e); 			   //���������Ҹ� �����Ѵ�.
//							e++;						   //�׸��� e������ ���� 1�÷��ش�.
//							break;     					   //������ ���� ���� ���� ���� ������ �ݺ��� Ż��
//						}
//					}
//				}
//				
//				if(list.size() < k) { //���� �ڵ��� ���Ҹ� list�� ��������� list�� ���̰� k���� �۴ٸ�
//					for(int i = list.size(); i < k; i++) { //k���̿� �������� �����ڸ��� -1�� �־��ش�.
//						list.add(-1);
//					}
//				}
//				
//				int[] res = new int[k]; 
//				
//				for(int i = 0; i < k; i++) { //list�� ���Ҹ� �迭�� ��´�.
//					res[i] = list.get(i);
//				}
//				return res;
//			}







	//---------------------------------------------------------------------------------------
	
	
	
	
	
	
	
		  //48��
//		  public int solution(String[] strArr) {
//			  
//			  int[] su = new int[30]; //strArr[] ������ ���̴� 1���� �ִ� 30�̱� ������ ���� ������ 30���� �迭�� �����Ѵ�.
//			  
//			  for(int i = 0; i < strArr.length; i++) {
//				  int r = strArr[i].length(); //strArr[]�ش��ε����� ���ڿ��� ���̸� ������ ����ְ�
//				  su[r-1]++; //���ڿ��� ���̰� �ش�Ǵ� �迭�� �ε��� ���� 1�÷��ش�.
//			  }
//			  
//			  int res = su[0]; //su[]�� ù��° �ε������� ������ ����ְ�
//			  
//			  for(int i = 1; i < su.length; i++) { //su[]�� ��� �ε����� ���鼭
//				  if(su[i] > res ) {  //ũ��񱳸� �Ͽ�
//					  res = su[i]; //ū ���Ҹ� ������ ����ָ� �������� ����ū ���Ұ� ���� �ȴ�.
//				  }
//			  }
//			  return res;
//		  }







	//---------------------------------------------------------------------------------------
	
	
	
	
	
	
	
		  //49��
//		  public int[] solution(int[] num_list) {
//			  
//			  Arrays.sort(num_list); //�Ű������� ���� �Ķ���͸� ������������ �������ش�.
//			  
//			  List<Integer> list = new ArrayList<Integer>();
//			  
//			  for(int i = 5; i < num_list.length; i++) { //������������ ���ĵ� num_list[]�� ������ 5���� �� �������� list�� ��´�.
//				  list.add(num_list[i]);
//			  }
//			  
//			  int[] res = new int[list.size()];
//			 
//			  for(int i = 0; i < list.size(); i++) { //���� �� 5���� �� �������� ���� list�� �迭�� �ٲ��ش�.
//				  res[i] = list.get(i);
//			  }
//			  return res;	  
//		  }







	//---------------------------------------------------------------------------------------
	
	
	
	
	
	
	
		  //50��
//		  public int solution(int[] rank, boolean[] attendance) {
//			  
//			  List<Integer> list = new ArrayList<Integer>();
//			  
//			  for(int i = 0; i < attendance.length; i++) { 
//				  if(attendance[i] == true) { //���� ���� true�� �ε����� ���� rank[] �ε����� ���Ұ��� list�� ��´�.
//					  list.add(rank[i]);
//				  }
//			  }
//			  
//			  Integer[] att = list.toArray(new Integer[list.size()]); //���� ���� list�� �迭�� ��ȯ�Ѵ�.
//			  
//			  Arrays.sort(att); //�迭�� ������������ ����(��ȸ�� �����ϴ� �л����� ����� ���� ������ ����)
//			  
//			  int[] high = new int[3]; //��ȸ�� �����ϴ� ����� ���� 3���� �ε������� ���� �迭
//			  
//			  for(int i = 0; i < 3; i++) {
//				  for(int j = 0; j < rank.length; j++) {
//					  if(att[i] == rank[j]) { //��ȸ�� �����ϴ� ����� ���� 3���� ���� �ε������� ã�°���
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
		  
	
	
	
	
	
	
		  //51��
//		  public int solution(double flo) {
//			  
//			  int res = (int)flo; //�ڱ⺸�� ���� Ÿ������ ����ȯ�� �ҷ��� ������ ����ȯ�� ������Ѵ�.
//			  
//			  return res;
//		  }







	//---------------------------------------------------------------------------------------
	
	
	
	
	
	
	
		  //52��
//		  public int solution(String num_str) {		  
//			  
//			  int res = 0; //���ڿ��� ������ �ϳ��� ������ ����
//			  
//			  for(int i = 0; i < num_str.length(); i++) {
//				  String str = ""; //���ڿ��� ���ڸ����� ������ ������ ������� charAt()�޼��带 ����Ͽ��µ� �׷��� ��ȯ���� char�� �Ǳ� ������ 
//				  				   //�ٷ� int������ ��� �Ǹ� charƯ���� �ƽ�Ű�ڵ�� int������ ���� ������ �츮�� ���ϴ� ����� �����������.
//				  				   //�׷��� ������ �ϴ� ���ڿ��� ����ְ� ���ڿ���  int�� �ٲٴ� �޼��带 ���� int������ ����ٰ��̴�.
//				  str += num_str.charAt(i);
//				  res += Integer.parseInt(str);
//			  }
//			  return res;
//		  }







	//---------------------------------------------------------------------------------------
	
	
	
	
	
		  
		  
		  //53��
//		  public String solution(String n_str) {
//			  
//			  StringBuffer sb = new StringBuffer(n_str); //deleteCharAt()�� ����ϱ� ���� ����ȯ
//			  
//			  for(int i = 0; i < sb.length(); i++) {
//				  if(sb.charAt(0) == '0') { //�Ű����� ���ڿ��� ù��° �ε����� ���� 0�̶�� ������ �Ѵ�.
//					  sb.deleteCharAt(0);   //�ε��� ���� 0���� ������ ������ ���ʺ��� ���� 0�϶� ������ �ϴµ� �׷��� �Ǹ� ���� �ε������� ��ĭ�� ������� �ȴ�.
//					  						//���� �ε����� 1�̿��ٸ� 0�� �ε����� ������ ���� 0���� ���� �ȴ�.
//				  } else { //0�� �ƴ϶�� �ݺ��� Ż��.
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
		  
		  
		  
		  
		  
		  
		  //54��
//			public String solution(String a, String b) {
//		
//			//����Ÿ���� int�� long�� ����ص� ������ int�� long�� ���������� ũ���� �Ű������� ������ �Ǹ� ������ ����.
//			//�׷��� ������ ���� ���� Ÿ���� BigInteger�� ����ϸ� �ȴ�.
//		
//			BigInteger ab = new BigInteger(a); //�����ڿ� ���ڿ��� ����ָ� ������ ��ȯ�ȴ�.
//			BigInteger bb = new BigInteger(b);
//		
//			String res = ab.add(bb).toString(); //ab�� bb�� ���ϰ� ���ڿ��� ��ȯ�Ѵ�.
//		
//			return res;
//		}
	
	
	
	
	
	//------------------------------------------------------------------------
	
	
	
	
		//55��
//		public int[] solution(int[] arr, int[] delete_list) {
//		
//			List<Integer> list = new ArrayList<Integer>(); //�Ű������� �� �迭�� �ߺ����� ���� ���Ұ��� �����ϴ� list
//		
//			w:for(int i = 0; i < arr.length; i++) { //arr[] ó������ ������ ���������� �����鼭
//				for(int j = 0; j < delete_list.length; j++) { //delete_list[]�� ���Ұ��� ���Ͽ�
//					if(arr[i] == delete_list[j]) { //�� �迭�� ���Ұ��� �ߺ��ȴٸ� 
//						continue w;				   //�ݺ����� Ż���Ͽ� arr[]�� ���� ���Ұ��� ���Ϸ� ����.
//					}
//				}
//				list.add(arr[i]); //���� arr[]�� i�ε��� ���� delete_list[]�� �ߺ����� �ʴ� ���̶�� list�� ��´�.
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
	
	
	
	
		//56��
//		public int solution(String my_string, String target) {
//		
//			int res;
//		
//			if(my_string.contains(target)) { //contains()�޼���� ���ڿ��ȿ� �Ű����� ���ڰ� ���ԵǾ� �ִ��� true, false�� ��ȯ���ش�.
//				res = 1;
//			} else {
//				res = 0;
//			}
//			return res;
//		}
	
	
	
	
	
	
	//------------------------------------------------------------------------

	
		  
		  
		  
		  
		  //57��
//		  public String solution(String[] str_list, String ex) {
//			  
//			  String res = "";
//			  
//			  for(int i = 0; i < str_list.length; i++) { // str_list[]�� �ε������� �ϳ��� �����ͼ�
//				  if(str_list[i].contains(ex)) {  //ex�������� ���ԵǾ� �ִٸ�
//					  continue; 				  //���ڿ��� �����ʰ� ���� �ε����� �Ѿ��.
//				  } else {
//					  res += str_list[i]; //ex�������� ���ԵǾ� ���� �ʴٸ� res���ڿ� ���� ���δ�.
//				  }
//			  }			  
//			  	return res;		  
//		  }

			
			
			
			
			
	//------------------------------------------------------------------------  
		  
		  
		  
		  
		  
		  
		  //58��
//		  public int solution(int[] date1, int[] date2) {
//			  
//			  String str1 = ""; //�Ű����� int�迭 �ΰ��� ���ڿ��� �ٲ��ٰ��̴�.
//			  String str2 = "";
//			  int res;
//			  
//			  for(int i = 0; i < 3; i++) {  
//				 str1 += date1[i];
//				 str2 += date2[i];
//			  }
//			  
//			  if(Integer.parseInt(str1) < Integer.parseInt(str2) ) { //���ڿ��� �ٲ� �迭�� int�� ��ȯ�Ͽ� �ΰ��� ���� ���Ѵ�.
//				  res = 1;
//			  } else {
//				  res = 0;
//			  }
//			  return res;
//		  }

			
			
			
			
			
	//------------------------------------------------------------------------   
		  
		  
		  
		  
		  
		  
		  //59��
//		  public int solution(String[] order) {
//			  
//			  int res = 0; //Ŀ�� ���� ��
//			  
//			  //������Ͱ� �߰ſ�� ������� �Ƹ޸�ī��� ī�� ���׳ĸ� ���ϸ� ���� Ǯ �� �ִ� ������.
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
		  
		  
		  
		
		  
		  
		  //60��
//		  public int[][] solution(int n){
//			  
//			  int[][] res = new int[n][n];
//			  
//			  for(int i = 0; i < res.length; i++) {
//				  for(int j = 0; j < res[i].length; j++) { //2�߹ݺ����� �̿���
//					  if( i == j ) { //i��j�� ���ٸ� �ش� �ε����� ���� 1�̰� �ٸ��ٸ� 0���� ����ش�.
//						  res[i][j] = 1;
//					  } else {
//						  res[i][j] = 0;
//					  }
//				  }
//			  }
//			  return res;
//		  }

			
			
			
			
			
	//------------------------------------------------------------------------
		  
		  
		  
		  
		  
	
		  //61��
//		  public String[] solution(String[] picture, int k) {
//			  
//			  List<String> list = new ArrayList<String>();
//			  
//			  for(int i = 0; i < picture.length; i++) {	//picture[]�� ��� ���ҿ� ����
//				  for(int j = 0; j < k; j++) {
//					  String pic = "";
//					  for(int g = 0; g < picture[i].length(); g++) { //�� ������ ���ڿ� �ϳ��ϳ� �����Ͽ� k����ŭ ���ڿ��� ����ְ�
//						  for(int f = 0; f < k; f++) {
//							  pic += picture[i].charAt(g);
//						  }
//					  }  
//					  list.add(pic); //k����ŭ ���ڸ� �߰��� ���ڿ��� list�� ��´�.(����)
//				  } //�� ���ڿ��� ���� ���ڿ��� k����ŭ list�� ��´�(����)
//			  }
//			  String[] res = list.toArray(new String[picture.length * k]); //��� ���� ���� list�� �迭�� ��ȯ�Ѵ�.
//			  
//			  return res;
//		  }

			
			
			
			
			
	//------------------------------------------------------------------------	  
	
	
	
	
	
	
		  //62��
//		  public int solution(int[][] arr){
//			  
//			  int res = 1; //��ȯ�� ������ �⺻���� 1�� �س���
//			  
//			  w:for(int i = 0; i < arr.length; i++) {
//				  for(int j = 0; j < arr[i].length; j++) {
//					  if(arr[i][j] != arr[j][i]) { //������ �� �غ��� ��
//						  res = 0; //�� �迭�� Ư���ε��� ���� �����ʴٸ� ������ ���� 0���� �ٲٰ� 
//						  break w; //�ݺ��� Ż��
//					  }
//				  }
//			  }
//			  return res; //���� ������ �� �غ��� �� ���� ���ٸ� �״�� 1���� ��ȯ�Ѵ�.
//		  }

			
			
			
			
			
	//------------------------------------------------------------------------	 
	
	
		  
		  
		  
		  
		  //63��
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
		  //2�߹迭�� �� ������ ���簢������ �������ְ� �Ű������� arr[][]�� ���Ҹ� �״�� �ű�� ���� ä����������
		  //���ڸ��� int�� �⺻���� 0���� �ڵ����� ä������.
			
			  
		  
			


	//------------------------------------------------------------------------
		  
		  
		  
		  
		  
		  
		  //64��
//		  public int solution(int[][] board, int k) {
//			  
//			  int res = 0;
//			  
//			  for(int i = 0; i < board.length; i++) { //i��j�� ��ȸ�ϴ� �ݺ����� �����
//				  for(int j = 0; j < board[i].length; j++) {
//					  if(i+j <= k) { //������ �����ϸ�
//						  res += board[i][j]; //i��j�� �ش��ϴ� �ε������� �����ش�.
//					  }
//				  }
//			  }
//			  return res;
//		  }
			
		  
		  
			


	//------------------------------------------------------------------------ 
		  
	
		  
		  
		  
		  
		  //65��
//		  public int[][] solution(int n){
//			  
//			  int[][] res = new int[n][n]; //n*nũ���� �迭����
//			  
//			  int val = 1; //�迭�� ���Ұ�
//			  int right = 0; 
//			  int bottom = 1;
//			  int left = n-2;
//			  int top = n-2;
//			  
//			  while(val <= n*n) { //�迭�� ���Ұ����� n*n�� ���������� �����ϱ� ������ val�� ���� �׺��� ũ�ٸ� �ݺ��� ����
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
