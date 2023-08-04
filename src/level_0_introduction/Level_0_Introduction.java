package level_0_introduction;

import java.util.Arrays;

public class Level_0_Introduction {
	public static void main(String[] args) {
		
		Level_0_Introduction_Method lim = new Level_0_Introduction_Method();
		
//		1. 등차수열 혹은 등비수열 common이 매개변수로 주어질 때, 마지막 원소 다음으로 올 숫자를 return 하도록 solution 함수를 완성해보세요.
//		제한사항
//		2 < common의 길이 < 1,000
//		-1,000 < common의 원소 < 2,000
//		common의 원소는 모두 정수입니다.
//		등차수열 혹은 등비수열이 아닌 경우는 없습니다.
//		등비수열인 경우 공비는 0이 아닌 정수입니다.
		
//		int[] common = {3,9,27};
//		
//		System.out.println(lim.solution(common));
		
		
		
		
		
		
	//--------------------------------------------------------------------------
		
		
		
		
		
		
		
//		2. 연속된 세 개의 정수를 더해 12가 되는 경우는 3, 4, 5입니다. 두 정수 num과 total이 주어집니다. 
//		연속된 수 num개를 더한 값이 total이 될 때, 정수 배열을 오름차순으로 담아 return하도록 solution함수를 완성해보세요.
//
//		제한사항
//		1 ≤ num ≤ 100
//		0 ≤ total ≤ 1000
//		num개의 연속된 수를 더하여 total이 될 수 없는 테스트 케이스는 없습니다.
		
//		int num = 99;
//		int total = 0;
//		
//		System.out.println(Arrays.toString(lim.solution(num, total)));
		
		
		
		
		
		
		//--------------------------------------------------------------------------
		
		
		
		
		
		
//		3. 머쓱이는 큰 종이를 1 x 1 크기로 자르려고 합니다. 예를 들어 2 x 2 크기의 종이를 1 x 1 크기로 자르려면 최소 가위질 세 번이 필요합니다.
//
//		정수 M, N이 매개변수로 주어질 때, M x N 크기의 종이를 최소로 가위질 해야하는 횟수를 return 하도록 solution 함수를 완성해보세요.
		
//		int M = 1;
//		int N = 1;
//		
//		System.out.println(lim.solution(M, N));

		
		
		
		
		
		//--------------------------------------------------------------------------
		
		
		
		
		
		
//		4. 문자열 "hello"에서 각 문자를 오른쪽으로 한 칸씩 밀고 마지막 문자는 맨 앞으로 이동시키면 "ohell"이 됩니다. 
//		이것을 문자열을 민다고 정의한다면 문자열 A와 B가 매개변수로 주어질 때, 
//		A를 밀어서 B가 될 수 있다면 밀어야 하는 최소 횟수를 return하고 밀어서 B가 될 수 없으면 -1을 return 하도록 solution 함수를 완성해보세요.
		
//		String A = "abc";
//		String B = "abc";
//		
//		System.out.println(lim.solution(A, B));

		
		
		
		
		
		//--------------------------------------------------------------------------
		
		
		
		
		
		
//		5. 문자열 my_str과 n이 매개변수로 주어질 때, my_str을 길이 n씩 잘라서 저장한 배열을 return하도록 solution 함수를 완성해주세요.
		
//		String my_str = "abcdef123a";
//		int n = 4;
//		
//		System.out.println(Arrays.toString(lim.solution(my_str, n)));

		
		
		
		
		
		//--------------------------------------------------------------------------
		
		
		
		
		
		
//		6. 머쓱이는 행운의 숫자 7을 가장 좋아합니다. 정수 배열 array가 매개변수로 주어질 때, 7이 총 몇 개 있는지 return 하도록 solution 함수를 완성해보세요.
		
//		int[] array = {7,1,1};
//		
//		System.out.println(lim.solution(array));

		
		
		
		
		
		//--------------------------------------------------------------------------
		
		
		
		
		
		
//		7. 영어 대소문자로 이루어진 문자열 my_string이 매개변수로 주어질 때, 
//		my_string을 모두 소문자로 바꾸고 알파벳 순서대로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요.
		
//		String my_string = "heLLo";
//		
//		System.out.println(lim.solution(my_string));

		
		
		
		
		
		//--------------------------------------------------------------------------
		
		
		
		
		
		
//		8. 어떤 세균은 1시간에 두배만큼 증식한다고 합니다. 
//		처음 세균의 마리수 n과 경과한 시간 t가 매개변수로 주어질 때 t시간 후 세균의 수를 return하도록 solution 함수를 완성해주세요.
		
//		int n = 7;
//		int t = 15;
//		
//		System.out.println(lim.solution(n, t));

		
		
		
		
		
		//--------------------------------------------------------------------------
		
		
		
		
		
		
//		9. 문자열 str1, str2가 매개변수로 주어집니다. str1 안에 str2가 있다면 1을 없다면 2를 return하도록 solution 함수를 완성해주세요.
		
//		String str1 = "ab6CDE443fgh22iJKlmn1o";
//		String str2 = "sCD";
//		
//		System.out.println(lim.solution(str1, str2));

		
		
		
		
		
		//--------------------------------------------------------------------------
		
		
		
		
		
		
//		10. 어떤 자연수를 제곱했을 때 나오는 정수를 제곱수라고 합니다. 
//		정수 n이 매개변수로 주어질 때, n이 제곱수라면 1을 아니라면 2를 return하도록 solution 함수를 완성해주세요.
//		제한사항
//		1 ≤ n ≤ 1,000,000
		
//		int n = 5;
//		
//		System.out.println(lim.solution(n));

		
		
		
		
		
		//--------------------------------------------------------------------------
		
		
		
		
		
		
//		11. 정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 return하도록 solution 함수를 완성해주세요
		
//		int n = 930211;
//		
//		System.out.println(lim.solution(n));

		
		
		
		
		
		//--------------------------------------------------------------------------
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main	
}
