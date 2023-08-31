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
		
		
		
		
		
		
//		12. 정수 n과 정수 배열 numlist가 매개변수로 주어질 때, numlist에서 n의 배수가 아닌 수들을 제거한 배열을 return하도록 solution 함수를 완성해주세요.
		
//		int n = 2;
//		int[] numlist = {4,5,6,7,8,9,10,11,12};
//		
//		System.out.println(Arrays.toString(lim.solution(n, numlist)));

		
		
		
		
		
		//--------------------------------------------------------------------------
		
		
		
		
		
		
//		13. 정수 num과 k가 매개변수로 주어질 때, 
//		num을 이루는 숫자 중에 k가 있으면 num의 그 숫자가 있는 자리 수를 return하고 없으면 -1을 return 하도록 solution 함수를 완성해보세요.
//
//		제한사항
//		0 < num < 1,000,000
//		0 ≤ k < 10
//		num에 k가 여러 개 있으면 가장 처음 나타나는 자리를 return 합니다.
		
//		int num = 232443;
//		int k = 7;
//		
//		System.out.println(lim.solution(num, k));

		
		
		
		
		
		//--------------------------------------------------------------------------
		
		
		
		
		
		
//		14. 두 배열이 얼마나 유사한지 확인해보려고 합니다. 문자열 배열 s1과 s2가 주어질 때 같은 원소의 개수를 return하도록 solution 함수를 완성해주세요.
		
//		String[] s1 = {"n", "omg"};
//		String[] s2 = {"m", "dot"}; 
//		
//		System.out.println(lim.solution(s1, s2));

		
		
		
		
		
		//--------------------------------------------------------------------------
		
		
		
		
		
		
//		15. 덧셈, 뺄셈 수식들이 'X [연산자] Y = Z' 형태로 들어있는 문자열 배열 quiz가 매개변수로 주어집니다. 
//		수식이 옳다면 "O"를 틀리다면 "X"를 순서대로 담은 배열을 return하도록 solution 함수를 완성해주세요.
//
//		제한사항
//		연산 기호와 숫자 사이는 항상 하나의 공백이 존재합니다. 단 음수를 표시하는 마이너스 기호와 숫자 사이에는 공백이 존재하지 않습니다.
//		1 ≤ quiz의 길이 ≤ 10
//		X, Y, Z는 각각 0부터 9까지 숫자로 이루어진 정수를 의미하며, 각 숫자의 맨 앞에 마이너스 기호가 하나 있을 수 있고 이는 음수를 의미합니다.
//		X, Y, Z는 0을 제외하고는 0으로 시작하지 않습니다.
//		-10,000 ≤ X, Y ≤ 10,000
//		-20,000 ≤ Z ≤ 20,000
//		[연산자]는 + 와 - 중 하나입니다.
		
//		String[] quiz = {"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"};
//		
//		System.out.println(Arrays.toString(lim.solution(quiz)));

		
		
		
		
		
		//--------------------------------------------------------------------------
		
		
		
		
		
		
//		16. my_string은 "3 + 5"처럼 문자열로 된 수식입니다. 
//		문자열 my_string이 매개변수로 주어질 때, 수식을 계산한 값을 return 하는 solution 함수를 완성해주세요.
//
//		제한사항
//		연산자는 +, -만 존재합니다.
//		문자열의 시작과 끝에는 공백이 없습니다.
//		0으로 시작하는 숫자는 주어지지 않습니다.
//		잘못된 수식은 주어지지 않습니다.
//		5 ≤ my_string의 길이 ≤ 100
//		my_string을 계산한 결과값은 1 이상 100,000 이하입니다.
//		my_string의 중간 계산 값은 -100,000 이상 100,000 이하입니다.
//		계산에 사용하는 숫자는 1 이상 20,000 이하인 자연수입니다.
//		my_string에는 연산자가 적어도 하나 포함되어 있습니다.
//		return type 은 정수형입니다.
//		my_string의 숫자와 연산자는 공백 하나로 구분되어 있습니다.
		
//		String my_string = "4 + 4 + 100 - 8";
//		
//		System.out.println(lim.solution(my_string));

		
		
		
		
		
		//--------------------------------------------------------------------------
		
		
		
		
		
		
//		17. 정수 배열 array가 매개변수로 주어질 때, 가장 큰 수와 그 수의 인덱스를 담은 배열을 return 하도록 solution 함수를 완성해보세요.
//
//		제한사항
//		1 ≤ array의 길이 ≤ 100
//		0 ≤ array 원소 ≤ 1,000
//		array에 중복된 숫자는 없습니다.
		
//		int[] array = {9, 10, 11, 8};
//		
//		System.out.println(Arrays.toString(lim.solution(array)));

		
		
		
		
		
		//--------------------------------------------------------------------------
		
		
		
		
		
		
//		18. 정수 n이 매개변수로 주어질 때, n의 약수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.
		
//		int n = 28;
//		
//		System.out.println(Arrays.toString(lim.solution(n)));

		
		
		
		
		
		//--------------------------------------------------------------------------
		
		
		
		
		
		
//		19. 문자열 s가 매개변수로 주어집니다.
//		s에서 한 번만 등장하는 문자를 사전 순으로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요.
//		한 번만 등장하는 문자가 없을 경우 빈 문자열을 return 합니다.
		
//		String s = "hello";
//		
//		System.out.println(am.solution(s));
		
		
		
		
		
		
		//----------------------------------------------------------------------------------
		
		
		
		
		
		
//		20. 문자열 my_string과 정수 num1, num2가 매개변수로 주어질 때,
//		my_string에서 인덱스 num1과 인덱스 num2에 해당하는 문자를 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.
		
//		String my_string = "I love you";
//		int num1 = 3;
//		int num2 = 6;
//		
//		System.out.println(am.solution(my_string, num1, num2));

		
		
		
		
		
		//----------------------------------------------------------------------------------
		
		
		
		
		
		
		
//		21. 영어가 싫은 머쓱이는 영어로 표기되어있는 숫자를 수로 바꾸려고 합니다.
//		문자열 numbers가 매개변수로 주어질 때, numbers를 정수로 바꿔 return 하도록 solution 함수를 완성해 주세요.
//
//		제한사항
//		numbers는 소문자로만 구성되어 있습니다.
//		numbers는 "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" 들이 공백 없이 조합되어 있습니다.
//		1 ≤ numbers의 길이 ≤ 50
//		"zero"는 numbers의 맨 앞에 올 수 없습니다.
		
//		String numbers = "onefourzerosixseven"	;
//		
//		System.out.println(am.solution(numbers));

		
		
		
		
		
		//----------------------------------------------------------------------------------
		
		
		
		
		
		
//		22. 문자열 my_string이 매개변수로 주어질 때, 대문자는 소문자로 소문자는 대문자로 변환한 문자열을 return하도록 solution 함수를 완성해주세요.
//
//		제한사항
//		1 ≤ my_string의 길이 ≤ 1,000
//		my_string은 영어 대문자와 소문자로만 구성되어 있습니다.
		
//		String my_string = "abCdEfghIJ";
//		
//		System.out.println(lim.solution(my_string));

		
		
		
		
		
		//----------------------------------------------------------------------------------
		
		
		
		
		
		
//		23. 군 전략가 머쓱이는 전쟁 중 적군이 다음과 같은 암호 체계를 사용한다는 것을 알아냈습니다.
//		암호화된 문자열 cipher를 주고받습니다.
//		그 문자열에서 code의 배수 번째 글자만 진짜 암호입니다.
//		문자열 cipher와 정수 code가 매개변수로 주어질 때 해독된 암호 문자열을 return하도록 solution 함수를 완성해주세요.
//		
//		제한사항
//		1 ≤ cipher의 길이 ≤ 1,000
//		1 ≤ code ≤ cipher의 길이
//		cipher는 소문자와 공백으로만 구성되어 있습니다.
//		공백도 하나의 문자로 취급합니다.
				
//		String cipher = "pfqallllabwaoclk";
//		int code = 2;
//		
//		System.out.println(lim.solution(cipher, code));

		
		
		
		
		
		//----------------------------------------------------------------------------------
		
		
		
		
		
		
//		24. 머쓱이는 친구들과 369게임을 하고 있습니다. 
//		369게임은 1부터 숫자를 하나씩 대며 3, 6, 9가 들어가는 숫자는 숫자 대신 3, 6, 9의 개수만큼 박수를 치는 게임입니다. 
//		머쓱이가 말해야하는 숫자 order가 매개변수로 주어질 때, 머쓱이가 쳐야할 박수 횟수를 return 하도록 solution 함수를 완성해보세요.
		
//		int order = 39463;
//		System.out.println(lim.solution(order));

		
		
		
		
		
		//----------------------------------------------------------------------------------
		
		
		
		
		
		
//		25. 정수 배열 array와 정수 n이 매개변수로 주어질 때, array에 들어있는 정수 중 n과 가장 가까운 수를 return 하도록 solution 함수를 완성해주세요.
//
//		제한사항
//		1 ≤ array의 길이 ≤ 100
//		1 ≤ array의 원소 ≤ 100
//		1 ≤ n ≤ 100
//		가장 가까운 수가 여러 개일 경우 더 작은 수를 return 합니다.
		
//		int[] array = {10,11,12};
//		int n = 13;
//		
//		System.out.println(lim.solution(array, n));

		
		
		
		
		
		//----------------------------------------------------------------------------------
		
		
		
		
		
		
//		26. 선분 세 개로 삼각형을 만들기 위해서는 다음과 같은 조건을 만족해야 합니다.
//		가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다.
//		삼각형의 세 변의 길이가 담긴 배열 sides이 매개변수로 주어집니다. 세 변으로 삼각형을 만들 수 있다면 1, 만들 수 없다면 2를 return하도록 solution 함수를 완성해주세요.
//		
//		제한사항
//		sides의 원소는 자연수입니다.
//		sides의 길이는 3입니다.
//		1 ≤ sides의 원소 ≤ 1,000
		
//		int[] sides = {199,72,222};
//		
//		System.out.println(lim.solution(sides));

		
		
		
		
		
		//----------------------------------------------------------------------------------
		
		
		
		
		
		
//		27. 문자열 my_string이 매개변수로 주어집니다. 
//		my_string에서 중복된 문자를 제거하고 하나의 문자만 남긴 문자열을 return하도록 solution 함수를 완성해주세요.
//
//		제한사항
//		1 ≤ my_string ≤ 110
//		my_string은 대문자, 소문자, 공백으로 구성되어 있습니다.
//		대문자와 소문자를 구분합니다.
//		공백(" ")도 하나의 문자로 구분합니다.
//		중복된 문자 중 가장 앞에 있는 문자를 남깁니다.
		
//		String my_string = "We are the world";
//		
//		System.out.println(lim.solution(my_string));

		
		
		
		
		
		//----------------------------------------------------------------------------------
		
		
		
		
		
		
//		28. 1부터 13까지의 수에서, 1은 1, 10, 11, 12, 13 이렇게 총 6번 등장합니다. 
//		정수 i, j, k가 매개변수로 주어질 때, i부터 j까지 k가 몇 번 등장하는지 return 하도록 solution 함수를 완성해주세요.
//
//		제한사항
//		1 ≤ i < j ≤ 100,000
//		0 ≤ k ≤ 9
		
//		int i = 3;
//		int j = 10;
//		int k = 2;
//		
//		System.out.println(lim.solution(i, j, k));

		
		
		
		
		
		//----------------------------------------------------------------------------------
		
		
		
		
		
		
//		29. 문자열 before와 after가 매개변수로 주어질 때, 
//		before의 순서를 바꾸어 after를 만들 수 있으면 1을, 만들 수 없으면 0을 return 하도록 solution 함수를 완성해보세요.
//
//		제한사항
//		0 < before의 길이 == after의 길이 < 1,000
//		before와 after는 모두 소문자로 이루어져 있습니다.
		
//		String before = "allpe";
//		String after = "apple";
//		
//		System.out.println(lim.solution(before, after));

		
		
		
		
		
		//----------------------------------------------------------------------------------
		
		
		
		
		
//		30. 프로그래머스 치킨은 치킨을 시켜먹으면 한 마리당 쿠폰을 한 장 발급합니다. 
//		쿠폰을 열 장 모으면 치킨을 한 마리 서비스로 받을 수 있고, 서비스 치킨에도 쿠폰이 발급됩니다. 
//		시켜먹은 치킨의 수 chicken이 매개변수로 주어질 때 받을 수 있는 최대 서비스 치킨의 수를 return하도록 solution 함수를 완성해주세요.
		
//		int chicken = 91;
//		
//		System.out.println(lim.solution(chicken));

		
		
		
		
	
	//----------------------------------------------------------------------------------
		
		
		
		
				
		
//		31. 머쓱이는 프로그래머스에 로그인하려고 합니다. 머쓱이가 입력한 아이디와 패스워드가 담긴 배열 id_pw와 회원들의 정보가 담긴
//		2차원 배열 db가 주어질 때, 다음과 같이 로그인 성공, 실패에 따른 메시지를 return하도록 solution 함수를 완성해주세요.
//		아이디와 비밀번호가 모두 일치하는 회원정보가 있으면 "login"을 return합니다.
//		로그인이 실패했을 때 아이디가 일치하는 회원이 없다면 “fail”를, 아이디는 일치하지만 비밀번호가 일치하는 회원이 없다면 “wrong pw”를 return 합니다.
//				
//		제한사항
//		회원들의 아이디는 문자열입니다.
//		회원들의 아이디는 알파벳 소문자와 숫자로만 이루어져 있습니다.
//		회원들의 패스워드는 숫자로 구성된 문자열입니다.
//		회원들의 비밀번호는 같을 수 있지만 아이디는 같을 수 없습니다.
//		id_pw의 길이는 2입니다.
//		id_pw와 db의 원소는 [아이디, 패스워드] 형태입니다.
//		1 ≤ 아이디의 길이 ≤ 15
//		1 ≤ 비밀번호의 길이 ≤ 6
//		1 ≤ db의 길이 ≤ 10
//		db의 원소의 길이는 2입니다.
		
//		String[] id_pw = {"meosseugi", "1234"};
//		String[][] db = {{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}};
//		
//		System.out.println(lim.solution(id_pw, db));

		
		
		
		
		
	//----------------------------------------------------------------------------------
		
		
		
		
		
		
//		32. 영어 점수와 수학 점수의 평균 점수를 기준으로 학생들의 등수를 매기려고 합니다.
//		영어 점수와 수학 점수를 담은 2차원 정수 배열 score가 주어질 때, 영어 점수와 수학 점수의 평균을 기준으로 매긴 등수를 담은 배열을 return하도록 solution 함수를 완성해주세요.
//
//		제한사항
//		0 ≤ score[0], score[1] ≤ 100
//		1 ≤ score의 길이 ≤ 10
//		score의 원소 길이는 2입니다.
//		score는 중복된 원소를 갖지 않습니다.
		
//		int[][] score = {{80,70},{70,80},{30,50},{90,100},{100,90},{100,100},{10,30}};
//		
//		System.out.println(Arrays.toString(lim.solution(score)));

		
		
		
		
		
	//----------------------------------------------------------------------------------
		
		
		
		
		
		
//		33. 정수 n을 기준으로 n과 가까운 수부터 정렬하려고 합니다. 
//		이때 n으로부터의 거리가 같다면 더 큰 수를 앞에 오도록 배치합니다. 
//		정수가 담긴 배열 numlist와 정수 n이 주어질 때 numlist의 원소를 n으로부터 가까운 순서대로 정렬한 배열을 return하도록 solution 함수를 완성해주세요.
//
//		제한사항
//		1 ≤ n ≤ 10,000
//		1 ≤ numlist의 원소 ≤ 10,000
//		1 ≤ numlist의 길이 ≤ 100
//		numlist는 중복된 원소를 갖지 않습니다.
		
//		int[] numlist = {10000,20,36,47,40,6,10,7000};
//		int n = 30;
//		
//		System.out.println(Arrays.toString(lim.solution(numlist, n)));

		
		
		
		
		
	//----------------------------------------------------------------------------------	
		
		
		
		
		
		
//		34. 이진수를 의미하는 두 개의 문자열 bin1과 bin2가 매개변수로 주어질 때, 두 이진수의 합을 return하도록 solution 함수를 완성해주세요.
//
//		제한사항
//		return 값은 이진수를 의미하는 문자열입니다.
//		1 ≤ bin1, bin2의 길이 ≤ 10
//		bin1과 bin2는 0과 1로만 이루어져 있습니다.
//		bin1과 bin2는 "0"을 제외하고 0으로 시작하지 않습니다.
		
//		String bin1 = "1001";
//		String bin2 = "1111";
//		
//		System.out.println(lim.solution(bin1, bin2));

		
		
		
		
		
	//----------------------------------------------------------------------------------
		
		
		
		
		
		
//		35. 소수점 아래 숫자가 계속되지 않고 유한개인 소수를 유한소수라고 합니다. 
//		분수를 소수로 고칠 때 유한소수로 나타낼 수 있는 분수인지 판별하려고 합니다. 유한소수가 되기 위한 분수의 조건은 다음과 같습니다.
//		기약분수로 나타내었을 때, 분모의 소인수가 2와 5만 존재해야 합니다.
//		두 정수 a와 b가 매개변수로 주어질 때, a/b가 유한소수이면 1을, 무한소수라면 2를 return하도록 solution 함수를 완성해주세요.
		
//		int a = 12;
//		int b = 21;
//		
//		System.out.println(lim.solution(a, b));

		
		
		
		
		
	//----------------------------------------------------------------------------------
		
		
		
		
		
		
//		36. 선분 3개가 평행하게 놓여 있습니다. 
//		세 선분의 시작과 끝 좌표가 [[start, end], [start, end], [start, end]] 형태로 들어있는 2차원 배열 lines가 매개변수로 주어질 때, 
//		두 개 이상의 선분이 겹치는 부분의 길이를 return 하도록 solution 함수를 완성해보세요.
//
//		lines가 [[0, 2], [-3, -1], [-2, 1]]일 때 그림으로 나타내면 다음과 같습니다.		
//				
//		선분이 두 개 이상 겹친 곳은 [-2, -1], [0, 1]로 길이 2만큼 겹쳐있습니다.
//		
//		제한사항
//		lines의 길이 = 3
//		lines의 원소의 길이 = 2
//		모든 선분은 길이가 1 이상입니다.
//		lines의 원소는 [a, b] 형태이며, a, b는 각각 선분의 양 끝점 입니다.
//		-100 ≤ a < b ≤ 100
		
//		int[][] lines = {{0,5},{3,9},{1,10}};
//		
//		System.out.println(lim.solution(lines));

		
		
		
		
		
		//----------------------------------------------------------------------------------
		
		
		
		
		
		
//		37. 정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.
//
//		제한사항
//		0 ≤ numbers의 원소 ≤ 10,000
//		2 ≤ numbers의 길이 ≤ 100
		
//		int[] numbers = {0, 31, 24, 10, 1, 9};
//		
//		System.out.println(lim.solution(numbers));

		
		
		
		
		
		//----------------------------------------------------------------------------------
		
		
		
		
		
		
//		38. i팩토리얼 (i!)은 1부터 i까지 정수의 곱을 의미합니다. 
//		예를들어 5! = 5 * 4 * 3 * 2 * 1 = 120 입니다. 
//		정수 n이 주어질 때 다음 조건을 만족하는 가장 큰 정수 i를 return 하도록 solution 함수를 완성해주세요.
//
//		i! ≤ n
//		제한사항
//		0 < n ≤ 3,628,800
		
//		int n = 7;
//		
//		System.out.println(lim.solution(n));

		
		
		
		
		
		//----------------------------------------------------------------------------------
		
		
		
		
		
		
//		39. 영어에선 a, e, i, o, u 다섯 가지 알파벳을 모음으로 분류합니다. 
//		문자열 my_string이 매개변수로 주어질 때 모음을 제거한 문자열을 return하도록 solution 함수를 완성해주세요.
//
//		제한사항
//		my_string은 소문자와 공백으로 이루어져 있습니다.
//		1 ≤ my_string의 길이 ≤ 1,000
				
//		String my_string = "nice to meet you";
//		
//		System.out.println(lim.solution(my_string));

		
		
		
		
		
		//----------------------------------------------------------------------------------
		
		
		
		
		
		
//		40. 점 네 개의 좌표를 담은 이차원 배열  dots가 다음과 같이 매개변수로 주어집니다.
//		[[x1, y1], [x2, y2], [x3, y3], [x4, y4]]
//		주어진 네 개의 점을 두 개씩 이었을 때, 두 직선이 평행이 되는 경우가 있으면 1을 없으면 0을 return 하도록 solution 함수를 완성해보세요.
//		
//		제한사항
//		dots의 길이 = 4
//		dots의 원소는 [x, y] 형태이며 x, y는 정수입니다.
//		0 ≤ x, y ≤ 100
//		서로 다른 두개 이상의 점이 겹치는 경우는 없습니다.
//		두 직선이 겹치는 경우(일치하는 경우)에도 1을 return 해주세요.
//		임의의 두 점을 이은 직선이 x축 또는 y축과 평행한 경우는 주어지지 않습니다.
		
//		int[][] dots = {{3,5},{4,1},{2,4},{5,10}};
//		
//		System.out.println(lim.solution(dots));

		
		
		
		
		
		//----------------------------------------------------------------------------------
		
		
		
		
		
		
//		41. 3x 마을 사람들은 3을 저주의 숫자라고 생각하기 때문에 3의 배수와 숫자 3을 사용하지 않습니다. 3x 마을 사람들의 숫자는 다음과 같습니다.
//
//		10진법	3x 마을에서 쓰는 숫자	10진법	3x 마을에서 쓰는 숫자
//		1	1	6	8
//		2	2	7	10
//		3	4	8	11
//		4	5	9	14
//		5	7	10	16
//		정수 n이 매개변수로 주어질 때, n을 3x 마을에서 사용하는 숫자로 바꿔 return하도록 solution 함수를 완성해주세요.
		
//		int n = 40;
//		
//		System.out.println(lim.solution(n));

		
		
		
		
		
		//----------------------------------------------------------------------------------
		
		
		
		
		
		
//		42. PROGRAMMERS-962 행성에 불시착한 우주비행사 머쓱이는 외계행성의 언어를 공부하려고 합니다. 
//		알파벳이 담긴 배열 spell과 외계어 사전 dic이 매개변수로 주어집니다. 
//		spell에 담긴 알파벳을 한번씩만 모두 사용한 단어가 dic에 존재한다면 1, 존재하지 않는다면 2를 return하도록 solution 함수를 완성해주세요.
//
//		제한사항
//		spell과 dic의 원소는 알파벳 소문자로만 이루어져있습니다.
//		2 ≤ spell의 크기 ≤ 10
//		spell의 원소의 길이는 1입니다.
//		1 ≤ dic의 크기 ≤ 10
//		1 ≤ dic의 원소의 길이 ≤ 10
//		spell의 원소를 모두 사용해 단어를 만들어야 합니다.
//		spell의 원소를 모두 사용해 만들 수 있는 단어는 dic에 두 개 이상 존재하지 않습니다.
//		dic과 spell 모두 중복된 원소를 갖지 않습니다.
		
//		String[] spell = {"s", "o", "m", "d"};
//		String[] dic = {"moos", "dzx", "smm", "sunmmo", "som"};
//		
//		System.out.println(lim.solution(spell, dic));

		
		
		
		
		
		//----------------------------------------------------------------------------------
		
		
		
		
		
		
//		43. 선분 세 개로 삼각형을 만들기 위해서는 다음과 같은 조건을 만족해야 합니다.
//		가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다.
//		삼각형의 두 변의 길이가 담긴 배열 sides이 매개변수로 주어집니다. 나머지 한 변이 될 수 있는 정수의 개수를 return하도록 solution 함수를 완성해주세요.
//		
//		제한사항
//		sides의 원소는 자연수입니다.
//		sides의 길이는 2입니다.
//		1 ≤ sides의 원소 ≤ 1,000
		
//		int[] sides = {11,7};
//		
//		System.out.println(lim.solution(sides));

		
		
		
		
		
		//----------------------------------------------------------------------------------
		
		
		
		
		
		
//		44. 문자열 my_string이 매개변수로 주어집니다. 
//		my_string은 소문자, 대문자, 자연수로만 구성되어있습니다. my_string안의 자연수들의 합을 return하도록 solution 함수를 완성해주세요.
//
//		제한사항
//		1 ≤ my_string의 길이 ≤ 1,000
//		1 ≤ my_string 안의 자연수 ≤ 1000
//		연속된 수는 하나의 숫자로 간주합니다.
//		000123과 같이 0이 선행하는 경우는 없습니다.
//		문자열에 자연수가 없는 경우 0을 return 해주세요.
		
//		String my_string = "1a2b3c4d123Z";
//		
//		System.out.println(lim.solution(my_string));

		
		
		
		
		
		//----------------------------------------------------------------------------------		
		
		
		
		
		
		
//		45. 정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.
//
//		제한사항
//		-10,000 ≤ numbers의 원소 ≤ 10,000
//		2 ≤ numbers 의 길이 ≤ 100
		
//		int[] numbers = {10, 20, 30, 5, 5, 20, 5};
//		
//		System.out.println(lim.solution(numbers));

		
		
		
		
		
		//----------------------------------------------------------------------------------
		
		
		
		
		
		
//		46. 문자열 배열 strlist가 매개변수로 주어집니다. strlist 각 원소의 길이를 담은 배열을 retrun하도록 solution 함수를 완성해주세요.
//
//		제한사항
//		1 ≤ strlist 원소의 길이 ≤ 100
//		strlist는 알파벳 소문자, 대문자, 특수문자로 구성되어 있습니다.
		
//		String[] strlist = {"We", "are", "the", "world!"};
//		
//		System.out.println(Arrays.toString(lim.solution(strlist)));

		
		
		
		
		
		//----------------------------------------------------------------------------------
		
		
		
		
		
		
//		47. 한 개 이상의 항의 합으로 이루어진 식을 다항식이라고 합니다. 
//		다항식을 계산할 때는 동류항끼리 계산해 정리합니다. 덧셈으로 이루어진 다항식 polynomial이 매개변수로 주어질 때, 동류항끼리 더한 결괏값을 문자열로 return 하도록 solution 함수를 완성해보세요. 같은 식이라면 가장 짧은 수식을 return 합니다.
//
//		제한사항
//		0 < polynomial에 있는 수 < 100	
//		polynomial에 변수는 'x'만 존재합니다.	
//		polynomial은 양의 정수, 공백, ‘x’, ‘+'로 이루어져 있습니다.	
//		항과 연산기호 사이에는 항상 공백이 존재합니다.	
//		공백은 연속되지 않으며 시작이나 끝에는 공백이 없습니다.	
//		하나의 항에서 변수가 숫자 앞에 오는 경우는 없습니다.	
//		" + 3xx + + x7 + "와 같은 잘못된 입력은 주어지지 않습니다.	
//		0으로 시작하는 수는 없습니다.	
//		문자와 숫자 사이의 곱하기는 생략합니다.
//		polynomial에는 일차 항과 상수항만 존재합니다.
//		계수 1은 생략합니다.		
//		결괏값에 상수항은 마지막에 둡니다.		
//		0 < polynomial의 길이 < 50
		
//		String polynomial = "3x + 7 + x";
//		
//		System.out.println(lim.solution(polynomial));

		
		
		
		
		
		//----------------------------------------------------------------------------------
		
		
		
		
		
		
//		48. 머쓱이는 RPG게임을 하고 있습니다. 
//		게임에는 up, down, left, right 방향키가 있으며 각 키를 누르면 위, 아래, 왼쪽, 오른쪽으로 한 칸씩 이동합니다. 
//		예를 들어 [0,0]에서 up을 누른다면 캐릭터의 좌표는 [0, 1], down을 누른다면 [0, -1], left를 누른다면 [-1, 0], right를 누른다면 [1, 0]입니다. 
//		머쓱이가 입력한 방향키의 배열 keyinput와 맵의 크기 board이 매개변수로 주어집니다. 
//		캐릭터는 항상 [0,0]에서 시작할 때 키 입력이 모두 끝난 뒤에 캐릭터의 좌표 [x, y]를 return하도록 solution 함수를 완성해주세요.
//
//		[0, 0]은 board의 정 중앙에 위치합니다. 예를 들어 board의 가로 크기가 9라면 캐릭터는 왼쪽으로 최대 [-4, 0]까지 오른쪽으로 최대 [4, 0]까지 이동할 수 있습니다.
//		제한사항
//		board은 [가로 크기, 세로 크기] 형태로 주어집니다.
//		board의 가로 크기와 세로 크기는 홀수입니다.
//		board의 크기를 벗어난 방향키 입력은 무시합니다.
//		0 ≤ keyinput의 길이 ≤ 50
//		1 ≤ board[0] ≤ 99
//		1 ≤ board[1] ≤ 99
//		keyinput은 항상 up, down, left, right만 주어집니다.
		
//		String[] keyinput = {"down", "down", "down", "down", "down"};
//		int[] board = {7,9};
//		
//		System.out.println(Arrays.toString(lim.solution(keyinput, board)));

		
		
		
		
		
		//----------------------------------------------------------------------------------
		
		
		
		
		
		
//		49. 숫자와 "Z"가 공백으로 구분되어 담긴 문자열이 주어집니다. 
//		문자열에 있는 숫자를 차례대로 더하려고 합니다. 이 때 "Z"가 나오면 바로 전에 더했던 숫자를 뺀다는 뜻입니다. 
//		숫자와 "Z"로 이루어진 문자열 s가 주어질 때, 머쓱이가 구한 값을 return 하도록 solution 함수를 완성해보세요.
//
//		제한사항
//		1 ≤ s의 길이 ≤ 200
//		-1,000 < s의 원소 중 숫자 < 1,000
//		s는 숫자, "Z", 공백으로 이루어져 있습니다.
//		s에 있는 숫자와 "Z"는 서로 공백으로 구분됩니다.
//		연속된 공백은 주어지지 않습니다.
//		0을 제외하고는 0으로 시작하는 숫자는 없습니다.
//		s는 "Z"로 시작하지 않습니다.
//		s의 시작과 끝에는 공백이 없습니다.
//		"Z"가 연속해서 나오는 경우는 없습니다.
		
//		String s = "-1 -2 -3 Z";
//		
//		System.out.println(lim.solution(s));

		
		
		
		
		
		//----------------------------------------------------------------------------------
		
		
		
		
		
		
//		50. 소인수분해란 어떤 수를 소수들의 곱으로 표현하는 것입니다. 
//		예를 들어 12를 소인수 분해하면 2 * 2 * 3 으로 나타낼 수 있습니다. 따라서 12의 소인수는 2와 3입니다. 
//		자연수 n이 매개변수로 주어질 때 n의 소인수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.
//
//		제한사항
//		2 ≤ n ≤ 10,000
		
//		int n = 420;
//		
//		System.out.println(Arrays.toString(lim.solution(n)));

		
		
		
		
		
		//----------------------------------------------------------------------------------
		
		
		
		
		
		
//		51. 문자열 my_string이 매개변수로 주어질 때, my_string 안에 있는 숫자만 골라 오름차순 정렬한 리스트를 return 하도록 solution 함수를 작성해보세요.
//
//		제한사항
//		1 ≤ my_string의 길이 ≤ 100
//		my_string에는 숫자가 한 개 이상 포함되어 있습니다.
//		my_string은 영어 소문자 또는 0부터 9까지의 숫자로 이루어져 있습니다. 
		
//		String my_string = "p2o4i8gj2";
//		
//		System.out.println(Arrays.toString(lim.solution(my_string)));

		
		
		
		
		
		//----------------------------------------------------------------------------------
		
		
		
		
		
		
//		52. 약수의 개수가 세 개 이상인 수를 합성수라고 합니다. 자연수 n이 매개변수로 주어질 때 n이하의 합성수의 개수를 return하도록 solution 함수를 완성해주세요.
//
//		제한사항
//		1 ≤ n ≤ 100
		
//		int n = 15;
//		
//		System.out.println(lim.solution(n));

		
		
		
		
		
		//----------------------------------------------------------------------------------
		
		
		
		
		
		
//		53. 머쓱이는 직육면체 모양의 상자를 하나 가지고 있는데 이 상자에 정육면체 모양의 주사위를 최대한 많이 채우고 싶습니다. 
//		상자의 가로, 세로, 높이가 저장되어있는 배열 box와 
//		주사위 모서리의 길이 정수 n이 매개변수로 주어졌을 때, 상자에 들어갈 수 있는 주사위의 최대 개수를 return 하도록 solution 함수를 완성해주세요.
//
//		제한사항
//		box의 길이는 3입니다.
//		box[0] = 상자의 가로 길이
//		box[1] = 상자의 세로 길이
//		box[2] = 상자의 높이 길이
//		1 ≤ box의 원소 ≤ 100
//		1 ≤ n ≤ 50
//		n ≤ box의 원소
//		주사위는 상자와 평행하게 넣습니다.
		
//		int[] box = {12,8,6};
//		int n = 3;
//		
//		System.out.println(lim.solution(box, n));

		
		
		
		
		
		//----------------------------------------------------------------------------------
		
		
		
		
		
		
//		54. 정수가 담긴 배열 numbers와 문자열 direction가 매개변수로 주어집니다. 
//		배열 numbers의 원소를 direction방향으로 한 칸씩 회전시킨 배열을 return하도록 solution 함수를 완성해주세요.
//
//		제한사항
//		3 ≤ numbers의 길이 ≤ 20
//		direction은 "left" 와 "right" 둘 중 하나입니다.
		
//		int[] numbers = {4, 455, 6, 4, -1, 45, 6};
//		String direction = "left";
//		
//		System.out.println(Arrays.toString(lim.solution(numbers, direction)));

		
		
		
		
		
		//----------------------------------------------------------------------------------
		
		
		
		
		
		
//		55. 머쓱이는 친구들과 동그랗게 서서 공 던지기 게임을 하고 있습니다. 
//		공은 1번부터 던지며 오른쪽으로 한 명을 건너뛰고 그다음 사람에게만 던질 수 있습니다. 
//		친구들의 번호가 들어있는 정수 배열 numbers와 정수 K가 주어질 때, k번째로 공을 던지는 사람의 번호는 무엇인지 return 하도록 solution 함수를 완성해보세요.
//
//		제한사항
//		2 < numbers의 길이 < 100
//		0 < k < 1,000
//		numbers의 첫 번째와 마지막 번호는 실제로 바로 옆에 있습니다.
//		numbers는 1부터 시작하며 번호는 순서대로 올라갑니다.
		
//		int[] numbers = {1,2,3};
//		int k = 2;
//		
//		System.out.println(lim.solution(numbers, k));

		
		
		
		
		
		//----------------------------------------------------------------------------------
		
		
		
		
		
		
//		56. 정수 배열 num_list와 정수 n이 매개변수로 주어집니다. num_list를 다음 설명과 같이 2차원 배열로 바꿔 return하도록 solution 함수를 완성해주세요.
//		num_list가 [1, 2, 3, 4, 5, 6, 7, 8] 로 길이가 8이고 n이 2이므로 num_list를 2 * 4 배열로 다음과 같이 변경합니다. 
//		2차원으로 바꿀 때에는 num_list의 원소들을 앞에서부터 n개씩 나눠 2차원 배열로 변경합니다.
//		num_list	n	result
//		[1, 2, 3, 4, 5, 6, 7, 8]	2	[[1, 2], [3, 4], [5, 6], [7, 8]]
//				
//		제한사항
//		num_list의 길이는 n의 배 수개입니다.
//		0 ≤ num_list의 길이 ≤ 150
//		2 ≤ n < num_list의 길이
		
//		int[] num_list = {100, 95, 2, 4, 5, 6, 18, 33, 948};
//		int n = 3;
//		
//		System.out.println(Arrays.deepToString(lim.solution(num_list, n)));

		
		
		
		
		
		//----------------------------------------------------------------------------------
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main	
}
