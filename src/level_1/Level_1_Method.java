package level_1;

import java.util.ArrayList;
import java.util.Arrays;
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

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
