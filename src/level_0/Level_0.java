package level_0;

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
		
//			System.out.println(lm.solution("qasdas"));
		
		
		
		
		
	}//main

}
