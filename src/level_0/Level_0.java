package level_0;

import java.util.Arrays;

public class Level_0 {
	
	public static void main(String[] args) {
		
		//메서드 클래스 객체생성
		Level_0_Method lm = new Level_0_Method();						

		

		
		//1. 정수 a와 b가 주어집니다. 각 수를 입력받아 입출력 예와 같은 형식으로 출력하는 코드를 작성해 보세요.

//			Scanner sc = new Scanner(System.in);
//			int a = sc.nextInt();
//			int b = sc.nextInt();
//				
//			System.out.println(a + "," + b);
		

					
		

		//---------------------------------------------------------------------------------
	
	

		

		//2. 문자열 str과 정수 n이 주어집니다.
		//str이 n번 반복된 문자열을 만들어 출력하는 코드를 작성해 보세요.
		
//			Scanner sc = new Scanner(System.in);
//				
//			String str = sc.next();
//			int n = sc.nextInt();
//				
//			for(int i = 0; i < n; i++) {
//				System.out.println(str);
//			}

		

	

		//---------------------------------------------------------------------------------

		

		

		//3. 영어 알파벳으로 이루어진 문자열 str이 주어집니다. 
		//각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해 보세요.

//			Scanner sc = new Scanner(System.in);
//			String str = sc.next();
//				
//			char a;
//			String b = "";
//				
//			for(int i = 0; i < str.length(); i++) {
//				a = str.charAt(i);
//				if(a >= 65 && a <= 90) {
//					b += (char)(a + 32);
//				}else {
//					b += (char)(a - 32);
//				}
//			}
//			System.out.println(b);

		

		
		

		//---------------------------------------------------------------------------------

		
		

		

		//4. 문자열 my_string, overwrite_string과 정수 s가 주어집니다. 
		//문자열 my_string의 인덱스 s부터 overwrite_string의 길이만큼을 문자열 overwrite_string으로 바꾼 
		//문자열을 return 하는 solution 함수를 작성해 주세요.

//		System.out.println(lm.solution("Program29b8UYP", "merS123", 7));
		

		

		//---------------------------------------------------------------------------------


		

		

		//5. 문자들이 담겨있는 배열 arr가 주어집니다. 
		//arr의 원소들을 순서대로 이어 붙인 문자열을 return 하는 solution함수를 작성해 주세요.
		
//			String[] arr = {"q","b","e","d","e"};
//			System.out.println(lm.solution(arr));

		

		

		
		//---------------------------------------------------------------------------------

		
	

		

		//6.양의 정수 n이 매개변수로 주어질 때, n이 홀수라면 n 이하의 홀수인 
		//모든 양의 정수의 합을 return 하고 n이 짝수라면 n 이하의 짝수인 
		//모든 양의 정수의 제곱의 합을 return 하는 solution 함수를 작성해 주세요.
				
//			System.out.println(lm.solution(11));

		


		

		//---------------------------------------------------------------------------------

		
	

		

		//7. 문자열에 따라 다음과 같이 두 수의 크기를 비교하려고 합니다.
		//두 수가 n과 m이라면
		//">", "=" : n >= m
		//"<", "=" : n <= m
		//">", "!" : n > m
		//"<", "!" : n < m
		//두 문자열 ineq와 eq가 주어집니다. 
		//ineq는 "<"와 ">"중 하나고, eq는 "="와 "!"중 하나입니다. 
		//그리고 두 정수 n과 m이 주어질 때, n과 m이 ineq와 eq의 조건에 
		//맞으면 1을 아니면 0을 return하도록 solution 함수를 완성해주세요.

//			System.out.println(lm.solution(">","=",4,5));

	

		

		//---------------------------------------------------------------------------------

		

		

		/*

		 * 8. 문자열 code가 주어집니다. code를 앞에서부터 읽으면서 만약 문자가 "1"이면 mode를 바꿉니다. mode에 따라 code를
		 * 읽어가면서 문자열 ret을 만들어냅니다.
		 * 
		 * mode는 0과 1이 있으며, idx를 0 부터 code의 길이 - 1 까지 1씩 키워나가면서 code[idx]의 값에 따라 다음과 같이
		 * 행동합니다.
		 * 
		 * mode가 0일 때 code[idx]가 "1"이 아니면 idx가 짝수일 때만 ret의 맨 뒤에 code[idx]를 추가합니다.
		 * code[idx]가 "1"이면 mode를 0에서 1로 바꿉니다. mode가 1일 때 code[idx]가 "1"이 아니면 idx가 홀수일
		 * 때만 ret의 맨 뒤에 code[idx]를 추가합니다. code[idx]가 "1"이면 mode를 1에서 0으로 바꿉니다. 문자열 code를
		 * 통해 만들어진 문자열 ret를 return 하는 solution 함수를 완성해 주세요.
		 * 
		 * 단, 시작할 때 mode는 0이며, return 하려는 ret가 만약 빈 문자열이라면 대신 "EMPTY"를 return 합니다.
		 */
		
//		System.out.println(lm.solution("qasdas"));
		
		
		
		
		
		//---------------------------------------------------------------------------------
		
		
		
		
		
		/* 9. 정수 배열 numLog가 주어집니다. 처음에 numLog[0]에서 부터 시작해 "w", "a", "s", "d"로 이루어진 문자열을
		 * 입력으로 받아 순서대로 다음과 같은 조작을 했다고 합시다.
		 * 
		 * "w" : 수에 1을 더한다. "s" : 수에 1을 뺀다. "d" : 수에 10을 더한다. "a" : 수에 10을 뺀다. 그리고 매번
		 * 조작을 할 때마다 결괏값을 기록한 정수 배열이 numLog입니다. 즉, numLog[i]는 numLog[0]로부터 총 i번의 조작을 가한
		 * 결과가 저장되어 있습니다.
		 * 
		 * 주어진 정수 배열 numLog에 대해 조작을 위해 입력받은 문자열을 return 하는 solution 함수를 완성해 주세요.
		 */
		
//		int[] numLog = {0,1,0,10,0,1,0,10,0,-1,-2,-1,0};  
//		System.out.println(lm.solution(numLog));
		
		
		
		
		
		//---------------------------------------------------------------------------------
		
		
		
		
		/*
		 * 10. 정수 배열 arr와 2차원 정수 배열 queries이 주어집니다. queries의 원소는 각각 하나의 query를 나타내며, [i,
		 * j] 꼴입니다.
		 * 
		 * 각 query마다 순서대로 arr[i]의 값과 arr[j]의 값을 서로 바꿉니다.
		 * 
		 * 위 규칙에 따라 queries를 처리한 이후의 arr를 return 하는 solution 함수를 완성해 주세요.
		 */
		
//		int[] arr = {0, 1, 2, 3, 4}; 
//		int[][] queries = {
//				{0,3}, {1,2}, {1,4}
//				};
//		
//		int[] res = lm.solution(arr,queries);
//		for (int is : res) {
//			System.out.println(is);
//		}
		 
		
		
		
		
		
		//---------------------------------------------------------------------------------
		
		
		
		
		
		
		
		/*
		 * 11. 정수 배열 arr와 2차원 정수 배열 queries이 주어집니다. queries의 원소는 각각 하나의 query를 나타내며, [s,
		 * e, k] 꼴입니다.
		 * 
		 * 각 query마다 순서대로 s ≤ i ≤ e인 모든 i에 대해 k보다 크면서 가장 작은 arr[i]를 찾습니다.
		 * 
		 * 각 쿼리의 순서에 맞게 답을 저장한 배열을 반환하는 solution 함수를 완성해 주세요. 단, 특정 쿼리의 답이 존재하지 않으면 -1을
		 * 저장합니다.
		 */
				
//		int[] arr = {0, 1, 2, 4, 3}; 
//		int[][] queries = {
//				{0,4,2}, {0,3,2}, {0,2,2}
//				};
//		
//		int[] res = lm.solution(arr,queries);
//		
//		for (int is : res) {
//			System.out.println(is);
//		}
		
		
		
		
		
		
		//---------------------------------------------------------------------------------
		
		
		
		
		
		
		/*
		 * 12. 정수 배열 arr와 2차원 정수 배열 queries이 주어집니다. queries의 원소는 각각 하나의 query를 나타내며, [s,
		 * e, k] 꼴입니다.
		 * 
		 * 각 query마다 순서대로 s ≤ i ≤ e인 모든 i에 대해 i가 k의 배수이면 arr[i]에 1을 더합니다.
		 * 
		 * 위 규칙에 따라 queries를 처리한 이후의 arr를 return 하는 solution 함수를 완성해 주세요.
		 */
		
//		int[] arr = {0, 1, 2, 4, 3}; 
//		int[][] queries = {
//				{0,4,1}, {0,3,2}, {0,3,3}
//				};
//		
//		int[] res = lm.solution(arr,queries);
//		
//		for (int is : res) {
//			System.out.println(is);
//		}

		
		
		
		
		
		//---------------------------------------------------------------------------------
		
		
		
		
		
		
		/*
		 * 13. 정수 l과 r이 주어졌을 때, l 이상 r이하의 정수 중에서 숫자 "0"과 "5"로만 이루어진 모든 정수를 오름차순으로 저장한
		 * 배열을 return 하는 solution 함수를 완성해 주세요.
		 * 
		 * 만약 그러한 정수가 없다면, -1이 담긴 배열을 return 합니다.
		 */
		
//		int[] arr = lm.solution(5,555);
//		
//		for (int i : arr) {
//			System.out.println(i);
//		}

		 
		
		
		 
		
		//---------------------------------------------------------------------------------
		
		
		 
		
		
		
		/*
		 * 14. boolean 변수 x1, x2, x3, x4가 매개변수로 주어질 때, 다음의 식의 true/false를 return 하는
		 * solution 함수를 작성해 주세요.
		 * 
		 * (x1 ∨ x2) ∧ (x3 ∨ x4)
		 */
		
		//System.out.println(lm.solution(true, false, true, false));

		 
		
		
		 
		
		//---------------------------------------------------------------------------------
		
		
		
		
		
		
		/*
		 * 15. 문자열 my_string과 이차원 정수 배열 queries가 매개변수로 주어집니다. queries의 원소는 [s, e] 형태로,
		 * my_string의 인덱스 s부터 인덱스 e까지를 뒤집으라는 의미입니다. my_string에 queries의 명령을 순서대로 처리한 후의
		 * 문자열을 return 하는 solution 함수를 작성해 주세요.
		 */
		
//		String my_string = "rermgorpsam"; 
//		int[][] queries = {
//				{2,3}, {0,7}, {5,9}, {6,10}
//				};
//		
//		System.out.println(lm.solution(my_string,queries));

		 
		
		
		 
		
		//---------------------------------------------------------------------------------
		
		
		
		
		
		
		/*
		 * 16. 1부터 6까지 숫자가 적힌 주사위가 네 개 있습니다. 네 주사위를 굴렸을 때 나온 숫자에 따라 다음과 같은 점수를 얻습니다.
		 * 
		 * 네 주사위에서 나온 숫자가 모두 p로 같다면 1111 × p점을 얻습니다. 세 주사위에서 나온 숫자가 p로 같고 나머지 다른 주사위에서
		 * 나온 숫자가 q(p ≠ q)라면 (10 × p + q)2 점을 얻습니다. 주사위가 두 개씩 같은 값이 나오고, 나온 숫자를 각각 p,
		 * q(p ≠ q)라고 한다면 (p + q) × |p - q|점을 얻습니다. 어느 두 주사위에서 나온 숫자가 p로 같고 나머지 두 주사위에서
		 * 나온 숫자가 각각 p와 다른 q, r(q ≠ r)이라면 q × r점을 얻습니다. 네 주사위에 적힌 숫자가 모두 다르다면 나온 숫자 중 가장
		 * 작은 숫자 만큼의 점수를 얻습니다. 네 주사위를 굴렸을 때 나온 숫자가 정수 매개변수 a, b, c, d로 주어질 때, 얻는 점수를
		 * return 하는 solution 함수를 작성해 주세요.
		 */
		
//		System.out.println(lm.solution(1,4,6,2));

		 
		
		
		 
		
		//---------------------------------------------------------------------------------
		
		
		
		
		
		
		/*
		 * 17. 문자열 배열 intStrs와 정수 k, s, l가 주어집니다. intStrs의 원소는 숫자로 이루어져 있습니다.
		 * 
		 * 배열 intStrs의 각 원소마다 s번 인덱스에서 시작하는 길이 l짜리 부분 문자열을 잘라내 정수로 변환합니다. 이때 변환한 정수값이
		 * k보다 큰 값들을 담은 배열을 return 하는 solution 함수를 완성해 주세요.
		 */
		
//		String[] intStrs = {"0123456789","9876543210","9999999999999"};
//		
//		int[] arr = lm.solution(intStrs, 50000, 5, 5);
//		
//		for (int i : arr) {
//			System.out.println(i);
//		}

		 
		
		
		 
		
		//---------------------------------------------------------------------------------
		
		
		
		
		
		
		/*
		 * 18. 어떤 문자열에 대해서 접미사는 특정 인덱스부터 시작하는 문자열을 의미합니다. 예를 들어, "banana"의 모든 접미사는
		 * "banana", "anana", "nana", "ana", "na", "a"입니다. 문자열 my_string이 매개변수로 주어질 때,
		 * my_string의 모든 접미사를 사전순으로 정렬한 문자열 배열을 return 하는 solution 함수를 작성해 주세요.
		 */
		
//		String[] arr = lm.solution("programmers");
//		
//		for (String i : arr) {
//			System.out.println(i);
//		}

		 
		
		
		 
		
		//---------------------------------------------------------------------------------
		
		
		
		
		
		
		
		/*
		 * 19. 문자열 my_string과 두 정수 m, c가 주어집니다. my_string을 한 줄에 m 글자씩 가로로 적었을 때 왼쪽부터 세로로
		 * c번째 열에 적힌 글자들을 문자열로 return 하는 solution 함수를 작성해 주세요.
		 */

//		System.out.println(lm.solution("programmers", 1, 1));

		 
		
		
		 
		
		//---------------------------------------------------------------------------------
		
		
		
		
		
		
		/*
		 * 20. 알파벳 대소문자로만 이루어진 문자열 my_string이 주어질 때, my_string에서 'A'의 개수, my_string에서
		 * 'B'의 개수,..., my_string에서 'Z'의 개수, my_string에서 'a'의 개수, my_string에서 'b'의
		 * 개수,..., my_string에서 'z'의 개수를 순서대로 담은 길이 52의 정수 배열을 return 하는 solution 함수를 작성해
		 * 주세요.
		 */
		
//		int[] res = lm.solution("Programmers");
//		System.out.println(Arrays.toString(res));

		 
		
		
		 
		
		//---------------------------------------------------------------------------------
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main

}
