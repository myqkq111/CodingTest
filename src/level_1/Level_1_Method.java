package level_1;

public class Level_1_Method {
	
	//1. 달리기 경주 
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
	
	//배열의 위치만 바꾸면 되는 간단한 문제다.
	//원래 자리에 있던 원소를 String에 담아 저장한 뒤 자리를 바꾸는데 String에 계속 새로운 값을 넣어주면 버리는 데이터가 그만큼 생기기 때문에
	//List를 사용해도 괜찮을 거 같다.
	
	
	//--------------------------------------------------------------------------
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
