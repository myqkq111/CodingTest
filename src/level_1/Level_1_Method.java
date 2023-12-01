package level_1;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.IntFunction;

public class Level_1_Method {
	
	//1. 달리기 경주 
//	public String[] solution(String[] players, String[] callings) {
//		
//		String name;
//		
//		for(int i = 0; i < callings.length; i++) {
//			for(int j = 0; j < players.length; j++) {
//				if(callings[i].equals(players[j])) {
//					name = players[j-1];
//					players[j-1] = players[j];
//					players[j] = name;
//				}
//			}
//		}
//		return players;
//	}
	
	//배열의 위치만 바꾸면 되는 간단한 문제다.
	//원래 자리에 있던 원소를 String에 담아 저장한 뒤 자리를 바꾸는데 String에 계속 새로운 값을 넣어주면 버리는 데이터가 그만큼 생기기 때문에
	//List를 사용해도 괜찮을 거 같다.
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	
	//2. 추억 점수
//	public int[] solution(String[] name, int[] yearning, String[][] photo) {
//		
//		int[] res = new int[photo.length];
//		
//		for(int i = 0; i < photo.length; i++) {
//			int sum = 0;
//			for(int j = 0; j < photo[i].length; j++) {
//				for(int f = 0; f < name.length; f++) {
//					if(name[f].equals(photo[i][j])) {
//						sum += yearning[f];
//					}
//				}
//			}
//			res[i] = sum;
//		}
//		return res;
//	}
	
	//이름과 점수의 index가 같다는걸 이용하여 3중 for문을 돌려주면 간단히 풀 수 있는 문제다. 
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	
	//3. 공원 산책
//	public int[] solution(String[] park, String[] routes) {
//		
//		int[] res = new int[2];
//
//		for(int i = 0; i < park.length; i++) { //시작 지점 구하기
//			if(park[i].contains("S")) {
//				int idx = park[i].indexOf("S");
//				res[0] = i; 
//				res[1] = idx;
//			}
//		}
//		
//		w:for(int i = 0; i < routes.length; i++) { //이동
//			String[] way = routes[i].split(" ");
//			int y;
//			
//			switch(way[0]) {
//			case "N":
//				y = res[0] - Integer.parseInt(way[1]);
//				
//				if(y >= 0) {
//					for(int j = res[0]-1; j >= y; j--) {
//						if('X' == park[j].charAt(res[1])) {
//							continue w;
//						}
//					}
//				} else {
//					continue w;
//				}				
//				res[0] = y;	
//				break;
//				
//			case "S":
//				y = res[0] + Integer.parseInt(way[1]);
//				
//				if(y < park.length) {
//					for(int j = res[0]+1; j <= y; j++) {
//						if('X' == park[j].charAt(res[1])) {
//							continue w;
//						}
//					}
//				} else {
//					continue w;
//				}				
//				res[0] = y;	
//				break;
//				
//			case "W":
//				y = res[1] - Integer.parseInt(way[1]);
//				
//				if(y >= 0) {
//					for(int j = res[1]-1; j >= y; j--) {
//						if('X' == park[res[0]].charAt(j)) {
//							continue w;
//						}
//					}
//				} else {
//					continue w;
//				}				
//				res[1] = y;	
//				break;
//				
//			case "E":
//				y = res[1] + Integer.parseInt(way[1]);
//				
//				if(y < park[0].length()) {
//					for(int j = res[1]+1; j <= y; j++) {
//						if('X' == park[res[0]].charAt(j)) {
//							continue w;
//						}
//					}
//				} else {
//					continue w;
//				}				
//				res[1] = y;	
//				break;
//			}		
//		}
//		return res;
//	}

	//시작 지점의 index부터 구하고 switch문을 사용해 각각의 방향에 대한 조건을 충족한다면 이동을 시키는 방식으로 작성했다.
	//각각의 방향에 대한 조건은 공통적으로 가고싶은 칸만큼 공간이 있는지부터 확인하고 가는길에 장애물이 있는지 확인한다.
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	
	//4. 바탕화면 정리
//	public int[] solution(String[] wallpaper) {
//			
//		int lux = wallpaper.length;
//		int luy = wallpaper[0].length();
//		int rdx = 0;
//		int rdy = 0;
//		
//		for(int i = 0; i < wallpaper.length; i++) {
//			for(int j = 0; j < wallpaper[i].length(); j++) {
//				if(wallpaper[i].charAt(j) == '#') {
//					if(lux > i) {
//						lux = i;
//					}
//					if(luy > j) {
//						luy = j;
//					}
//					if(rdx < i+1) {
//						rdx = i+1;
//					}
//					if(rdy < j+1) {
//						rdy = j+1;
//					}
//				}
//			}
//		}	
//		int[] res = {lux, luy, rdx, rdy};
//		
//		return res;
//	}

	//복잡해 보이지만 가장 위,아래,왼쪽,오른쪽에 있는 파일의 index를 구하면 되는 간단한 문제다.
	//끝점인 아래와 오른쪽 index는 +1을 해줘야한다.
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	
	//5. 덧칠하기
//	public int solution(int n, int m, int[] section) {
//		
//		List<Integer> list = new ArrayList<Integer>();
//		
//		for(int i = 0; i < section.length; i++) {
//			list.add(section[i]);
//		}
//		
//		int res = 0;
//		
//		while(list.size() != 0) {
//			int min = list.get(0);
//			int size = list.size();
//			w:for(int i = size-1; i >= 0; i--) {
//				for(int j = min; j < min + m; j++) {
//					if(list.get(i) == j) {
//						list.remove(i);
//						continue w;
//					}
//				}
//			}
//			res++;
//		}
//		return res;
//	}

	//배열의 원소중에 가장 작은 수부터 m개의 숫자가 배열에 있다면 해당 원소를 삭제하고 몇변을 반복했는지를 통해 결과값을 가져왔다.
	//해당되는 원소를 삭제한뒤 continue를 사용해주지 않으면 index문제로 오류가 뜬다.
	//그리고 배열 뒤 원소부터 삭제를 해줘야 index문제로 오류가 뜨지 않는다.
	
	
	//--------------------------------------------------------------------------

	
	
	
	
	
	//6. 대충 만든 자판
//	public int[] solution(String[] keymap, String[] targets) {
//		
//		int[] res = new int[targets.length];
//		
//		w:for(int i = 0; i < targets.length; i++) {
//			int click = 0;
//			for(int j = 0; j < targets[i].length(); j++) {
//				int su1 = 0;
//				for(int f = 0; f < keymap.length; f++) {
//					if(keymap[f].contains(Character.toString(targets[i].charAt(j) ))) {
//						int su2 = keymap[f].indexOf(targets[i].charAt(j))+1;
//						if(su1 == 0 || su1 > su2) {
//							su1 = su2;
//						}
//					}
//				}
//				if(su1 == 0) {
//					res[i] = -1;
//					continue w;
//				} else {
//					res[i] += su1;
//				}
//			}
//		}
//		return res;
//	}

	//3중 for문을 사용해 targets배열의 원소를 한글자씩 가져와 비교하여 작성할 수 있는 가장 적은 수를 찾아내는 방식으로 작성했다. 
	//만약 작성할 수 없는 문자가 있다면 해당 원소는 작성할 수 없으므로 -1값을 준다. 
	//3중 for문이라 복잡해 보일 수 있지만 간단한 문제였다.
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	
	//7. 카드 뭉치
//	public String solution(String[] cards1, String[] cards2, String[] goal) {
//		
//		String res = "Yes";
//		int ca1 = 0;
//		int ca2 = 0;
//		
//		w:for(int i = 0; i < goal.length; i++) {
//			for(int j = ca1; j < cards1.length; j++) {
//				if(goal[i].equals(cards1[j])) {
//					ca1++;
//					continue w;
//				}
//				break;
//			}
//			for(int j = ca2; j < cards2.length; j++) {
//				if(goal[i].equals(cards2[j])) {
//					ca2++;
//					continue w;
//				}
//				break;
//			}
//			res = "No";
//			break;
//		}
//		return res;
//	}

	//for문 안에 if 조건이 참이라면 continue로 다음 원소로 가고 거짓이라면 break로 한번만 반복할 수 있게 작성했다.
	//그렇게 for문안에 두개의 for문을 겨쳐 맨밑으로 오게 된다면 일치하는 원소가 없어 문장을 완성시킬 수 없다는 뜻이므로 No값이 들어가게 된다.
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	//8. 둘만의 암호
//	public String solution(String s, String skip, int index) {
//		
//		StringBuffer sb = new StringBuffer(s);
//		
//		for(int i = 0; i < sb.length(); i++) {
//			for(int j = 0; j < index;) {
//				
//				char next = sb.charAt(i);
//				
//				if(next + 1 > 'z') {
//					sb.setCharAt(i, 'a');
//				} else {
//					sb.setCharAt(i, ++next);
//				}
//				
//				if(skip.contains(Character.toString(sb.charAt(i)))) {
//					continue;
//				}
//				
//				j++;
//			}//for
//		}//for
//		String res = sb.toString();
//		
//		return res;
//	}

	//아스키코드를 이용하면 간단하게 풀 수 있는 문제다.
	//다음 알파벳이 skip문자열에 포함이 되어있으면 반복횟수를 증가시키지 않고 다음 알파벳으로 가도록 작성했다.
	//주의할 점으로 다음 알파벳을 넣을때 선행증감을 해줘야한다. 후행증감을 사용하면 알파벳이 바뀌지않는다. 
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	
	//9. 개인정보 수집 유효기간
//	public int[] solution(String today, String[] terms, String[] privacies) {
//		
//		List<Integer> list = new ArrayList<Integer>();
//		
//		for(int i = 0; i < terms.length; i++) {
//			w:for(int j = 0; j < privacies.length; j++) {
//				String[] arr = terms[i].split(" ");
//			
//				if(privacies[j].contains(arr[0])) {
//					String[] array = privacies[j].substring(0, 10).replace('.', ' ').split(" ");
//			
//					int month = Integer.parseInt(arr[1]) + Integer.parseInt(array[1]);
//					
//					if(month > 12) {
//						int year = Integer.parseInt(array[0]);
//						array[0] = Integer.toString(year + 1);
//						array[1] = Integer.toString(month % 12);
//					} else {
//						array[1] = Integer.toString(month);
//					}
//					
//					String[] todayArr = today.replace('.', ' ').split(" ");
//			
//					for(int f = 0; f < 3; f++) {
//						if(Integer.parseInt(todayArr[f]) > Integer.parseInt(array[f]))  {
//							list.add(j+1);
//							continue w;
//						} else if(Integer.parseInt(todayArr[f]) < Integer.parseInt(array[f])){
//							continue w;
//						} 
//					}//for f
//					list.add(j+1);
//				}//if	
//				
//			}//for j
//		}//for i
//		
//		int[] res = new int[list.size()]; 
//		
//		for(int i = 0; i < list.size(); i++) {
//			res[i] = list.get(i);
//		}	
//		Arrays.sort(res);
//		
//		return res;
//	}

	//split메서드와 Integer.parseInt를 많이 사용한 거 같다.
	//날짜 관련 객체와 메서드를 알고있었다면 쉬웠을텐데 어렵게 풀어낸거 같다.
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	
	//10. 크기가 작은 부분문자열
//	public int solution(String t, String p) {
//		
//		int res = 0;
//		
//		for(int i = 0; i < t.length()-p.length()+1; i++) {
//			String sub = t.substring(i, i+p.length());
//			
//			if(Integer.parseInt(sub) <= Integer.parseInt(p)) {
//				res++;
//			}
//		} 
//		return res;
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	
	//11. 가장 가까운 같은 글자
//	public int[] solution(String s) {
//		
//		int[] res = new int[s.length()];
//		
//		w:for(int i = 0; i < s.length(); i++) {
//			for(int j = s.length()-1; j >= 0; j--) {
//				if(i != j && i > j) {
//					if(s.charAt(i) == s.charAt(j)) {
//						res[i] = i-j;
//						continue w;
//					}
//				}
//			}
//			res[i] = -1;
//		}
//		return res;
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	
	//12. 문자열 나누기
//	public int solution(String s) {
//		
//		int res = 0;
//		int tr = 0;
//		int fa = 0;
//		char x = s.charAt(0);
//		
//		for(int i = 0; i < s.length(); i++) {
//			if(x == s.charAt(i)) {
//				tr++;
//			}else {
//				fa++;
//			}
//			
//			if(s.length()-1 > i && tr == fa) {
//				x = s.charAt(i+1);
//				res++;
//			} else if(tr == fa) {
//				res++;
//			} else if(s.length()-1 == i) {
//				res++;
//			}
//		}
//		return res;
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	
	//13. 명예의 전당(1)
//	public int[] solution(int k, int[] score) {
//		
//		Integer[] rank = new Integer[k];
//		int[] res = new int[score.length];
//		
//		for(int i = 0; i < k; i++) {
//			rank[i] = 0;
//		}
//		
//		for(int i = 0; i < score.length; i++) {
//			
//			if(i < k) {
//				rank[i] = score[i];
//				Arrays.sort(rank, Collections.reverseOrder());
//				res[i] = rank[i];
//				continue;
//			}
//			
//			Arrays.sort(rank);
//			
//			if(rank[0] < score[i]) {
//				rank[0] = score[i];
//				Arrays.sort(rank);
//			}
//			res[i] = rank[0];
//		}
//		return res;
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	
	//14. 기사단원의 무기
//	public int solution(int number, int limit, int power) {
//		
//		int res = 0;
//		
//		for(int i = 1; i <= number; i++) {
//			int at = 0;
//			for(int j = 1; j <= i; j++) {
//				if(i % j == 0) {
//					at++;
//				}
//			}
//			if(at > limit) {
//				at = power;
//			}
//			res += at;
//		}
//		return res;
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	
	//15. 과일 장수
//	public int solution(int k, int m, int[] score) {
//		
//		int res = 0;
//		List<Integer> list = new ArrayList<Integer>();
//		Arrays.sort(score);
//		
//		for(int i = score.length-1; i >= 0; i--) {
//			list.add(score[i]);
//			
//			if(list.size() == m) {
//				int a = k;
//				for(int j = 0; j < m; j++) {
//					if(list.get(j) < a) {
//						a = list.get(j);
//					}
//				}
//				res += a*m;
//				list.clear();
//			}
//		}
//		return res;
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	
	//16. 푸드 파이트 대회
//	public String solution(int[] food) {
//		
//		String res = "";
//		
//		for(int i = 1; i < food.length; i++) {
//			int su = food[i] / 2;
//	
//			for(int j = 0; j < su; j++) {
//				res += i;
//			}
//		}
//		
//		res += 0;
//		
//		for(int i = food.length-1; i > 0; i--) {
//			int su = food[i] / 2;
//			
//			for(int j = 0; j < su; j++) {
//				res += i;
//			}
//		}
//		return res;
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	
	//17. 햄버거 만들기
//	public int solution(int[] ingredient) {
//		int res = 0;
//		int material = 1;
//		
//		List<Integer> list = new ArrayList<Integer>();
//		
//		for(int i = 0; i < ingredient.length; i++) {
//			list.add(ingredient[i]);
//		}
//		
//		for(int i = 0; i < list.size();) {
//			if(list.get(i) == material) {
//				material++;
//				list.remove(i);
//				continue;
//			}
//			if(material == 4 && list.get(i) == 1) {
//				list.remove(i);
//				res++;
//				material = 1;
//				i = 0;
//				continue;
//			}
//			i++;
//		}
//		return res;
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	
	
	//18. 콜라 문제
//	public int solution(int a, int b, int n) {
//		
//		int res = 0;
//		
//		while(true) {
//			int su = n / a;
//			if(su <= 0) {
//				break;
//			}
//			n %= a;
//			n += (su * b);
//			res += (su * b);
//		}
//		return res;
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	
	//19. 삼총사
//	public int solution(int[] number) {
//		
//		int res = 0;
//		
//		for(int i = 0; i < number.length; i++) {
//			for(int j = 0; j < number.length; j++) {
//				if(i == j || i > j) {
//					continue;
//				}
//				for(int n = 0; n < number.length; n++) {
//					if(i == n || j == n || j > n) {
//						continue;
//					}				
//					if(number[i] + number[j] + number[n] == 0) {
//						res++;
//					}
//				}
//			}
//		}
//		return res;
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	
	//20. 숫자 짝꿍
//	public String solution(String X, String Y) {
//		
//		List<String> list = new ArrayList<String>();
//		
//		StringBuffer sbX = new StringBuffer(X);
//		StringBuffer sbY = new StringBuffer(Y);
//		
//		w:for(int i = sbX.length()-1; i >= 0; i--) {
//			for(int j = sbY.length()-1; j >= 0; j--) {
//				if(sbX.length() == 0 || sbY.length() == 0) {
//					break w;
//				}
//				
//				if(sbX.charAt(i) == sbY.charAt(j)) {
//					list.add(Character.toString(sbX.charAt(i)));
//					sbX.deleteCharAt(i);
//					sbY.deleteCharAt(j);
//					continue w;
//				}
//			}
//		}
//		
//		int zero = 0;
//		
//		for(int i = 0; i < list.size(); i++) {
//			if(!list.get(i).equals("0")) {
//				zero = 1;
//			}
//		}
//		
//		if(list.size() == 0) {
//			list.add("-1");
//		} else if(zero == 0){
//			list.clear();
//			list.add("0");
//		} else {
//			list.sort(Comparator.reverseOrder());
//		}		
//		
//		return list.toString();		
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	//21. 성격 유형 검사하기
//	public String solution(String[] survey, int[] choices) {
//		
//		String str = "RTCFJMAN";
//		int[] in = new int[8];
//		
//		int idx;
//		
//		for(int i = 0; i < survey.length; i++) {
//			switch(choices[i]) {
//			case 1:
//				idx = str.indexOf(survey[i].charAt(0));
//				in[idx]+=3;
//				break;
//			case 2:
//				idx = str.indexOf(survey[i].charAt(0));
//				in[idx]+=2;
//				break;
//			case 3:
//				idx = str.indexOf(survey[i].charAt(0));
//				in[idx]+=1;
//				break;
//			case 4:
//				break;
//			case 5:
//				idx = str.indexOf(survey[i].charAt(1));
//				in[idx]+=1;
//				break;
//			case 6:
//				idx = str.indexOf(survey[i].charAt(1));
//				in[idx]+=2;
//				break;
//			case 7:
//				idx = str.indexOf(survey[i].charAt(1));
//				in[idx]+=3;
//				break;
//			}
//		}
//		String res = "";
//		
//		for(int i = 0; i < 8; i+=2) {
//			if(in[i] == in[i+1]) {
//				if(str.charAt(i) < str.charAt(i+1)) {
//					res+=str.charAt(i);
//				} else {
//					res+=str.charAt(i+1);
//				}
//			} else if(in[i] > in[i+1]) {
//				res+=str.charAt(i);
//			} else {
//				res+=str.charAt(i+1);
//			}
//		}
//		return res;		
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	
	//22. 신고 결과 받기 
//	public int[] solution(String[] id_list, String[] report, int k) {
//		
//		int[] res = new int[id_list.length];
//		int[] sin = new int[id_list.length];
//		String[] arr;
//		
//		for(int i = 0; i < report.length; i++) {
//			arr = report[i].split(" ");
//			for(int j = 0; j < id_list.length; j++) {
//				if(arr[1].equals(id_list[j])) {
//					sin[j]++;
//				}
//			} 
//		} 
//		
//		for(int i = 0; i < sin.length; i++) {
//			if(sin[i] >= k) {
//				for(int j = 0; j < report.length; j++) {
//					arr = report[j].split(" ");
//					if(arr[1].equals(id_list[i])) {
//						for(int g = 0; g < id_list.length; g++) {
//							if(arr[0].equals(id_list[g])) {
//								res[g]++;
//							}
//						}
//					}
//				}
//			}
//		}
//		return res;
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	
	//23. 나머지가 1이 되는 수 찾기
//	public int solution(int n) {
//		
//		int res = 0;
//		
//		for(int i = 2; i <= n; i++) {
//			if(n % i == 1) {
//				res = i;
//				break;
//			}
//		}
//		return res;
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	
	//24. 최소직사각형
//	public int solution(int[][] sizes) {
//		
//		for(int i = 0; i < sizes.length; i++) {
//			if(sizes[i][0] < sizes[i][1]) {
//				int change = sizes[i][0];
//				sizes[i][0] = sizes[i][1];
//				sizes[i][1] = change;
//			}
//		}
//		
//		int width = sizes[0][0];
//		int heigh = sizes[0][1];
//		
//		for(int i = 1; i < sizes.length; i++) {
//			if(sizes[i][0] > width) {
//				width = sizes[i][0];
//			}
//			if(sizes[i][1] > heigh) {
//				heigh = sizes[i][1];
//			}
//		}
//		int res = width * heigh;
//		
//		return res;
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	
	//25. 없는 숫자 더하기
//	public int solution(int[] numbers) {
//		
//		int res = 0;
//		
//		w:for(int i = 0; i < 10; i++) {
//			for(int j = 0; j < numbers.length; j++) {
//				if(i == numbers[j]) {
//					continue w;
//				}
//			}
//			res += i;
//		}
//		return res;
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------


	
	
	
	
	
	//26. 부족한 금액 계산하기
//	public long solution(int price, int money, int count) {
//		
//		int sum = 0;
//		
//		for(int i = 1; i <= count; i++) {
//			sum += (price * i);
//		}
//		
//		int res = money - sum;
//		
//		if(res >= 0) {
//			res = 0;
//		} else {
//			res *= -1;
//		}
//		return res;
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------


	
	
	
	
	
	//27. 숫자 문자열과 영단어
//	public int solution(String s) {
//		
//		String res = "";
//		String str = "";
//		
//		for(int i = 0; i < s.length(); i++) {
//			int n = Character.getNumericValue(s.charAt(i));
//			
//			if(n < 10) {
//				res += n;
//			} else {
//				str += s.charAt(i);
//				
//				switch(str) {
//				case "zero":
//					res += "0";
//					str = "";
//					break;
//				case "one":
//					res += "1";
//					str = "";
//					break;
//				case "two":
//					res += "2";
//					str = "";
//					break;
//				case "three":
//					res += "3";
//					str = "";
//					break;
//				case "four":
//					res += "4";
//					str = "";
//					break;
//				case "five":
//					res += "5";
//					str = "";
//					break;
//				case "six":
//					res += "6";
//					str = "";
//					break;
//				case "seven":
//					res += "7";
//					str = "";
//					break;
//				case "eight":
//					res += "8";
//					str = "";
//					break;
//				case "nine":
//					res += "9";
//					str = "";
//					break;
//				}
//			}
//		}
//		return Integer.parseInt(res);
//	}

	
	
	
	 
	
	//--------------------------------------------------------------------------
	
	 
	
	
	
	//28. 약수의 개수와 덧셈
//	public int solution(int left, int right) {
//		
//		int res = 0;
//		
//		for(int i = left; i <= right; i++) {
//			int count = 0;
//			for(int j = 1; j <= i; j++) {
//				if(i % j == 0) {
//					count++;
//				}
//			}
//			if(count % 2 == 0) {
//				res += i;
//			}else {
//				res -= i;
//			}
//		}
//		return res;
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
 
	
	
	
	
	
	//29. 로또의 최고 순위와 최저 순위
//	public int[] solution(int[] lottos, int[] win_nums) {
//		
//		int su = 0;
//		int be = 0;
//		
//		for(int i = 0; i < 6; i++) {
//			if(lottos[i] == 0) {
//				su++;
//			} else {
//				for(int j = 0; j < 6; j++) {
//					if(lottos[i] == win_nums[j]) {
//						be++;
//					}
//				}	
//			}
//		}
//		int[] res = new int[2];
//		res[0] = 7 - (be + su);
//		res[1] = 7 - be;
//		
//		if(res[0] == 7) {
//			res[0] = 6;
//		}
//		if(res[1] == 7) {
//			res[1] = 6;
//		}
//		
//		return res;
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	
	//30. 음양 더하기
//	public int solution(int[] absolutes, boolean[] signs) {
//		
//		int res = 0;
//		
//		for(int i = 0; i < absolutes.length; i++) {
//			if(!signs[i]) {
//				absolutes[i] *= -1; 
//			}
//			res += absolutes[i];
//		}
//		return res;
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	//31. 신규 아이디 추천
//	public String solution(String new_id) {
//
//		new_id = new_id.toLowerCase(); //1단계
//		StringBuffer sb = new StringBuffer(new_id);
//		
//		int su = 0;
//		
//		for(int i = sb.length()-1; i >= 0; i--) { //2단계
//			if(sb.charAt(i) >= 'a' && sb.charAt(i) <= 'z') {
//				continue;
//			} else if(sb.charAt(i) >= '0' && sb.charAt(i) <= '9') {
//				continue;
//			} else if(sb.charAt(i) == '-' || sb.charAt(i) == '.' || sb.charAt(i) == '_') {
//				continue;
//			} else {
//				sb.deleteCharAt(i);
//			}
//		}
//	
//		for(int i = sb.length()-1; i >= 0; i--) { //3단계
//			if(sb.charAt(i) == '.') {
//				su++;
//			}
//			
//			if(sb.charAt(i) != '.' || i == 0) {
//				if(su >= 2) {
//					for(int j = i + su -1; j > i; j--) {
//						sb.deleteCharAt(j);
//					}
//					su = 0;
//				} else {
//					su = 0;
//				}
//			}
//		}
//		//----------------- 4단계
//		int first = sb.indexOf(".");
//		int last = sb.lastIndexOf(".");
//		
//		if(first == 0) {
//			sb.deleteCharAt(0);
//		}
//		if(last == sb.length()-1) {
//			sb.deleteCharAt(sb.length()-1);
//		}
//		//------------------
//		if(sb.length() == 0) { //5단계
//			sb = new StringBuffer("a");
//		}
//		
//		if(sb.length() > 15) { //6단계
//			String str = sb.substring(0, 15);
//			sb = new StringBuffer(str);
//			if(last == sb.length()-1) {
//				sb.deleteCharAt(sb.length()-1);
//			}
//		} 
//		
//		String res = sb.toString();
//		
//		if(res.length() < 3){ //7단계
//			char ch = res.charAt(res.length()-1);
//			for(int i = res.length(); i < 3; i++) {
//				res += ch;
//			}
//		}	
//		return res;		
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	//32. 내적
//	public int solution(int[] a, int[] b) {
//		
//		int res = a[0] * b[0];
//		
//		for(int i = 1; i < a.length; i++) {
//			res += (a[i] * b[i]);
//		}
//		return res;
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------

	
	
	
	
	//33. 3진법 뒤집기
//	public int solution(int n) {
//		
//		String res = "";
//		
//		while(n != 0) {
//			res += (n % 3);
//			n /= 3;
//		}
//		return Integer.parseInt(res, 3);
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	//34. 두 개 뽑아서 더하기
//	public int[] solution(int[] numbers) {
//		
//		Set<Integer> set = new HashSet<Integer>();
//		
//		for(int i = 0; i < numbers.length; i++) {
//			for(int j = 0; j < numbers.length; j++) {
//				if(i != j) {
//					set.add(numbers[i] + numbers[j]);
//				}
//			}
//		}
//		int[] res = set.stream().mapToInt(Integer::intValue).toArray();
//		
//		return res;
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	//35. 키패드 누르기
//	public String solution(int[] numbers, String hand) {
//		
//		String res = "";
//		
//		int[] left = {3,0};
//		int[] right = {3,2};
//		
//		int l,r,su;
//		
//		for(int i = 0; i < numbers.length; i++) {
//			switch(numbers[i]) {
//			case 1:
//				left[0] = 0;
//				left[1] = 0;
//				res += "L";
//				break;
//			case 4:
//				left[0] = 1;
//				left[1] = 0;
//				res += "L";
//				break;
//			case 7:
//				left[0] = 2;
//				left[1] = 0;
//				res += "L";
//				break;
//			case 3:
//				right[0] = 0;
//				right[1] = 2;
//				res += "R";
//				break;
//			case 6:
//				right[0] = 1;
//				right[1] = 2;
//				res += "R";
//				break;
//			case 9:
//				right[0] = 2;
//				right[1] = 2;
//				res += "R";
//				break;
//			case 2:
//				l = (left[0] - 0) + (1 - left[1]);
//				r = (right[0] - 0) + (right[1] - 1);
//				if(l < r) {
//					left[0] = 0;
//					left[1] = 1;
//					res += "L";
//				} else if(l > r) {
//					right[0] = 0;
//					right[1] = 1;
//					res += "R";
//				} else {
//					if(hand.equals("right")) {
//						right[0] = 0;
//						right[1] = 1;
//						res += "R";
//					} else {
//						left[0] = 0;
//						left[1] = 1;
//						res += "L";
//					}
//				}
//				break;
//			case 5:
//				su = left[0] - 1;
//				if(su < 0) {
//					su *= -1;
//				}
//				l = su + (1 - left[1]);
//				
//				su = right[0] - 1;
//				if(su < 0) {
//					su *= -1;
//				}
//				r = su + (right[1] - 1);
//				
//				if(l < r) {
//					left[0] = 1;
//					left[1] = 1;
//					res += "L";
//				} else if(l > r) {
//					right[0] = 1;
//					right[1] = 1;
//					res += "R";
//				} else {
//					if(hand.equals("right")) {
//						right[0] = 1;
//						right[1] = 1;
//						res += "R";
//					} else {
//						left[0] = 1;
//						left[1] = 1;
//						res += "L";
//					}
//				}
//				break;
//			case 8:
//				su = left[0] - 2;
//				if(su < 0) {
//					su *= -1;
//				}
//				l = su + (1 - left[1]);
//				
//				su = right[0] - 2;
//				if(su < 0) {
//					su *= -1;
//				}
//				r = su + (right[1] - 1);
//				
//				if(l < r) {
//					left[0] = 2;
//					left[1] = 1;
//					res += "L";
//				} else if(l > r) {
//					right[0] = 2;
//					right[1] = 1;
//					res += "R";
//				} else {
//					if(hand.equals("right")) {
//						right[0] = 2;
//						right[1] = 1;
//						res += "R";
//					} else {
//						left[0] = 2;
//						left[1] = 1;
//						res += "L";
//					}
//				}
//				break;
//			case 0:
//				l = (3 - left[0]) + (1 - left[1]);
//				r = (3 - right[0]) + (right[1] - 1);
//				if(l < r) {
//					left[0] = 3;
//					left[1] = 1;
//					res += "L";
//				} else if(l > r) {
//					right[0] = 3;
//					right[1] = 1;
//					res += "R";
//				} else {
//					if(hand.equals("right")) {
//						right[0] = 3;
//						right[1] = 1;
//						res += "R";
//					} else {
//						left[0] = 3;
//						left[1] = 1;
//						res += "L";
//					}
//				}
//				break;
//			}
//		}
//		return res;		
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	//36. 크레인 인형뽑기 게임
//	public int solution(int[][] board, int[] moves) {
//		
//		int res = 0;
//		
//		List<Integer> list = new ArrayList<Integer>();
//		
//		for(int i = 0; i < moves.length; i++) {
//			int idx = moves[i] - 1;
//			
//			for(int j = 0; j < board.length; j++) {
//				if(board[j][idx] != 0) {
//					list.add(board[j][idx]);
//					board[j][idx] = 0;
//					break;
//				}
//			}
//	
//			if(list.size() >= 2) {
//				int index = list.size() - 1;
//				if(list.get(index) == list.get(index-1)) {
//					list.remove(index);
//					list.remove(index-1);
//					res += 2;
//				}
//			}
//		}
//		return res;
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	//37. 실패율
//	public int[] solution(int N, int[] stages) {
//		
//		int[] clear = new int[N+1];
//		int[] challenge = new int[N+1];
//		
//		for(int i = 0; i < stages.length; i++) {
//			for(int j = 0; j < stages[i]; j++) {
//				clear[j]++;
//			}
//			challenge[stages[i]-1]++;
//		}
//		List<Integer> list = new ArrayList<Integer>();
//		List<Integer> rank = new ArrayList<Integer>();
//	
//		w:for(int i = 0; i < N; i++) {
//			if(clear[i] == 0) {
//				list.add(0);
//				rank.add(i+1);
//			} else {
//				int su = challenge[i]*100/clear[i];
//				int idx = list.size();
//				
//				if(idx == 0) {
//					list.add(su);
//					rank.add(i+1);
//				} else {
//					for(int j = 0; j < idx; j++) {
//						if(list.get(j) < su) {
//							list.add(j,su);
//							rank.add(j,i+1);
//							continue w;
//						} else if(list.get(j) == su && rank.get(j) > i+1) {
//							list.add(j,su);
//							rank.add(j,i+1);
//							continue w;
//						} 
//					}
//					list.add(su);
//					rank.add(i+1);
//				}
//			}
//		}
//		int[] res = new int[N];
//		
//		for(int i = 0; i < N; i++) {
//			res[i] = rank.get(i);
//		}
//		return res;
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	//38. 체육복
//	public int solution(int n, int[] lost, int[] reserve) {
//		
//		int res = 0;
//		int[] arr = new int[n];
//		
//		for(int i = 0; i < lost.length; i++) {
//			int idx = lost[i]-1;
//			arr[idx]--;
//		}
//		for(int i = 0; i < reserve.length; i++) {
//			int idx = reserve[i]-1;
//			arr[idx]++;
//		} 
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[i] == -1) {
//				if(i == 0) {
//					if(arr[i+1] == 1) {
//						arr[i]++;
//						arr[i+1]--;
//					}
//				} else if(i == arr.length-1) {
//					if(arr[i-1] == 1) {
//						arr[i]++;
//						arr[i-1]--;
//					}
//				} else if(arr[i-1] == 1) {
//					arr[i]++;
//					arr[i-1]--;
//				} else if(arr[i+1] == 1) {
//					arr[i]++;
//					arr[i+1]--;
//				}
//			}
//			
//			if(arr[i] >= 0) {
//				res++;
//			}
//		}
//		return res;
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	//39. 모의고사
//	public int[] solution(int[] answers) {
//		
//		int[] arr1 = new int[answers.length];
//		int[] arr2 = new int[answers.length];
//		int[] arr3 = new int[answers.length];
//		
//		int su1 = 1;
//		int su2 = 2;
//		int su3 = 3;
//		int su2sub = 1;
//		int su3sub = 0;
//		
//		for(int i = 0; i < answers.length; i++) {
//			arr1[i] = su1;
//			arr2[i] = su2;
//			arr3[i] = su3;
//			
//			//su1
//			if(su1 == 5) {
//				su1 = 1;
//			} else {
//				su1++;
//			}
//			
//			//su2
//			if(su2 != 2) {
//				su2 = 2;
//			} else {
//				su2 = su2sub;
//				switch(su2sub) {
//				case 1:
//					su2sub = 3;
//					break;
//				case 3:
//					su2sub = 4;
//					break;
//				case 4:
//					su2sub = 5;
//					break;
//				case 5:
//					su2sub = 1;
//					break;
//				}
//			}
//			
//			//su3
//			su3sub++;
//			if(su3sub == 2) {
//				switch(su3) {
//				case 1:
//					su3 = 2;
//					break;
//				case 2:
//					su3 = 4;
//					break;
//				case 3:
//					su3 = 1;
//					break;
//				case 4:
//					su3 = 5;
//					break;
//				case 5:
//					su3 = 3;
//					break;
//				}
//				su3sub = 0;
//			}		
//		}
//		
//		int[] ok = {0,0,0};
//		
//		for(int i = 0; i < answers.length; i++) {
//			if(arr1[i] == answers[i]) {
//				ok[0]++;
//			}
//			if(arr2[i] == answers[i]) {
//				ok[1]++;
//			}
//			if(arr3[i] == answers[i]) {
//				ok[2]++;
//			}
//		}
//		
//		int best = ok[0];
//		if(best < ok[1]) {
//			best = ok[1];
//		}
//		if(best < ok[2]) {
//			best = ok[2];
//		}
//		
//		List<Integer> list = new ArrayList<Integer>();
//		
//		for(int i = 0; i < ok.length; i++) {
//			if(ok[i] == best) {
//				list.add(i+1);
//			}
//		}
//		
//		int[] res = new int[list.size()];
//		
//		for(int i = 0; i < list.size(); i++) {
//			res[i] = list.get(i);
//		}
//		return res;
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	//40. K번째 수
//	public int[] solution(int[] array, int[][] commands) {
//		
//		int[] res = new int[commands.length];
//		
//		for(int e = 0; e < commands.length; e++) {
//			int i = commands[e][0];
//			int j = commands[e][1];
//			int k = commands[e][2];
//			
//			List<Integer> list = new ArrayList<Integer>();
//			for(int f = i-1; f <= j-1; f++) {
//				list.add(array[f]);
//			}
//			list.sort(null);
//			res[e] = list.get(k-1);
//		}
//		return res;
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	//41. 완주하지 못한 선수
//	public String solution(String[] participant, String[] completion) {
//		
//		String res;
//		
//		List<String> listP = new ArrayList<String>(Arrays.asList(participant));
//		List<String> listC = new ArrayList<String>(Arrays.asList(completion));
//		
//		for(int i = listP.size()-1; i >= 0; i--) {
//			for(int j = listC.size()-1; j >= 0; j--) {
//				if(listP.get(i).equals(listC.get(j))) {
//					listP.remove(i);
//					listC.remove(j);
//					break;
//				}
//			}
//		}
//		res = listP.get(0);
//		
//		return res;
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	//42. 예산
//	public int solution(int[] d, int budget) {
//		
//		int res = 0;
//		
//		Arrays.sort(d);
//		
//		for(int i = 0; i < d.length; i++) {
//			if(budget - d[i] >= 0) {
//				budget -= d[i];
//				res++;
//			} else {
//				break;
//			}
//		}
//		return res;
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	//43. 소수 만들기
//	public int solution(int[] nums) {
//		
//		int res = 0;
//		
//		for(int i = 0; i < nums.length; i++) {
//			for(int j = 0; j < nums.length; j++) {
//				if(j != i && j > i) {
//					for(int e = 0; e < nums.length; e++) {
//						if(e != j && e > j) {
//							int su = nums[i] + nums[j] + nums[e];
//							int count = 0;
//							for(int f = 2; f <= su; f++) {
//								if(su % f == 0) {
//									count++;
//								}
//							}
//							if(count == 1) {
//								res++;
//							}
//						}
//					}
//				}
//			}
//		}
//		return res;
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	

	
	//44. 직사각형 별찍기
//	public void solution(int n, int m) {
//		
//		for(int i = 0; i < m; i++) {
//			for(int j = 0; j < n; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	//45. x만큼 간격이 있는 n개의 숫자
//	public long[] solution(int x, int n) {
//		
//		long[] res = new long[n];
//		int su = x;
//		
//		for(int i = 0; i < n; i++) {
//			res[i] = su;
//			su += x;
//		}
//		return res;
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	//46. 행렬의 덧셈
//	public int[][] solution(int[][] arr1, int[][] arr2){
//		
//		int[][] res = new int[arr1.length][arr1[0].length];
//		
//		for(int i = 0; i < arr1.length; i++) {
//			for(int j = 0; j < arr1[i].length; j++) {
//				res[i][j] = arr1[i][j] + arr2[i][j];
//			}
//		}
//		return res;
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	//47. 핸드폰 번호 가리기
//	public String solution(String phone_number) {
//		
//		String res = "";
//		
//		for(int i = 0; i < phone_number.length(); i++) {
//			if(i < phone_number.length()-4) {
//				res += "*";
//			} else {
//				res += phone_number.charAt(i);
//			}
//		}
//		return res;
//	}

	
	
	
	
	
	//-------------------------------------------------------------------------- 
	
	
	
	
	
	//48. 하샤드 수
//	public boolean solution(int x) {
//		
//		String str = Integer.toString(x);
//		int res = 0;
//		
//		for(int i = 0; i < str.length(); i++) {
//			res += Character.getNumericValue(str.charAt(i));
//		}
//		return x % res == 0;
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	//49. 평균 구하기
//	public double solution(int[] arr) {
//		
//		int su = 0;
//		
//		for(int i = 0; i < arr.length; i++) {
//			su += arr[i];
//		}
//		return (double)su / arr.length;
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	//50. 콜라츠 추측
//	public int solution(int num) {
//		
//		int count = 0;
//		
//		if(num != 1) {
//			while(num != 1) {
//				if(num % 2 == 0) {
//					num /= 2;
//				} else {
//					num = (num * 3) + 1;
//				}
//				count++;
//				if(count > 500) {
//					count = -1;
//					break;
//				}
//			}
//		}
//		return count;
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	//51. 최대공약수와 최소공배수
//	public int[] solution(int n, int m) {
//		
//		int max = 0, min;
//		List<Integer> list1 = new ArrayList<Integer>();
//		List<Integer> list2 = new ArrayList<Integer>();
//		
//		for(int i = 1; i <= n; i++) {
//			if(n % i == 0) {
//				list1.add(i);
//			}
//		}
//		for(int i = 1; i <= m; i++) {
//			if(m % i == 0) {
//				list2.add(i);
//			}
//		}
//		w:for(int i = list1.size()-1; i >= 0; i--) {
//			for(int j = list2.size()-1; j >= 0; j--) {
//				if(list1.get(i) == list2.get(j)) {
//					max = list1.get(i);
//					break w;
//				}
//			}
//		}
//		
//		int su1 = n;
//		int su2 = m;
//		if(su1 > su2) {
//			su1 = m;
//			su2 = n;
//		}
//		if(su2 % su1 == 0) {
//			min = su1 * (su2 / su1);
//		}else {
//			min = su1 * su2;
//		}
//		
//		int[] res = {max, min};
//		
//		return res;
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	//52. 짝수와 홀수
//	public String solution(int num) {
//		
//		String res = "";
//		if(num % 2 == 0) {
//			res = "Even";
//		} else {
//			res = "Odd";
//		}
//		return res;
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	//53. 제일 작은 수 제거하기
//	public int[] solution(int[] arr) {
//		
//		List<Integer> list = new ArrayList<Integer>();
//		
//		if(arr.length == 1) {
//			list.add(-1);
//		} else {
//			int min = arr[0];
//			for(int i = 1; i < arr.length; i++) {
//				if(min > arr[i]) {
//					min = arr[i];
//				}
//			}
//			for(int i = 0; i < arr.length; i++) {
//				if(min != arr[i]) {
//					list.add(arr[i]);
//				}
//			}
//		}
//		int[] res = new int[list.size()];
//		
//		for(int i = 0; i < res.length; i++) {
//			res[i] = list.get(i);
//		}
//		return res;
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	//54. 정수 제곱근 판별
//	public long solution(long n) {
//		
//		long res = 0;
//		
//		for(int i = 1; i <= n; i++) {
//			if(i * i == n) {
//				res = (i + 1) * (i + 1);
//				break;
//			}
//			if(i * i > n) {
//				res = -1;
//				break;
//			}
//		}
//		return res;
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	//55. 정수 내림차순으로 배치하기
//	public long solution(long n) {
//		
//		String str = Long.toString(n);
//		String res = "";
//		
//		for(int i = 9; i >= 0; i--) {
//			for(int j = 0; j < str.length(); j++) {
//				if(Character.getNumericValue(str.charAt(j)) == i) {
//					res += str.charAt(j);
//				}
//			}
//		}
//		return Long.parseLong(res);
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	//56. 자연수 뒤집어 배열로 만들기
//	public int[] solution(long n) {
//		
//		String str = Long.toString(n);
//		int[] res = new int[str.length()];
//		int idx = 0;
//		
//		for(int i = str.length()-1; i >= 0; i--) {
//			res[idx] = Character.getNumericValue(str.charAt(i));
//			idx++;
//		}
//		return res;
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	//57. 자연수 더하기
//	public int solution(int n) {
//		
//		String str = Integer.toString(n);
//		int res = 0;
//		
//		for(int i = 0; i < str.length(); i++) {
//			res += Character.getNumericValue(str.charAt(i));
//		}
//		return res;
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	//58. 이상한 문자 만들기
//	public String solution(String s) {
//		
//		String[] arr = s.split(" ");
//		String str = "";
//		String res = "";
//		
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[i].length(); j++) {
//				if(j % 2 == 0) {
//					str += arr[i].toUpperCase().charAt(j);
//				} else {
//					str += arr[i].toLowerCase().charAt(j);
//				}
//			}
//			res += str + " ";
//			str = "";
//		}
//		return res.trim();
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	//59. 약수의 합
//	public int solution(int n) {
//		
//		int res = 0;
//		
//		for(int i = 1; i <= n; i++) {
//			if(n % i == 0) {
//				res += i;
//			}
//		}
//		return res;
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	//60. 시저 암호
//	public String solution(String s, int n) {
//		
//		StringBuffer sb = new StringBuffer(s);
//		
//		for(int i = 0; i < sb.length(); i++) {
//			if(sb.charAt(i) != ' ') {
//				for(int j = 0; j < n; j++) {
//					if(sb.charAt(i) == 'Z') {
//						sb.setCharAt(i, 'A');
//					} else if(sb.charAt(i) == 'z') {
//						sb.setCharAt(i, 'a');
//					} else {
//						sb.setCharAt(i, (char) (sb.charAt(i)+1));
//					}
//				}
//			}
//		}
//		return sb.toString();
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	//61. 문자열을 정수로 바꾸기
//	public int solution(String s) {
//		
//		return Integer.parseInt(s);
//		
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	//62. 수박수박수박수박수박수?
//	public String solution(int n) {
//		
//		String res = "";
//		
//		for(int i = 0; i < n; i++) {
//			if(i % 2 == 0) {
//				res += "수";
//			} else {
//				res += "박";
//			}
//		}
//		return res;
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	//63. 소수 찾기
//	public int solution(int n) {
//		
//		int res = 0;
//		
//		for(int i = 2; i <= n; i++) {
//			int count = 0;
//			for(int j = 2; j <= i; j++) {
//				if(i % j == 0) {
//					count++;
//				}
//			}
//			if(count == 1) {
//				res++;
//			}
//		}
//		return res;
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	//64. 서울에서 김서방 찾기
//	public String solution(String[] seoul) {
//		
//		String res = "";
//		
//		for(int i = 0; i < seoul.length; i++) {
//			if(seoul[i].equals("Kim")) {
//				res = "김서방은 " + i + "에 있다";
//			}
//		}
//		return res;
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	//65. 문자열 다루기 기본
//	public boolean solution(String s) {
//		
//		boolean res = true;
//		
//		try {
//			int su = Integer.parseInt(s);
//		} catch (Exception e) {
//			res = false;
//			return res;
//		}
//		return res;
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	//66. 문자열 내림차순으로 배치하기
//	public String solution(String s) {
//		
//		String res = "";
//		
//		for(int i = 'z'; i >= 'a'; i--) {
//			for(int j = 0; j < s.length(); j++) {
//				if(s.charAt(j) == i) {
//					res += (char)i;
//				}
//			}
//		}
//		for(int i = 'Z'; i >= 'A'; i--) {
//			for(int j = 0; j < s.length(); j++) {
//				if(s.charAt(j) == i) {
//					res += (char)i;
//				}
//			}
//		}
//		return res;
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	//67. 문자열 내 p와 y의 개수
//	boolean solution(String s) {
//		
//		int p = 0;
//		int y = 0;
//		
//		for(int i = 0; i < s.length(); i++) {
//			if(s.charAt(i) == 'p' || s.charAt(i) == 'P') {
//				p++;
//			}
//			if(s.charAt(i) == 'y' || s.charAt(i) == 'Y') {
//				y++;
//			}
//		}
//		boolean res;
//		if(p == y) {
//			res = true;
//		} else {
//			res = false;
//		}
//		return res;
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	//68. 문자열 내 마음대로 정렬하기
//	public String[] solution(String[] strings, int n) {
//		
//		String[] res = new String[strings.length];
//		List<String> list = new ArrayList<String>();
//		int idx = 0;
//		
//		for(int i = 'a'; i <= 'z'; i++) {
//			for(int j = 0; j < strings.length; j++) {
//				if(strings[j].charAt(n) == i) {
//					list.add(strings[j]);
//				}
//			}
//			list.sort(null);
//			for(int j = 0; j < list.size(); j++) {
//				res[idx] = list.get(j);
//				idx++;
//			}
//			list.clear();
//		}
//		return res;
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	//69. 두 정수 사이의 합
//	public long solution(int a, int b) {
//		
//		int res = 0;
//		int min = a;
//		int max = b;
//		if(a > b) {
//			min = b;
//			max = a;
//		}
//		
//		for(int i = min; i <= max; i++) {
//			res += i;
//		}
//		return res;
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	//70. 나누어 떨어지는 숫자 배열
//	public int[] solution(int[] arr, int divisor) {
//		
//		List<Integer> list = new ArrayList<Integer>();
//		
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[i] % divisor == 0) {
//				list.add(arr[i]);
//			}
//		}
//		if(list.size() == 0) {
//			list.add(-1);
//		}
//		
//		int[] res = new int[list.size()];
//		
//		for(int i = 0; i < list.size(); i++) {
//			res[i] = list.get(i);
//		}
//		Arrays.sort(res);
//		return res;
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	//71. 같은 숫자는 싫어
//	public int[] solution(int[] arr) {
//		
//		List<Integer> list = new ArrayList<Integer>();
//		list.add(arr[0]);
//		
//		for(int i = 1; i < arr.length; i++) {
//			if(arr[i] != arr[i-1]) {
//				list.add(arr[i]);
//			}
//		}
//		
//		int[] res = new int[list.size()];
//		
//		for(int i = 0; i < list.size(); i++) {
//			res[i] = list.get(i);
//		}
//		return res;
//	}

	
	
	
	
	
	//--------------------------------------------------------------------------

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
