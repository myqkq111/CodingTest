package level_1;

import java.util.Arrays;

public class Level_1 {
	public static void main(String[] args) {
		
		Level_1_Method lm = new Level_1_Method();
	
		//1. 달리기 경주
//		문제 설명
//		얀에서는 매년 달리기 경주가 열립니다. 해설진들은 선수들이 자기 바로 앞의 선수를 추월할 때 추월한 선수의 이름을 부릅니다. 
//		예를 들어 1등부터 3등까지 "mumu", "soe", "poe" 선수들이 순서대로 달리고 있을 때, 해설진이 "soe"선수를 불렀다면 2등인 "soe" 선수가 1등인 "mumu" 선수를 추월했다는 것입니다. 
//		즉 "soe" 선수가 1등, "mumu" 선수가 2등으로 바뀝니다.
//	
//		선수들의 이름이 1등부터 현재 등수 순서대로 담긴 문자열 배열 players와 해설진이 부른 이름을 담은 문자열 배열 callings가 매개변수로 주어질 때, 
//		경주가 끝났을 때 선수들의 이름을 1등부터 등수 순서대로 배열에 담아 return 하는 solution 함수를 완성해주세요.
//	
//		제한사항
//		5 ≤ players의 길이 ≤ 50,000
//		players[i]는 i번째 선수의 이름을 의미합니다.
//		players의 원소들은 알파벳 소문자로만 이루어져 있습니다.
//		players에는 중복된 값이 들어가 있지 않습니다.
//		3 ≤ players[i]의 길이 ≤ 10
//		2 ≤ callings의 길이 ≤ 1,000,000
//		callings는 players의 원소들로만 이루어져 있습니다.
//		경주 진행중 1등인 선수의 이름은 불리지 않습니다.

//		String[] players = {"mumu", "soe", "poe", "kai", "mine"};
//		String[] callings = {"kai", "kai", "mine", "mine"};
//		
//		System.out.println(Arrays.toString(lm.solution(players, callings)));
		
		
		
		
		
		
		//--------------------------------------------------------------------------
	
	
	
	
	
	
		//2. 추억 점수
//		문제 설명
//		사진들을 보며 추억에 젖어 있던 루는 사진별로 추억 점수를 매길려고 합니다. 
//		사진 속에 나오는 인물의 그리움 점수를 모두 합산한 값이 해당 사진의 추억 점수가 됩니다. 
//		예를 들어 사진 속 인물의 이름이 ["may", "kein", "kain"]이고 각 인물의 그리움 점수가 [5점, 10점, 1점]일 때 해당 사진의 
//		추억 점수는 16(5 + 10 + 1)점이 됩니다. 다른 사진 속 인물의 이름이 ["kali", "mari", "don", "tony"]이고 ["kali", "mari", "don"]의 
//		그리움 점수가 각각 [11점, 1점, 55점]]이고, "tony"는 그리움 점수가 없을 때, 이 사진의 추억 점수는 3명의 그리움 점수를 합한 67(11 + 1 + 55)점입니다.
//
//		그리워하는 사람의 이름을 담은 문자열 배열 name, 각 사람별 그리움 점수를 담은 정수 배열 yearning, 각 사진에 찍힌 인물의 이름을 담은 
//		이차원 문자열 배열 photo가 매개변수로 주어질 때, 사진들의 추억 점수를 photo에 주어진 순서대로 배열에 담아 return하는 solution 함수를 완성해주세요.
//
//		제한사항
//		3 ≤ name의 길이 = yearning의 길이≤ 100
//		3 ≤ name의 원소의 길이 ≤ 7
//		name의 원소들은 알파벳 소문자로만 이루어져 있습니다.
//		name에는 중복된 값이 들어가지 않습니다.
//		1 ≤ yearning[i] ≤ 100
//		yearning[i]는 i번째 사람의 그리움 점수입니다.
//		3 ≤ photo의 길이 ≤ 100
//		1 ≤ photo[i]의 길이 ≤ 100
//		3 ≤ photo[i]의 원소(문자열)의 길이 ≤ 7
//		photo[i]의 원소들은 알파벳 소문자로만 이루어져 있습니다.
//		photo[i]의 원소들은 중복된 값이 들어가지 않습니다.
	
//		String[] name = {"may", "kein", "kain", "radi"};
//		int[] yearning = {5, 10, 1, 3};
//		String[][] photo = {{"may"},{"kein", "deny", "may"},{"kon", "coni"}};
//		
//		System.out.println(Arrays.toString(lm.solution(name, yearning, photo)));

		
		
		
		
		
		//--------------------------------------------------------------------------
		
		
		
		
		
		
		//3. 공원 산책
//		문제 설명
//		지나다니는 길을 'O', 장애물을 'X'로 나타낸 직사각형 격자 모양의 공원에서 로봇 강아지가 산책을 하려합니다. 
//		산책은 로봇 강아지에 미리 입력된 명령에 따라 진행하며, 명령은 다음과 같은 형식으로 주어집니다.
//
//		["방향 거리", "방향 거리" … ]
//		예를 들어 "E 5"는 로봇 강아지가 현재 위치에서 동쪽으로 5칸 이동했다는 의미입니다. 로봇 강아지는 명령을 수행하기 전에 다음 두 가지를 먼저 확인합니다.
//
//		주어진 방향으로 이동할 때 공원을 벗어나는지 확인합니다.
//		주어진 방향으로 이동 중 장애물을 만나는지 확인합니다.
//		위 두 가지중 어느 하나라도 해당된다면, 로봇 강아지는 해당 명령을 무시하고 다음 명령을 수행합니다.
//		공원의 가로 길이가 W, 세로 길이가 H라고 할 때, 공원의 좌측 상단의 좌표는 (0, 0), 우측 하단의 좌표는 (H - 1, W - 1) 입니다.
//		공원을 나타내는 문자열 배열 park, 로봇 강아지가 수행할 명령이 담긴 문자열 배열 routes가 매개변수로 주어질 때, 
//		로봇 강아지가 모든 명령을 수행 후 놓인 위치를 [세로 방향 좌표, 가로 방향 좌표] 순으로 배열에 담아 return 하도록 solution 함수를 완성해주세요.
//
//		제한사항
//		3 ≤ park의 길이 ≤ 50
//		3 ≤ park[i]의 길이 ≤ 50
//		park[i]는 다음 문자들로 이루어져 있으며 시작지점은 하나만 주어집니다.
//		S : 시작 지점
//		O : 이동 가능한 통로
//		X : 장애물
//		park는 직사각형 모양입니다.
//		1 ≤ routes의 길이 ≤ 50
//		routes의 각 원소는 로봇 강아지가 수행할 명령어를 나타냅니다.
//		로봇 강아지는 routes의 첫 번째 원소부터 순서대로 명령을 수행합니다.
//		routes의 원소는 "op n"과 같은 구조로 이루어져 있으며, op는 이동할 방향, n은 이동할 칸의 수를 의미합니다.
//		op는 다음 네 가지중 하나로 이루어져 있습니다.
//		N : 북쪽으로 주어진 칸만큼 이동합니다.
//		S : 남쪽으로 주어진 칸만큼 이동합니다.
//		W : 서쪽으로 주어진 칸만큼 이동합니다.
//		E : 동쪽으로 주어진 칸만큼 이동합니다.
//		1 ≤ n ≤ 9
		
//		String[] park = {"OSO","OOO","OXO","OOO"};
// 		String[] routes = {"E 2","S 3","W 1"};
// 		
// 		System.out.println(Arrays.toString(lm.solution(park, routes)));

		
		
		
		
		
		//--------------------------------------------------------------------------
		
		
		
		
		
		
		//4. 바탕화면 정리
//		문제 설명
//		코딩테스트를 준비하는 머쓱이는 프로그래머스에서 문제를 풀고 나중에 다시 코드를 보면서 공부하려고 작성한 코드를 컴퓨터 바탕화면에 아무 위치에나 저장해 둡니다. 
//		저장한 코드가 많아지면서 머쓱이는 본인의 컴퓨터 바탕화면이 너무 지저분하다고 생각했습니다. 프로그래머스에서 작성했던 코드는 그 문제에 가서 다시 볼 수 있기 때문에 저장해 둔 파일들을 전부 삭제하기로 했습니다.
//
//		컴퓨터 바탕화면은 각 칸이 정사각형인 격자판입니다. 이때 컴퓨터 바탕화면의 상태를 나타낸 문자열 배열 wallpaper가 주어집니다. 
//		파일들은 바탕화면의 격자칸에 위치하고 바탕화면의 격자점들은 바탕화면의 가장 왼쪽 위를 (0, 0)으로 시작해 (세로 좌표, 가로 좌표)로 표현합니다. 빈칸은 ".", 파일이 있는 칸은 "#"의 값을 가집니다. 드래그를 하면 파일들을 선택할 수 있고, 선택된 파일들을 삭제할 수 있습니다. 머쓱이는 최소한의 이동거리를 갖는 한 번의 드래그로 모든 파일을 선택해서 한 번에 지우려고 하며 드래그로 파일들을 선택하는 방법은 다음과 같습니다.
//
//		드래그는 바탕화면의 격자점 S(lux, luy)를 마우스 왼쪽 버튼으로 클릭한 상태로 격자점 E(rdx, rdy)로 이동한 뒤 마우스 왼쪽 버튼을 떼는 행동입니다. 
//		이때, "점 S에서 점 E로 드래그한다"고 표현하고 점 S와 점 E를 각각 드래그의 시작점, 끝점이라고 표현합니다.
//
//		점 S(lux, luy)에서 점 E(rdx, rdy)로 드래그를 할 때, "드래그 한 거리"는 |rdx - lux| + |rdy - luy|로 정의합니다.
//
//		점 S에서 점 E로 드래그를 하면 바탕화면에서 두 격자점을 각각 왼쪽 위, 오른쪽 아래로 하는 직사각형 내부에 있는 모든 파일이 선택됩니다.
//		머쓱이의 컴퓨터 바탕화면의 상태를 나타내는 문자열 배열 wallpaper가 매개변수로 주어질 때 바탕화면의 파일들을 한 번에 삭제하기 위해 최소한의 이동거리를 갖는 드래그의 시작점과 끝점을 담은 정수 배열을 return하는 solution 함수를 작성해 주세요. 드래그의 시작점이 (lux, luy), 끝점이 (rdx, rdy)라면 정수 배열 [lux, luy, rdx, rdy]를 return하면 됩니다.
//
//		제한사항
//		1 ≤ wallpaper의 길이 ≤ 50
//		1 ≤ wallpaper[i]의 길이 ≤ 50
//		wallpaper의 모든 원소의 길이는 동일합니다.
//		wallpaper[i][j]는 바탕화면에서 i + 1행 j + 1열에 해당하는 칸의 상태를 나타냅니다.
//		wallpaper[i][j]는 "#" 또는 "."의 값만 가집니다.
//		바탕화면에는 적어도 하나의 파일이 있습니다.
//		드래그 시작점 (lux, luy)와 끝점 (rdx, rdy)는 lux < rdx, luy < rdy를 만족해야 합니다.
		
//		String[] wallpaper = {"..", "#."};
//		
//		System.out.println(Arrays.toString(lm.solution(wallpaper)));

		
		
		
		
		
		//--------------------------------------------------------------------------
		
		
	
	
		
		
		//5. 덧칠하기
//		문제 설명
//		어느 학교에 페인트가 칠해진 길이가 n미터인 벽이 있습니다. 벽에 동아리 · 학회 홍보나 회사 채용 공고 포스터 등을 게시하기 위해 테이프로 붙였다가 철거할 때 떼는 일이 많고 그 과정에서 페인트가 벗겨지곤 합니다. 페인트가 벗겨진 벽이 보기 흉해져 학교는 벽에 페인트를 덧칠하기로 했습니다.
//
//		넓은 벽 전체에 페인트를 새로 칠하는 대신, 구역을 나누어 일부만 페인트를 새로 칠 함으로써 예산을 아끼려 합니다. 이를 위해 벽을 1미터 길이의 구역 n개로 나누고, 각 구역에 왼쪽부터 순서대로 1번부터 n번까지 번호를 붙였습니다. 그리고 페인트를 다시 칠해야 할 구역들을 정했습니다.
//
//		벽에 페인트를 칠하는 롤러의 길이는 m미터이고, 롤러로 벽에 페인트를 한 번 칠하는 규칙은 다음과 같습니다.
//
//		롤러가 벽에서 벗어나면 안 됩니다.
//		구역의 일부분만 포함되도록 칠하면 안 됩니다.
//		즉, 롤러의 좌우측 끝을 구역의 경계선 혹은 벽의 좌우측 끝부분에 맞춘 후 롤러를 위아래로 움직이면서 벽을 칠합니다. 현재 페인트를 칠하는 구역들을 완전히 칠한 후 벽에서 롤러를 떼며, 이를 벽을 한 번 칠했다고 정의합니다.
//
//		한 구역에 페인트를 여러 번 칠해도 되고 다시 칠해야 할 구역이 아닌 곳에 페인트를 칠해도 되지만 다시 칠하기로 정한 구역은 적어도 한 번 페인트칠을 해야 합니다. 예산을 아끼기 위해 다시 칠할 구역을 정했듯 마찬가지로 롤러로 페인트칠을 하는 횟수를 최소화하려고 합니다.
//
//		정수 n, m과 다시 페인트를 칠하기로 정한 구역들의 번호가 담긴 정수 배열 section이 매개변수로 주어질 때 롤러로 페인트칠해야 하는 최소 횟수를 return 하는 solution 함수를 작성해 주세요.
//
//		제한사항
//		1 ≤ m ≤ n ≤ 100,000
//		1 ≤ section의 길이 ≤ n
//		1 ≤ section의 원소 ≤ n
//		section의 원소는 페인트를 다시 칠해야 하는 구역의 번호입니다.
//		section에서 같은 원소가 두 번 이상 나타나지 않습니다.
//		section의 원소는 오름차순으로 정렬되어 있습니다.
		
//		int n = 4;
//		int m = 1;
//		int[] section = {1,2,3,4};
//		
//		System.out.println(lm.solution(n, m, section));

		
		
		
		
		
		//--------------------------------------------------------------------------
		

		
		
		
		
		//6. 대충 만든 자판
//		문제 설명
//		휴대폰의 자판은 컴퓨터 키보드 자판과는 다르게 하나의 키에 여러 개의 문자가 할당될 수 있습니다. 키 하나에 여러 문자가 할당된 경우, 동일한 키를 연속해서 빠르게 누르면 할당된 순서대로 문자가 바뀝니다.
//
//		예를 들어, 1번 키에 "A", "B", "C" 순서대로 문자가 할당되어 있다면 1번 키를 한 번 누르면 "A", 두 번 누르면 "B", 세 번 누르면 "C"가 되는 식입니다.
//
//		같은 규칙을 적용해 아무렇게나 만든 휴대폰 자판이 있습니다. 이 휴대폰 자판은 키의 개수가 1개부터 최대 100개까지 있을 수 있으며, 특정 키를 눌렀을 때 입력되는 문자들도 무작위로 배열되어 있습니다. 또, 같은 문자가 자판 전체에 여러 번 할당된 경우도 있고, 키 하나에 같은 문자가 여러 번 할당된 경우도 있습니다. 심지어 아예 할당되지 않은 경우도 있습니다. 따라서 몇몇 문자열은 작성할 수 없을 수도 있습니다.
//
//		이 휴대폰 자판을 이용해 특정 문자열을 작성할 때, 키를 최소 몇 번 눌러야 그 문자열을 작성할 수 있는지 알아보고자 합니다.
//
//		1번 키부터 차례대로 할당된 문자들이 순서대로 담긴 문자열배열 keymap과 입력하려는 문자열들이 담긴 문자열 배열 targets가 주어질 때, 각 문자열을 작성하기 위해 키를 최소 몇 번씩 눌러야 하는지 순서대로 배열에 담아 return 하는 solution 함수를 완성해 주세요.
//
//		단, 목표 문자열을 작성할 수 없을 때는 -1을 저장합니다.
//
//		제한사항
//		1 ≤ keymap의 길이 ≤ 100
//		1 ≤ keymap의 원소의 길이 ≤ 100
//		keymap[i]는 i + 1번 키를 눌렀을 때 순서대로 바뀌는 문자를 의미합니다.
//		예를 들어 keymap[0] = "ABACD" 인 경우 1번 키를 한 번 누르면 A, 두 번 누르면 B, 세 번 누르면 A 가 됩니다.
//		keymap의 원소의 길이는 서로 다를 수 있습니다.
//		keymap의 원소는 알파벳 대문자로만 이루어져 있습니다.
//		1 ≤ targets의 길이 ≤ 100
//		1 ≤ targets의 원소의 길이 ≤ 100
//		targets의 원소는 알파벳 대문자로만 이루어져 있습니다.
		
//		String[] keymap = {"AGZ","BSSS"};
//		String[] targets = {"ASA"};
//		
//		System.out.println(Arrays.toString(lm.solution(keymap, targets)));

		
		
		
		
		
		//--------------------------------------------------------------------------
		
		
		
		
		

		//7. 카드 뭉치
//		문제 설명
//		코니는 영어 단어가 적힌 카드 뭉치 두 개를 선물로 받았습니다. 코니는 다음과 같은 규칙으로 카드에 적힌 단어들을 사용해 원하는 순서의 단어 배열을 만들 수 있는지 알고 싶습니다.
//
//		원하는 카드 뭉치에서 카드를 순서대로 한 장씩 사용합니다.
//		한 번 사용한 카드는 다시 사용할 수 없습니다.
//		카드를 사용하지 않고 다음 카드로 넘어갈 수 없습니다.
//		기존에 주어진 카드 뭉치의 단어 순서는 바꿀 수 없습니다.
//		예를 들어 첫 번째 카드 뭉치에 순서대로 ["i", "drink", "water"], 두 번째 카드 뭉치에 순서대로 ["want", "to"]가 적혀있을 때 ["i", "want", "to", "drink", "water"] 순서의 단어 배열을 만들려고 한다면 첫 번째 카드 뭉치에서 "i"를 사용한 후 두 번째 카드 뭉치에서 "want"와 "to"를 사용하고 첫 번째 카드뭉치에 "drink"와 "water"를 차례대로 사용하면 원하는 순서의 단어 배열을 만들 수 있습니다.
//
//		문자열로 이루어진 배열 cards1, cards2와 원하는 단어 배열 goal이 매개변수로 주어질 때, cards1과 cards2에 적힌 단어들로 goal를 만들 있다면 "Yes"를, 만들 수 없다면 "No"를 return하는 solution 함수를 완성해주세요.
//
//		제한사항
//		1 ≤ cards1의 길이, cards2의 길이 ≤ 10
//		1 ≤ cards1[i]의 길이, cards2[i]의 길이 ≤ 10
//		cards1과 cards2에는 서로 다른 단어만 존재합니다.
//		2 ≤ goal의 길이 ≤ cards1의 길이 + cards2의 길이
//		1 ≤ goal[i]의 길이 ≤ 10
//		goal의 원소는 cards1과 cards2의 원소들로만 이루어져 있습니다.
//		cards1, cards2, goal의 문자열들은 모두 알파벳 소문자로만 이루어져 있습니다.
		
//		String[] cards1 = {"i", "water", "drink"};
//		String[] cards2 = {"want", "to"};
//		String[] goal = {"i", "want", "to", "drink", "water"};
//		
//		System.out.println(lm.solution(cards1, cards2, goal));

		
		
		
		
		
		//--------------------------------------------------------------------------
		
		
		
		
		
		//8. 둘만의 암호
//		문제 설명
//		두 문자열 s와 skip, 그리고 자연수 index가 주어질 때, 다음 규칙에 따라 문자열을 만들려 합니다. 암호의 규칙은 다음과 같습니다.
//
//		문자열 s의 각 알파벳을 index만큼 뒤의 알파벳으로 바꿔줍니다.
//		index만큼의 뒤의 알파벳이 z를 넘어갈 경우 다시 a로 돌아갑니다.
//		skip에 있는 알파벳은 제외하고 건너뜁니다.
//		예를 들어 s = "aukks", skip = "wbqd", index = 5일 때, a에서 5만큼 뒤에 있는 알파벳은 f지만 [b, c, d, e, f]에서 'b'와 'd'는 skip에 포함되므로 세지 않습니다. 따라서 'b', 'd'를 제외하고 'a'에서 5만큼 뒤에 있는 알파벳은 [c, e, f, g, h] 순서에 의해 'h'가 됩니다. 나머지 "ukks" 또한 위 규칙대로 바꾸면 "appy"가 되며 결과는 "happy"가 됩니다.
//
//		두 문자열 s와 skip, 그리고 자연수 index가 매개변수로 주어질 때 위 규칙대로 s를 변환한 결과를 return하도록 solution 함수를 완성해주세요.
//
//		제한사항
//		5 ≤ s의 길이 ≤ 50
//		1 ≤ skip의 길이 ≤ 10
//		s와 skip은 알파벳 소문자로만 이루어져 있습니다.
//		skip에 포함되는 알파벳은 s에 포함되지 않습니다.
//		1 ≤ index ≤ 20
		
//		String s = "aukks";
//		String skip = "wbqd";
//		int index = 5;
//		
//		System.out.println(lm.solution(s, skip, index));

		
		
		
		
		
		//--------------------------------------------------------------------------
		
		
		
		
		
		
		//9. 개인정보 수집 유효기간
//		문제 설명
//		고객의 약관 동의를 얻어서 수집된 1~n번으로 분류되는 개인정보 n개가 있습니다. 약관 종류는 여러 가지 있으며 각 약관마다 개인정보 보관 유효기간이 정해져 있습니다. 당신은 각 개인정보가 어떤 약관으로 수집됐는지 알고 있습니다. 수집된 개인정보는 유효기간 전까지만 보관 가능하며, 유효기간이 지났다면 반드시 파기해야 합니다.
//
//		예를 들어, A라는 약관의 유효기간이 12 달이고, 2021년 1월 5일에 수집된 개인정보가 A약관으로 수집되었다면 해당 개인정보는 2022년 1월 4일까지 보관 가능하며 2022년 1월 5일부터 파기해야 할 개인정보입니다.
//		당신은 오늘 날짜로 파기해야 할 개인정보 번호들을 구하려 합니다.
//
//		모든 달은 28일까지 있다고 가정합니다.
//
//		다음은 오늘 날짜가 2022.05.19일 때의 예시입니다.
//
//		약관 종류	유효기간
//		A	6 달
//		B	12 달
//		C	3 달
//		번호	개인정보 수집 일자	약관 종류
//		1	2021.05.02	A
//		2	2021.07.01	B
//		3	2022.02.19	C
//		4	2022.02.20	C
//		첫 번째 개인정보는 A약관에 의해 2021년 11월 1일까지 보관 가능하며, 유효기간이 지났으므로 파기해야 할 개인정보입니다.
//		두 번째 개인정보는 B약관에 의해 2022년 6월 28일까지 보관 가능하며, 유효기간이 지나지 않았으므로 아직 보관 가능합니다.
//		세 번째 개인정보는 C약관에 의해 2022년 5월 18일까지 보관 가능하며, 유효기간이 지났으므로 파기해야 할 개인정보입니다.
//		네 번째 개인정보는 C약관에 의해 2022년 5월 19일까지 보관 가능하며, 유효기간이 지나지 않았으므로 아직 보관 가능합니다.
//		따라서 파기해야 할 개인정보 번호는 [1, 3]입니다.
//
//		오늘 날짜를 의미하는 문자열 today, 약관의 유효기간을 담은 1차원 문자열 배열 terms와 수집된 개인정보의 정보를 담은 1차원 문자열 배열 privacies가 매개변수로 주어집니다. 이때 파기해야 할 개인정보의 번호를 오름차순으로 1차원 정수 배열에 담아 return 하도록 solution 함수를 완성해 주세요.
//
//		제한사항
//		today는 "YYYY.MM.DD" 형태로 오늘 날짜를 나타냅니다.
//		1 ≤ terms의 길이 ≤ 20
//		terms의 원소는 "약관 종류 유효기간" 형태의 약관 종류와 유효기간을 공백 하나로 구분한 문자열입니다.
//		약관 종류는 A~Z중 알파벳 대문자 하나이며, terms 배열에서 약관 종류는 중복되지 않습니다.
//		유효기간은 개인정보를 보관할 수 있는 달 수를 나타내는 정수이며, 1 이상 100 이하입니다.
//		1 ≤ privacies의 길이 ≤ 100
//		privacies[i]는 i+1번 개인정보의 수집 일자와 약관 종류를 나타냅니다.
//		privacies의 원소는 "날짜 약관 종류" 형태의 날짜와 약관 종류를 공백 하나로 구분한 문자열입니다.
//		날짜는 "YYYY.MM.DD" 형태의 개인정보가 수집된 날짜를 나타내며, today 이전의 날짜만 주어집니다.
//		privacies의 약관 종류는 항상 terms에 나타난 약관 종류만 주어집니다.
//		today와 privacies에 등장하는 날짜의 YYYY는 연도, MM은 월, DD는 일을 나타내며 점(.) 하나로 구분되어 있습니다.
//		2000 ≤ YYYY ≤ 2022
//		1 ≤ MM ≤ 12
//		MM이 한 자릿수인 경우 앞에 0이 붙습니다.
//		1 ≤ DD ≤ 28
//		DD가 한 자릿수인 경우 앞에 0이 붙습니다.
//		파기해야 할 개인정보가 하나 이상 존재하는 입력만 주어집니다.
		
//		String today = "2020.01.01";
//		String[] terms = {"Z 3", "D 5"};
//		String[] privacies = {"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"};
//		
//		System.out.println(Arrays.toString(lm.solution(today, terms, privacies)));

		
		
		
		
		
		//--------------------------------------------------------------------------
		
		
	
		
		
		
		//10. 크기가 작은 부분문자열
//		문제 설명
//		숫자로 이루어진 문자열 t와 p가 주어질 때, t에서 p와 길이가 같은 부분문자열 중에서, 이 부분문자열이 나타내는 수가 p가 나타내는 수보다 작거나 같은 것이 나오는 횟수를 return하는 함수 solution을 완성하세요.
//
//		예를 들어, t="3141592"이고 p="271" 인 경우, t의 길이가 3인 부분 문자열은 314, 141, 415, 159, 592입니다. 이 문자열이 나타내는 수 중 271보다 작거나 같은 수는 141, 159 2개 입니다.
//
//		제한사항
//		1 ≤ p의 길이 ≤ 18
//		p의 길이 ≤ t의 길이 ≤ 10,000
//		t와 p는 숫자로만 이루어진 문자열이며, 0으로 시작하지 않습니다.
		
//		String t = "10203";
//		String p = "15";
//		
//		System.out.println(lm.solution(t, p));

		
		
		
		
		
		//--------------------------------------------------------------------------
		
		
		
		
		
		
		//11. 가장 가까운 같은 글자
//		문제 설명
//		문자열 s가 주어졌을 때, s의 각 위치마다 자신보다 앞에 나왔으면서, 자신과 가장 가까운 곳에 있는 같은 글자가 어디 있는지 알고 싶습니다.
//		예를 들어, s="banana"라고 할 때,  각 글자들을 왼쪽부터 오른쪽으로 읽어 나가면서 다음과 같이 진행할 수 있습니다.
//
//		b는 처음 나왔기 때문에 자신의 앞에 같은 글자가 없습니다. 이는 -1로 표현합니다.
//		a는 처음 나왔기 때문에 자신의 앞에 같은 글자가 없습니다. 이는 -1로 표현합니다.
//		n은 처음 나왔기 때문에 자신의 앞에 같은 글자가 없습니다. 이는 -1로 표현합니다.
//		a는 자신보다 두 칸 앞에 a가 있습니다. 이는 2로 표현합니다.
//		n도 자신보다 두 칸 앞에 n이 있습니다. 이는 2로 표현합니다.
//		a는 자신보다 두 칸, 네 칸 앞에 a가 있습니다. 이 중 가까운 것은 두 칸 앞이고, 이는 2로 표현합니다.
//		따라서 최종 결과물은 [-1, -1, -1, 2, 2, 2]가 됩니다.
//
//		문자열 s이 주어질 때, 위와 같이 정의된 연산을 수행하는 함수 solution을 완성해주세요.
//
//		제한사항
//		1 ≤ s의 길이 ≤ 10,000
//		s은 영어 소문자로만 이루어져 있습니다.
	
//		String s = "foobaf";
//		
//		System.out.println(Arrays.toString(lm.solution(s)));

		
		
		
		
		
		//--------------------------------------------------------------------------
		
		
		
		
		
		//12. 문자열 나누기
//		문제 설명
//		문자열 s가 입력되었을 때 다음 규칙을 따라서 이 문자열을 여러 문자열로 분해하려고 합니다.
//
//		먼저 첫 글자를 읽습니다. 이 글자를 x라고 합시다.
//		이제 이 문자열을 왼쪽에서 오른쪽으로 읽어나가면서, x와 x가 아닌 다른 글자들이 나온 횟수를 각각 셉니다. 처음으로 두 횟수가 같아지는 순간 멈추고, 지금까지 읽은 문자열을 분리합니다.
//		s에서 분리한 문자열을 빼고 남은 부분에 대해서 이 과정을 반복합니다. 남은 부분이 없다면 종료합니다.
//		만약 두 횟수가 다른 상태에서 더 이상 읽을 글자가 없다면, 역시 지금까지 읽은 문자열을 분리하고, 종료합니다.
//		문자열 s가 매개변수로 주어질 때, 위 과정과 같이 문자열들로 분해하고, 분해한 문자열의 개수를 return 하는 함수 solution을 완성하세요.
//
//		제한사항
//		1 ≤ s의 길이 ≤ 10,000
//		s는 영어 소문자로만 이루어져 있습니다.
		
//		String s = "aaabbaccccabba";
//		
//		System.out.println(lm.solution(s));

		
		
		
		
		
		//--------------------------------------------------------------------------
	
	
	
		
		
		
		//13. 명예의 전당(1)
//		문제 설명
//		"명예의 전당"이라는 TV 프로그램에서는 매일 1명의 가수가 노래를 부르고, 시청자들의 문자 투표수로 가수에게 점수를 부여합니다. 
//		매일 출연한 가수의 점수가 지금까지 출연 가수들의 점수 중 상위 k번째 이내이면 해당 가수의 점수를 명예의 전당이라는 목록에 올려 기념합니다. 
//		즉 프로그램 시작 이후 초기에 k일까지는 모든 출연 가수의 점수가 명예의 전당에 오르게 됩니다. 
//		k일 다음부터는 출연 가수의 점수가 기존의 명예의 전당 목록의 k번째 순위의 가수 점수보다 더 높으면, 출연 가수의 점수가 명예의 전당에 오르게 되고 
//		기존의 k번째 순위의 점수는 명예의 전당에서 내려오게 됩니다.
//
//		이 프로그램에서는 매일 "명예의 전당"의 최하위 점수를 발표합니다. 
//		예를 들어, k = 3이고, 7일 동안 진행된 가수의 점수가 [10, 100, 20, 150, 1, 100, 200]이라면, 
//		명예의 전당에서 발표된 점수는 아래의 그림과 같이 [10, 10, 10, 20, 20, 100, 100]입니다.
//		명예의 전당 목록의 점수의 개수 k, 1일부터 마지막 날까지 출연한 가수들의 점수인 score가 주어졌을 때, 
//		매일 발표된 명예의 전당의 최하위 점수를 return하는 solution 함수를 완성해주세요.
//
//		제한사항
//		3 ≤ k ≤ 100
//		7 ≤ score의 길이 ≤ 1,000
//		0 ≤ score[i] ≤ 2,000
		
//		int k = 4;
//		int[] score = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};
//		
//		System.out.println(Arrays.toString(lm.solution(k, score)));

		
		
		
		
		
		//--------------------------------------------------------------------------
		
		
		
		
		
		
		//14. 기사단원의 무기
//		문제 설명
//		숫자나라 기사단의 각 기사에게는 1번부터 number까지 번호가 지정되어 있습니다. 기사들은 무기점에서 무기를 구매하려고 합니다.
//
//		각 기사는 자신의 기사 번호의 약수 개수에 해당하는 공격력을 가진 무기를 구매하려 합니다. 단, 이웃나라와의 협약에 의해 공격력의 제한수치를 정하고, 제한수치보다 큰 공격력을 가진 무기를 구매해야 하는 기사는 협약기관에서 정한 공격력을 가지는 무기를 구매해야 합니다.
//
//		예를 들어, 15번으로 지정된 기사단원은 15의 약수가 1, 3, 5, 15로 4개 이므로, 공격력이 4인 무기를 구매합니다. 만약, 이웃나라와의 협약으로 정해진 공격력의 제한수치가 3이고 제한수치를 초과한 기사가 사용할 무기의 공격력이 2라면, 15번으로 지정된 기사단원은 무기점에서 공격력이 2인 무기를 구매합니다. 무기를 만들 때, 무기의 공격력 1당 1kg의 철이 필요합니다. 그래서 무기점에서 무기를 모두 만들기 위해 필요한 철의 무게를 미리 계산하려 합니다.
//
//		기사단원의 수를 나타내는 정수 number와 이웃나라와 협약으로 정해진 공격력의 제한수치를 나타내는 정수 limit와 제한수치를 초과한 기사가 사용할 무기의 공격력을 나타내는 정수 power가 주어졌을 때, 무기점의 주인이 무기를 모두 만들기 위해 필요한 철의 무게를 return 하는 solution 함수를 완성하시오.
//
//		제한사항
//		1 ≤ number ≤ 100,000
//		2 ≤ limit ≤ 100
//		1 ≤ power ≤ limit
		
//		int number = 10;
//		int limit = 3;
//		int power = 2;
//		
//		System.out.println(lm.solution(number, limit, power));

		
		
		
		
		
		//--------------------------------------------------------------------------
		
		
		
		
		
		
		//15. 과일 장수
//		문제 설명
//		과일 장수가 사과 상자를 포장하고 있습니다. 사과는 상태에 따라 1점부터 k점까지의 점수로 분류하며, k점이 최상품의 사과이고 1점이 최하품의 사과입니다. 사과 한 상자의 가격은 다음과 같이 결정됩니다.
//
//		한 상자에 사과를 m개씩 담아 포장합니다.
//		상자에 담긴 사과 중 가장 낮은 점수가 p (1 ≤ p ≤ k)점인 경우, 사과 한 상자의 가격은 p * m 입니다.
//		과일 장수가 가능한 많은 사과를 팔았을 때, 얻을 수 있는 최대 이익을 계산하고자 합니다.(사과는 상자 단위로만 판매하며, 남는 사과는 버립니다)
//
//		예를 들어, k = 3, m = 4, 사과 7개의 점수가 [1, 2, 3, 1, 2, 3, 1]이라면, 다음과 같이 [2, 3, 2, 3]으로 구성된 사과 상자 1개를 만들어 판매하여 최대 이익을 얻을 수 있습니다.
//
//		(최저 사과 점수) x (한 상자에 담긴 사과 개수) x (상자의 개수) = 2 x 4 x 1 = 8
//		사과의 최대 점수 k, 한 상자에 들어가는 사과의 수 m, 사과들의 점수 score가 주어졌을 때, 과일 장수가 얻을 수 있는 최대 이익을 return하는 solution 함수를 완성해주세요.
//
//		제한사항
//		3 ≤ k ≤ 9
//		3 ≤ m ≤ 10
//		7 ≤ score의 길이 ≤ 1,000,000
//		1 ≤ score[i] ≤ k
//		이익이 발생하지 않는 경우에는 0을 return 해주세요.
		
//		int k = 4; 
//		int m = 3;
//		int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
//		
//		System.out.println(lm.solution(k, m, score));

		
		
		
		
		
		//--------------------------------------------------------------------------
		
		
		
		
		
		
		//16. 푸드 파이트 대회
//		문제 설명
//		수웅이는 매달 주어진 음식을 빨리 먹는 푸드 파이트 대회를 개최합니다. 이 대회에서 선수들은 1대 1로 대결하며, 매 대결마다 음식의 종류와 양이 바뀝니다. 대결은 준비된 음식들을 일렬로 배치한 뒤, 한 선수는 제일 왼쪽에 있는 음식부터 오른쪽으로, 다른 선수는 제일 오른쪽에 있는 음식부터 왼쪽으로 순서대로 먹는 방식으로 진행됩니다. 중앙에는 물을 배치하고, 물을 먼저 먹는 선수가 승리하게 됩니다.
//
//		이때, 대회의 공정성을 위해 두 선수가 먹는 음식의 종류와 양이 같아야 하며, 음식을 먹는 순서도 같아야 합니다. 또한, 이번 대회부터는 칼로리가 낮은 음식을 먼저 먹을 수 있게 배치하여 선수들이 음식을 더 잘 먹을 수 있게 하려고 합니다. 이번 대회를 위해 수웅이는 음식을 주문했는데, 대회의 조건을 고려하지 않고 음식을 주문하여 몇 개의 음식은 대회에 사용하지 못하게 되었습니다.
//
//		예를 들어, 3가지의 음식이 준비되어 있으며, 칼로리가 적은 순서대로 1번 음식을 3개, 2번 음식을 4개, 3번 음식을 6개 준비했으며, 물을 편의상 0번 음식이라고 칭한다면, 두 선수는 1번 음식 1개, 2번 음식 2개, 3번 음식 3개씩을 먹게 되므로 음식의 배치는 "1223330333221"이 됩니다. 따라서 1번 음식 1개는 대회에 사용하지 못합니다.
//
//		수웅이가 준비한 음식의 양을 칼로리가 적은 순서대로 나타내는 정수 배열 food가 주어졌을 때, 대회를 위한 음식의 배치를 나타내는 문자열을 return 하는 solution 함수를 완성해주세요.
//
//		제한사항
//		2 ≤ food의 길이 ≤ 9
//		1 ≤ food의 각 원소 ≤ 1,000
//		food에는 칼로리가 적은 순서대로 음식의 양이 담겨 있습니다.
//		food[i]는 i번 음식의 수입니다.
//		food[0]은 수웅이가 준비한 물의 양이며, 항상 1입니다.
//		정답의 길이가 3 이상인 경우만 입력으로 주어집니다.
		
//		int[] food = {1,7,1,2};
//		
//		System.out.println(lm.solution(food));

		
		
		
		
		
		//--------------------------------------------------------------------------
	
		
		
		
		
		
		//17. 햄버거 만들기
//		문제 설명
//		햄버거 가게에서 일을 하는 상수는 햄버거를 포장하는 일을 합니다. 
//		함께 일을 하는 다른 직원들이 햄버거에 들어갈 재료를 조리해 주면 조리된 순서대로 상수의 앞에 아래서부터 위로 쌓이게 되고, 상수는 순서에 맞게 쌓여서 완성된 햄버거를 따로 옮겨 포장을 하게 됩니다. 
//		상수가 일하는 가게는 정해진 순서(아래서부터, 빵 – 야채 – 고기 - 빵)로 쌓인 햄버거만 포장을 합니다. 
//		상수는 손이 굉장히 빠르기 때문에 상수가 포장하는 동안 속 재료가 추가적으로 들어오는 일은 없으며, 재료의 높이는 무시하여 재료가 높이 쌓여서 일이 힘들어지는 경우는 없습니다.
//
//		예를 들어, 상수의 앞에 쌓이는 재료의 순서가 [야채, 빵, 빵, 야채, 고기, 빵, 야채, 고기, 빵]일 때, 상수는 여섯 번째 재료가 쌓였을 때, 
//		세 번째 재료부터 여섯 번째 재료를 이용하여 햄버거를 포장하고, 아홉 번째 재료가 쌓였을 때, 두 번째 재료와 일곱 번째 재료부터 아홉 번째 재료를 이용하여 햄버거를 포장합니다. 
//		즉, 2개의 햄버거를 포장하게 됩니다.
//
//		상수에게 전해지는 재료의 정보를 나타내는 정수 배열 ingredient가 주어졌을 때, 상수가 포장하는 햄버거의 개수를 return 하도록 solution 함수를 완성하시오.
//
//		제한사항
//		1 ≤ ingredient의 길이 ≤ 1,000,000
//		ingredient의 원소는 1, 2, 3 중 하나의 값이며, 순서대로 빵, 야채, 고기를 의미합니다.
		
//		int[] ingredient = {2,1,1,2,3,1,2,3,1};
//		
//		System.out.println(lm.solution(ingredient));

		
		
		
		
		
		//--------------------------------------------------------------------------
		
		
	
		
		
		
		//18. 콜라 문제
//		문제 설명
//		오래전 유행했던 콜라 문제가 있습니다. 콜라 문제의 지문은 다음과 같습니다.
//
//		정답은 아무에게도 말하지 마세요.
//
//		콜라 빈 병 2개를 가져다주면 콜라 1병을 주는 마트가 있다. 빈 병 20개를 가져다주면 몇 병을 받을 수 있는가?
//
//		단, 보유 중인 빈 병이 2개 미만이면, 콜라를 받을 수 없다.
//
//		문제를 풀던 상빈이는 콜라 문제의 완벽한 해답을 찾았습니다. 상빈이가 푼 방법은 아래 그림과 같습니다. 
//		우선 콜라 빈 병 20병을 가져가서 10병을 받습니다. 받은 10병을 모두 마신 뒤, 가져가서 5병을 받습니다. 5병 중 4병을 모두 마신 뒤 가져가서 2병을 받고, 또 2병을 모두 마신 뒤 가져가서 1병을 받습니다. 
//		받은 1병과 5병을 받았을 때 남은 1병을 모두 마신 뒤 가져가면 1병을 또 받을 수 있습니다. 이 경우 상빈이는 총 10 + 5 + 2 + 1 + 1 = 19병의 콜라를 받을 수 있습니다.
//		문제를 열심히 풀던 상빈이는 일반화된 콜라 문제를 생각했습니다. 이 문제는 빈 병 a개를 가져다주면 콜라 b병을 주는 마트가 있을 때, 빈 병 n개를 가져다주면 몇 병을 받을 수 있는지 계산하는 문제입니다. 기존 콜라 문제와 마찬가지로, 보유 중인 빈 병이 a개 미만이면, 추가적으로 빈 병을 받을 순 없습니다. 상빈이는 열심히 고심했지만, 일반화된 콜라 문제의 답을 찾을 수 없었습니다. 상빈이를 도와, 일반화된 콜라 문제를 해결하는 프로그램을 만들어 주세요.
//
//		콜라를 받기 위해 마트에 주어야 하는 병 수 a, 빈 병 a개를 가져다 주면 마트가 주는 콜라 병 수 b, 상빈이가 가지고 있는 빈 병의 개수 n이 매개변수로 주어집니다. 상빈이가 받을 수 있는 콜라의 병 수를 return 하도록 solution 함수를 작성해주세요.
//
//		제한사항
//		1 ≤ b < a ≤ n ≤ 1,000,000
//		정답은 항상 int 범위를 넘지 않게 주어집니다.
		
//		int a = 3;
//		int b = 1;
//		int n = 20;
//		
//		System.out.println(lm.solution(a, b, n));

		
		
		
		
		
		//--------------------------------------------------------------------------
		
		
		
		
		
		
		//19. 삼총사
//		문제 설명
//		한국중학교에 다니는 학생들은 각자 정수 번호를 갖고 있습니다. 이 학교 학생 3명의 정수 번호를 더했을 때 0이 되면 3명의 학생은 삼총사라고 합니다. 
//		예를 들어, 5명의 학생이 있고, 각각의 정수 번호가 순서대로 -2, 3, 0, 2, -5일 때, 첫 번째, 세 번째, 네 번째 학생의 정수 번호를 더하면 0이므로 세 학생은 삼총사입니다. 또한, 두 번째, 네 번째, 다섯 번째 학생의 정수 번호를 더해도 0이므로 세 학생도 삼총사입니다. 따라서 이 경우 한국중학교에서는 두 가지 방법으로 삼총사를 만들 수 있습니다.
//
//		한국중학교 학생들의 번호를 나타내는 정수 배열 number가 매개변수로 주어질 때, 학생들 중 삼총사를 만들 수 있는 방법의 수를 return 하도록 solution 함수를 완성하세요.
//
//		제한사항
//		3 ≤ number의 길이 ≤ 13
//		-1,000 ≤ number의 각 원소 ≤ 1,000
//		서로 다른 학생의 정수 번호가 같을 수 있습니다.
		
//		int[] number = {-1,1,-1,1};
//		
//		System.out.println(lm.solution(number));

		
		
		
		
		
		//--------------------------------------------------------------------------
		
		
		
		
		
		//20. 숫자 짝꿍
//		문제 설명
//		두 정수 X, Y의 임의의 자리에서 공통으로 나타나는 정수 k(0 ≤ k ≤ 9)들을 이용하여 만들 수 있는 가장 큰 정수를 두 수의 짝꿍이라 합니다(단, 공통으로 나타나는 정수 중 서로 짝지을 수 있는 숫자만 사용합니다). X, Y의 짝꿍이 존재하지 않으면, 짝꿍은 -1입니다. X, Y의 짝꿍이 0으로만 구성되어 있다면, 짝꿍은 0입니다.
//
//		예를 들어, X = 3403이고 Y = 13203이라면, X와 Y의 짝꿍은 X와 Y에서 공통으로 나타나는 3, 0, 3으로 만들 수 있는 가장 큰 정수인 330입니다. 다른 예시로 X = 5525이고 Y = 1255이면 X와 Y의 짝꿍은 X와 Y에서 공통으로 나타나는 2, 5, 5로 만들 수 있는 가장 큰 정수인 552입니다(X에는 5가 3개, Y에는 5가 2개 나타나므로 남는 5 한 개는 짝 지을 수 없습니다.)
//		두 정수 X, Y가 주어졌을 때, X, Y의 짝꿍을 return하는 solution 함수를 완성해주세요.
//
//		제한사항
//		3 ≤ X, Y의 길이(자릿수) ≤ 3,000,000입니다.
//		X, Y는 0으로 시작하지 않습니다.
//		X, Y의 짝꿍은 상당히 큰 정수일 수 있으므로, 문자열로 반환합니다.
		
//		String X = "5525";
//		String Y = "1255";
//		
//		System.out.println(lm.solution(X, Y));

		
		
		
		
		
		//--------------------------------------------------------------------------
		
		
		
		
		
		
		//21. 성격 유형 검사하기
//		문제 설명
//		나만의 카카오 성격 유형 검사지를 만들려고 합니다.
//		성격 유형 검사는 다음과 같은 4개 지표로 성격 유형을 구분합니다. 성격은 각 지표에서 두 유형 중 하나로 결정됩니다.
//
//		지표 번호	성격 유형
//		1번 지표	라이언형(R), 튜브형(T)
//		2번 지표	콘형(C), 프로도형(F)
//		3번 지표	제이지형(J), 무지형(M)
//		4번 지표	어피치형(A), 네오형(N)
//		4개의 지표가 있으므로 성격 유형은 총 16(=2 x 2 x 2 x 2)가지가 나올 수 있습니다. 예를 들어, "RFMN"이나 "TCMA"와 같은 성격 유형이 있습니다.
//
//		검사지에는 총 n개의 질문이 있고, 각 질문에는 아래와 같은 7개의 선택지가 있습니다.
//
//		매우 비동의
//		비동의
//		약간 비동의
//		모르겠음
//		약간 동의
//		동의
//		매우 동의
//		각 질문은 1가지 지표로 성격 유형 점수를 판단합니다.
//
//		예를 들어, 어떤 한 질문에서 4번 지표로 아래 표처럼 점수를 매길 수 있습니다.
//
//		선택지	성격 유형 점수
//		매우 비동의	네오형 3점
//		비동의	네오형 2점
//		약간 비동의	네오형 1점
//		모르겠음	어떤 성격 유형도 점수를 얻지 않습니다
//		약간 동의	어피치형 1점
//		동의	어피치형 2점
//		매우 동의	어피치형 3점
//		이때 검사자가 질문에서 약간 동의 선택지를 선택할 경우 어피치형(A) 성격 유형 1점을 받게 됩니다. 만약 검사자가 매우 비동의 선택지를 선택할 경우 네오형(N) 성격 유형 3점을 받게 됩니다.
//
//		위 예시처럼 네오형이 비동의, 어피치형이 동의인 경우만 주어지지 않고, 질문에 따라 네오형이 동의, 어피치형이 비동의인 경우도 주어질 수 있습니다.
//		하지만 각 선택지는 고정적인 크기의 점수를 가지고 있습니다.
//
//		매우 동의나 매우 비동의 선택지를 선택하면 3점을 얻습니다.
//		동의나 비동의 선택지를 선택하면 2점을 얻습니다.
//		약간 동의나 약간 비동의 선택지를 선택하면 1점을 얻습니다.
//		모르겠음 선택지를 선택하면 점수를 얻지 않습니다.
//		검사 결과는 모든 질문의 성격 유형 점수를 더하여 각 지표에서 더 높은 점수를 받은 성격 유형이 검사자의 성격 유형이라고 판단합니다. 단, 하나의 지표에서 각 성격 유형 점수가 같으면, 두 성격 유형 중 사전 순으로 빠른 성격 유형을 검사자의 성격 유형이라고 판단합니다.
//
//		질문마다 판단하는 지표를 담은 1차원 문자열 배열 survey와 검사자가 각 질문마다 선택한 선택지를 담은 1차원 정수 배열 choices가 매개변수로 주어집니다. 이때, 검사자의 성격 유형 검사 결과를 지표 번호 순서대로 return 하도록 solution 함수를 완성해주세요.
//
//		제한사항
//		1 ≤ survey의 길이 ( = n) ≤ 1,000
//		survey의 원소는 "RT", "TR", "FC", "CF", "MJ", "JM", "AN", "NA" 중 하나입니다.
//		survey[i]의 첫 번째 캐릭터는 i+1번 질문의 비동의 관련 선택지를 선택하면 받는 성격 유형을 의미합니다.
//		survey[i]의 두 번째 캐릭터는 i+1번 질문의 동의 관련 선택지를 선택하면 받는 성격 유형을 의미합니다.
//		choices의 길이 = survey의 길이
//
//		choices[i]는 검사자가 선택한 i+1번째 질문의 선택지를 의미합니다.
//		1 ≤ choices의 원소 ≤ 7
		
//		String[] survey = {"TR", "RT", "TR"};
//		int[] choices = {7,1,3};
//		
//		System.out.println(lm.solution(survey, choices));

		
		
		
		
		
		//--------------------------------------------------------------------------
		
		
		
		
		
		
		//22. 신고 결과 받기 
//		문제 설명
//		신입사원 무지는 게시판 불량 이용자를 신고하고 처리 결과를 메일로 발송하는 시스템을 개발하려 합니다. 무지가 개발하려는 시스템은 다음과 같습니다.
//
//		각 유저는 한 번에 한 명의 유저를 신고할 수 있습니다.
//		신고 횟수에 제한은 없습니다. 서로 다른 유저를 계속해서 신고할 수 있습니다.
//		한 유저를 여러 번 신고할 수도 있지만, 동일한 유저에 대한 신고 횟수는 1회로 처리됩니다.
//		k번 이상 신고된 유저는 게시판 이용이 정지되며, 해당 유저를 신고한 모든 유저에게 정지 사실을 메일로 발송합니다.
//		유저가 신고한 모든 내용을 취합하여 마지막에 한꺼번에 게시판 이용 정지를 시키면서 정지 메일을 발송합니다.
//		다음은 전체 유저 목록이 ["muzi", "frodo", "apeach", "neo"]이고, k = 2(즉, 2번 이상 신고당하면 이용 정지)인 경우의 예시입니다.
//
//		유저 ID	유저가 신고한 ID	설명
//		"muzi"	"frodo"	"muzi"가 "frodo"를 신고했습니다.
//		"apeach"	"frodo"	"apeach"가 "frodo"를 신고했습니다.
//		"frodo"	"neo"	"frodo"가 "neo"를 신고했습니다.
//		"muzi"	"neo"	"muzi"가 "neo"를 신고했습니다.
//		"apeach"	"muzi"	"apeach"가 "muzi"를 신고했습니다.
//		각 유저별로 신고당한 횟수는 다음과 같습니다.
//
//		유저 ID	신고당한 횟수
//		"muzi"	1
//		"frodo"	2
//		"apeach"	0
//		"neo"	2
//		위 예시에서는 2번 이상 신고당한 "frodo"와 "neo"의 게시판 이용이 정지됩니다. 이때, 각 유저별로 신고한 아이디와 정지된 아이디를 정리하면 다음과 같습니다.
//
//		유저 ID	유저가 신고한 ID	정지된 ID
//		"muzi"	["frodo", "neo"]	["frodo", "neo"]
//		"frodo"	["neo"]	["neo"]
//		"apeach"	["muzi", "frodo"]	["frodo"]
//		"neo"	없음	없음
//		따라서 "muzi"는 처리 결과 메일을 2회, "frodo"와 "apeach"는 각각 처리 결과 메일을 1회 받게 됩니다.
//
//		이용자의 ID가 담긴 문자열 배열 id_list, 각 이용자가 신고한 이용자의 ID 정보가 담긴 문자열 배열 report, 정지 기준이 되는 신고 횟수 k가 매개변수로 주어질 때, 각 유저별로 처리 결과 메일을 받은 횟수를 배열에 담아 return 하도록 solution 함수를 완성해주세요.
//
//		제한사항
//		2 ≤ id_list의 길이 ≤ 1,000
//		1 ≤ id_list의 원소 길이 ≤ 10
//		id_list의 원소는 이용자의 id를 나타내는 문자열이며 알파벳 소문자로만 이루어져 있습니다.
//		id_list에는 같은 아이디가 중복해서 들어있지 않습니다.
//		1 ≤ report의 길이 ≤ 200,000
//		3 ≤ report의 원소 길이 ≤ 21
//		report의 원소는 "이용자id 신고한id"형태의 문자열입니다.
//		예를 들어 "muzi frodo"의 경우 "muzi"가 "frodo"를 신고했다는 의미입니다.
//		id는 알파벳 소문자로만 이루어져 있습니다.
//		이용자id와 신고한id는 공백(스페이스)하나로 구분되어 있습니다.
//		자기 자신을 신고하는 경우는 없습니다.
//		1 ≤ k ≤ 200, k는 자연수입니다.
//		return 하는 배열은 id_list에 담긴 id 순서대로 각 유저가 받은 결과 메일 수를 담으면 됩니다.
		
//		String[] id_list = {"con", "ryan"};
//		String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
//		int k = 3;
//		
//		System.out.println(Arrays.toString(lm.solution(id_list, report, k)));

		
		
		
		
		
		//--------------------------------------------------------------------------
		
		
		
		
		
		
		//23. 나머지가 1이 되는 수 찾기
//		문제 설명
//		자연수 n이 매개변수로 주어집니다. n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 x를 return 하도록 solution 함수를 완성해주세요. 답이 항상 존재함은 증명될 수 있습니다.
//
//		제한사항
//		3 ≤ n ≤ 1,000,000
		
//		int n = 12;
//		
//		System.out.println(lm.solution(n));

		
		
		
		
		
		//--------------------------------------------------------------------------
		
		
		
		
		
		
		//24. 최소직사각형
//		문제 설명
//		명함 지갑을 만드는 회사에서 지갑의 크기를 정하려고 합니다. 다양한 모양과 크기의 명함들을 모두 수납할 수 있으면서, 작아서 들고 다니기 편한 지갑을 만들어야 합니다. 이러한 요건을 만족하는 지갑을 만들기 위해 디자인팀은 모든 명함의 가로 길이와 세로 길이를 조사했습니다.
//
//		아래 표는 4가지 명함의 가로 길이와 세로 길이를 나타냅니다.
//
//		명함 번호	가로 길이	세로 길이
//		1	60	50
//		2	30	70
//		3	60	30
//		4	80	40
//		가장 긴 가로 길이와 세로 길이가 각각 80, 70이기 때문에 80(가로) x 70(세로) 크기의 지갑을 만들면 모든 명함들을 수납할 수 있습니다. 하지만 2번 명함을 가로로 눕혀 수납한다면 80(가로) x 50(세로) 크기의 지갑으로 모든 명함들을 수납할 수 있습니다. 이때의 지갑 크기는 4000(=80 x 50)입니다.
//
//		모든 명함의 가로 길이와 세로 길이를 나타내는 2차원 배열 sizes가 매개변수로 주어집니다. 모든 명함을 수납할 수 있는 가장 작은 지갑을 만들 때, 지갑의 크기를 return 하도록 solution 함수를 완성해주세요.
//
//		제한사항
//		sizes의 길이는 1 이상 10,000 이하입니다.
//		sizes의 원소는 [w, h] 형식입니다.
//		w는 명함의 가로 길이를 나타냅니다.
//		h는 명함의 세로 길이를 나타냅니다.
//		w와 h는 1 이상 1,000 이하인 자연수입니다.
		
//		int[][] sizes = {{14,4},{19,6},{6,16},{18,7},{7,11}};
//		
//		System.out.println(lm.solution(sizes));

		
		
		
		
		
		//--------------------------------------------------------------------------

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	}
}