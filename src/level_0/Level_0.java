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
		
	
		
		
		
		
		/*
		 * 21. 정수 n과 k가 주어졌을 때, 1 이상 n이하의 정수 중에서 k의 배수를 오름차순으로 저장한 배열을 return 하는
		 * solution 함수를 완성해 주세요.
		 */
		
//		int[] res = lm.solution(20, 4);
//		
//		for (int i : res) {
//			System.out.println(i);
//		}

		
		

		

		//---------------------------------------------------------------

		



		

		/*
		 * 22. 문자열 my_string과 정수 배열 indices가 주어질 때, my_string에서 indices의 원소에 해당하는 인덱스의
		 * 글자를 지우고 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.
		 */

//		String my_string = "apporoograpemmemprs";
//		int[] indices = {1,16,6,15,0,10,11,3};
//
//		System.out.println(lm.solution(my_string, indices));


		

		

		//---------------------------------------------------------------
		

		

		

		/*
		 * 23. 정수 배열 arr가 주어집니다. 이때 arr의 원소는 1 또는 0입니다. 정수 idx가 주어졌을 때, idx보다 크면서 배열의 값이
		 * 1인 가장 작은 인덱스를 찾아서 반환하는 solution 함수를 완성해 주세요.
		 * 
		 * 단, 만약 그러한 인덱스가 없다면 -1을 반환합니다.
		 */

//		int[] arr = { 1, 0, 1, 1, 1};
//		int idx = 0;
//		
//		System.out.println(lm.solution(arr, idx));


		

		

		//---------------------------------------------------------------
		
		
		
		
		
		
		/*
		 * 24. 정수 n과 정수 3개가 담긴 리스트 slicer 그리고 정수 여러 개가 담긴 리스트 num_list가 주어집니다. slicer에
		 * 담긴 정수를 차례대로 a, b, c라고 할 때, n에 따라 다음과 같이 num_list를 슬라이싱 하려고 합니다.
		 */
		
//		int[] num_list = {1,2,3,4,5,6,7,8,9};
//		int[] slicer = { 1, 5, 2};
//		int idx = 4;
//		
//		
//		int[] res = lm.solution(idx, slicer, num_list);
//		
//		for (int i : res) {
//			System.out.println(i);
//		}


		

		

		//---------------------------------------------------------------
		
		
		
		
		
		
		/*
		 * 25. 정수 배열 arr와 2개의 구간이 담긴 배열 intervals가 주어집니다.
		 * 
		 * intervals는 항상 [[a1, b1], [a2, b2]]의 꼴로 주어지며 각 구간은 닫힌 구간입니다. 닫힌 구간은 양 끝값과 그
		 * 사이의 값을 모두 포함하는 구간을 의미합니다.
		 * 
		 * 이때 배열 arr의 첫 번째 구간에 해당하는 배열과 두 번째 구간에 해당하는 배열을 앞뒤로 붙여 새로운 배열을 만들어 return 하는
		 * solution 함수를 완성해 주세요.
		 */
		
//		int[][] intervals = {{1,3},{0,4}};
//		int[] arr = {1,2,3,4,5};	
//		
//		System.out.println(Arrays.toString(lm.solution(arr, intervals)));


		

		

		//---------------------------------------------------------------
		
		
		
	
		
		/*
		 * 26. 정수 배열 arr가 주어집니다.
		 * 
		 * 배열 안의 2가 모두 포함된 가장 작은 연속된 부분 배열을 return 하는 solution 함수를 완성해 주세요.
		 * 
		 * 단, arr에 2가 없는 경우 [-1]을 return 합니다.
		 */	
//		int[] arr = {1,2,1};
//		
//		System.out.println(Arrays.toString(lm.solution(arr)));


		

		

		//--------------------------------------------------------

		


		

		/*
		 * 27. 정수 배열 arr와 query가 주어집니다.
		 * 
		 * query를 순회하면서 다음 작업을 반복합니다.
		 * 
		 * 짝수 인덱스에서는 arr에서 query[i]번 인덱스를 제외하고 배열의 query[i]번 인덱스 뒷부분을 잘라서 버립니다. 홀수
		 * 인덱스에서는 arr에서 query[i]번 인덱스는 제외하고 배열의 query[i]번 인덱스 앞부분을 잘라서 버립니다. 위 작업을 마친 후
		 * 남은 arr의 부분 배열을 return 하는 solution 함수를 완성해 주세요.
		 */
//		int[] arr = {0,1,2,3,4,5};
//		int[] query = {4,1,2};
//		
//		System.out.println(Arrays.toString(lm.solution(arr, query)));



		

		//--------------------------------------------------------

		
		

		

		/*
		 * 28. 정수 리스트 num_list와 정수 n이 주어질 때, num_list를 n 번째 원소 이후의 원소들과 n 번째까지의 원소들로 나눠
		 * n 번째 원소 이후의 원소들을 n 번째까지의 원소들 앞에 붙인 리스트를 return하도록 solution 함수를 완성해주세요.
		 */	
//		int[] num_list = {5,2,1,7,5};
//		int n = 3; 
//		
//		System.out.println(Arrays.toString(lm.solution(num_list,n)));



		

		//--------------------------------------------------------
	

		

		

		/*
		 * 29. 문자열 리스트 str_list에는 "u", "d", "l", "r" 네 개의 문자열이 여러 개 저장되어 있습니다.
		 * str_list에서 "l"과 "r" 중 먼저 나오는 문자열이 "l"이라면 해당 문자열을 기준으로 왼쪽에 있는 문자열들을 순서대로 담은
		 * 리스트를, 먼저 나오는 문자열이 "r"이라면 해당 문자열을 기준으로 오른쪽에 있는 문자열들을 순서대로 담은 리스트를 return하도록
		 * solution 함수를 완성해주세요. "l"이나 "r"이 없다면 빈 리스트를 return합니다.
		 */
		
//		String[] str_list = {"l"};
//
//		System.out.println(Arrays.toString(lm.solution(str_list)));



		

		//--------------------------------------------------------
		
		
		
		
		
		/*
		 * 30. 최대 5명씩 탑승가능한 놀이기구를 타기 위해 줄을 서있는 사람들의 이름이 담긴 문자열 리스트 names가 주어질 때, 앞에서 부터
		 * 5명씩 묶은 그룹의 가장 앞에 서있는 사람들의 이름을 담은 리스트를 return하도록 solution 함수를 완성해주세요. 마지막 그룹이
		 * 5명이 되지 않더라도 가장 앞에 있는 사람의 이름을 포함합니다.
		 */
		
//		String[] names = {"nami", "ahri", "jayce", "garen", "ivern", "jinx", "vex"};
//		
//		System.out.println(Arrays.toString(lm.solution(names)));



		

		//--------------------------------------------------------
		
		
		
		
		
		
		/*
		 * 31. 오늘 해야 할 일이 담긴 문자열 배열 todo_list와 각각의 일을 지금 마쳤는지를 나타내는 boolean 배열 finished가
		 * 매개변수로 주어질 때, todo_list에서 아직 마치지 못한 일들을 순서대로 담은 문자열 배열을 return 하는 solution 함수를
		 * 작성해 주세요.
		 */
		
//		String[] todo_list = {"problemsolving", "practiceguitar", "swim", "studygraph"};
//		boolean[] finished = {true, true, true, false};
//		
//		System.out.println(Arrays.toString(lm.solution(todo_list, finished)));



		

		//--------------------------------------------------------
		
		
		
		
		
		
		/*
		 * 32. 정수 배열 arr와 2차원 정수 배열 queries이 주어집니다. queries의 원소는 각각 하나의 query를 나타내며, [s,
		 * e] 꼴입니다.
		 * 
		 * 각 query마다 순서대로 s ≤ i ≤ e인 모든 i에 대해 arr[i]에 1을 더합니다.
		 * 
		 * 위 규칙에 따라 queries를 처리한 이후의 arr를 return 하는 solution 함수를 완성해 주세요.
		 */
		
//		 int[] arr = {0, 1, 2, 3, 4};
//		 int[][] queries = {{0,1},{1,2},{2,3}};
//		
//		 System.out.println(Arrays.toString(lm.solution(arr, queries)));


		

		

		//--------------------------------------------------------
		
		
		
		
		
		
		/*
		 * 33. 정수 배열 arr가 주어집니다. arr의 각 원소에 대해 값이 50보다 크거나 같은 짝수라면 2로 나누고, 50보다 작은 홀수라면
		 * 2를 곱하고 다시 1을 더합니다.
		 * 
		 * 이러한 작업을 x번 반복한 결과인 배열을 arr(x)라고 표현했을 때, arr(x) = arr(x + 1)인 x가 항상 존재합니다. 이러한
		 * x 중 가장 작은 값을 return 하는 solution 함수를 완성해 주세요.
		 * 
		 * 단, 두 배열에 대한 "="는 두 배열의 크기가 서로 같으며, 같은 인덱스의 원소가 각각 서로 같음을 의미합니다.
		 */
		
//		int[] arr = {1, 2, 3, 100, 99, 98};
//		System.out.println(lm.solution(arr));


		

		

		//--------------------------------------------------------
		
		
		
		
		
		
		/*
		 * 34. 정수가 있을 때, 짝수라면 반으로 나누고, 홀수라면 1을 뺀 뒤 반으로 나누면, 마지막엔 1이 됩니다. 예를 들어 10이 있다면
		 * 다음과 같은 과정으로 1이 됩니다.
		 * 
		 * 10 / 2 = 5 (5 - 1) / 2 = 4 4 / 2 = 2 2 / 2 = 1 위와 같이 4번의 나누기 연산으로 1이 되었습니다.
		 * 
		 * 정수들이 담긴 리스트 num_list가 주어질 때, num_list의 모든 원소를 1로 만들기 위해서 필요한 나누기 연산의 횟수를
		 * return하도록 solution 함수를 완성해주세요.
		 */
		
//		int[] num_list = {12, 4, 15, 1, 14};
//		System.out.println(lm.solution(num_list));


		

		

		//--------------------------------------------------------
		
		
		
		
		

		/*
		 * 35. 알파벳으로 이루어진 문자열 myString과 pat이 주어집니다. myString의 연속된 부분 문자열 중 pat이 존재하면 1을
		 * 그렇지 않으면 0을 return 하는 solution 함수를 완성해 주세요.
		 * 
		 * 단, 알파벳 대문자와 소문자는 구분하지 않습니다.
		 */
		
//		String myString = "abcdEfGH";
//		String pat = "bcef";
//		
//		System.out.println(lm.solution(myString,pat));


		

		

		//--------------------------------------------------------
		
		
		
		
		
		
		/*
		 * 36. 문자열 배열 strArr가 주어집니다. 모든 원소가 알파벳으로만 이루어져 있을 때, 배열에서 홀수번째 인덱스의 문자열은 모든 문자를
		 * 대문자로, 짝수번째 인덱스의 문자열은 모든 문자를 소문자로 바꿔서 반환하는 solution 함수를 완성해 주세요.
		 */
		
//		String[] strArr = {"aBc","AbC"};
//		
//		System.out.println(Arrays.toString(lm.solution(strArr)));


		

		

		//--------------------------------------------------------
		
		
		
		
		
		
		/*
		 * 37. 문자열 myString이 주어집니다. myString에서 알파벳 "a"가 등장하면 전부 "A"로 변환하고, "A"가 아닌 모든
		 * 대문자 알파벳은 소문자 알파벳으로 변환하여 return 하는 solution 함수를 완성하세요.
		 */
		
//		String myString = "PrOgRaMmErS";
//		
//		System.out.println(lm.solution(myString));


		

		

		//--------------------------------------------------------
		
		
		
		
		
		
		
		/*
		 * 38. 문자열 myString과 pat가 주어집니다. myString의 부분 문자열중 pat로 끝나는 가장 긴 부분 문자열을 찾아서
		 * return 하는 solution 함수를 완성해 주세요.
		 */
		
//		String myString = "AAAAaaaa";
//		String pat = "A";
//		
//		System.out.println(lm.solution(myString,pat));


		

		

		//--------------------------------------------------------
		
		
		
		
		
		
		/*
		 * 39. 문자열 myString과 pat이 주어집니다. myString에서 pat이 등장하는 횟수를 return 하는 solution 함수를
		 * 완성해 주세요.
		 */
		
//		String myString = "aaaaa";
//		String pat = "aa";
//		
//		System.out.println(lm.solution(myString,pat));


		

		

		//--------------------------------------------------------
		
		
		
		
		
		
		/*
		 * 40. 단어가 공백 한 개 이상으로 구분되어 있는 문자열 my_string이 매개변수로 주어질 때, my_string에 나온 단어를
		 * 앞에서부터 순서대로 담은 문자열 배열을 return 하는 solution 함수를 작성해 주세요.
		 */
		
//		String my_string = " i    love  you";
//		
//		System.out.println(Arrays.toString(lm.solution(my_string)));


		

		

		//--------------------------------------------------------
		
		
		
		
		
		
		  /*
		   * 41. 문자열 binomial이 매개변수로 주어집니다. binomial은 "a op b" 형태의 이항식이고 a와 b는 음이 아닌 정수,
		   * op는 '+', '-', '*' 중 하나입니다. 주어진 식을 계산한 정수를 return 하는 solution 함수를 작성해 주세요.
		   */
		
//		 String binomial = "40000 * 40000";
//		 
//		 System.out.println(lm.solution(binomial));


		

		

		//--------------------------------------------------------
		
		
		
		
		
		
		/*
		 * 42. 문자 "A"와 "B"로 이루어진 문자열 myString과 pat가 주어집니다. myString의 "A"를 "B"로, "B"를
		 * "A"로 바꾼 문자열의 연속하는 부분 문자열 중 pat이 있으면 1을 아니면 0을 return 하는 solution 함수를 완성하세요.
		 */
		
//		String myString = "ABAB";
//		String pat = "ABAB";
//		
//		System.out.println(lm.solution(myString, pat));


		

		

		//--------------------------------------------------------
		
		
		
		
		
		/*
		 * 43. 'm'과 "rn"이 모양이 비슷하게 생긴 점을 활용해 문자열에 장난을 하려고 합니다. 문자열 rny_string이 주어질 때,
		 * rny_string의 모든 'm'을 "rn"으로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.
		 */
		
//		String rny_string = "burnmm";
//		
//		System.out.println(lm.solution(rny_string));


		

		

		//--------------------------------------------------------
		
		
		
		
		
		
		/*
		 * 44. 임의의 문자열이 주어졌을 때 문자 "a", "b", "c"를 구분자로 사용해 문자열을 나누고자 합니다.
		 * 
		 * 예를 들어 주어진 문자열이 "baconlettucetomato"라면 나눠진 문자열 목록은 ["onlettu", "etom", "to"] 가
		 * 됩니다.
		 * 
		 * 문자열 myStr이 주어졌을 때 위 예시와 같이 "a", "b", "c"를 사용해 나눠진 문자열을 순서대로 저장한 배열을 return 하는
		 * solution 함수를 완성해 주세요.
		 * 
		 * 단, 두 구분자 사이에 다른 문자가 없을 경우에는 아무것도 저장하지 않으며, return할 배열이 빈 배열이라면 ["EMPTY"]를
		 * return 합니다.
		 */
		
//		String myStr = "baconlettucetomato";
//		
//		System.out.println(Arrays.toString(lm.solution(myStr)));


		

		

		//--------------------------------------------------------
		
		
		
			
		
		
		/*
		 * 45. 아무 원소도 들어있지 않은 빈 배열 X가 있습니다. 길이가 같은 정수 배열 arr과 boolean 배열 flag가 매개변수로 주어질 때,
		 * flag를 차례대로 순회하며 flag[i]가 true라면 X의 뒤에 arr[i]를 arr[i] × 2 번 추가하고, flag[i]가
		 * false라면 X에서 마지막 arr[i]개의 원소를 제거한 뒤 X를 return 하는 solution 함수를 작성해 주세요.
		 */
		
//		int[] arr = {3, 2, 4, 1, 3};
//		boolean[] flag = {true, false, true, false, false};
//		
//		System.out.println(Arrays.toString(lm.solution(arr,flag)));
		
		
		
		
		
		
		
		//--------------------------------------------------------
		
		
		
		
			
		
		
		/*
		 * 46. 0과 1로만 이루어진 정수 배열 arr가 주어집니다. arr를 이용해 새로운 배열 stk을 만드려고 합니다.
		 * 
		 * i의 초기값을 0으로 설정하고 i가 arr의 길이보다 작으면 다음을 반복합니다.
		 * 
		 * 만약 stk이 빈 배열이라면 arr[i]를 stk에 추가하고 i에 1을 더합니다. stk에 원소가 있고, stk의 마지막 원소가
		 * arr[i]와 같으면 stk의 마지막 원소를 stk에서 제거하고 i에 1을 더합니다. stk에 원소가 있는데 stk의 마지막 원소가
		 * arr[i]와 다르면 stk의 맨 마지막에 arr[i]를 추가하고 i에 1을 더합니다. 위 작업을 마친 후 만들어진 stk을 return
		 * 하는 solution 함수를 완성해 주세요.
		 * 
		 * 단, 만약 빈 배열을 return 해야한다면 [-1]을 return 합니다.
		 */
		
//		int[] arr = {0, 1, 1, 0};
//		
//		System.out.println(Arrays.toString(lm.solution(arr)));

		
		
		
		
		
		
		//--------------------------------------------------------
		
		
		
		
		
		
		
		
		/*
		 * 47. 랜덤으로 서로 다른 k개의 수를 저장한 배열을 만드려고 합니다. 적절한 방법이 떠오르지 않기 때문에 일정한 범위 내에서 무작위로 수를 뽑은
		 * 후, 지금까지 나온적이 없는 수이면 배열 맨 뒤에 추가하는 방식으로 만들기로 합니다.
		 * 
		 * 이미 어떤 수가 무작위로 주어질지 알고 있다고 가정하고, 실제 만들어질 길이 k의 배열을 예상해봅시다.
		 * 
		 * 정수 배열 arr가 주어집니다. 문제에서의 무작위의 수는 arr에 저장된 순서대로 주어질 예정이라고 했을 때, 완성될 배열을 return
		 * 하는 solution 함수를 완성해 주세요.
		 * 
		 * 단, 완성될 배열의 길이가 k보다 작으면 나머지 값을 전부 -1로 채워서 return 합니다.
		 */

//		int[] arr = {0, 1, 1, 1, 1};
//		int k = 4;
//		
//		System.out.println(Arrays.toString(lm.solution(arr,k)));

		
		
	
		
		
		
		//--------------------------------------------------------
		
		
		
		
		
		
		
		
//		 48. 문자열 배열 strArr이 주어집니다. strArr의 원소들을 길이가 같은 문자열들끼리 그룹으로 묶었을 때 가장 개수가 많은 그룹의
//		  크기를 return 하는 solution 함수를 완성해 주세요.
//				  제한사항
//				  1 ≤ strArr의 길이 ≤ 100,000
//				  1 ≤ strArr의 원소의 길이 ≤ 30
//				  strArr의 원소들은 알파벳 소문자로 이루어진 문자열입니다.
		 
		
//		String[] strArr = {"a","c","d","efg","hi"};
//		
//		System.out.println(lm.solution(strArr));

		
	
		
		
		
		//--------------------------------------------------------
		
		
		
		
		
		
//		49. 정수로 이루어진 리스트 num_list가 주어집니다. 
//		num_list에서 가장 작은 5개의 수를 제외한 수들을 오름차순으로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
		
//		int[] num_list = {12, 4, 15, 46, 38, 1, 14, 56, 32, 10};
//		
//		System.out.println(Arrays.toString(lm.solution(num_list)));

		
	
		
		
		
		//--------------------------------------------------------
		
		
		
		
		
		
//		50. 0번부터 n - 1번까지 n명의 학생 중 3명을 선발하는 전국 대회 선발 고사를 보았습니다. 
//		등수가 높은 3명을 선발해야 하지만, 개인 사정으로 전국 대회에 참여하지 못하는 학생들이 있어 참여가 가능한 학생 중 등수가 높은 3명을 선발하기로 했습니다.
//
//		각 학생들의 선발 고사 등수를 담은 정수 배열 rank와 전국 대회 참여 가능 여부가 담긴 boolean 배열 attendance가 매개변수로 주어집니다. 
//		전국 대회에 선발된 학생 번호들을 등수가 높은 순서대로 각각 a, b, c번이라고 할 때 10000 × a + 100 × b + c를 return 하는 solution 함수를 작성해 주세요.
		
//		int[] rank = {6, 1, 5, 2, 3, 4};
//		boolean[] attendance = {true, false, true, false, false, true};
//		
//		System.out.println(lm.solution(rank, attendance));

		
	
		
		
		
		//--------------------------------------------------------
		
		


		
		
//		51. 실수 flo가 매개 변수로 주어질 때, flo의 정수 부분을 return하도록 solution 함수를 완성해주세요.
		
//		double flo = 69.92;
//		
//		System.out.println(lm.solution(flo));

		
	
		
		
		
		//--------------------------------------------------------
		
		
		
		
		
		
		
//		52. 한 자리 정수로 이루어진 문자열 num_str이 주어질 때, 각 자리수의 합을 return하도록 solution 함수를 완성해주세요.
		
//		String num_str = "100000000";
//		
//		System.out.println(lm.solution(num_str));

		
		
		
		
		
		//--------------------------------------------------------
		
			
		
		
		
		
//		53. 정수로 이루어진 문자열 n_str이 주어질 때, n_str의 가장 왼쪽에 처음으로 등장하는 0들을 뗀 문자열을 return하도록 solution 함수를 완성해주세요.
		
//		String n_str = "854020";
//		
//		System.out.println(lm.solution(n_str));

		
		
		
		
		
		//--------------------------------------------------------
		
		
		
				
		
		
//		54. 0 이상의 두 정수가 문자열 a, b로 주어질 때, 
//		a + b의 값을 문자열로 return 하는 solution 함수를 작성해 주세요.

//		String a = "18446744073709551615";
//		String b = "287346502836570928366";
//		
//		System.out.println(lm.solution(a, b));
		
		
		
		
		
		
		//------------------------------------------------------------------------
		
		
		
		
		
		
//		55. 정수 배열 arr과 delete_list가 있습니다. 
//		arr의 원소 중 delete_list의 원소를 모두 삭제하고 남은 원소들은 기존의 arr에 있던 
//		순서를 유지한 배열을 return 하는 solution 함수를 작성해 주세요.
		
//		int[] arr = {110, 66, 439, 785, 1};
//		int[] delete_list = {377, 823, 119, 43};
//		
//		System.out.println(Arrays.toString(lm.solution(arr, delete_list)));

		
		
		
		
		
		//------------------------------------------------------------------------
		
		
		
		
		
		
//		56. 부분 문자열이란 문자열에서 연속된 일부분에 해당하는 문자열을 의미합니다. 
//		예를 들어, 문자열 "ana", "ban", "anana", "banana", "n"는 모두 문자열 "banana"의 부분 문자열이지만, "aaa", "bnana", "wxyz"는 모두 "banana"의 부분 문자열이 아닙니다.
//
//		문자열 my_string과 target이 매개변수로 주어질 때, target이 문자열 my_string의 부분 문자열이라면 1을, 
//		아니라면 0을 return 하는 solution 함수를 작성해 주세요.
		
//		String my_string = "banana";
//		String target = "wxyz";
//		
//		System.out.println(lm.solution(my_string, target));

		
		
		
		
		
		//------------------------------------------------------------------------
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main

}
