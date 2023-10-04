package level_1;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
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
	
	
	
	
	
	
	//7. ī�� ��ġ
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

	//for�� �ȿ� if ������ ���̶�� continue�� ���� ���ҷ� ���� �����̶�� break�� �ѹ��� �ݺ��� �� �ְ� �ۼ��ߴ�.
	//�׷��� for���ȿ� �ΰ��� for���� ���� �ǹ����� ���� �ȴٸ� ��ġ�ϴ� ���Ұ� ���� ������ �ϼ���ų �� ���ٴ� ���̹Ƿ� No���� ���� �ȴ�.
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	//8. �Ѹ��� ��ȣ
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

	//�ƽ�Ű�ڵ带 �̿��ϸ� �����ϰ� Ǯ �� �ִ� ������.
	//���� ���ĺ��� skip���ڿ��� ������ �Ǿ������� �ݺ�Ƚ���� ������Ű�� �ʰ� ���� ���ĺ����� ������ �ۼ��ߴ�.
	//������ ������ ���� ���ĺ��� ������ ���������� ������Ѵ�. ���������� ����ϸ� ���ĺ��� �ٲ����ʴ´�. 
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	
	//9. �������� ���� ��ȿ�Ⱓ
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

	//split�޼���� Integer.parseInt�� ���� ����� �� ����.
	//��¥ ���� ��ü�� �޼��带 �˰��־��ٸ� �������ٵ� ��ư� Ǯ��� ����.
	
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	
	//10. ũ�Ⱑ ���� �κй��ڿ�
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
	
	
	
	
	
	
	//11. ���� ����� ���� ����
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
	
	
	
	
	
	
	//12. ���ڿ� ������
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
	
	
	
	
	
	
	//13. ���� ����(1)
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
