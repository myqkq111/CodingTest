package level_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Level_1_Method {
	
	//1. �޸��� ���� 
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
	
	//�迭�� ��ġ�� �ٲٸ� �Ǵ� ������ ������.
	//���� �ڸ��� �ִ� ���Ҹ� String�� ��� ������ �� �ڸ��� �ٲٴµ� String�� ��� ���ο� ���� �־��ָ� ������ �����Ͱ� �׸�ŭ ����� ������
	//List�� ����ص� ������ �� ����.
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	
	//2. �߾� ����
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
	
	//�̸��� ������ index�� ���ٴ°� �̿��Ͽ� 3�� for���� �����ָ� ������ Ǯ �� �ִ� ������. 
	
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	
	//3. ���� ��å
//	public int[] solution(String[] park, String[] routes) {
//		
//		int[] res = new int[2];
//
//		for(int i = 0; i < park.length; i++) { //���� ���� ���ϱ�
//			if(park[i].contains("S")) {
//				int idx = park[i].indexOf("S");
//				res[0] = i; 
//				res[1] = idx;
//			}
//		}
//		
//		w:for(int i = 0; i < routes.length; i++) { //�̵�
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

	//���� ������ index���� ���ϰ� switch���� ����� ������ ���⿡ ���� ������ �����Ѵٸ� �̵��� ��Ű�� ������� �ۼ��ߴ�.
	//������ ���⿡ ���� ������ ���������� �������� ĭ��ŭ ������ �ִ������� Ȯ���ϰ� ���±濡 ��ֹ��� �ִ��� Ȯ���Ѵ�.
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	
	//4. ����ȭ�� ����
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

	//������ �������� ���� ��,�Ʒ�,����,�����ʿ� �ִ� ������ index�� ���ϸ� �Ǵ� ������ ������.
	//������ �Ʒ��� ������ index�� +1�� ������Ѵ�.
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	
	//5. ��ĥ�ϱ�
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

	//�迭�� �����߿� ���� ���� ������ m���� ���ڰ� �迭�� �ִٸ� �ش� ���Ҹ� �����ϰ� ��� �ݺ��ߴ����� ���� ������� �����Դ�.
	//�ش�Ǵ� ���Ҹ� �����ѵ� continue�� ��������� ������ index������ ������ ���.
	//�׸��� �迭 �� ���Һ��� ������ ����� index������ ������ ���� �ʴ´�.
	
	
	//--------------------------------------------------------------------------

	
	
	
	
	
	//6. ���� ���� ����
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

	//3�� for���� ����� targets�迭�� ���Ҹ� �ѱ��ھ� ������ ���Ͽ� �ۼ��� �� �ִ� ���� ���� ���� ã�Ƴ��� ������� �ۼ��ߴ�. 
	//���� �ۼ��� �� ���� ���ڰ� �ִٸ� �ش� ���Ҵ� �ۼ��� �� �����Ƿ� -1���� �ش�. 
	//3�� for���̶� ������ ���� �� ������ ������ ��������.
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}