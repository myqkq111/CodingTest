package level_1;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;

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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
