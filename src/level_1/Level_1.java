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
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}