package level_0_introduction;

import java.util.ArrayList;
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
	public String[] solution(String my_str, int n) {
		
		String[] res;
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
