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
		
		
		
		
		
		
		
//		머쓱이는 프로그래머스에 로그인하려고 합니다. 머쓱이가 입력한 아이디와 패스워드가 담긴 배열 id_pw와 회원들의 정보가 담긴
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
//		System.out.println(am.solution(id_pw, db));

		
		
		
		
		
		//----------------------------------------------------------------------------------
		
		
		
		
		
		
//		영어 점수와 수학 점수의 평균 점수를 기준으로 학생들의 등수를 매기려고 합니다.
//		영어 점수와 수학 점수를 담은 2차원 정수 배열 score가 주어질 때, 영어 점수와 수학 점수의 평균을 기준으로 매긴 등수를 담은 배열을 return하도록 solution 함수를 완성해주세요.
//
//		제한사항
//		0 ≤ score[0], score[1] ≤ 100
//		1 ≤ score의 길이 ≤ 10
//		score의 원소 길이는 2입니다.
//		score는 중복된 원소를 갖지 않습니다.
		
//		int[][] score = {{80,70},{70,80},{30,50},{90,100},{100,90},{100,100},{10,30}};
//		
//		System.out.println(Arrays.toString(am.solution(score)));

		
		
		
		
		
		//----------------------------------------------------------------------------------
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main	
}
