package level_1;

public class Level_1_Method {
	
	//1. �޸��� ���� 
	public String[] solution(String[] players, String[] callings) {
		
		String name;
		
		for(int i = 0; i < callings.length; i++) {
			for(int j = 0; j < players.length; j++) {
				if(callings[i].equals(players[j])) {
					name = players[j-1];
					players[j-1] = players[j];
					players[j] = name;
				}
			}
		}
		return players;
	}
	
	//�迭�� ��ġ�� �ٲٸ� �Ǵ� ������ ������.
	//���� �ڸ��� �ִ� ���Ҹ� String�� ��� ������ �� �ڸ��� �ٲٴµ� String�� ��� ���ο� ���� �־��ָ� ������ �����Ͱ� �׸�ŭ ����� ������
	//List�� ����ص� ������ �� ����.
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
