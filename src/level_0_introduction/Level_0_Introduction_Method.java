package level_0_introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
