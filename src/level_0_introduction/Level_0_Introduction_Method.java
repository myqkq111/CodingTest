package level_0_introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Level_0_Introduction_Method {
	
	//Level 0 �Թ�
	
	//1��
//	public int solution(int[] common) {
//		
//		int res; //������� ���� ����
//		
//		if(common[0] - common[1] == common[1] - common[2]) { //������������ Ȯ��
//			int a = common[1] - common[0]; //���������� �´ٸ� ������ ���ϰ�
//			res = common[common.length-1] + a; //���������� + ����
//		} else { //���������� �ƴ϶��
//			int a = common[1] / common[0]; //���� ���ϰ�
//			res = common[common.length-1] * a; //���������� * ����
//		}
//		return res;
//	}
	
	
	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	
	
	//2��
//	public int[] solution(int num, int total) {
//		
//		int[] res = new int[num]; //���� ���� �迭
//		
//		for(int i = -50; i <= 1000; i++) { // num�� �ִ밪�� 100�� total�� �ִ밪�� 1000�� �̿��� ��� ����� ���� ���������
//										   // ���ü� �ִ� ���Ұ� -50���� 1000�̱� ������ �ݺ����� ���� �����ش�.			
//			int idx = 0; //�ε��������� ���
//			
//			for(int j = i; j < i+num; j++) { //-50���� ���������� num�� ������ŭ �迭�� ���
//				res[idx] = j;
//				idx++;
//			}			
//			
//			int sum = 0;
//			
//			idx = 0;
//			
//			for(int j = 0; j < res.length; j++) { //�迭�� ��� ������ ���� total������ Ȯ���Ѵ�.
//				sum+=res[idx];
//				idx++;
//			}
//			
//			if(sum == total) { //������ ���� total�̶��
//				break; //�ݺ��� ������ �迭 ��ȯ, �ƴ϶�� ���� ���ҷ� �Ѿ��.
//			}
//		}
//		return res;
//	}

	
	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	
	
	//3��
//	public int solution(int M, int N) {
//		//M�� N�� ���� ���� -1�� �ϸ� �������� Ƚ���� ���´ٴ� ������ �ľ��ϸ� Ǯ�⽱��.
//		int res = (M * N) - 1;
//		
//		return res;
//	}

	
	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	
	
	//4��
//	public int solution(String A, String B) {
//		
//		int res = 0; //���� ���� ����
//		
//		while(true) { //�ݺ����� �������� �����鼭
//			if(res == A.length()) { //A���ڿ��� ��ĭ�� ���� �о�ôٸ� 
//				res = -1;			//-1���� ������ �ݺ����� Ż���Ѵ�.
//				break;
//			}
//			
//			if(!A.equals(B)) { //A�� B���ڿ��� ���� �ʴٸ�
//				String C = ""; //������ A�� C�� ��� ���ڿ��� ��ĭ�� �о��ٰǵ�
//				for(int i = 0; i < A.length(); i++) { 
//					if(i == 0) { //ù��° ���ڷδ� A���ڿ��� �Ǹ����� ���ڰ� ���;��ϱ� ������ 
//						C += A.charAt(A.length()-1); //���������ڿ��� ó������ ����ְ�
//					} else { //�������� ���ʴ�� ����ش�.
//						C += A.charAt(i-1);
//					}
//				}
//				A = C; //B�� �񱳸� ���� A�� ����ְ�
//				res++; //���ڿ��� �о��� Ƚ���� 1������Ų��.
//			} else { //A�� B���ڿ��� ���ٸ�
//				break; //�״�� �ݺ����� Ż���Ѵ�.
//			}
//		}
//		return res;
//	}

	
	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	
	
	//5��
//	public String[] solution(String my_str, int n) {
//		
//		List<String> list = new ArrayList<String>(); //�迭�� ����� list
//		String a = ""; //n���� ���ڿ��� ���� ��ü
//		
//		for(int i = 0; i < my_str.length(); i++) { //my_str�� ���̸�ŭ �ݺ����� ����
//			
//			a += my_str.charAt(i); //ó������ �ϳ��� a��ü�� ���ڸ� ���
//			
//			if(a.length() == n) { //���� ���ڰ� n���� �Ǿ�����
//				list.add(a); //list�� ���
//				a = ""; //a��ü�� �ʱ�ȭ�Ѵ�.
//			} else if(i == my_str.length()-1) { //n���� �ƴ����� ���̻� ���� ���ڰ� ���ٸ� ���� ��� ���ڸ� list�� ��´�.
//				list.add(a);
//			}		
//		}
//		
//		String[] res = list.toArray(new String[list.size()]); //list�� �迭�� ��ȯ��Ų��.
//		
//		return res;
//		
//	}

	
	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	
	
	//6��
//	public int solution(int[] array) {
//		
//		int res = 0; //7�� ������ ���� ����
//		
//		for(int i = 0; i < array.length; i++) {
//			String num = Integer.toString(array[i]); //�迭�� ���Ұ��� ���ڿ��� �ٲٰ�
//			
//			for(int j = 0; j < num.length(); j++ )  { //���ڿ��� ���� �ϳ��ϳ� ���Ͽ� 7�� �ִٸ� ������ŭ res�������� ������Ų��.
//				if(num.charAt(j) == '7') {
//					res++; 
//				}
//			}
//		}
//		return res;
//	}

	
	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	
	
	//7��
//	public String solution(String my_string) {
//		
//		my_string = my_string.toLowerCase(); //��ҹ��� ���ڿ��� �ҹ��ڷ� �����		
//		
//		char[] array = my_string.toCharArray(); //���ڿ��� ���ڹ迭�� ������ش�.
//		
//		Arrays.sort(array); //�迭�� ������������ �������ְ�
//		
//		String res = "";
//		
//		for(int i = 0; i < array.length; i++) { //�迭�� ó������ ������� ���ڿ��� ���� ������ ���ڿ��� ������ش�.
//			res += array[i];
//		}
//		return res;
//	}

	
	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	
	//8��
//	public int solution(int n, int t) {
//		
//		int res = n;
//		
//		for(int i = 0; i < t; i++) { //1�ð��� �ι辿 �þ�ϱ� t����ŭ �ݺ����� �����鼭 ���ϱ� 2�� ���ָ� �ȴ�.
//			res *= 2;
//		}
//		return res;
//	}

	
	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	
	
	//9��
//	public int solution(String str1, String str2) {
//		
//		int res;
//		
//		if(str1.contains(str2)) { //contains : ���ڿ� �ȿ� �Ű����� ���ڿ��� ���ԵǾ��ִ��� Ȯ���ϴ� �޼���
//			res = 1;
//		} else {
//			res = 2;
//		}
//		return res;
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	
	//10��
//	public int solution(int n) {
//		
//		int res = 2; //���� 2�� ���� ����
//		
//		for(int i = 1; i <= 1000; i++) { //1000���� ���������� n�� �ִ�ġ�� 1000000�� 1000�� �����̱� �����̴�.
//			if(i * i == n) {
//				res = 1;
//				break;
//			}
//		}
//		return res;
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	
	//11��
//	public int solution(int n) {
//		int answer = 0;
//		String [] arr = Integer.toString(n).split(""); //�Ű����� n�� ���ڿ��� �ٲٰ� ���ڸ��� ���ڸ� �迭�� ��´�.
//		
//		for(String a : arr) { //�迭�� ��� ���Ҹ� �ϳ���
//			answer += Integer.parseInt(a); //int�� ����ȯ �� ������ ���� �����ش�.
//		}
//		return answer;
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	
	
	//12��
//	public int[] solution(int n, int[] numlist) {
//		
//		List<Integer> list = new ArrayList<Integer>(); //���� ���� list
//		
//		for(int i = 0; i < numlist.length; i++) {
//			if(numlist[i] % n == 0) { //numlist�� ���Ұ� n�� ��� �϶�
//				list.add(numlist[i]); //���Ҹ� list�� ���
//			}
//		}
//		int[] res = new int[list.size()]; 
//		
//		for(int i = 0; i < list.size(); i++) { //list�� ��� ���Ҹ� �迭�� ��´�.
//			res[i] = list.get(i);
//		}
//		
//		return res;
//		
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	
	//13��
//	public int solution(int num, int k) {
//		
//		int res;
//		
//		String strnum = Integer.toString(num); //�Ű����� �ΰ��� ���ڿ��� ����ȯ ���ְ�
//		String strk = Integer.toString(k);
//		
//		if(strnum.contains(strk)) { //num�ȿ� k�� ������ �Ǿ��ִٸ�
//			res = strnum.indexOf(strk) + 1; //k�� �ִ� �ڸ����� ��ȯ�ϰ�
//		} else { //���ٸ�
//			res = -1; //-1�� ��ȯ�Ѵ�.
//		}
//		
//		return res;
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	
	//14��
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
	
	
	
	
	
	
	//15��
//	public String[] solution(String[] quiz) {
//		
//		String[] res = new String[quiz.length];
//		
//		for(int i = 0; i < quiz.length; i++) { //quiz�迭�� ���Ҹ� �ϳ��� �����´�.
//			
//			String[] arr = quiz[i].split(" "); //���Ҹ� split�޼��带 �̿��� �迭�� ����ָ� arr�迭�� ���̴� ������ 5�� �ȴ�.
//			
//			int x = Integer.parseInt(arr[0]); //���� ���ڿ����� int�� ����ȯ ���ش�.
//			int y = Integer.parseInt(arr[2]);
//			int z = Integer.parseInt(arr[4]);
//			
//			switch(arr[1]) { //[������]�� + ���� - ���� �����ϰ�
//			case "+":
//				if(x + y == z) { //���갪�� �´ٸ� res�迭�� O�� �ƴ϶�� X�� �ִ´�.
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
	
	
	
	
	
	
	
	//16��
//	public int solution(String my_string) {
//		
//		String[] arr = my_string.split(" "); //���ڿ��� ���� �������� �迭�� ��´�.
//		
//		int res = Integer.parseInt(arr[0]); //�迭�� ù��°�� ������ �����̱� ������ ������ ����ش�.
//		
//		String pm = ""; //�����ȣ�� ���� ��ü
//		
//		for(int i = 1; i < arr.length; i++) {
//			if(i % 2 == 1) { //�ε����� Ȧ���϶�
//				pm = arr[i]; //pm��ü�� ���Ҹ� ����ش�.(Ȧ�� ���Ҵ� �����ȣ)
//			} else { //�ε����� ¦�����
//				switch(pm) { //pm��ü�� ����Ǿ��ִ� �����ȣ�� +���� -���� �ľ��� �� ������ش�.
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
	
	
	
	
	
	
	//17��
//	public int[] solution(int[] array) {
//		
//		int[] res = {array[0], 0}; //�Ű����� �迭�� 0��° �ε����� ���ҿ� 0�ε����� �迭�� ���
//		
//		for(int i = 0; i < array.length; i++) {
//			if(res[0] < array[i]) { //�Ű����� �迭�� ���Ҹ� ���Ͽ� 
//				res[0] = array[i]; //ū���� ���Ӱ� res�迭�� ����ش�.
//				res[1] = i;
//			}
//		}
//		return res;
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	
	//18��
//	public int[] solution(int n) {
//		
//		List<Integer> list = new ArrayList<Integer>();
//		
//		for(int i = 1; i <= n; i++) { //1���� n���� ���ڸ� ���ʴ�� ������ �������� 0�̸� n�� ����̱� ������ list�� ����ش�.
//			if(n % i == 0) { 
//				list.add(i);
//			}
//		}		
//		int[] res = new int[list.size()];
//		
//		for(int i = 0; i < list.size(); i++) { //list�� ���Ҹ� �迭�� ��� ����
//			res[i] = list.get(i);
//		}
//		return res;
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	
	//19��
//    public String solution(String s) {
//	    String answer = "";
//	    
//	    w:for(int i = 0; i < s.length(); i ++){ //s�� ���ڸ� �ٸ� ���ڵ�� ���Ѵ�
//	        for(int j = 0; j < s.length(); j++){
//	            if(i == j){ //���� �ε��� �϶� �ǳʶٵ��� �Ѵ�.
//	                continue;
//	            }
//	            if(s.charAt(i) == s.charAt(j)){ //���� ������ ���ڰ� �������
//	                continue w; //���� �ε����� �Ѿ��
//	            }
//	        }
//	        answer += s.charAt(i); //���� �ε����� ������� ��ü�� ����ش�.
//	    }
//	    String[] arr = answer.split(""); //�迭�� ������
//	    Arrays.sort(arr); //������������ �����Ѵ�
//	    
//	    answer = ""; //����ִ� ������ ������������ ���ĵ� ���ڿ��� ���Ӱ� �ޱ� ���ؼ��̴�.
//	    
//	    for(int i = 0; i < arr.length; i++){
//	        answer += arr[i];
//	    }
//	    
//	    return answer;
//	}






	//----------------------------------------------------------------------------------






	//20��
//	public String solution(String my_string, int num1, int num2) {
//		
//		char ch1 = my_string.charAt(num1); //num1,2 �ε����� �ش��ϴ� ���ڸ� �̸� �޾Ƶд�.
//		char ch2 = my_string.charAt(num2);
//		
//		StringBuffer sb = new StringBuffer(my_string); //setCharAt()�� ����ϱ� ����
//		
//		sb.setCharAt(num1, ch2); //num1,2�ε����� �ش��ϴ� ������ ��ġ�� ���� �ٲ۴�.
//		sb.setCharAt(num2, ch1);
//		
//		String res = sb.toString();
//		
//		return res;
//		
//	}






	//----------------------------------------------------------------------------------





	
	//21��
//	public long solution(String numbers) {
//		
//		String str = ""; //numbers�� ���ڸ� �ϳ��� ���� ��ü
//		String resStr = ""; //numbers�� ���ĺ��� �´� ���ڸ� �ϴ� ���ڿ��� ��´�.
//		
//		for(int i = 0; i < numbers.length(); i++) {			
//			str += numbers.charAt(i); //���ڸ� �ϳ��� ��ü�� �߰��ϴٰ�
//	
//			switch(str) { //�´� ����ܾ �ִٸ�
//			case "zero":
//				resStr += 0; //�׿� �´� ���ڸ� ���
//				str = ""; //��ü�� �ٽ� ����.
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
//		long res = Integer.parseInt(resStr); //���ڿ��� ���ڷ� �ٲ��´�.
//		
//		return res;
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	
	//22��
//	public String solution(String my_string) {
//		
//		String res = ""; //������� ���� ��ü
//		
//		for(int i = 0; i < my_string.length(); i++) {
//			String tocase = ""; //���ڸ� �ϳ��� ��Ƽ� ��ҹ��ڷ� ������ ���ֱ����� �뵵
//			tocase += my_string.charAt(i);
//			if(my_string.charAt(i) >= 'a' && my_string.charAt(i) <= 'z') { //�ҹ����ϰ�� �빮�ڷ�
//				res += tocase.toUpperCase(); 
//			} else { //�빮���ϰ�� �ҹ��ڷ� �ٲ۴�.
//				res += tocase.toLowerCase();
//			}
//		}
//		return res;
//	}

	
	
	
	
	
	//----------------------------------------------------------------------------------
	
	
	
	
	
	
	//23��
//	public String solution(String cipher, int code) {
//		
//		String res = "";
//		
//		for(int i = code; i <= cipher.length(); i += code) { //code���� �����ؼ� code����� ��ü�� ��´�.
//			res += cipher.charAt(i-1); //code�� �ڸ����̰� charAt()�� �ε����� ������ϱ� ������ -1�� ���ش�.
//		}
//		return res;
//	}

	
	
	
	
	
	//----------------------------------------------------------------------------------
	
	
	
	
	
	
	//24��
//	public int solution(int order) {
//		
//		int res = 0;
//		
//		String str = Integer.toString(order); //�Ű����� int�� String���� �ٲ��ְ�
//		String[] arr = str.split(""); //���ڿ��� ���ڸ��� �迭�� �����ش�.
//		
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[i].equals("3") || arr[i].equals("6") || arr[i].equals("9")) {
//				res++; //���ڰ� 3,6,9��� res������ ���� ��½�Ų��.
//			}
//		}
//		return res;
//	}

	
	
	
	
	
	//----------------------------------------------------------------------------------
	
	
	
	
	
	
	//25��
//	public int solution(int[] array, int n) {
//		
//		int res = array[0]; //array�� ù��° ���ҿ�
//		int x; //ù��°���ҿ� n�� �� ���� ��´�.
//		
//		if(array[0] > n) { //ù��°���ҿ� n���� ���� ū������ �������� ������ �Ѵ�. �׷��� ������ �ȳ����� �����̴�.
//			x = array[0] - n;
//		} else {
//			x = n - array[0];
//		}
//		
//		for(int i = 1; i < array.length; i++) {
//			int y; //i�ε����� �ش��ϴ� ���ҿ� n�� �� ���� ���� ����
//			if(array[i] > n) { //�������� �ȳ����� �ϱ����� ���ǹ�
//				y = array[i] - n;
//			} else {
//				y = n - array[i];
//			}
//			
//			if(x == y) { //x��y�� ���Ͽ� �ΰ��� ���ٸ�
//				if(res > array[i]) { //������ ���Ҹ� res������ ��´�.
//					res = array[i];
//				}
//			} else if(x > y) { //y�� �� �۴ٸ� x���� ����� ���̱� ������
//				res = array[i]; //res�� �ش� �ε����� ���Ҹ� �־��ְ�
//				x = y; //�� ���ҿ� n�� ���̰��� x�� ����ش�.
//			}
//		}
//		return res;
//	}

	
	
	
	
	
	//----------------------------------------------------------------------------------
	
	
	
	
	
	
	//26��
//	public int solution(int[] sides) {
//		
//		int res; //1�Ǵ�2 ������� ���� ����
//		int max = sides[0]; //����ū ������ ���� ���� ����
//		int maxidx = 0; //����ū ������ �ε���
//		int sum = 0; //����ū ���Ҹ� ������ ������ ������ �հ�
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
	
	
	
	
	
	
	//27��
//	 public String solution(String my_string) {
//		 
//		 String[] arr = my_string.split(""); //�Ű����� ���ڿ��� �迭�� ��������
//		 List<String> list = new ArrayList<String>(Arrays.asList(arr)); //list�� ��ȯ�Ѵ�.
//		 
//		 for(int i = 0; i < list.size()-1; i++) {		 
//			 for(int j = list.size()-1; j > i; j--) {			 
//				 if(list.get(i).equals(list.get(j))) { //��� ���ڸ� ���Ͽ� ���� ���ڰ� ������� �ڿ� �ִ� ���ڸ� �����.
//					list.remove(j);
//				 }			 
//			 }		 
//		 }
//		 
//		 String res = "";
//		 for(int i = 0; i < list.size(); i++) { //�ߺ����ڸ� ������ �� ���� list�� ���Ҹ� ���ڿ��� �ٲ۴�.
//			 res += list.get(i);
//		 }	 
//		 return res;
//	 }

		
		
		
		
		
	//----------------------------------------------------------------------------------
	
	
	
	 
	 
	 
	 //28��
//	 public int solution(int i, int j, int k) {
//		 
//		 int res = 0; //���� ���� ����
//		 
//		 for(int q = i; q <= j; q++) {
//			 String str = Integer.toString(q); //i���� j��ŭ �ݺ����� �����鼭 ���ڸ� ���ڿ��� ��ȯ��Ų��.
//			 for(int w = 0; w < str.length(); w++) {
//				 if(Character.getNumericValue(str.charAt(w)) == k) { //���ڿ��� ���� �ϳ��� ������ k�� ���Ͽ� ���ٸ�
//					 res++; //������ ���
//				 }
//			 }
//		 }
//		 return res;
//	 }

		
		
		
		
		
	//----------------------------------------------------------------------------------
	 
	 
	 
	 
	 
	 
	//29��
//	public int solution(String before, String after) {
//		
//		String str = ""; //before�� ���ڿ��� �Ųٷ� ���� ��ü
//		int res;
//		
//		for(int i = before.length()-1; i >= 0; i--) { //���ڿ��� �Ųٷ� ��°���
//			str += before.charAt(i);
//		}
//
//		if(str.equals(after)) { //�Ųٷ� ���� ���ڿ��� after�� ���ٸ�
//			res = 1; //1��
//		} else { //�ƴ϶��
//			res = 0; //0�� �ִ´�.
//		}
//		return res;
//	}

	
	
	
	
	
	//----------------------------------------------------------------------------------
	
	
	
	
	
	
	//30��
//	public int solution(int chicken) {
//		
//		int res = chicken / 10; //������� ���� ����(�������� ��Ų ġŲ�� ��)
//		int a = chicken / 10; //�������� ġŲ�� ��Ű�� �� ���� ������
//		int b = chicken % 10; //�������� ġŲ�� ��Ű�� ���� ������
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
	
	
	
	
	
	
	//31��
//	public String solution(String[] id_pw, String[][] db) {
//	
//		String res = "";
//		
//		for(int i = 0; i < db.length; i++) {
//			if(id_pw[0].equals(db[i][0])) { //id���� Ȯ���Ѵ�.
//				if(id_pw[1].equals(db[i][1])) { //��ġ�ϴ� id�� ��й�ȣ�� ��ġ�Ѵٸ�
//					res = "login"; //login�� ��� �ݺ��� Ż��
//					break;
//				} else { //id�� ��ġ�ϰ� ��й�ȣ�� ��ġ���� �ʴ´ٸ�
//					res = "wrong pw"; //wrong pw�� ��� �ݺ��� Ż��
//					break;
//				}
//			}
//		}
//		
//		if(res.isEmpty()) { //��� id�� ���������� ��ġ�ϴ� id�� ���ٸ� fail�� ��´�.
//			res = "fail";
//		}
//		
//		return res;
//	}






	//----------------------------------------------------------------------------------




	
	
	//32��
//	public int[] solution(int[][] score) {
//		
//		int[] res = new int[score.length]; //����� ���� �迭
//		
//		List<Integer> list = new ArrayList<Integer>(); //�Ű����� 2���� �迭�� ������ ����� ���� list
//		
//		for(int i = 0; i < score.length; i++) {
//			int ave = (score[i][0] + score[i][1]) / 2; //����� ���� list�� ��´�
//			list.add(ave);
//		}
//		
//		Collections.sort(list, Collections.reverseOrder()); //����� ���� ���Ұ� ������ �������� ����
//		
//		int count; //����� ������ ������ ����� �ְ� �� �ο���ŭ ��������� ������ ���� ������ ������� ī��Ʈ�Ѵ�.
//		
//		for(int i = 1; i <= list.size(); i += count) {
//			List<Integer> ov = new ArrayList<Integer>(); //������� ���ĵ� list�� ���Ҹ� ������� ���Ͽ� ���� ����� ���� 2�����迭 ������ �ε����� ���� list
//			count = 0;
//			for(int j = 0; j < score.length; j++) {
//				if(list.get(i-1) == (score[j][0] + score[j][1]) / 2) {
//					ov.add(j); //list�� �ش� �ε����� ���ҿ� ���� ����� ���� 2�����迭�� �ε����� ��´�.
//				}
//			}
//			for(int j = 0; j < ov.size(); j++) {
//				res[ov.get(j)] = i; //res�迭�� �� �ε����� ����� �Է����ְ�
//				count++; //�ش����� ������� ī��Ʈ�Ѵ�.
//			}
//		}
//			return res;
//	}






	//----------------------------------------------------------------------------------
	
	
	
	
	
	
	//33��
//	public int[] solution(int[] numlist, int n) {
//		
//		int[] res = new int[numlist.length]; //����� ���� �迭
//		int[] ch = new int[numlist.length]; //n�� numlist�迭 ������ �Ÿ�
//		
//		for(int i = 0; i < numlist.length; i++) {
//			int a = numlist[i] - n;
//			if(a < 0) { //numlist ���� - n�� �������
//				a = -(a);	//����� �ٲ��ش�.
//			}
//			ch[i] = a;
//		}
//		
//		Arrays.sort(ch); //������������ ����
//		
//		int count; 
//		
//		for(int i = 0; i < ch.length; i += count) {
//			List<Integer> list = new ArrayList<Integer>(); //������� ch���Ұ� ��ġ�ϴ� ���Ҹ� ���� list
//			for(int j = 0; j < numlist.length; j++) {
//				int a = numlist[j] - n;
//				if(a < 0) {
//					a = -(a);
//				}
//				if(a == ch[i]) {
//					list.add(numlist[j]);
//				}
//			}
//			if(list.size() == 2) { //list�� size�� 2��°� �Ÿ��� ���� ���Ұ� �ִٴ� ��
//				count = 2;
//				if(list.get(0) > list.get(1)) { //ū���Ұ� �տ� ���� ���Ұ� �ڿ� ������ ��ġ�Ѵ�.
//					res[i] = list.get(0);
//					res[i+1] = list.get(1);
//				} else {
//					res[i] = list.get(1);
//					res[i+1] = list.get(0);
//				}
//			} else { //list�� size�� 1�϶�
//				count = 1;
//				res[i] = list.get(0);
//			}
//		}
//		return res;
//	}

	
	
	
	
	
	//----------------------------------------------------------------------------------
	
	
	
	

	
	//34��
//	public String solution(String bin1, String bin2) {
//		
//		int a = Integer.parseInt(bin1, 2); //�Ű����� ���ڿ��� 2������ �о� 10���� int�� ����ȯ�Ѵ�.
//		int b = Integer.parseInt(bin2, 2);
//		
//		int c = a + b; //10������ �ٲ� �Ű����� �ΰ��� ��������
//		
//		String res = Integer.toBinaryString(c); //10������ 2���� ���ڿ��� �ٲ��ش�.
//		
//		return res;	
//	}

	
	
	
	
	
	//----------------------------------------------------------------------------------
	
	
	
	
	
	
	//35��
//	public int solution(int a, int b) {
//		
//		int res = 1;
//		
//		List<Integer> alist = new ArrayList<Integer>(); //a�� ��� ���ϱ�
//		for(int i = 1; i <= a; i++) {
//			if(a % i == 0) {
//				alist.add(i);
//			}
//		}
//		
//		List<Integer> blist = new ArrayList<Integer>(); //b�� ��� ���ϱ�
//		for(int i = 1; i <= b; i++) {
//			if(b % i == 0) {
//				blist.add(i);
//			}
//		}
//	
//		int max = 0; //a��b�� �ִ����� ���ϱ�
//		for(int i = 0; i < alist.size(); i++) {
//			for(int j = 0; j < blist.size(); j++) {
//				if(alist.get(i) == blist.get(j)) {
//					max = alist.get(i); 
//				}
//			}
//		}
//		
//		int fraction = b / max; //���м��� ��Ÿ�������� �и�
//		List<Integer> list = new ArrayList<Integer>();//���м� �и��� ���μ��� ���� list
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
//		for(int i = 0; i < list.size(); i++) { //�и��� ���μ��� 2�� 5�� �ִ��� Ȯ��
//			if(list.get(i) != 2 && list.get(i) != 5) {
//				res = 2;
//				break;
//			}
//		}
//		return res;
//	}

	
	
	
	
	
	//----------------------------------------------------------------------------------
	
	
	
	
	
	
	//36��
//	public int solution(int[][] lines) {		
//
//		int res = 0; //������� ������ ����
//		
//		Map<Integer, Integer> map = new HashMap<Integer, Integer>(); 
//		
//		for(int i = 0; i < lines.length; i++) {
//			for(int j = lines[i][0]; j < lines[i][1]; j++) { //2�����迭�� ��� ���Ҹ� map�� �������̴�.
//				if(map.get(j) == null) { 			//���� �� 0~2��� ġ�� 01 , 12 �̷������� ����ٰ��̴�.
//					map.put(j, j+1); //�ش� Ű���� ���°�� ������ ��ġ�� �κ��� ���� ������ ���� ���Ҹ� �־��ְ�
//				} else { //Ű���� �������
//					res++; //��ġ�� �κ��̱� ������ res���� 1���������ش�.
//					map.remove(j); //�׸��� Ű�� �����ϴ� ������ 2�����迭 ������ 3�� �̱� ������ ��ġ�� �κ��� 3���� �� ���ԵǾ� ������� �ݺ������� ��ȸ�Ҷ�����
//				}					//res������ ���� �ö󰣴�. �׷��� ������ ó���� ��ĥ�� ������ �����ָ� ������ ��ĥ�� Ű ���� ���� ������
//			}						//res�������� ��½�Ű���ʰ� map���Ҹ� �߰��ϰԵȴ�.
//		}
//		return res;
//	}

	
	
	
	
	
	//----------------------------------------------------------------------------------
	
	
	
	
	
	
	//37��
//	public int solution(int[] numbers) {
//		
//		Arrays.sort(numbers); //�Ű����� int�迭�� ������������ �����Ѵ�
//		
//		int res = numbers[numbers.length-1] * numbers[numbers.length-2]; //int�迭�� �ǵڿ� �ΰ��� ���Ҹ� ���Ѵ�.
//		
//		return res;
//		
//	}

	
	
	
	
	
	//----------------------------------------------------------------------------------
	
	
	
	
	
	
	//38��
//	public int solution(int n) {
//		
//		int res = 0; //����� ���� ����
//		
//		for(int i = 10; i > 0; i-- ) { //�ִ� ������ 10���� ���Ѱ��� n�� ���Ͽ� n�� ũ�ų� ������������ ������.
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
	
	
	
	
	
	
	//39��
//	public String solution(String my_string) {
//		
//		String[] arr = {"a","e","i","o","u"}; //�ټ����� ���ĺ��� �迭�� ����ش�
//		int idx;
//		
//		StringBuffer sb = new StringBuffer(my_string); //deleteCharAt()�� ����ϱ� ���� ����ȯ
//		
//		for(int i = 0; i < arr.length; i++) {
//			while(sb.indexOf(arr[i]) != -1){ //-1�� �ƴ϶�°� �Ű������� �ش� ���ĺ��� �ִٴ� ��
//				idx = sb.indexOf(arr[i]); //�ش� ���ĺ��� index�� ã��
//				sb.deleteCharAt(idx); //�� �κ��� �����Ѵ�.
//			}
//		}
//		return sb.toString(); 
//	}

	
	
	
	
	
	//----------------------------------------------------------------------------------
	
	
	
	
	
	
	//40��
//	public int solution(int[][] dots) {
//		//������ ������ �� ������ ���Ⱑ ���ٴ� ��.
//		//�̰͸� �˸� �����ϰ� Ǯ �� �ִ�.
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
//	 public double slope(int[] a, int[] b) { //���⸦ ���ϴ� �޼��� ����
//	    	return (a[0]-b[0])*1.0/(a[1]-b[1]);
//	    }

		
		
		
		
		
	//----------------------------------------------------------------------------------
	
	
	 
	 
	 
	 
	 //41��
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
	//res�� i���� ���󰡸鼭 3�� ���ǰų� 3�� ��� �϶� ���� ��� ��Ų��.
	//�׷��� ���� ��� ���ѵ� 3�� ���ǰų� 3�� ��� �϶�
	//3�� ��������ʰ� 3�� ����� �ƴҶ����� res���� ��½�Ų��.
	
	
	
	
	
	
	//----------------------------------------------------------------------------------
	 
	 
	 
	 
	 
	 
	 //42��
//	public int solution(String[] spell, String[] dic) {
//		
//		int res = 2; //�⺻���� 2�� ����
//		
//		w:for(int i = 0; i < dic.length; i++) {
//			for(int j = 0; j < spell.length; j++) {
//				if(dic[i].contains(spell[j])) { //spell[]�� �ش� �ε������� dic[]�� �ε������� �����ִٸ� spell[]�� ���� �ε������� Ȯ���غ���.
//					if(spell.length-1 == j) { //spell[]�� �� ���Ҵٸ� spell�� ��� ���ĺ��� ��� ����� dic�� �����Ѵٴ� ���̹Ƿ�
//						res = 1; //1���� �־��ְ�
//						break w; //��� �ݺ����� Ż���� ����� ��ȯ�Ѵ�
//					} else { //���� spell[]�� �� �ȵ��Ҵٸ� ������ �ȳ������� ���������� �Ѿ ���� �ε������� Ȯ���Ѵ�.
//						continue;
//					}
//				}
//				break; //���ĺ��� ���ԵǾ��ִ��� Ȯ���ϴ��� ���Ե������� ���ĺ��� �ִٸ� dic�� ���� ���ҷ� �̵��Ѵ�.
//			}
//		}
//		return res;
//	}

	
	
	
	
	
	//----------------------------------------------------------------------------------
	
	
	
	
	
	
	//43��
//	public int solution(int[] sides) {
//		
//		int res = 0;
//		int max; //�� ������ ū��
//		int min; //�� ������ ������
//		
//		if(sides[0] > sides[1]) {
//			max = sides[0];
//			min = sides[1];
//		}else {
//			max = sides[1];
//			min = sides[0];
//		}
//			
//		res += (sides[0] + sides[1]) - max -1; //������ �Ѻ��� ���� �� ���� ��� ����
//		
//		for(int i = 1; i <= max; i++) { //�� ������ ���� �� ���� ���� ��� ����
//			if(i + min > max && i <= max) {
//				res++;
//			}
//		}
//		return res;
//	}

	
	
	
	
	
	//----------------------------------------------------------------------------------
	 
	 
	
	
	
	
	//44��
//	public int solution(String my_string) {
//		
//		int res = 0; //������� ���� ����
//		String su = ""; //�ڿ����� ���� ���ڿ�
//		
//		for(int i = 0; i < my_string.length(); i++) { //���ڿ��� �ѱ��ھ� ������
//			if(my_string.charAt(i) >= 'a' && my_string.charAt(i) <= 'z' || my_string.charAt(i) >= 'A' && my_string.charAt(i) <= 'Z') { //���ڰ� �ƴ� ���ڶ��
//				if(!su.isEmpty()) { //su���ڿ��� ���� ��� �ִٸ�
//					res += Integer.parseInt(su); //int�� ��ȯ�� res������ �����ְ�
//					su = ""; //su���ڿ��� ����ش�.
//				} //���� su���ڿ��� ����ִٸ� �ƹ��� �̺�Ʈ���� �Ѿ��.
//				
//			} else { //���ڶ�� su���ڿ��� ��´�. ���ڿ��� ��������� ���ڸ� �ڿ����� �ƴ� ���ڸ��̻��� �ڿ����� ���� �ֱ� ������ ���ڿ��� ��� ���´�.
//				su += my_string.charAt(i);
//			}
//		}
//		return res;
//	}

	
	
	
	
	
	//----------------------------------------------------------------------------------
	
	
	
	
	
	
	//45��
//	public int solution(int[] numbers) {
//		
//		Arrays.sort(numbers); //������������ ����
//		
//		int res;
//		
//		//������ ������ ���ϸ� ����� �Ǳ� ������ ���� �ΰ��� �������� ����ū������ ���� ���� �ִ�.
//		//�׷��� ������ ������������ ���ĵ� �迭�� �տ��� �ο��Ҹ� ���� ���� �ڿ��� �ο��Ҹ� ���Ѱ��� ���Ͽ� �� ū���� ��ȯ�Ѵ�.
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
	
	
	
	
	
	
	//46��
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
	
	
	
	
	
	
	//47��
//	public String solution(String polynomial) {
//		
//		String[] arr = polynomial.split(" "); //�Ű����� ���ڿ��� ������ �������� �迭�� ��´�
//		
//		int su1 = 0; //���� ���� ����
//		int su2 = 0; //������� ����
//		
//		for(int i = 0; i < arr.length; i+=2) { //�迭�� Ȧ���� +�� �ְ� ¦���� �����װ� ������� �ֱ� ������ 2�� ���������ش�
//			if(arr[i].charAt(arr[i].length()-1) == 'x') { //���ҿ� x�� �����ϰ� �ִٸ�(������)
//				if(arr[i].length() == 1) { //x�ϳ��� �ִ� ������ �̶�� 1x�̱� ������
//					su1 += 1; //1�� �����ش�
//				} else { //x�ϳ��� �ִ°� �ƴ϶��
//					arr[i] = arr[i].replace('x', '0'); //x�� 0���� �ٲ��ְ�
//					su1 += Integer.parseInt(arr[i]) / 10; //���ڿ��� int�� ����ȯ�� 10�� �����ָ� x�� ������ ���� ���ڰ� ������ �ȴ�.
//				}
//			}else { //���ҿ� x�� �������� �ʴ´ٸ�(�����)
//				su2 += Integer.parseInt(arr[i]);
//			}
//		}
//		
//		String res; //su1�̳� su2�� ���� 0�̶�� ���׽Ŀ� �������̳� ������� ���� ����̱� ������ ������� �ؿ��� ���� ���ǿ� ���� �޶�����.
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
	
	
	
	
	
	
	//48��
//	public int[] solution(String[] keyinput, int[] board) {
//		
//		int[] res = {0,0}; //������ 0,0���� �����ϱ� ������ �ʱⰪ���� �ش�.
//		int upMax = board[1] / 2; //�������� �ִ�ũ��
//		int downMax = (board[1] / 2) * -1;
//		int rightMax = board[0] / 2;
//		int leftMax = (board[0] / 2) * -1;
//		
//		for(int i = 0; i < keyinput.length; i++) { 
//			switch(keyinput[i]) { //keyinput�迭�� �� ���Ҹ� ������ ������ true��� ���Ҹ��� �ٸ� ������ �Ͽ� ���� �����Ѵ�.
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
	
	
	
	
	
	
	//49��
//	public int solution(String s) {
//		
//		String[] arr = s.split(" "); //������ �������� �迭�� ��´�.
//		
//		int res = 0; //s�� ���ڿ����� ���� ���� ����
//		
//		for(int i = 0; i < arr.length; i++) { //�迭�� ���̸�ŭ �ݺ����� ����
//			if(arr[i].equals("Z")) { //�ش� �ε����� ���Ұ� "Z"���
//				res -= Integer.parseInt(arr[i-1]); //���� ���ߴ� ���ڸ� ����
//			} else { //"�ش� �ε����� ���Ұ� "Z"�� �ƴ϶��
//				res += Integer.parseInt(arr[i]); //�ش� ���Ҹ� �����ش�.
//			}
//		}
//		return res;
//	}

	
	
	
	
	
	//----------------------------------------------------------------------------------
	
	
	
	
	
	
	//50��
//	public int[] solution(int n) {
//		
//		List<Integer> list = new ArrayList<Integer>(); 
//		
//		for(int i = 2; i <= n; i++) { 
//			while(n % i == 0) { //n ������ i �� 0�̶��
//				list.add(i); //i�� list�� ���
//				n /= i; //n�� ���������� 0�� �ȵɶ����� �ݺ��Ѵ�.
//			} //0�� �ȵȴٸ� ���� ���� �Ѿ��.
//		}
//		//��Ʈ���� �̿��� list�� �ߺ����� �������ְ� ������������ ���ı��� �����ϰ� �� �� �ִ�.
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
	
	
	
	
	
	
	//51��
//	public int[] solution(String my_string) {
//		
//		List<Integer> list = new ArrayList<Integer>(); //���ڸ� ���� list
//		
//		for(int i = 0; i < my_string.length(); i++) {
//			if(!(my_string.charAt(i) >= 'a' && my_string.charAt(i) <= 'z')) { //���ڿ��� �۾��� �ϳ��� ������ ���ڶ��
//				list.add(Character.getNumericValue(my_string.charAt(i))); //list�� ��´�
//			}
//		}
//		int[] res = new int[list.size()]; //list�� ��� ���ڸ� int�迭�� ����ְ�
//		
//		for(int i = 0; i < res.length; i++) {
//			res[i] = list.get(i);
//		}
//		
//		Arrays.sort(res); //������������ �������ش�.
//		
//		return res;
//	}

	
	
	
	
	
	//----------------------------------------------------------------------------------
	
	
	
	
	
	
	//52��
//	public int solution(int n) {
//		
//		int res = 0; //�ռ����� ����
//		
//		for(int i = 4; i <= n; i++) { //1,2,3�� �ռ����� �ɼ� ���� ������ 4���� ����
//			 int x = 0; //����� ����
//			 for(int j = 1; j <= i; j++) { //����� ����� ã�´�.
//				 if(i % j == 0) {
//					 x++;
//				 }
//			 }
//			 if(x >= 3) { //���� i�� �ռ������
//				 res++; //������ 1���
//			 }
//		}
//		return res;
//	}

	
	
	
	
	
	//----------------------------------------------------------------------------------
	
	
	
	
	
	
	//53��
//	public int solution(int[] box, int n) {
//		
//		int res = 1;
//		
//		for(int i = 0; i < 3; i++) {
//			res *= box[i] / n; 
//		}
//		return res;
//	}
	//����,����,���̸� n���� �������� ���ϸ� �ȴ�.
	
	
	
	
	
	//----------------------------------------------------------------------------------
	
	
	
	
	
	//54��
//	public int[] solution(int[] numbers, String direction) {
//		
//		int[] res = new int[numbers.length];
//		
//		for(int i = 1; i < numbers.length; i++) {
//			if(direction.equals("right")) { //right���
//				res[0] = numbers[numbers.length-1]; //�迭�� ù��° ���ҷ� �Ű����� �迭�� ���������Ҹ� �ְ�
//				res[i] = numbers[i-1]; //�ι�°���� �Ű����� �迭�� ���Ҹ� ������� �ִ´�.
//			} else { //left���
//				res[numbers.length-1] = numbers[0]; //�迭�� ������ ���ҷ� �Ű����� �迭�� ù��° ���Ҹ� �ְ�
//				res[i-1] = numbers[i]; //�Ű����� �迭�� �ι�° ���Һ��� ������� �ִ´�.
//			}
//		}
//		return res;
//	}

	
	
	
	
	
	//----------------------------------------------------------------------------------
	
	
	
	
	
	
	//55��
//	public int solution(int[] numbers, int k) {
//		
//		int idx = 1; //�ʱⰪ�� 1�� �ְ� �ι�°���� ���������� +2�� ���ش�.
//		
//		for(int i = 1; i < k; i++) {
//			idx += 2;
//		}
//		
//		int res = idx % numbers.length; //idx���� ������ ����� ���� �������� k��°�� ���� ������ ����� ��ȣ��. 
//		if(res == 0) { //idx������ ����� ���� ���� ��� �������� 0�� �ȴ�. ���� �ǵ��� ������ ����� ���� ���� ����̹Ƿ� ������ ����� idx���� ����ش�.
//			res = numbers.length;
//		}
//		
//		return res;
//	}

	
	
	
	
	
	//----------------------------------------------------------------------------------
	
	
	
	
	
	
	//56��
//	public int[][] solution(int[] num_list, int n){
//		
//		int[][] res = new int[num_list.length / n][n];; //������� ���� 2���� �迭
//	
//		int idx = 0; //�Ű����� �迭�� ���Ҹ� ������� �������� �ҷ��� ����
//		for(int i = 0; i < res.length; i++) {
//			for(int j = 0; j < n; j++) {
//				res[i][j] = num_list[idx];
//				idx++;
//			}
//		}
//		return res;
//	}

	
	
	
	
	
	//----------------------------------------------------------------------------------
	
	
	
	
	
	
	//57��
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
	
	
	
	
	
	
	//58��
//	public String solution(String rsp) {
//		
//		String res = "";
//		
//		//�Ű����� ���ڿ��� �ѱ��ھ� ������ ��ġ�ϴ� ����� ���� res���ڿ��� ��´�.
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
