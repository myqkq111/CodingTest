package level_1;

import java.util.Arrays;

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
	//������ ���⿡ ���� ������ ���������� ������� ĭ��ŭ ������ �ִ������� Ȯ���ϰ� ���±濡 ��ֹ��� �ִ��� Ȯ���Ѵ�.
	
	
	
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
